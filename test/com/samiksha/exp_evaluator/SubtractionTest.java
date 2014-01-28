package com.samiksha.exp_evaluator;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SubtractionTest extends Subtraction {
        @Test
        public void testSubtraction(){
            Operation subtraction = new Subtraction();
            double result = subtraction.operate(new Expression(5), new Expression(3));
            assertEquals(2.0, result);
        }
}
