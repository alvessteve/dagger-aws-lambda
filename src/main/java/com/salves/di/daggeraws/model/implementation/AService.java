package com.salves.di.daggeraws.model.implementation;

import com.salves.di.daggeraws.model.IAService;

public class AService implements IAService {
    @Override
    public String printA() {
        return "A";
    }
}
