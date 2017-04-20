package com.learnjava.exception;

import util.CallerUtil;

import java.util.List;

/**
 * Created by z001qgd on 2/8/17.
 */
public class Caller {

    public static void main(String[] args) {

        try{

            CallerUtil util = new CallerUtil();
            util.nullcheck(null);

            List<String > list  =null;

           /* try{
                list.size();
            }catch(Exception e ){
                System.out.println("Inside Exception : " + e);
            }

            System.out.println("After exception :");*/

        }catch(Exception e){
            System.out.println("Exception in Caller: " + e);

            //e.printStackTrace();
        }

    }
}
