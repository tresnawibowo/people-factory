import model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ServiceableVehicle motor = new Motorcycle();
        ServiceableVehicle mobil = new Car();
        Vehicle sepeda = new Bike();
        motor.move();
        motor.canBeServiced();
        mobil.move();
        mobil.canBeServiced();
        sepeda.move();

//        Mahasiswa mhs1 = new Mahasiswa("RESTU", "22211");
//        Mahasiswa mhs2 = new Mahasiswa();
//        mhs1.tampilkanData();
//        mhs2.setName("ABCDE");
//        mhs2.setNim("12231");
//        mhs2.tampilkanData();

//        System.out.print("Insert number: ");
//        int num = sc.nextInt();
//        checkEvenOdd(num);
//        Random rand = new Random();
//        int number = rand.nextInt(10) + 1;
//        int guess;
//        System.out.print("Tebak angka (1-10): ");
//        guess = sc.nextInt();
//        while (guess != number) {
//            if (guess == -1) return;
//            System.out.print("Tebak angka (1-10): ");
//            guess = sc.nextInt();
//        }
//        do {
//            System.out.print("Tebak angka (1-10): ");
//            guess = sc.nextInt();
//            if (guess <= 0) return;
//        } while (guess != number);
//        do {
//            System.out.print("Tebak angka (1-10): ");
//            guess = sc.nextInt();
//            if (guess <= 0) return;
//        } while (guess != number);
//        System.out.println("Benar! Angka = " + number);


//        if (guess == number) {
//        } else {
//            System.out.println("Salah, angka = " + number);
//        }
//        int x = 2;
//        checkNumber(x);
//
//        int hari = 3;
//        printHari(hari);
//
//        Integer hari2 = 4;
//        printHariInteger(hari2);
    }

    private static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

    private static void printHari(int hari) {
        switch (hari) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            default:
                System.out.println("Hari tidak ditemukan");
        }
    }

    private static void printHariInteger(Integer hari) {
        if (hari == null || hari < 1 || hari > 7) {
            System.out.println("Hari tidak ditemukan, value tidak sesuai: " + hari);
            return;
        }
        switch (hari) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            default:
                System.out.println("Hari tidak ditemukan");
        }
    }
}