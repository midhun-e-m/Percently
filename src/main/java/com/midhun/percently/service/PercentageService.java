package com.midhun.percently.service;

import org.springframework.stereotype.Service;

@Service
public class PercentageService {

    public double percentageOf(double percentage, double number) {
        return (percentage * number) / 100;
    }

    public double increase(double number, double percentage) {
        return number + ((percentage * number) / 100);
    }

    public double decrease(double number, double percentage) {
        return number - ((percentage * number) / 100);
    }

    public double findPercentage(double value, double total) {
        return (value / total) * 100;
    }
}