package org.itstep.model;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void getArea() {
        Triangle triangle = new Triangle();
        triangle.setBase(10);
        triangle.setHeight(16);
        Assertions.assertEquals(80,triangle.getArea());
//
        }
    }
