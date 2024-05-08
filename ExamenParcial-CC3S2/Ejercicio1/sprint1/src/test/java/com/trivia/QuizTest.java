package com.trivia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class QuizTest {
    private Quiz quiz;
    private Question question1;
    private Question question2;

    @BeforeEach
    public void setUp() {
        quiz = new Quiz();
        question1 = new Question("¿Cuál es la capital de Francia?", List.of("Madrid", "Londres", "París", "Berlín"), 2);
        question2 = new Question("¿Qué elemento tiene el símbolo químico 'O'?", List.of("Oro", "Oxígeno", "Osmio", "Oganesón"), 1);
        quiz.addQuestion(question1);
        quiz.addQuestion(question2);
    }

    // Prueba para verificar las respuestas correctas
    @Test
    public void testCorrectAnswers() {
        // Pregunta 1: Respuesta correcta
        assertTrue(question1.isCorrectAnswer(2), "La respuesta correcta para la pregunta 1 no fue validada correctamente.");

        // Pregunta 2: Respuesta correcta
        assertTrue(question2.isCorrectAnswer(1), "La respuesta correcta para la pregunta 2 no fue validada correctamente.");
    }

    @Test
    public void testIncorrectAnswers() {
        // Pregunta 1: Respuestas incorrectas
        assertFalse(question1.isCorrectAnswer(0), "La validación de la respuesta incorrecta falló para la pregunta 1.");
        assertFalse(question1.isCorrectAnswer(1), "La validación de la respuesta incorrecta falló para la pregunta 1.");
        assertFalse(question1.isCorrectAnswer(3), "La validación de la respuesta incorrecta falló para la pregunta 1.");

        // Pregunta 2: Respuestas incorrectas
        assertFalse(question2.isCorrectAnswer(0), "La validación de la respuesta incorrecta falló para la pregunta 2.");
        assertFalse(question2.isCorrectAnswer(2), "La validación de la respuesta incorrecta falló para la pregunta 2.");
        assertFalse(question2.isCorrectAnswer(3), "La validación de la respuesta incorrecta falló para la pregunta 2.");
    }

    @Test
    public void testOutOfBoundsAnswers() {
        // Pregunta 1: Indices fuera de rango
        assertThrows(IndexOutOfBoundsException.class, () -> question1.isCorrectAnswer(-1), "No se lanzó IndexOutOfBoundsException con indice -1.");
        assertThrows(IndexOutOfBoundsException.class, () -> question1.isCorrectAnswer(4), "No se lanzó IndexOutOfBoundsException con indice 4.");

        // Pregunta 2: Indices fuera de rango
        assertThrows(IndexOutOfBoundsException.class, () -> question2.isCorrectAnswer(-1), "No se lanzó IndexOutOfBoundsException con indice -1.");
        assertThrows(IndexOutOfBoundsException.class, () -> question2.isCorrectAnswer(4), "No se lanzó IndexOutOfBoundsException con indice 4.");
    }

}