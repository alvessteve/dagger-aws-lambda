package com.salves.di.daggeraws.services.implementation;

import com.salves.di.daggeraws.services.IAService;

public class AService implements IAService {
    @Override
    public String printA() {
        return "A";
    }
}
