# Sprint 2: Lógica del juego y puntuación 

## Objetivo: 
Implementar un sistema de puntuación y refinar la lógica del juego para manejar múltiples rondas y terminación del juego.
## Tareas:
1. Ampliar la clase Quiz para incluir un sistema de puntuación que rastree las respuestas correctas e incorrectas.
```
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

        showResults();
    }

    // Metodo para mostrar los resultados finales
    private void showResults() {
        System.out.println("\nJuego terminado. Aquí está tu puntuación:");
        System.out.println("Preguntas contestadas: " + (correctAnswers + incorrectAnswers));
        System.out.println("Respuestas correctas: " + correctAnswers);
        System.out.println("Respuestas incorrectas: " + incorrectAnswers);
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

```

2. Implementar lógica para múltiples rondas de juego, permitiendo al juego continuar hasta que se completen todas las preguntas.
```
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

        showResults();
    }
```


3. Crear un mecanismo para terminar el juego una vez que se hayan respondido todas las preguntas, y mostrar el resultado final al usuario.
```
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

        showResults();
    }
```

4. Escribir pruebas unitarias para verificar la precisión del sistema de puntuación y la correcta funcionalidad del flujo del juego.
```
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
```

## Casos de prueba para JUnit:
• Asegurar que la puntuación se incremente correctamente con cada respuesta correcta.

• Comprobar que el juego concluya adecuadamente después de la última ronda.