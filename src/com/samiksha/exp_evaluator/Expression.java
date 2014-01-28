package com.samiksha.exp_evaluator;

public class Expression {

    Double value;
    Expression right;
    Expression left;
    Operation operation;

    public Expression(double value) {
        this.value = value;
    }

    public Expression(Expression right, Expression left, Operation operation) {
        this.operation = operation;
        this.right = right;
        this.left = left;
    }

    public double evaluate() {
        if (value != null) return value;
        return operation.operate(right, left);
    }
}

