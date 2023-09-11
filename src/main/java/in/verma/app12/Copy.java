package in.verma.app12;
import java.io.*;

public class Copy {

    static String path1 = "/Users/marinaverma/IdeaProjects/itgirls-12-project/src/main/java/in/verma/app12/myfile.txt";
    static String path2 = "/Users/marinaverma/IdeaProjects/itgirls-12-project/src/main/java/in/verma/app12/copyto.txt";
    public static void main(String[] args) {

        File a = new File(path1);
        File b = new File(path2);

        try (
                FileReader fileReader = new FileReader(a);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                FileWriter fileWriter = new FileWriter(b);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {
            String line;
            line = bufferedReader.readLine();
            while ((line != null)) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                line = bufferedReader.readLine();
            }

            System.out.println("Cкопировано!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
