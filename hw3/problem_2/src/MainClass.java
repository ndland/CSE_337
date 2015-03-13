/**
 * Created by Nick on 3/13/15.
 */
public class MainClass {
    public static void main(String[] args) {
        Encoder en = new Encoder(10);

        System.out.println(en.process("abc"));
        System.out.println(en.process("xyz"));
    }
}
