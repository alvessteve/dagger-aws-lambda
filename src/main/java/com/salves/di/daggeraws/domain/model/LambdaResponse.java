package com.salves.di.daggeraws.domain.model;

import java.io.Serializable;

public class LambdaResponse implements Serializable {

    private String output;

    public LambdaResponse() {
    }

    public LambdaResponse(String output) {
        this.output = output;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "{" +
                "output='" + output + '\'' +
                '}';
    }
}
