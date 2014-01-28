package com.samiksha.exp_evaluator;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ExpressionTest {
    @Test
    public void testEvaluate() throws Exception {
        Expression expression = new Expression(new Expression(2), new Expression(3), new Addition());
        assertEquals(5.0, expression.evaluate());
    }

    @Test
    public void test_for_evaluate_expression() throws Exception {
        Expression twoPlusThree = e(e(3), e(2), plus());
        Expression multiplyByFour = e(twoPlusThree, e(4), multiply());
        Expression threeMultiplyByTwo = e(e(3), e(2), multiply());
        Expression expression = e(multiplyByFour, threeMultiplyByTwo, plus());
        assertEquals(26.0, expression.evaluate());
    }

    @Test
    public void test_for_evaluate_expression_with_brackets() throws Exception {
        Expression twoPlusFour = e(e(4), e(2), plus());
        Expression divideByThree = e(twoPlusFour, e(3), divide());
        Expression expression = e(twoPlusFour, divideByThree, plus());
        assertEquals(6.5, expression.evaluate());
    }
    public static Expression e(int n) {
        return new Expression(n);
    }

    public static Expression e(Expression l, Expression r, Operation o) {
        return new Expression(r, l, o);
    }

    public static Operation plus() {
        return new Addition();
    }

    public static Operation multiply() {
        return new Multiplication();
    }

    public static Operation divide() {
        return new Division();
    }
}