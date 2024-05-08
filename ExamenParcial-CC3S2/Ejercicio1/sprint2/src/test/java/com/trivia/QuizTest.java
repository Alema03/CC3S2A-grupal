package com.trivia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class QuizTest {
    private Quiz quiz;
    private Question question1;
    private Question question2;

    @BeforeEach
    public void setUp() {
        InputStream simulatedInput = new ByteArrayInputStream("3\n2\nsalir\n".getBytes());
        quiz = new Quiz(simulatedInput);
        question1 = new Question("¿Cuál es la capital de Francia?", List.of("Madrid", "Londres", "Paris", "Berlin"), 2);
        question2 = new Question("¿Qué elemento tiene el símbolo químico 'O'?", List.of("Oro", "Oxigeno", "Osmio", "Oganeson"), 1);
        quiz.addQuestion(question1);
        quiz.addQuestion(question2);
    }

    // Prueba para verificar las respuestas correctas
    @Test
    public void testCorrectAnswers() {
        assertTrue(question1.isCorrectAnswer(2), "La respuesta correcta para la pregunta 1 no fue validada correctamente.");
        assertTrue(question2.isCorrectAnswer(1), "La respuesta correcta para la pregunta 2 no fue validada correctamente.");
    }

    // Prueba para verificar las respuestas incorrectas
    @Test
    public void testIncorrectAnswers() {
        assertFalse(question1.isCorrectAnswer(0), "La validación de la respuesta incorrecta falló para la pregunta 1.");
        assertFalse(question1.isCorrectAnswer(1), "La validación de la respuesta incorrecta falló para la pregunta 1.");
        assertFalse(question1.isCorrectAnswer(3), "La validación de la respuesta incorrecta falló para la pregunta 1.");

        assertFalse(question2.isCorrectAnswer(0), "La validación de la respuesta incorrecta falló para la pregunta 2.");
        assertFalse(question2.isCorrectAnswer(2), "La validación de la respuesta incorrecta falló para la pregunta 2.");
        assertFalse(question2.isCorrectAnswer(3), "La validación de la respuesta incorrecta falló para la pregunta 2.");
    }

    // Prueba para verificar indices fuera de rango
    @Test
    public void testOutOfBoundsAnswers() {
        assertThrows(IndexOutOfBoundsException.class, () -> question1.isCorrectAnswer(-1), "No se lanzó IndexOutOfBoundsException con indice -1.");
        assertThrows(IndexOutOfBoundsException.class, () -> question1.isCorrectAnswer(4), "No se lanzó IndexOutOfBoundsException con indice 4.");

        assertThrows(IndexOutOfBoundsException.class, () -> question2.isCorrectAnswer(-1), "No se lanzó IndexOutOfBoundsException con indice -1.");
        assertThrows(IndexOutOfBoundsException.class, () -> question2.isCorrectAnswer(4), "No se lanzó IndexOutOfBoundsException con indice 4.");
    }

    // Prueba para verificar el sistema de puntuacion
    @Test
    public void testScoringSystem() {
        quiz.setTotalRounds(2);
        quiz.start();

        assertEquals(2, quiz.getCorrectAnswers() + quiz.getIncorrectAnswers(), "El número de respuestas contestadas no es correcto.");
    }

    // Prueba para verificar que el juego termine correctamente al usar 'salir'
    @Test
    public void testExitGame() {
        Question question3 = new Question("¿Cuál es el río más largo del mundo?", List.of("Nilo", "Amazonas", "Yangtsé", "Misisipi"), 1);
        quiz.addQuestion(question3);
        quiz.setTotalRounds(3);

        // Simulacion basica: Configurar una entrada para que el usuario elija 'salir'
        String simulatedInput = "salir\n";
        System.setIn(new java.io.ByteArrayInputStream(simulatedInput.getBytes()));

        quiz.start();

        // Verificar que el numero total de preguntas contestadas sea menor que el total
        assertTrue(quiz.getCorrectAnswers() + quiz.getIncorrectAnswers() < 3, "El juego no se detuvo al usar 'salir'.");
    }

}