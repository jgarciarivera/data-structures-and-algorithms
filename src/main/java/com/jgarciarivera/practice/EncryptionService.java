package com.jgarciarivera.practice;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

// Code to decrypt encrypted messages from To Hunt A Killer: Death At The Dive Bar game
public class EncryptionService {

    public String decrypt(String message, int[] cipher) {

        BiMap<Character, Integer> alphabet = initializeAlphabet();
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
                translated = alphabet.inverse().get(letterIndex);
                cipherIndex++;
            }

            decrypted = decrypted + translated;
        }

        return decrypted;
    }

    private BiMap<Character, Integer> initializeAlphabet() {
        BiMap<Character, Integer> alphabet = HashBiMap.create();
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
}
