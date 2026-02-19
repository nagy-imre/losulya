/*
* File: Solution.java
* Author: Nagy Imre
* Copyright: 2026, Nagy Imre
* Group: II-E
* Date: 2026-02-19
* Github: https://github.com/nagy-imre
* Licenc: MIT
*/

package com.example;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Add meg a ló mellkas kerületét (cm): ");
            double mellkasKerulet = sc.nextDouble();
            
            System.out.println("Add meg a ló hosszát (cm): ");
            double hossz = sc.nextDouble();
            
            double loSulya = szamol(mellkasKerulet, hossz);
            
            System.out.printf("A „Carroll és Huntington” képlet alapján a ló súlya: %.2f kg\n", loSulya);
        }
    }

    public static double szamol(double mellkasKerulet, double hossz) {
        return (mellkasKerulet * mellkasKerulet * hossz) / 11877;
    }
}
