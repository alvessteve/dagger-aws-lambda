package com.salves.di.daggeraws.model.implementation;

import com.salves.di.daggeraws.model.IAService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AServiceTest {
    @Test
    void should_display_A() {
        IAService iaService = new AService();
        Assertions.assertEquals("A", iaService.printA());
    }
}