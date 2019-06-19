package org.itstep;

import org.itstep.model.Circle;
import org.itstep.model.Shape;
import org.itstep.model.Square;
import org.itstep.model.Triangle;
import org.itstep.service.ListService;

import java.util.*;

public class ApplicationRunner {

    public static void main(String[] args) {
        // Circle circle = new Circle();
        //circle.setRadius(10);
        //System.out.println("Circle has radius"+ circle.getRadius());
        //System.out.println("Circle has area"+ circle.getArea());

        //String str = "str1";
        //String [] strings = new String[3];
        //strings [0] = "str";
        //strings [1] = "str2";
        //strings [2] = "str3";

        //System.out.println(strings [0]);

        Circle circle = new Circle(15);
        Triangle triangle = new Triangle(10, 8);
        Square square = new Square(18);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);
        shapeList.add(triangle);
        shapeList.add(square);
        shapeList.add(circle);

        Shape maxShape = ListService.getMaxShape(shapeList);

        if (maxShape !=null);
        System.out.println("Max shape is " + maxShape.getClass().getSimpleName() +
                " and has area " + maxShape.getArea());

        //System.out.println("Size of list is " + shapeList.size());

        //Set<Shape> shapeSet = new HashSet<>(shapeList);
        //shapeSet.add(circle);
        //shapeSet.add(triangle);
        //shapeSet.add(square);
       // shapeSet.add(circle);

        //System.out.println("Size of set is " + shapeSet.size());

       // System.out.println(square);
    }
}
