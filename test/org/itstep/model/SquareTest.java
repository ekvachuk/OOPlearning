package org.itstep.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class SquareTest {

    @Test
    void getArea() {
        Square square = new Square();
        square.setSide(10);
        square.setSide(10);
        Assertions.assertEquals(100, square.getArea());
    }
}