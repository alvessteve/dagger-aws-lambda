package com.salves.di.daggeraws.domain.implementation;

import com.salves.di.daggeraws.domain.IAService;

public class AService implements IAService {
    @Override
    public String printA() {
        return "A";
    }
}
