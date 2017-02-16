package com.learnjava.exception;

/**
 * Created by z001qgd on 2/8/17.
 */
public class Caller {

    public static void main(String[] args) {

        try{

            CallerUtil util = new CallerUtil();
            util.nullcheck(null);

        }catch(Exception e){
            System.out.println("Exception in Caller: " + e.getMessage());
           // e.printStackTrace();
        }

    }
}
