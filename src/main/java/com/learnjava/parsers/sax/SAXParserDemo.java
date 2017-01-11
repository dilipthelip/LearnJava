package com.learnjava.parsers.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by z001qgd on 12/13/16.
 */
public class SAXParserDemo {

    public static void main(String[] args) throws Exception {
        SAXParserFactory parserFactor = SAXParserFactory.newInstance();
        SAXParser parser = parserFactor.newSAXParser();
        SAXHandler handler = new SAXHandler();

        FileInputStream inputStream=new FileInputStream("/Dilip/Study/LearnJava/src/main/java/com/learnjava/employee.xml");
        parser.parse(inputStream,handler);
        //parser.parse()
//        parser.parse(ClassLoader.getSystemResourceAsStream("/Dilip/Study/LearnJava/src/main/java/com/learnjava/employee.xml"),
//                handler);
        //Printing the list of employees obtained from XML
        for ( Employee emp : handler.empList){
            System.out.println(emp);
        }
    }



    static class SAXHandler extends DefaultHandler {

        List<Employee> empList = new ArrayList<>();
        Employee emp = null;
        String content = null;
        //Triggered when the start of tag is found.
        public void startElement(String uri, String localName,
                                 String qName, Attributes attributes)
        throws SAXException {

            switch(qName){
                case "employee":
                    emp = new Employee();
                    emp.id = attributes.getValue("id");
                    break;
            }
        }


        @Override
        public void endElement(String uri, String localName,
                               String qName) throws SAXException {
            switch(qName){
                //Add the employee to list once end tag is found
                case "employee":
                    empList.add(emp);
                    break;
                //For all other end tags the employee has to be updated.
                case "firstName":
                    emp.firstName = content;
                    break;
                case "lastName":
                    emp.lastName = content;
                    break;
                case "location":
                    emp.location = content;
                    break;
            }
        }
        @Override
        public void characters(char[] ch, int start, int length)
        throws SAXException {
            content = String.copyValueOf(ch, start, length).trim();
        }
    }
    static class Employee {
        String id;
        String firstName;
        String lastName;
        String location;
        @Override
        public String toString() {
            return firstName + " " + lastName + "(" + id + ")" + location;
        }
    }


}
