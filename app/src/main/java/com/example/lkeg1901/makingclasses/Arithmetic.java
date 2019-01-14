package com.example.lkeg1901.makingclasses;

public class Arithmetic {

    private int mOperand1;
    private int mOperand2;

    public Arithmetic() {
        mOperand1 = 2;
        mOperand2 = 3;
    }

    public String toString(){
        return "com.example.lkeg1901.makingclasses.Arithmetic Instance: mOperand1 = " + mOperand1 + ";mOperand2 = " + mOperand2 + ".";
    }

    public int add() {
        return mOperand1 + mOperand2;
    }

    public int subtract() {
        return mOperand2 - mOperand1;
    }

    public int multiply() {
        return mOperand1 * mOperand2;
    }

    public int divide() {
        return mOperand2 / mOperand1;
    }
}
