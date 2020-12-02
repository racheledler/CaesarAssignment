package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Plaintext: ");
        String plaintext = input.nextLine();

        System.out.println("Rotation: "); // prompt user for a number
        int rotation = input.nextInt();
        String ciphertext = "";
        char alphabet;
        for (int i=0; i < plaintext.length(); i++)
        {
            alphabet = plaintext.charAt(i); // shift by i
            if (alphabet >= 'a' && alphabet <= 'z')
            {
                alphabet = (char) (alphabet + rotation);
                if (alphabet > 'z') {
                    alphabet = (char) (alphabet + 'a' - 'z' - 1);
                }
                ciphertext = ciphertext + alphabet;
            }
            else if (alphabet >= 'A' && alphabet <='Z') {
                alphabet = (char) (alphabet + rotation);

                if (alphabet > 'Z') {
                    alphabet = (char) (alphabet + 'A' - 'Z' - 1);
                }
                ciphertext = ciphertext + alphabet;
            }
            else {
                ciphertext = ciphertext + alphabet;
            }




    }

        System.out.println("Ciphertext: " + ciphertext);
} }
