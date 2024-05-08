package com.trivia;

import java.util.List;

public class Question {
    private String description;
    private List<String> options;
    private int correctOption;

    public Question(String description, List<String> options, int correctOption) {
        if (correctOption < 0 || correctOption >= options.size()) {
            throw new IllegalArgumentException("Indice de opción correcta invalido.");
        }
        this.description = description;
        this.options = options;
        this.correctOption = correctOption;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getOptions() {
        return options;
    }

    // Verifica si una respuesta dada es correcta
    public boolean isCorrectAnswer(int option) {
        if (option < 0 || option >= options.size()) {
            throw new IndexOutOfBoundsException("Indice de respuesta fuera de rango: " + option);
        }
        return option == correctOption;
    }

    // Devuelve el indice de la respuesta correcta
    public int getCorrectOption() {
        return correctOption;
    }

    // Muestra la pregunta con sus opciones de respuesta
    public void display() {
        System.out.println(description);
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ") " + options.get(i));
        }
    }
}

