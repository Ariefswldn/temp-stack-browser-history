package com.github.affandes.kuliah.pm;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> history = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Browser History Menu ===");
            System.out.println("1. Kunjungi halaman baru");
            System.out.println("2. Back");
            System.out.println("3. Tampilkan history");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan URL: ");
                    String url = scanner.nextLine();
                    history.push(url);
                    System.out.println("Berhasil mengunjungi: " + url);
                    break;
                case 2:
                    if (!history.isEmpty()) {
                        String last = history.pop();
                        System.out.println("Kembali dari: " + last);
                    } else {
                        System.out.println("History kosong!");
                    }
                    break;
                case 3:
                    System.out.println("=== History Browser ===");
                    if (history.isEmpty()) {
                        System.out.println("History kosong!");
                    } else {
                        for (String h : history) {
                            System.out.println(h);
                        }
                    }
                    break;
                case 0:
                    System.out.println("Keluar program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
