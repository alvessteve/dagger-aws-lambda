package com.salves.di.daggeraws.model.implementation;

import com.salves.di.daggeraws.model.IAggregateService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AggregateServiceTest {

    private IAggregateService aggregateService;

    @BeforeEach
    void setUp() {
        aggregateService = new AggregateService(new AService(), new BService());
    }

    @Test
    public void should_dipslay_ABC() {
        Assertions.assertEquals("ABC", aggregateService.printABC());
    }
}