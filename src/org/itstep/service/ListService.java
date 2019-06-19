package org.itstep.service;

import org.itstep.model.Shape;

import java.util.List;

public class ListService {

    public static Shape getMaxShape (List<Shape> shapes){
        if (!shapes.isEmpty()) {
            Shape maxShape = shapes.get(0);
            for (int i = 1; i < shapes.size(); i++){
               if (maxShape.getArea() <shapes.get(i).getArea()){
                   maxShape = shapes.get(i);
               }
            }
            return maxShape;
        }
        return null;
    }
}
