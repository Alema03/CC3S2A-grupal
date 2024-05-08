package com.wordz.domain;

import com.wordz.domain.Score;

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
