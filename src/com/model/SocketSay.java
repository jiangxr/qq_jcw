package com.model;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by jiangchangwei on 2017/5/19.
 */
public class SocketSay {

    public Socket createSocket() throws IOException {
        Socket socket = new Socket("localhost", 8888);
        return socket;
    }

    public void say(Socket socket, String s) throws IOException {
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);
        printWriter.write(s);
        printWriter.flush();
    }

    public static void main(String[] args) throws IOException {
        SocketSay socketSay = new SocketSay();
        Socket socket = socketSay.createSocket();
        socketSay.say(socket, "nihaoa");
    }
}
