package com.BrewMES.demo.model;

import com.brewmes.demo.model.Batch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BatchTest {

    @Test
    void calculateOee() {
        Batch batch = new Batch();

        batch.setAcceptableProducts(97);
        batch.setProductType(0);
        batch.setMachineSpeed(600);
        batch.setTotalProducts(100);

        assertEquals(97.0, batch.calculateOee());
    }
}