package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerCharacterTest {

    @Test
    void getX_shouldReturnZero_whenGameStarts() {
        assertEquals(0, PlayerCharacter.getX());
    }
}
