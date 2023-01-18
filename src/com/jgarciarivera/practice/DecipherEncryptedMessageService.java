package com.jgarciarivera.practice;
import java.util.*;

// Code to decipher encrypted messages from To Hunt A Killer: Death At The Dive Bar game
public class DecipherEncryptedMessageService {

    public String decipher(String original, int[] cipher) {
        HashMap<Character, Integer> alphabet = initializeAlphabet();
        HashMap<Integer, Character> invertedAlphabet = initializeInvertedAlphabet();
        int cipherIndex = 0;
        String result = "";

        for (char letter : original.toCharArray()) {
            if (cipherIndex == cipher.length) {
                cipherIndex = 0;
            }

            char translatedLetter = letter;

            if (alphabet.containsKey(letter)) {
                int letterIndex = alphabet.get(letter) - cipher[cipherIndex];
                if (letterIndex < 1) {
                    letterIndex = letterIndex + alphabet.size();
                }
                translatedLetter = invertedAlphabet.get(letterIndex);
                cipherIndex++;
            }
            result = result + translatedLetter;
        }

        return result;
    }

    private HashMap<Character, Integer> initializeAlphabet() {
        HashMap<Character, Integer> alphabet = new HashMap<Character, Integer>();
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
        HashMap<Integer, Character> alphabet = new HashMap<Integer, Character>();
        alphabet.put(1, 'A');
        alphabet.put(2, 'B');
        alphabet.put(3, 'C');
        alphabet.put(4, 'D');
        alphabet.put(5, 'E');
        alphabet.put(6, 'F');
        alphabet.put(7, 'G');
        alphabet.put(8, 'H');
        alphabet.put(9, 'I');
        alphabet.put(10, 'J');
        alphabet.put(11, 'K');
        alphabet.put(12, 'L');
        alphabet.put(13, 'M');
        alphabet.put(14, 'N');
        alphabet.put(15, 'O');
        alphabet.put(16, 'P');
        alphabet.put(17, 'Q');
        alphabet.put(18, 'R');
        alphabet.put(19, 'S');
        alphabet.put(20, 'T');
        alphabet.put(21, 'U');
        alphabet.put(22, 'V');
        alphabet.put(23, 'W');
        alphabet.put(24, 'X');
        alphabet.put(25, 'Y');
        alphabet.put(26, 'Z');
        return alphabet;
    }
}
