package com.salves.di.daggeraws.model.implementation;

import com.salves.di.daggeraws.model.IBService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BServiceTest {
    @Test
    void should_display_B() {
        IBService ibService = new BService();
        Assertions.assertEquals("B", ibService.printB());
    }
}