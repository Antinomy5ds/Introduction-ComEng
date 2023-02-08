import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input;
        try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("C:\\Users\\Lenovo\\Desktop\\KU Fund\\Into\\output.txt"));
            System.out.print("Write Something :");
            input = scn.nextLine();
            writer.write("\n" + input);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try

        {
            BufferedReader reader = new BufferedReader(
                    new FileReader("C:\\Users\\Lenovo\\Desktop\\KU Fund\\Into\\output.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}