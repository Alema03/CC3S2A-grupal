# Sprint 1: Configuración inicial y funcionalidad básica 

En este sprint, se configura el entorno y se implementa la lógica básica del juego

### Clase Word
La clase Word será responsable de almacenar la palabra correcta y evaluar las suposiciones.
Usaremos el código proporcionado para definir cómo se verifica cada suposición:
```
public class Word {
 private final String word;
 public Word(String correctWord) {
 this.word = correctWord;
 }
 public Score guess(String attempt) {
 var score = new Score(word);
 score.assess(attempt);
 return score;
 }
}
```
### Clase Score
La clase Score evaluará la respuesta dada y almacenará los resultados de la evaluación:

```
public class Score {
    private final String correct;
    private final List<Letter> results = new ArrayList<>();
    public Score(String correct) {
        this.correct = correct;
    }
    public Letter letter(int position) {
        return results.get(position);
    }
    public void assess(String attempt) {
        for (int i = 0; i < attempt.length(); i++) {
            char current = attempt.charAt(i);
            if (isCorrectLetter(i, current)) {
                results.add(Letter.CORRECT);
            } else if (occursInWord(current)) {
                results.add(Letter.PART_CORRECT);
            } else {
                results.add(Letter.INCORRECT);
            }
        }
    }
    private boolean isCorrectLetter(int position, char currentLetter) {
        return correct.charAt(position) == currentLetter;
    }
    private boolean occursInWord(char current) {
        return correct.contains(String.valueOf(current));
    }
}
```

### Clase WordTest
Los tests verificarán la funcionalidad de las clases Word y Score usando JUnit:
```
public class WordTest {
    @Test
    public void oneIncorrectLetter() {
        var word = new Word("A");
        var score = word.guess("Z");
        assertScoreForGuess(score, INCORRECT);
    }
    @Test
    public void oneCorrectLetter() {
        var word = new Word("A");
        var score = word.guess("A");
        assertScoreForGuess(score, CORRECT);
    }
    @Test
    public void secondLetterWrongPosition() {
        var word = new Word("AR");
        var score = word.guess("ZA");
        assertScoreForGuess(score, INCORRECT, PART_CORRECT);
    }
    @Test
    public void allScoreCombinations() {
        var word = new Word("ARI");
        var score = word.guess("ZAI");
        assertScoreForGuess(score, INCORRECT, PART_CORRECT, CORRECT);
    }
    private void assertScoreForGuess(Score score, Letter... expectedScores) {
        for (int position = 0; position < expectedScores.length; position++) {
            Letter expected = expectedScores[position];
            assertThat(score.letter(position)).isEqualTo(expected);
        }
    }
}
```
### Objetivos:
• Configurar el entorno del proyecto con Gradle y JUnit 5.

• Implementar la lógica básica del juego Wordz para aceptar y validar suposiciones de
palabras.

• Escribir casos de prueba iniciales siguiendo el enfoque TDD.
### Tareas:

1. Configuración del proyecto: Crear un nuevo proyecto en Gradle y configurar dependencias para JUnit 5.
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
    testImplementation 'org.assertj:assertj-core:3.25.3'
}

test {
    useJUnitPlatform()
}
```

2. Clase Word: Implementar la clase básica con el método guess que acepte una suposición y devuelva un resultado básico. Utiliza los fragmentos dados donde defines la clase Word y sus métodos.

```
public class Word {
    private final String word;
    public Word(String correctWord) {
        this.word = correctWord;
    }
    public Score guess(String attempt) {
        var score = new Score(word);
        score.assess(attempt);
        return score;
    }
}
```


3. Pruebas iniciales: Escribir pruebas para validar suposiciones incorrectas y correctas utilizando JUnit 5. Usa el código de ejemplo proporcionado en las pruebas oneIncorrectLetter y oneCorrectLetter.

```
public class WordTest {
    @Test
    public void oneIncorrectLetter() {
        var word = new Word("A");
        var score = word.guess("Z");
        assertScoreForGuess(score, INCORRECT);
    }
    @Test
    public void oneCorrectLetter() {
        var word = new Word("A");
        var score = word.guess("A");
        assertScoreForGuess(score, CORRECT);
    }
    @Test
    public void secondLetterWrongPosition() {
        var word = new Word("AR");
        var score = word.guess("ZA");
        assertScoreForGuess(score, INCORRECT, PART_CORRECT);
    }
    @Test
    public void allScoreCombinations() {
        var word = new Word("ARI");
        var score = word.guess("ZAI");
        assertScoreForGuess(score, INCORRECT, PART_CORRECT, CORRECT);
    }
    private void assertScoreForGuess(Score score, Letter... expectedScores) {
        for (int position = 0; position < expectedScores.length; position++) {
            Letter expected = expectedScores[position];
            assertThat(score.letter(position)).isEqualTo(expected);
        }
    }
}
```

4. Refactorización y código limpio: Revisar el código para mejorar la claridad y la mantenibilidad.


```
public class Word {
private final String correctWord;

    public Word(String correctWord) {
        this.correctWord = correctWord;
    }

    public Score guess(String attempt) {
        Score score = new Score(correctWord);
        score.assess(attempt);
        return score;
    }
}
```



5. Análisis de código estático: Configurar SonarQube para analizar el código y solucionar problemas identificados.