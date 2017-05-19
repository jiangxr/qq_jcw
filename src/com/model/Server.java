package com.model;

import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by jiangchangwei on 2017/5/19.
 */
public class Server {
    private ExecutorService executorService;
    private boolean isWaited = true;

    public Server() {
        executorService = Executors.newFixedThreadPool(1);
    }

    public void start() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        while(isWaited) {
            Socket socket = serverSocket.accept();
            executorService.execute(new SocketTask(socket));
        }

    }


    private class SocketTask implements Runnable {
        private Socket socket;
        public SocketTask(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                InputStream inputStream = socket.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
                String s = "";
                while((s = br.readLine()) != null) {
                    System.out.println(s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;
        }
    }

    public static void main(String[] args) throws IOException {
        new Server().start();
    }
}
