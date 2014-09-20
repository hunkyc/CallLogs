import java.io.*;


public class fileComparison {
    public static void main (String[] args) throws FileNotFoundException, IOException {
        FileReader file1 = new FileReader(args[0]);
        FileReader file2 = new FileReader(args[1]);

        BufferedReader br1 = new BufferedReader(file1);
        BufferedReader br2 = new BufferedReader(file2);

        String first;
        String second;

        while((first = br1.readLine()) != null) {
            second = br2.readLine();
            if (first.equals(second)) {
                System.out.println("it matches");
            }
            else {
                System.out.println("They don't match");
                System.out.println(first);
                System.out.println("does not match");
                System.out.println(second);
            }
        }
    }
}
