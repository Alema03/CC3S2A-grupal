package com.trivia;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.addQuestion(new Question("¿Cuál es la capital de Francia?", List.of("Madrid", "Londres", "París", "Berlín"), 2));
        quiz.start();
    }
}