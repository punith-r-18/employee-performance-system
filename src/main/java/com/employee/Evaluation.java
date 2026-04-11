package com.employee;

public class Evaluation {

    public String evaluatePerformance(int score) {

        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Invalid score");
        }

        if (score >= 85) {
            return "Excellent";
        } else if (score >= 70) {
            return "Good";
        } else if (score >= 50) {
            return "Average";
        } else {
            return "Poor";
        }
    }
}