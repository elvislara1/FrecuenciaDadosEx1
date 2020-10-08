package com.company;

import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random rnd = new Random();
        int dado1;
        int dado2;

        System.out.println("¡¿Cuantas veces quieres lanzar los dados?!");
        int lanzamiento = scanner.nextInt();

        int array[] = new int[12];
        for (int x = 0; x < lanzamiento; x++) {
            dado1 = rnd.nextInt(6)+1;
            dado2 = rnd.nextInt(6)+1;

            array[(dado1 + dado2 - 1)]++;
        }
        System.out.println("Lanzamiento....");
        System.out.println("Resultado: ");
        for (int x = 1; x < array.length; x++) {
            System.out.println((x + 1) + " " + "---> " + " " + array[x] + " veces");
        }
    }
}
