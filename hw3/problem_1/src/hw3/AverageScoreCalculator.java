package hw3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nick on 3/10/15.
 */
public class AverageScoreCalculator {

    List<Integer> numbersInLine = new ArrayList<Integer>();
    List<String> names = new ArrayList<String>();
    StringBuilder sb = new StringBuilder();
    String inputFileName;
    String outputFileName;

    public AverageScoreCalculator(String relativeInputFileName, String relativeOutputFileName) {
        inputFileName = relativeInputFileName;
        outputFileName = relativeOutputFileName;
    }

    public void writeAverageScore() {
        readFile();
        try {
            FileWriter fw = new FileWriter(outputFileName);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(sb.toString());
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void readFile() {
        try {
            InputStream is = new FileInputStream(new File(inputFileName));
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;

            while ((line = br.readLine()) != null) {
                line.trim();
                String[] strings = line.split(" ");
                for (String string : strings) {
                    if (string.matches("\\d+")) {
                        numbersInLine.add(Integer.valueOf(string));
                    } else if (string.matches("[a-zA-Z]+")){
                        names.add(string);
                    }
                }
                if (!names.isEmpty() && !numbersInLine.isEmpty()) {
                    fileContentBuffer();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private double average() {
        double sum = 0;
        for(Integer element : numbersInLine) {
            sum += element;
        }
        return sum / (double) numbersInLine.size();
    }

    private void fileContentBuffer() {
        for (String name : names) {
            sb.append(name);
            sb.append(" ");
        }
        sb.append((int) Math.ceil(average()));
        sb.append("\n");
        numbersInLine.clear();
        names.clear();
    }
}
