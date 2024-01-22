import javax.naming.spi.DirStateFactory;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.CREATE;

public class PersonGenerator {
    public static void main(String[] args) {
        String IDNum = "";
        String firstName = "";
        String lastName = "";
        String title = "";
        int YOB = 0;
        String csvRec = "";
        boolean done = false;
        Person perp;

        Scanner in = new Scanner(System.in);

        ArrayList<Person> recs = new ArrayList<>();
        do {
            IDNum = SafeInput.getNonZeroLenString(in, "Enter the ID");
            firstName = SafeInput.getNonZeroLenString(in, "Enter First Name");
            lastName = SafeInput.getNonZeroLenString(in, "Enter Last Name");
            title = SafeInput.getNonZeroLenString(in, "Enter title");
            YOB = SafeInput.getRangedInt(in, "Enter the year for the age calc: ", 1000, 9999);


            perp = new Person(IDNum, firstName, lastName, title, YOB);




            done = SafeInput.getYNConfirm(in, "Are You Done?");


            recs.add(perp);


        } while (!done);

        File workingDirectory = new File(System.getProperty("user.dir"));
        Path file = Paths.get(workingDirectory.getPath() + "PersonTestData.csv");
        try {

            OutputStream out =
                    new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer =
                    new BufferedWriter(new OutputStreamWriter(out));


            for (Person rec : recs) {
                writer.write(rec.toCSVDataRecord(), 0, rec.toCSVDataRecord().length());
                writer.newLine();

            }
            writer.close();
            System.out.println("Data file written!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}


