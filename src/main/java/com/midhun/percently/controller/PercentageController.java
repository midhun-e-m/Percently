package com.midhun.percently.controller;

import com.midhun.percently.service.PercentageService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PercentageController {

    private final PercentageService service;

    public PercentageController(PercentageService service) {
        this.service = service;
    }

    @GetMapping("/of")
    public double percentageOf(
            @RequestParam double percentage,
            @RequestParam double number) {

        return service.percentageOf(percentage, number);
    }

}