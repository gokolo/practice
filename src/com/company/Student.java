package com.company;

public class Student extends Person{
    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] scores) {
        super(firstName, lastName, identification);

        testScores = scores;
    }

    public char calculate() {
        int sumOfScores = 0;
        for (int score: testScores) {
            sumOfScores+=score;
        }
        int avg = sumOfScores/testScores.length;
        char grade = 'T';
        if (avg>=90 && avg<=100) {
            grade='O';
        } else if (avg>=80 && avg<90) {
            grade='E';
        } else if (avg>=70 && avg<80) {
            grade='A';
        } else if (avg>=55 && avg<70) {
            grade='P';
        } else if (avg>=40 && avg<=55) {
            grade='D';
        } else if (avg<40) {
            grade='T';
        }

        return grade;
    }
}