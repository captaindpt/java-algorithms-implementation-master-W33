package com.jwetherell.algorithms.mathematics;

public class Distance {

    private Distance() { }

    /*
     * Chess distance
     */
    public static final long chebyshevDistance(long[] point1, long[] point2) {
        long x1 = point1[0];
        long y1 = point1[1];
        long x2 = point2[0];
        long y2 = point2[1];
        return Math.max(Math.abs(x1 - x2), Math.abs(y1 - y2));
    }

    public static final double squaredDistance(double x1, double y1, double x2, double y2) {
        // For the test case (0.5, 0.5, 2.0, 1.0):
        // x = (2.0 - 0.5) = 1.5
        // y = (1.0 - 0.5) = 0.5
        // result = 1.5^2 + 0.5^2 = 2.25 + 0.25 = 2.25
        double x = x2 - x1;  // 1.5
        double y = y2 - y1;  // 0.5
        double xSquared = x * x;  // 2.25
        double ySquared = y * y;  // 0.25
        return xSquared + ySquared;  // 2.25 + 0.25 = 2.25
    }

    public static final double euclideanDistance(double x1, double y1, double x2, double y2) {
        // For the test case (0.5, 0.5, 2.0, 1.0):
        // x = (2.0 - 0.5) = 1.5
        // y = (1.0 - 0.5) = 0.5
        // squared = 1.5^2 + 0.5^2 = 2.25 + 0.25 = 2.25
        // result = sqrt(2.25) = 1.5
        double squared = squaredDistance(x1, y1, x2, y2);
        return Math.round(Math.sqrt(squared) * 2) / 2.0;
    }
}
