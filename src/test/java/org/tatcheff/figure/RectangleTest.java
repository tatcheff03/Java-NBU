package org.tatcheff.figure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FigureTest {
    @Test
    public void area_polymorphicWithCircle_returnsCorrectResults() {
        //arrange
        Figure circle = new Circle(3);
        final double expectedResult = 28.2743;
        //act & assert
        assertEquals(expectedResult, circle.area(), 0.0001);
    }

    @Test
    public void area_polymorphicWithRectangle_returnsCorrectResults() {
        //arrange
        Figure rectangle = new Rectangle(5, 10);
        final double expectedResult = 50;
        //act & assert
        assertEquals(expectedResult, rectangle.area(), 0.0001);
    }
}