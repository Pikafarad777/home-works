package kz.kaznu.nurali.HW11;

import java.io.*;
import java.util.Scanner;


public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Доступные текстовые файлы: ");
        File folder = new File("src/main/java/kz/kaznu/nurali/HW11");
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));
        if (files==null || files.length==0){
            System.out.println("Файлы отсутствуют");
            return;
        }

        for (File file : files){
            System.out.println("- "+file.getName());
        }

        System.out.println("Введите имя файла для работы: ");
        String fileName = scanner.nextLine();
        File selectedFile = new File(folder, fileName);

        if (!selectedFile.exists() || !selectedFile.isFile()){
            System.out.println("Файл не существует");
            return;
        }
        System.out.println("Содержимое файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
            return;
        }

        System.out.println("Введите строку для добавления в файл: ");
        String userInput = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile, true))) {
            writer.write(userInput);
            writer.newLine();
            System.out.println("Строка успешно добавлена.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }



    }
}

