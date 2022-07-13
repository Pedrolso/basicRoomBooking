package application;


import application.entities.Room;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Room[] room = new Room[10]; // QUANTIAS DE QUARTO

        System.out.print("How many rooms will be rented? ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("Rent #" + i);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int numero = sc.nextInt();

            room[numero] = new Room(name, email);

        }
        System.out.println("Busy rooms: ");
        for (int i = 0; i < room.length; i++) {
            if (room[i] != null) {
                System.out.println(i + "" + room[i]);
            }
        }


    }
}
