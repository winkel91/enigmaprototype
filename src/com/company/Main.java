package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char letter = "E";
        int number = letterToNumber(letter);
        System.out.printf("Bogstavet %c bliver til %d", letter, number);
        //System.out.println("Velkommen til Enigma-prototypen");
        //Scanner s = new Scanner(System.in);
        //System.out.print("Vælg mellem encoding eller decoding e/d");
        //String tekst = s.nextLine().toUpperCase();
        String plaintext ="ABE";
        int[] cipher = textToListofNumbers(plaintext);
        System.out.println(cipher);
        System.out.println(Arrays.toString(cipher));
        int number = 1;
        char letter = numberToLetter(number);
        System.out.printf("Tallet %d bliver til bogstavet %c/n", number, letter);
        int[] cipher = {1,2,5,11,1,20};
        String plaintext = listOfNumbersToText(cipher);
        System.out.println("Den krypterede tekst er: ");
        System.out.println(plaintext);
        //int tal[] = konverterTekstTilTal(tekst);
        //String talListe = lavListeAfTalTilString(tal);
        //String line = line.toUpperCase();
        /*if (tekst.equals("E")) {
            System.out.println("Du har valgt encoding, indtast en tekst");
            tekst = s.nextLine();
            System.out.print("Dette giver resultatet: "+tal);
            //metode
            //output
        } else if (tekst.equals("D")) {
            System.out.println("Du har valgt decoding, indtast en liste af tal");
            tekst = s.nextLine();
            System.out.println("Dette giver resultatet: " + talListe);
            //metode
            //output
        } else {
            System.out.println("Fejl, brug venligst svarmulighederne e og d");
        }
    } */
    public static int[] textToListofNumbers(String text) {
        int[] numbers = new int[text.length()];
        char[] letters = text.toCharArray();
        for(int i=0; i< letters.length(), i++) {
            String letter = text.substring(i,i+1);
            text.charAt()
            numbers[i] = letterToNumber(letters[i]);
            liste[i] = number;
            }
        //int[] liste = {1,2,5};
        //liste[0] = 1;
        //liste[1] = 2;
        //liste[2] = 3;
        return numbers;
    }
    //public static int[] konverterTekstTilTal(String tekst) {}
    public static int letterToNumber(char letter) {
        /*char alfabet = {"ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ"};
        int[] numre = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29};
        int nummer = 0;
        for(int i =0; i < alfabet.length; i++) {
            char bogstavetViTjekker = alfabet[i];
            if( letter == bogstavetViTjekker ) {
                System.out.printf("Funder bogstav %c på index %d", bogstavetViTjekker, i);
                //nummer = numre[i];
                System.out.printf("og det har nummer: %d/n", nummer);
            }
        }
         */
        String alfabetet = "ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";
        int num = alfabetet.indexOf(letter);
        return num
    }
    public static String listOfNumbersToText(int[] numbers) {
        Stringbuilder ? text="";
        for(int number : numbers) {
            //int number = numbers[i];
            char letter = numberToLetter(number);
            text = append(letter);
        }
        return text.toString();
        }
    public static char numberToLetter(int number) {
        final String alfabetet = " ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";
        //char letter = alfabetet.charAt(number);
        return alfabetet.charAt(number);
        }
}