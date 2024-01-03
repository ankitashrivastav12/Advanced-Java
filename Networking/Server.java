import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket sos = new ServerSocket(6666);
            Socket soc = sos.accept(); //establishes connection
            ObjectInputStream ois = new ObjectInputStream(soc.getInputStream());
            String str = (String)ois.readUTF();
            System.out.println("message= " +str);
            sos.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}