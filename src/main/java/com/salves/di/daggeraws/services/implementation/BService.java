package com.salves.di.daggeraws.services.implementation;

import com.salves.di.daggeraws.services.IBService;

public class BService implements IBService {
    @Override
    public String printB() {
        return "B";
    }
}
