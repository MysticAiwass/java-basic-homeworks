package ru.aiwass.java_basic.homeworks.module_3.lesson20;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MathServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)){
            while (true){
                Socket clientSocket = serverSocket.accept();
                ServerThread serverThread = new ServerThread(clientSocket);
                serverThread.start();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
