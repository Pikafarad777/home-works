package kz.kaznu.nurali.HW12;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(7777);
        System.out.println("Сервер запущен...");

        while (true) {
            Socket clientSocket = serverSocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            out.println("Введите два числа и операцию (+, -, *, /) через пробел:");
            String[] input = in.readLine().split(" ");
            double num1 = Double.parseDouble(input[0]);
            double num2 = Double.parseDouble(input[1]);
            String operation = input[2];

            double result = switch (operation) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                case "/" -> num2 != 0 ? num1 / num2 : Double.NaN;
                default -> Double.NaN;
            };
            out.println("Результат: " + result);
        }
    }
}

