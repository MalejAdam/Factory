package com;

import java.util.EnumMap;

public class ShapesFactory {
    private static final EnumMap<Shapes, Draw> draws = new EnumMap<Shapes, Draw>(Shapes.class);

    public Draw getDraw(Shapes shapes){
        return draws.get(shapes);
    }

    static {
        draws.put(Shapes.Rectangle, new Rectangle());
        draws.put(Shapes.Circle, new Circle());
        draws.put(Shapes.Square, new Square());
    }
}
