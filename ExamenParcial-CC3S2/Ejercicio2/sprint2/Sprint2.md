# Sprint 2: Ampliación de la lógica de juego 

## Objetivos:
• Ampliar la lógica del juego para incluir retroalimentación detallada sobre las suposiciones.

• Continuar el desarrollo utilizando TDD.

## Tareas:
1. Ampliar clase Word: Implementar lógica para evaluar letras en posiciones correctas e incorrectas. Integra el código de assess y la evaluación de la posición de las letras.
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

   public Score assessPosition(String attempt) {
   var score = new Score(word);
   score.assessPosition(attempt);
   return score;
   }
   }
```
2. Pruebas de retroalimentación: Ampliar el conjunto de pruebas para cubrir todos los casos posibles de retroalimentación, incluyendo secondLetterWrongPosition y allScoreCombinations.
```
    @Test
    public void secondLetterWrongPosition_AssessPosition() {
        var word = new Word("AR");
        var score = word.assessPosition("ZA");
        assertScoreForGuess(score, INCORRECT, INCORRECT);
    }


    @Test
    public void allScoreCombinations_AssessPosition() {
        var word = new Word("ARI");
        var score = word.assessPosition("ZAI");
        assertScoreForGuess(score, INCORRECT, INCORRECT, CORRECT);
    }
  ```
3. Refactorización: Mejorar el diseño y la implementación basada en los resultados de las pruebas y el análisis de código estático.

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

    public Score assessPosition(String attempt) {
        Score score = new Score(correctWord);
        score.assessPosition(attempt);
        return score;
    }
}
  ```

4. Cobertura de código: Utilizar JaCoCo o otras herramienta para asegurar que la cobertura del código sea superior al 90%.

