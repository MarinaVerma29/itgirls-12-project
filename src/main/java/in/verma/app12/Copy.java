package in.verma.app12;
import java.io.*;

public class Copy {
    public static void main(String[] args) {

        File a = new File("/Users/marinaverma/IdeaProjects/itgirls-12-project/src/main/java/in/verma/app12/myfile.txt");
        File b = new File("/Users/marinaverma/IdeaProjects/itgirls-12-project/src/main/java/in/verma/app12/copyto.txt");

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
