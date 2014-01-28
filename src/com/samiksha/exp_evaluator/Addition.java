
package com.samiksha.exp_evaluator;

public class Addition implements Operation {
    @Override
    public double operate(Expression right, Expression left) {
        return right.evaluate() + left.evaluate();
    }
}

class Multiplication implements Operation{
    @Override
    public double operate(Expression right, Expression left) {
        return right.evaluate() * left.evaluate();
    }
}

class Division implements Operation{
    @Override
    public double operate(Expression right, Expression left) {
        return right.evaluate() / left.evaluate();
    }
}