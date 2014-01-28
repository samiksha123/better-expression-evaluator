package com.samiksha.exp_evaluator;

import junit.framework.Assert;
import org.junit.Test;

public class MultiplicationTest extends Multiplication {
        @Test
        public void testMultiplication(){
            Operation multiplication = new Multiplication();
            double result = multiplication.operate(new Expression(2), new Expression(3));

            Assert.assertEquals(6.0, result);
        }
    }
