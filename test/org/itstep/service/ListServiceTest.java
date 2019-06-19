package org.itstep.service;

import org.itstep.model.Circle;
import org.itstep.model.Shape;
import org.itstep.model.Square;
import org.itstep.model.Triangle;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListServiceTest {

    @Test
    void getMaxShape() {
        Circle circle = new Circle(15);
        Triangle triangle = new Triangle(10, 8);
        Square square = new Square(40);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);
        shapeList.add(triangle);
        shapeList.add(square);
        shapeList.add(circle);

        assertNotNull(shapeList);

        Shape maxShape = ListService.getMaxShape(shapeList);

        assertNotNull(maxShape);
        assertEquals(maxShape.getClass().getSimpleName(), "Square");
        assertEquals(maxShape.getArea(),1600);

        Shape nullShape = ListService.getMaxShape(new ArrayList<>());
        assertNull(nullShape);
    }
}