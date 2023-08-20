package in.verma.app12;
import java.io.*;

public class Copy {
    public static void main(String[] args) {

        File a = new File("myfile.txt");
        File b = new File("copyto.txt");

        try (
                FileReader fileReader = new FileReader(a);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                FileWriter fileWriter = new FileWriter(b);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {
            String line;


            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            System.out.println("Cкопировано!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
