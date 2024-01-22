import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import static java.nio.file.StandardOpenOption.CREATE;

public class ProductReader


{
    private static Object Product;

    public static void main(String[] args)
    {
        JFileChooser chooser = new JFileChooser();
        File selectedFile;
        Product pRec;

        ArrayList<Object> lines = new ArrayList<>();

        try
        {

            File workingDirectory = new File(System.getProperty("user.dir"));
            chooser.setCurrentDirectory(workingDirectory);

            if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
                selectedFile = chooser.getSelectedFile();
                Path file = selectedFile.toPath();

                InputStream in =
                        new BufferedInputStream(Files.newInputStream(file, CREATE));
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(in));

                // Finally we can read the file LOL!
                int line = 0;

                String words[];

                System.out.println("ID#        Name       Description      Cost");
                System.out.println("==================================================");

                while(reader.ready())
                {
                    Product = reader.readLine();
                    lines.add(Product);
                    line++;


                }



                for (Object obj : lines) {
                    if (obj instanceof String) {
                        String l = (String) obj;
                        String fields[] = l.split(", ");

                        // Rest of your code
                        System.out.printf("%-10s %-10s %-15s %-10s %n",fields[0],fields[1], fields[2], fields[3]);
                    }
                }

                reader.close(); // must close the file to seal it and flush buffer
                System.out.println("\n\nData file read!");
            }
            else  // user closed the file dialog without choosing
            {
                System.out.println("Failed to choose a file to process");
                System.out.println("Run the program again!");
                System.exit(0);
            }
        }  // end of TRY
        catch (FileNotFoundException e)
        {
            System.out.println("File not found!!!");
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}