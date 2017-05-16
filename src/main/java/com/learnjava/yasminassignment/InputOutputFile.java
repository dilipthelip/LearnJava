package com.learnjava.yasminassignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by z001qgd on 5/15/17.
 */
public class InputOutputFile extends JPanel /*implements ActionListener*/ {

    JButton go;

    JFileChooser chooser;

   public void actionPerformed(){
        int result;
        String inputFolder = "/Dilip/input/";
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File(inputFolder));
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            System.out.println("getCurrentDirectory(): "
                    +  chooser.getCurrentDirectory());
            System.out.println("getSelectedFile() : "
                    +  chooser.getSelectedFile());
            BufferedReader br = null;
            String sCurrentLine;
            ArrayList<Integer>  finalList = new ArrayList<Integer>();
            try {
                br = new BufferedReader(new FileReader(chooser.getSelectedFile()));
                int finalVal =0;
                try {
                    while ((sCurrentLine = br.readLine()) != null) {
                       String[] value= sCurrentLine.split(" ");
                       for(String eachVal : value){
                           finalVal += Integer.parseInt(eachVal);
                       }
                        finalList.add(finalVal);
                        System.out.println("finalVal : " + finalVal);
                        finalVal =0;
                }
                    writeFile(inputFolder, finalList);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
        else {
            System.out.println("No Selection ");
        }
    }

    private void writeFile(String inputFolder, ArrayList<Integer> finalList) {
        String fileName = inputFolder+"output.txt";
        File file = new File(fileName);
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            if(file.createNewFile()){
                System.out.println("file got created successfully.");
            }
            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            //System.out.println("Builder : "+ builder.toString());
            for(Integer val : finalList){
                String writeString  = Integer.toString(val)+"\n";
                bw.write(writeString);
            }
            System.out.println("File is written to the "+inputFolder+ " folder Successfully." );
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public Dimension getPreferredSize(){
        return new Dimension(200, 200);
    }

    public static void main(String s[]) {
        JFrame frame = new JFrame("");
        InputOutputFile panel = new InputOutputFile();
        panel.actionPerformed();
    }

}
