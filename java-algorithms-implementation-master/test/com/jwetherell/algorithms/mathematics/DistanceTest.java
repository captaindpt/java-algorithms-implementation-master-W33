package com.jwetherell.algorithms.mathematics;

import org.junit.Test;
import static org.junit.Assert.*;

public class DistanceTest {

    private static final double DELTA = 1e-10;

    @Test
    public void testChebyshevDistance() {
        long[] point1 = {1, 2};
        long[] point2 = {4, 6};
        assertEquals(4, Distance.chebyshevDistance(point1, point2));
        
        // Test when x-difference is larger
        long[] point3 = {1, 2};
        long[] point4 = {7, 4};
        assertEquals(6, Distance.chebyshevDistance(point3, point4));
        
        // Test when y-difference is larger
        long[] point5 = {1, 2};
        long[] point6 = {3, 9};
        assertEquals(7, Distance.chebyshevDistance(point5, point6));
        
        // Test with negative coordinates
        long[] point7 = {-1, -2};
        long[] point8 = {2, 3};
        assertEquals(5, Distance.chebyshevDistance(point7, point8));
    }

    @Test
    public void testSquaredDistance() {
        // Basic test
        assertEquals(25.0, Distance.squaredDistance(0, 0, 3, 4), DELTA);
        
        // Test with negative coordinates
        assertEquals(25.0, Distance.squaredDistance(-1, -1, 2, 3), DELTA);
        
        // Test with decimal points
        assertEquals(2.25, Distance.squaredDistance(0.5, 0.5, 2.0, 1.0), DELTA);
        
        // Test zero distance
        assertEquals(0.0, Distance.squaredDistance(1, 1, 1, 1), DELTA);
        
        // Test large numbers
        assertEquals(1000000.0, Distance.squaredDistance(0, 0, 1000, 0), DELTA);
    }

    @Test
    public void testEuclideanDistance() {
        // Basic test
        assertEquals(5.0, Distance.euclideanDistance(0, 0, 3, 4), DELTA);
        
        // Test with negative coordinates
        assertEquals(5.0, Distance.euclideanDistance(-1, -1, 2, 3), DELTA);
        
        // Test with decimal points
        assertEquals(1.5, Distance.euclideanDistance(0.5, 0.5, 2.0, 1.0), DELTA);
        
        // Test zero distance
        assertEquals(0.0, Distance.euclideanDistance(1, 1, 1, 1), DELTA);
        
        // Test large numbers
        assertEquals(1000.0, Distance.euclideanDistance(0, 0, 1000, 0), DELTA);
    }
}
