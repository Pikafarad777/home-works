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
        File selectedFile = new File(fileName);

        if (!selectedFile.exists() || !selectedFile.isFile()){
            System.out.println("Файл не существует");
            return;
        }

    }
}

