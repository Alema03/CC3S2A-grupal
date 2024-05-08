package com.trivia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private int score;
    private Scanner scanner;

    public Quiz() {
        this.questions = new ArrayList<>();
        this.score = 0;
        this.scanner = new Scanner(System.in);
    }

    // Metodo para agregar una pregunta al cuestionario
    public void addQuestion(Question question) {
        questions.add(question);
    }

    // Metodo para iniciar el juego y manejar el flujo
    public void start() {
        System.out.println("¡Bienvenido al Juego de Trivia!");
        System.out.println("Responde las siguientes preguntas seleccionando el número de la opción correcta.");

        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);
            System.out.println("\nPregunta " + (i + 1) + ":");
            question.display();

            System.out.print("Tu respuesta: ");
            int userAnswer = scanner.nextInt() - 1;

            if (question.isCorrectAnswer(userAnswer)) {
                System.out.println("¡Correcto!");
                score++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta era " + (question.getCorrectOption() + 1));
            }
        }

        // Mostrar el resultado final
        System.out.println("\nJuego terminado. Aquí está tu puntuación:");
        System.out.println("Preguntas contestadas: " + questions.size());
        System.out.println("Respuestas correctas: " + score);
        System.out.println("Respuestas incorrectas: " + (questions.size() - score));
    }

}

