package org.jugistanbul.question08.fixed;

final class Circle implements Figure {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * (radius * radius);
    }
}