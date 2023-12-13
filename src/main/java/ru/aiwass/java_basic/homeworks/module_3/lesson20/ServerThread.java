package ru.aiwass.java_basic.homeworks.module_3.lesson20;

import java.io.*;
import java.net.Socket;

public class ServerThread extends Thread {
    private Socket clientSocket;

    public ServerThread(Socket socket) {
        this.clientSocket = socket;
    }

    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             OutputStream outputStream = clientSocket.getOutputStream()) {

            String availableOperations = "Доступные операции: +,-,*,/";
            outputStream.write(availableOperations.getBytes());
            outputStream.write('\n');

            String userInput = reader.readLine();

            String[] inputArray = userInput.split(" ");
            double operand1 = Double.parseDouble(inputArray[0]);
            double operand2 = Double.parseDouble(inputArray[1]);
            String operation = inputArray[2];

            double result = 0;
            switch (operation) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    if (operand2 != 0) {
                        result = operand1 / operand2;
                    } else {
                        System.out.println("Деление на ноль!");
                    }
                    break;
                default:
                    System.out.println("Некорректная операция!");
            }

            String resultString = "Результат: " + result;
            outputStream.write(resultString.getBytes());
            outputStream.write('\n');

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
