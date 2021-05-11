package logic;
import java.io.*;
import org.junit.Test;

public class Filetest {
    @Test
    public void ioTest() throws IOException {
        FileInputStream inputStream=new FileInputStream("src/main/java/testio.mm");
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));
        String str=null;
        while((str=bufferedReader.readLine())!=null){
            System.out.println(str);
        }
        inputStream.close();
        bufferedReader.close();

    }
}
