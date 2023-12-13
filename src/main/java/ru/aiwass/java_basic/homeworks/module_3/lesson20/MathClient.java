package ru.aiwass.java_basic.homeworks.module_3.lesson20;

import java.io.*;
import java.net.Socket;

public class MathClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345);
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             OutputStream outputStream = socket.getOutputStream()){
            String availableOperations = reader.readLine();
            System.out.println(availableOperations);


            System.out.print("Введите первое число: ");
            double operand1 = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());

            System.out.print("Введите второе число: ");
            double operand2 = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());

            System.out.print("Введите операцию (+, -, *, /): ");
            String operation = new BufferedReader(new InputStreamReader(System.in)).readLine();

            String userInput = operand1 + " " + operand2 + " " + operation;
            outputStream.write(userInput.getBytes());
            outputStream.write('\n');

            String result = reader.readLine();
            System.out.println(result);

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
