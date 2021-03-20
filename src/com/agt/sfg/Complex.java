package com.agt.sfg;

public class Complex {

    private final double re;
    private final double im;

    // Enforce no-instance behavior with a private constructor
    private Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static Complex valueOf(double re, double im) {
        return new Complex(re, im);
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public Complex plus(Complex c) {
        return new Complex(re + c.getRe(), im + c.getIm());
    }
}
