package com.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * Created by Пользователь on 27.03.2017.
 */
public class AllApartaments extends DefaultHandler{
    public void getCountsOfAllApartaments() {
        try {
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxParserFactory.newSAXParser();
            DefaultHandler defaultHandler = new DefaultHandler() {

                int numberOfStateApartament = 0;
                int numberOfDepartmentApartament = 0;
                int numberOfPrivatizedApartamanet = 0;

                public void startElement(String uri, String localName, String qName,
                                         Attributes attributes) throws SAXException {
                    if (qName.equalsIgnoreCase("stateApartament")) {
                        numberOfStateApartament++;
                    }
                    if (qName.equalsIgnoreCase("departmentalApartament")) {
                        numberOfDepartmentApartament++;
                    }
                    if (qName.equalsIgnoreCase("privatizedApartament")) {
                        numberOfPrivatizedApartamanet++;
                    }
                }

                public void endDocument()
                        throws SAXException {
                    System.out.println("Number of State Apartament : " + numberOfStateApartament);
                    System.out.println("Number of Privatized Apartament : " + numberOfPrivatizedApartamanet);
                    System.out.println("Number of Departmental Apartament : " + numberOfDepartmentApartament);
                    System.out.println();
                }
            };


            saxParser.parse("E:\\xml\\xml\\laba1.xml", defaultHandler);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}