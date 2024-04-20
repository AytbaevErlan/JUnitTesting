package org.example.preparingcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class TestableCodeTest {
    private static TestableCode tc = new TestableCode();

    @Test
    @DisplayName("Test greeting special name")
    public void testSpecialNameGreeting() {
        String name = "Noah";
        String outcome = "I do not know you, Noah. But you are in our VIP list!";
        assertEquals(outcome, tc.greetUser(name));
    }

    @Test
    @DisplayName("Test greeting special and known name")
    public void testSpecialNameAndKnownNameGreeting() {
        String name = "Tess";
        String outcome = "I know you, Tess.You're even on VIP list!";
        assertEquals(outcome, tc.greetUser(name));
    }

    @Test
    @DisplayName("Test greeting unknown name")
    public void testUnknownNameGreeting() {
        String name = "Heh";
        assertTrue(tc.greetUser(name).contains("stranger"));
    }

    @Test
    @DisplayName("Test part of the day greeting")
    public void testDayPart() {
        LocalDateTime dateTime = LocalDateTime.of(2024,4, 20, 1, 30);

        String outcome = "Good Night, ";
        assertEquals(outcome, tc.greetDay(dateTime));
    }
}
