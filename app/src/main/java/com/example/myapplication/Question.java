package com.example.myapplication;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class Question {
    private int questionId;
    private boolean trueAnswer;

    public Question(int questionId, boolean trueAnswer){
        this.questionId = questionId;
        this.trueAnswer = trueAnswer;
    }
}
