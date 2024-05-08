package com.trivia;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private int correctAnswers;
    private int incorrectAnswers;
    private int totalRounds;
    private Scanner scanner;

    public Quiz() {
        this(System.in);
    }

    public Quiz(InputStream inputStream) {
        this.questions = new ArrayList<>();
        this.correctAnswers = 0;
        this.incorrectAnswers = 0;
        this.totalRounds = 10;
        this.scanner = new Scanner(inputStream);
    }

    public void setTotalRounds(int totalRounds) {
        this.totalRounds = totalRounds;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void start() {
        System.out.println("¡Bienvenido al Juego de Trivia!");
        System.out.println("Responde las siguientes preguntas seleccionando el numero de la opcion correcta.");
        System.out.println("Para salir en cualquier momento, escribe 'salir'.");

        int rounds = Math.min(totalRounds, questions.size());

        for (int i = 0; i < rounds; i++) {
            Question question = questions.get(i);
            System.out.println("\nPregunta " + (i + 1) + ":");
            question.display();

            System.out.print("Tu respuesta (o 'salir'): ");
            String input = scanner.next();

            // Permitir al usuario salir escribiendo 'salir'
            if (input.equalsIgnoreCase("salir")) {
                System.out.println("Has decidido salir del juego.");
                break;
            }

            // Convertir la respuesta a un número y ajustar el índice a base 0
            int userAnswer;
            try {
                userAnswer = Integer.parseInt(input) - 1;
            } catch (NumberFormatException e) {
                System.out.println("Respuesta no válida. Por favor, selecciona un número.");
                incorrectAnswers++;
                continue;
            }

            // Validar la respuesta del usuario
            if (userAnswer >= 0 && userAnswer < question.getOptions().size() && question.isCorrectAnswer(userAnswer)) {
                System.out.println("¡Correcto!");
                correctAnswers++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta era " + (question.getCorrectOption() + 1));
                incorrectAnswers++;
            }
        }

        showDetailedResults();
    }

    // Metodo para mostrar los resultados finales
    void showDetailedResults() {
        System.out.println("\nResumen del Juego:");
        System.out.println("Preguntas contestadas: " + (correctAnswers + incorrectAnswers));
        System.out.println("Respuestas correctas: " + correctAnswers);
        System.out.println("Respuestas incorrectas: " + incorrectAnswers);

        System.out.println("\nDetalles de las respuestas:");
        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);
            String result = question.isCorrectAnswer(question.getCorrectOption()) ? "Correcta" : "Incorrecta";
            System.out.println("Pregunta " + (i + 1) + ": " + question.getDescription() + " - Respuesta: " + result);
        }
    }


    public List<Question> getQuestions() {
        return questions;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public int getIncorrectAnswers() {
        return incorrectAnswers;
    }
}
