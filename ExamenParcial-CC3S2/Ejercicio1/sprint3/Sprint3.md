# Sprint 3: Mejoras en la interfaz y refinamiento 

## Objetivo: 
Mejorar la interfaz de usuario en la consola para hacerla más amigable y agregar características adicionales como niveles de dificultad.

## Tareas:
1. Refinar la presentación de preguntas y respuestas en la consola para mejorar la legibilidad y la interacción del usuario.
```

```
2. Introducir niveles de dificultad para las preguntas, permitiendo que el juego ajuste dinámicamente la dificultad basándose en el desempeño del jugador.
```

```
3. Implementar una funcionalidad para mostrar un resumen detallado al final del juego, incluyendo la puntuación total, respuestas correctas e incorrectas.

```
private void showDetailedResults() {
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
```
4. Desarrollar pruebas unitarias adicionales para validar las nuevas funcionalidades y las mejoras realizadas en la interfaz de usuario.
```

```
## Casos de prueba para JUnit:
• Verificar que las preguntas se muestren con el formato y claridad adecuados.

• Comprobar que el resumen final refleje de manera precisa la puntuación y las respuestas del
jugador.

