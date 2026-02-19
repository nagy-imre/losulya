package com.example;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Add meg a ló mellkas kerületét (cm): ");
        double mellkasKerulet = sc.nextDouble();

        System.out.println("Add meg a ló hosszát (cm): ");
        double hossz = sc.nextDouble();

        double loSulya = szamol(mellkasKerulet, hossz);

        System.out.printf("A „Carroll és Huntington” képlet alapján a ló súlya: %.2f kg\n", loSulya);

        sc.close();
    }

    public static double szamol(double mellkasKerulet, double hossz) {
        return (mellkasKerulet * mellkasKerulet * hossz) / 11877;
    }
}
