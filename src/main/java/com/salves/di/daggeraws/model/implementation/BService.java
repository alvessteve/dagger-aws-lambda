package com.salves.di.daggeraws.model.implementation;

import com.salves.di.daggeraws.model.IBService;

public class BService implements IBService {
    @Override
    public String printB() {
        return "B";
    }
}
