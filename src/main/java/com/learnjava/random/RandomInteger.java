package com.learnjava.random;

import java.math.BigInteger;
import java.util.Random;

/**
 * Created by z001qgd on 2/4/17.
 */
public class RandomInteger {

    public static void main(String[] args) {

        BigInteger b1 = new BigInteger(75, new Random());

        for (int i=0 ; i <100;  i++) {
            if (b1.signum() == 1) {
                System.out.println("b1 :" + b1);

            } else {
                b1 = b1.multiply(BigInteger.ONE) ;
                System.out.println("Negative Number : " + b1);
            }
        }


    }
}
