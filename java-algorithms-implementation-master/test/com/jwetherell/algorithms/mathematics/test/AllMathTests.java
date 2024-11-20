package com.jwetherell.algorithms.mathematics.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.jwetherell.algorithms.mathematics.DivisionTest;
import com.jwetherell.algorithms.mathematics.DistanceTest;

@RunWith(Suite.class)
@SuiteClasses({
    DivisionTest.class,
    DistanceTest.class
})
public class AllMathTests {
    public static void main(String[] args) {   
        JUnitCore core = new JUnitCore(); 
        core.run(AllMathTests.class); 
    }
}
