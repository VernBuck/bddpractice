package com.company;

public class Math {
    private int a;
    private int b;

    public Math(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int applecount) {
        this.a = a;
    }

    public void setB(int bananacount) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public  String toString() {
        return this.getA() + " " + this.getB();
    }


}
