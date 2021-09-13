package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Velkommen til Enigma-prototypen");
        String line;
        Scanner s = new Scanner(System.in);
        System.out.print("Vælg mellem encoding eller decoding e/d");
        line = s.nextLine();
        String medStort = line.toUpperCase();
        if (line.equals("e")) {
            System.out.println("Du har valgt encoding, indtast en tekst");
            line = s.nextLine();
            metode
            output
        } else if (line.equals("d")) {
            System.out.println("Du har valgt decoding, indtast en liste af tal");
            line = s.nextLine();
            metode
            output
        } else {
            System.out.println("Fejl, brug venligst svarmulighederne e og d");
        }
    }
}
