import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String [] args){
        File folder = new File("C://Users/homaw/Desktop/video15/");
        File file = new File("C://Users/homaw/Desktop/indexVideo15.html");


        /*
        if(!folder.exists()){
            folder.mkdir();
        }
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            List<String> html = Arrays.asList("<!Doctype>","<html>","<head>","<title>Video15(File)</title>","</head>","<body>","<p>salut c'est jin_jo</p>","</body>","</html>");
            try {

                FileWriter writer = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(writer);
                for(String line : html){
                    bw.write(line);
                    bw.newLine();
                    System.out.println(line);
                }


                bw.write("salut les Zero");
                bw.newLine();
                bw.write("coucou Comment ca va?");
                bw.newLine();
                bw.write("test2");
                bw.newLine();
                bw.close();
                writer.close();


                //lire dans un ficher
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
                String line = reader.readLine();
                while (line != null){
                    System.out.println(line);
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

         */
         File file1 = new File("C://Users/homaw/Desktop/video15/"+file.getName());
        try {
            Files.copy(file.toPath(),file1.toPath(), StandardCopyOption.REPLACE_EXISTING);
            file.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}