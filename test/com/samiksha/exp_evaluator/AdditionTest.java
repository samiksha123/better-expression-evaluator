package com.samiksha.exp_evaluator;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;
public class AdditionTest extends Addition {


    public class OperationTest {
        @Test
        public void testAddition(){
            Operation addition = new Addition();
            double result = addition.operate(new Expression(2d), new Expression(3d));

            assertEquals(5d, result);
        }
    }
}
