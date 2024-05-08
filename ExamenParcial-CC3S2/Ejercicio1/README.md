### Preguntas relacionadas al juego Trivia (4 puntos)

#### 1. ¿Qué caracteriza a una metodología ágil y cómo se aplicaría al desarrollo del juego de trivia?

Las metodologías ágiles se caracterizan por su iteración rápida, adaptabilidad y colaboración. Estas características se pueden aplicar al desarrollo del juego de trivia de la siguiente forma:

- **Iteración rápida:** El desarrollo se dividiría en pequeños incrementos (sprints), cada uno enfocado en una funcionalidad específica como la interfaz, las preguntas, la lógica del juego, etc. Esto permite obtener retroalimentación temprana y constante.
- **Adaptabilidad:** La estructura modular del juego facilita la implementación de cambios basados en los comentarios de los jugadores o los requisitos cambiantes.
- **Colaboración:** Involucrar a todas las partes interesadas (desarrolladores, diseñadores, jugadores) en discusiones frecuentes mejora el producto final.

#### 2. Explica cómo el principio de entrega continua podría implementarse en el proyecto del juego de trivia usando Gradle

Gradle puede usarse para automatizar la compilación, las pruebas y el despliegue, facilitando la integración y entrega continuas. Un ejemplo de cómo implementar esto incluye:

- **Automatización de compilaciones:** Configurar Gradle para que compile automáticamente el código con cada cambio.
- **Pruebas unitarias:** Usar Gradle para ejecutar pruebas unitarias tras cada compilación y generar informes.
- **Entrega continua:** Integrar el proceso de compilación y pruebas con un servidor de integración continua (CI) que despliegue automáticamente versiones probadas del juego.

#### 3. Describe el ciclo TDD y cómo se aplicaría a una nueva característica en el juego, como la implementación del sistema de puntuación

El ciclo TDD (Red-Green-Refactor) implica:

- **Red (Fallar):** Escribir una prueba que falla al principio, ya que la funcionalidad no está implementada.
- **Green (Pasar):** Implementar el código mínimo para que la prueba pase.
- **Refactor (Refactorizar):** Refactorizar el código para mejorar su calidad y mantener la prueba pasando.

Aplicando TDD al sistema de puntuación:

1. Escribir una prueba para una función `getScore` que devuelva 0 cuando no hay respuestas correctas.
2. Implementar la función `getScore` para que pase la prueba.
3. Refactorizar el código para agregar otras pruebas relacionadas con la puntuación.

#### 4. ¿Cuáles son los beneficios de utilizar TDD en el desarrollo de software y cómo ayuda a prevenir regresiones en el juego de trivia?

Los beneficios de TDD incluyen:

- **Documentación:** Las pruebas actúan como documentación de cómo debe funcionar el código.
- **Diseño dirigido:** Fomenta un diseño de código orientado a objetivos específicos.
- **Prevención de regresiones:** Las pruebas previenen cambios no deseados en el comportamiento del juego, garantizando que las funciones existentes sigan funcionando correctamente tras añadir nuevas.

#### 5. Proporciona un ejemplo de cómo podrías refactorizar un bloque de código del juego de trivia para mejorar su mantenibilidad

Supongamos que tenemos un bloque de código que repite un mensaje al validar una respuesta en el método `start` de la clase `Quiz`. Podríamos extraerlo en un método separado para mejorar su reutilización:

**Antes de la refactorización:**

```java
if (userAnswer >= 0 && userAnswer < question.getOptions().size() && question.isCorrectAnswer(userAnswer)) {
    System.out.println("¡Correcto!");
    correctAnswers++;
} else {
    System.out.println("Incorrecto. La respuesta correcta era " + (question.getCorrectOption() + 1));
    incorrectAnswers++;
}
```

**Después de la refactorización:**

```java
private void checkAnswer(Question question, int userAnswer) {
    if (userAnswer >= 0 && userAnswer < question.getOptions().size() && question.isCorrectAnswer(userAnswer)) {
        System.out.println("¡Correcto!");
        correctAnswers++;
    } else {
        System.out.println("Incorrecto. La respuesta correcta era " + (question.getCorrectOption() + 1));
        incorrectAnswers++;
    }
}

```
#### 6. Explica la importancia de la refactorización en los sprints de desarrollo ágil y cómo se integra en el proceso de TDD. Discute cómo la refactorización es una parte integral del ciclo de TDD y cómo contribuye a la mejora continua del código en un entorno ágil.
Es importante porqu permite mejorar la calidad del código sin cambiar su comportamiento externo. Esto permite mantener un código limpio, legible y fácil de mantener a medida que se avanza y se hace cambios en el proyecto.


#### 7. Describe cómo JUnit 5 puede utilizarse para implementar pruebas parametrizadas en el juego de trivia. Proporciona un ejemplo concreto. Explica la funcionalidad de las pruebas parametrizadas en JUnit 5 y cómo se podría usar para probar diferentes casos de entrada para validar la lógica del juego.

Puede usarse para ejecutar una prueba con diferentes conjuntos de datos, asi se puede probar la misma lógica con varias entradas y ver los resultados y encoentran posibles fallas o no. En el juego  podríamos usar pruebas parametrizadas para probar diferentes escenarios de preguntas y respuestas.

En este caso probare el método isCorrectAnswer() de la clase Question con diferentes opciones de respuesta.
```

public class QuestionTest {

    @DisplayName("Pruebas de respuestas correctas")
    @ParameterizedTest(name = "#{index} - Respuesta {0} es correcta")
    @MethodSource("correctAnswerProvider")
    void testIsCorrectAnswer(int userAnswer, int correctOption, boolean expectedResult) {
        Question question = new Question("¿Cuál es la capital de Francia?", List.of("Madrid", "Londres", "Paris", "Berlin"), correctOption);
        assertEquals(expectedResult, question.isCorrectAnswer(userAnswer));
    }

    static Stream<Arguments> correctAnswerProvider() {
        return Stream.of(
            arguments(0, 2, false), // Opción incorrecta
            arguments(1, 2, false), // Opción incorrecta
            arguments(2, 2, true),  // Opción correcta
            arguments(3, 2, false)  // Opción incorrecta
        );
    }
}
```
#### 8. ¿Qué características nuevas introduce JUnit 5 que son particularmente útiles para proyectos complejos como el juego de trivia?
- **Extensiones:** Permiten agregar funcionalidades adicionales a las pruebas, como la inyección de dependencias, la configuracion personalizada y la integración con otras herramientas.
- **Anotaciones:** Ofrece un conjunto ampliado de anotaciones que facilitan la escritura de pruebas más expresivas y flexibles.
- **Arquit. modular:** Cuenta con una arquitectura modular que facilita la extensibilidad y la integracion con otras herramientas y marcos de prueba.