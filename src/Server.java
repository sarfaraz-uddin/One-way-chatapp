import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {

        System.out.println("A new connection is trying to connect...");
        ServerSocket serverSocket= null;
        try {
            serverSocket = new ServerSocket(421);
            Socket socket=serverSocket.accept();

            System.out.println("A new client is connected");
            OutputStream outputStream=socket.getOutputStream();
            PrintWriter printwriter=new PrintWriter(outputStream,true);
            while(true){
                Scanner scanner=new Scanner(System.in);
                String input=scanner.nextLine();
                printwriter.println(input);

            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}