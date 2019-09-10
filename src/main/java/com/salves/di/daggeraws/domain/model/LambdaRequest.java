package com.salves.di.daggeraws.domain.model;

import java.io.Serializable;

public class LambdaRequest implements Serializable {

    private String input;

    public LambdaRequest() {
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
