package com.jgarciarivera.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EncryptionServiceTest {

    EncryptionService encryptionService;

    @BeforeEach
    public void setUp() {
        encryptionService = new EncryptionService();
    }

    @Test
    public void EncryptionService_Decrypt_ValidString_ReturnsExpectedMessage() {
        // Arrange
        String expected = "CAN'T WAIT TO SEE YOU MIND IF I BORROW THE CAR AGAIN? -C";
        String encrypted = "DDO'U ZBJW UP VFF BPV PJOG JG L CPUSPZ UIH DBU BHDJO? -F";
        int[] cipher = { 1, 3, 1 };

        // Act
        String actual = encryptionService.decrypt(encrypted, cipher);

        // Assert
        assertEquals(actual, expected);
    }
}