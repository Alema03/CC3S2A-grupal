# Sprint 1: Estructura básica y preguntas 

## Objetivo: 

- Configurar el entorno del proyecto y desarrollar la lógica básica para la manipulación y presentación de preguntas y respuestas.

## Tareas:
1. Configurar el entorno del proyecto utilizando Gradle, incluyendo la dependencia para JUnit 5.

```
    plugins {
    id 'java'
}

group = 'org.example'
version = '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    testImplementation platform('org.junit:junit-bom:5.9.1')
    testImplementation 'org.junit.jupiter:junit-jupiter'
}

test {
    useJUnitPlatform()
}

```

2. Desarrollar la clase Question con atributos para la descripción de la pregunta, las opciones disponibles y la respuesta correcta.

```
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
```
3. Implementar la clase Quiz que manejará el flujo del juego, incluyendo cargar preguntas,presentarlas al usuario y recibir respuestas.

```
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

        }

        // Mostrar el resultado final
        System.out.println("\nJuego terminado. Aquí está tu puntuación:");
        System.out.println("Preguntas contestadas: " + questions.size());
        System.out.println("Respuestas correctas: " + score);
        System.out.println("Respuestas incorrectas: " + (questions.size() - score));
    }

}
```


4. Programar la lógica para mostrar preguntas de manera secuencial y permitir al usuario ingresar respuestas.
```
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
```

5. Escribir pruebas unitarias para asegurar que las preguntas se carguen correctamente y que las respuestas sean validadas adecuadamente.
```
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
```
## Casos de prueba para JUnit:

• Verificar que la carga de preguntas desde un repositorio o archivo esté correcta.

• Asegurar que el sistema acepte y valide respuestas de manera adecuada, incluyendo la captura de entradas inválidas como letras o números fuera del rango.