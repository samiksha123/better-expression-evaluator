package com.samiksha.exp_evaluator;

public class Subtraction implements Operation{
        @Override
        public double operate(Expression right, Expression left) {
            return right.evaluate() - left.evaluate();
        }
}