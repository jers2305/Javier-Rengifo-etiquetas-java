import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<String> array = new ArrayList<String>();

             if (args.length != 0) {
                for (String arg : args) {
                    array.add(arg);
                }
            }

             for (String arg : array) {
                System.out.println(arg);
            }

        } catch (Exception e) {
            System.out.println("error: " + e);
        }
    }
}
