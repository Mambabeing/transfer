package logic;
import java.io.*;

public class IOmm {
    public static void main(String[] args) throws IOException{
        FileInputStream inputStream=new FileInputStream("src/main/java/program.mm");
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));
        String str=null;
        while ((str=bufferedReader.readLine())!=null){
            System.out.println(str);
        }
        inputStream.close();
        bufferedReader.close();

    }

}
