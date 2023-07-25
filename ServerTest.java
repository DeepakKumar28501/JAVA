import java.net.*;
import java.io.*;
import java.util.*;

public class ServerTest {
    public ServerSocket ss;

    public static void main(String args[]) throws IOException {
        ServerTest st = new ServerTest();
        System.out.println("Server Running");
        for (;;)
            st.serve();
    }

    public ServerTest() throws IOException {
        ss = new ServerSocket(13);
    }

    public void serve() throws IOException {
        Socket s = null;
        s = ss.accept();
        // BufferedWriter out = new BufferedWriter(new
        // OutputStreamWriter(s.getOutputStream()));
        // out.write("Day & time :" + (new Date().toString()));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        out.write("Hello Developer");
        out.close();
    }
}
