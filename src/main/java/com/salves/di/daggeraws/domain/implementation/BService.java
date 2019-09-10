package com.salves.di.daggeraws.domain.implementation;

import com.salves.di.daggeraws.domain.IBService;

public class BService implements IBService {
    @Override
    public String printB() {
        return "B";
    }
}
