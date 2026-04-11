package com.employee;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EvaluationController {

    private final Evaluation evaluation = new Evaluation();

    @GetMapping("/evaluate")
    public String evaluate(@RequestParam int score) {
        return evaluation.evaluatePerformance(score);
    }
}