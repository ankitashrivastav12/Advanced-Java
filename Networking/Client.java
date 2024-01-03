import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket soc = new Socket("localhost",6666);
            ObjectOutputStream out = new ObjectOutputStream(soc.getOutputStream());
            out.writeUTF("Hello Developers");
            out.flush();
            out.close();
            soc.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
