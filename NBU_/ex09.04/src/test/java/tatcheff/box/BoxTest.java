package tatcheff.box;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {
    private Box box;

    @BeforeEach
    public void setUp() {
        box = new Box(10, 20, 30);

    }

    @Test
    public void testIncreaseDimensions_valueIsValid_shouldIncreaseDimensions() {
        //Arrange
        double increasePercentage = 10;
        double expectedWidth = 11.0;
        double expectedHeight = 22.0;
        double expectedDepth = 33.0;
        //Act
        box.increaseDimensions(increasePercentage);

        //Assert
        assertEquals(expectedWidth, box.getWidth());
        assertEquals(expectedHeight, box.getHeigth());
        assertEquals(expectedDepth, box.getDepth());

    }

    @Test
    public void testIncreaseDimensions_valueIsNegative() {

        double increasePercentage = -1;
        assertThrows(IllegalArgumentException.class, () -> box.increaseDimensions(increasePercentage));
    }

    @Test
    public void testIncreaseDimensions_valueIsGreaterThan100() {

        double increasePercentage = 101;
        assertThrows(IllegalArgumentException.class, () -> box.increaseDimensions(increasePercentage));

    }
}