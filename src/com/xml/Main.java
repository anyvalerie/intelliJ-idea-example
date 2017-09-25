package com.xml;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class Main {


    public static void main(String[] args) {
        AllApartaments readXml = new AllApartaments();
        System.out.print("1. Counts of all types of apartaments:\n");
        readXml.getCountsOfAllApartaments();
        try {
            File inputFile = new File("E:\\xml\\xml\\laba1.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            WithoutHome withoutHome = new WithoutHome();
            saxParser.parse(inputFile, withoutHome);
            withoutHome.querty1();
            withoutHome.querty2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
