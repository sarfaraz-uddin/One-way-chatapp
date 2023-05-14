import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args){
        try {
            Socket socket=new Socket("localhost",421);
            InputStream inputStream=socket.getInputStream();
//            int c=inputStream.read();
//            while(c!=1){
//                System.out.println((char)c);
//                c=inputStream.read();
//            }
            InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
            BufferedReader bufferedreader=new BufferedReader(inputStreamReader);
           while(true){
               System.out.println(bufferedreader.readLine());

           }
//            System.out.println((char)inputStreamReader.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
