package com.learnjava.process;

/**
 * Created by z001qgd on 2/24/17.
 */
public class ProcessCheck {

    public static void main(String[] args) {
        try {
            // create a new process
            System.out.println("Creating Process...");
            Process p = Runtime.getRuntime().exec("atom");

            // wait 10 seconds
            System.out.println("Waiting...");
            Thread.sleep(500);

            // kill the process
            p.destroy();
            System.out.println("Process destroyed.");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    }

