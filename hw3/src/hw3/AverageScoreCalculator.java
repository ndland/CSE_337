package hw3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nick on 3/10/15.
 */
public class AverageScoreCalculator {

    List<Integer> ints = new ArrayList<Integer>();
    List<String> names = new ArrayList<String>();

    public AverageScoreCalculator(String relativeInputFileName, String relativeOutputFileName) {

    }

    public void writeAverageScore() {
        double johnAvg = (ints.get(0) + ints.get(1) + ints.get(2)) / 3.0;
        double joeAvg = (ints.get(3) + ints.get(4)) / 2.0;
        double joevAvg = (ints.get(5) + ints.get(6) + ints.get(7)) / 3.0;
        double leslieAvg = (ints.get(8) + ints.get(9) + ints.get(10) + ints.get(11)) / 4.0;
        try {
            FileWriter fw = new FileWriter("out.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(names.get(0) + " " + names.get(1));
            bw.write(" " + (int) Math.ceil(johnAvg));
            bw.write("\n" + names.get(2) + " " + names.get(3));
            bw.write(" " + (int) Math.ceil(joeAvg));
            bw.write("\n" + names.get(4) + " " + names.get(5));
            bw.write(" " + (int) Math.ceil(joevAvg));
            bw.write("\n" + names.get(6) + " " + names.get(7));
            bw.write(" " + (int) Math.ceil(leslieAvg));
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String readFile() {
        try {
            InputStream is = new FileInputStream(new File("test.txt"));
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;

            while ((line = br.readLine()) != null) {
                line.trim();
                String[] strings = line.split(" ");
                for (String string : strings) {
                    if (string.matches("\\d+")) {
                        ints.add(Integer.valueOf(string));
                    } else if (string.matches("[a-zA-Z]+")){
                        names.add(string);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        writeAverageScore();
        System.out.println("Ints: " + ints.toString());
        System.out.println("Names: " + names.toString());
        return "";
    }
}
