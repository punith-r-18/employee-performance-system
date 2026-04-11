package com.employee;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvaluationTest {

    Evaluation evaluation = new Evaluation();

    @Test
    void testExcellentRating() {
        assertEquals("Excellent", evaluation.evaluatePerformance(90));
    }

    @Test
    void testGoodRating() {
        assertEquals("Good", evaluation.evaluatePerformance(75));
    }

    @Test
    void testAverageRating() {
        assertEquals("Average", evaluation.evaluatePerformance(55));
    }

    @Test
    void testPoorRating() {
        assertEquals("Poor", evaluation.evaluatePerformance(30));
    }

    @Test
    void testInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            evaluation.evaluatePerformance(-10);
        });
    }
}