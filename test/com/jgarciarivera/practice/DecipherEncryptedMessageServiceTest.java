package com.jgarciarivera.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecipherEncryptedMessageServiceTest {

    DecipherEncryptedMessageService decipherEncryptedMessageService;

    @BeforeEach
    public void setUp() {
        decipherEncryptedMessageService = new DecipherEncryptedMessageService();
    }

    @Test
    public void DecipherEncryptedMessageService_Decipher_ValidString_ReturnsExpectedMessage() {
        // Arrange
        String expected = "CAN'T WAIT TO SEE YOU MIND IF I BORROW THE CAR AGAIN? -C";
        String encrypted = "DDO'U ZBJW UP VFF BPV PJOG JG L CPUSPZ UIH DBU BHDJO? -F";
        int[] cipher = { 1, 3, 1 };

        // Act
        String actual = decipherEncryptedMessageService.decipher(encrypted, cipher);

        // Assert
        assertEquals(actual, expected);
    }
}