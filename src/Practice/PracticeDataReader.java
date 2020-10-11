package Practice;


import java.io.BufferedReader;
import java.io.FileReader;

public class PracticeDataReader {

    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String filePath = "C:\\Users\\helen\\IdeaProjects\\Demo_Study_Practice\\DataTest\\Sample";

        try{
            fileReader= new FileReader(filePath);
            bufferedReader =new BufferedReader(fileReader);
            String data;
            while ((data= bufferedReader.readLine()) != null){
                System.out.println(data);
            }

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("File not found Exception");
        }finally {
            try{
                fileReader.close();
                bufferedReader.close();
            }catch (Exception e){
                System.out.println("File is closed not");
            }
        }
    }
}
