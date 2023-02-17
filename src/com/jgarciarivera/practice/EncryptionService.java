package com.jgarciarivera.practice;
import java.util.*;

// Code to decrypt encrypted messages from To Hunt A Killer: Death At The Dive Bar game
public class EncryptionService {

    public String decrypt(String message, int[] cipher) {

        HashMap<Character, Integer> alphabet = initializeAlphabet();
        HashMap<Integer, Character> invertedAlphabet = initializeInvertedAlphabet();
        int cipherIndex = 0;
        String decrypted = "";

        for (char letter : message.toCharArray()) {

            if (cipherIndex == cipher.length) {
                cipherIndex = 0;
            }

            char translated = letter;

            if (alphabet.containsKey(letter)) {
                int letterIndex = alphabet.get(letter) - cipher[cipherIndex];
                if (letterIndex < 1) {
                    letterIndex = letterIndex + alphabet.size();
                }
                translated = invertedAlphabet.get(letterIndex);
                cipherIndex++;
            }

            decrypted = decrypted + translated;
        }

        return decrypted;
    }

    private HashMap<Character, Integer> initializeAlphabet() {
        HashMap<Character, Integer> alphabet = new HashMap<>();
        alphabet.put('A', 1);
        alphabet.put('B', 2);
        alphabet.put('C', 3);
        alphabet.put('D', 4);
        alphabet.put('E', 5);
        alphabet.put('F', 6);
        alphabet.put('G', 7);
        alphabet.put('H', 8);
        alphabet.put('I', 9);
        alphabet.put('J', 10);
        alphabet.put('K', 11);
        alphabet.put('L', 12);
        alphabet.put('M', 13);
        alphabet.put('N', 14);
        alphabet.put('O', 15);
        alphabet.put('P', 16);
        alphabet.put('Q', 17);
        alphabet.put('R', 18);
        alphabet.put('S', 19);
        alphabet.put('T', 20);
        alphabet.put('U', 21);
        alphabet.put('V', 22);
        alphabet.put('W', 23);
        alphabet.put('X', 24);
        alphabet.put('Y', 25);
        alphabet.put('Z', 26);
        return alphabet;
    }

    private HashMap<Integer, Character> initializeInvertedAlphabet() {
        HashMap<Integer, Character> inverted = new HashMap<>();
        inverted.put(1, 'A');
        inverted.put(2, 'B');
        inverted.put(3, 'C');
        inverted.put(4, 'D');
        inverted.put(5, 'E');
        inverted.put(6, 'F');
        inverted.put(7, 'G');
        inverted.put(8, 'H');
        inverted.put(9, 'I');
        inverted.put(10, 'J');
        inverted.put(11, 'K');
        inverted.put(12, 'L');
        inverted.put(13, 'M');
        inverted.put(14, 'N');
        inverted.put(15, 'O');
        inverted.put(16, 'P');
        inverted.put(17, 'Q');
        inverted.put(18, 'R');
        inverted.put(19, 'S');
        inverted.put(20, 'T');
        inverted.put(21, 'U');
        inverted.put(22, 'V');
        inverted.put(23, 'W');
        inverted.put(24, 'X');
        inverted.put(25, 'Y');
        inverted.put(26, 'Z');
        return inverted;
    }
}
