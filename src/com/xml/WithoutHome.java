package com.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
* Created by Пользователь on 28.03.2017.
*/
public class WithoutHome extends DefaultHandler {

    private boolean numberFlat=false;
    private boolean numberEntrance=false;
    private boolean generalSquare=false;
    private boolean liveSquare=false;
    private boolean phone=false;
    private boolean tenant=false;
    private boolean heating=true;
    private int howMuch=4;
    private String[] sNumberFlat=new String [howMuch];
    private String[] sNumberEntrance=new String [howMuch];
    private String[] sGeneralSquare=new String [howMuch];
    private String[] sLiveSquare=new String [howMuch];
    private String[] sTenant=new String [howMuch];
    private String[] sHeating=new String [howMuch];
    private String[] sPhone=new String [howMuch];
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException
    {
        if (qName.equalsIgnoreCase("numberofFlat")) {
            numberFlat = true;
        } else if (qName.equalsIgnoreCase("numberofEntrance")) {
            numberEntrance = true;
        } else if (qName.equalsIgnoreCase("overallSquare")) {
            generalSquare = true;
        }
        else if (qName.equalsIgnoreCase("livingSquare")) {
            liveSquare = true;
        }else if (qName.equalsIgnoreCase("phone")) {
            phone = true;
        }
        else if (qName.equalsIgnoreCase("tenant")) {
            tenant = true;
        }
        else if(qName.equalsIgnoreCase("heating")){
            heating=true;
        }

    }
    int i1=0;
    int i2=0;
    int i3=0;
    int i4=0;
    int i5=0;
    int i6=0;
    int i7=0;
    public void characters(char ch[], int start, int length)
            throws SAXException
    {
        if(numberFlat){
            sNumberFlat[i1] =new String(ch, start, length);
            numberFlat = false;
            i1++;
        } else if(numberEntrance) {
            sNumberEntrance[i2]=new String(ch, start, length);
            numberEntrance = false;
            i2++;
        } else if (generalSquare) {
            sGeneralSquare[i3]= new String(ch, start, length);
            generalSquare = false;
            i3++;
        } else if (liveSquare) {
            sLiveSquare[i4]= new String(ch, start, length);
            liveSquare = false;
            i4++;
        } else if (tenant) {
            sTenant[i5]= new String(ch, start, length);
            tenant = false;
            i5++;
        } else if (heating) {
            sHeating[i6]= new String(ch, start, length);
            heating = false;
            i6++;
        } else if (phone) {
            sPhone[i7]= new String(ch, start, length);
            // System.out.println("Name Of Channel: " + NameOfChannel[i3]);
            phone = false;
            i7++;
        }
    }
    void querty1 (){
        String search="Glushko";
        System.out.println("2. Search house with tenant - "+search+" :");
        for(int i=0;i<howMuch;i++) {
            if(search.equals(sTenant[i])){
                System.out.println("Tenant: " + sTenant[i] );
                System.out.println("Phone: " + sPhone[i] );
                System.out.println("Number of flat: " + sNumberFlat[i]);
                System.out.println("Number of Entrance: " + sNumberEntrance[i] );
                System.out.println("General Square: " + sGeneralSquare[i] );
                System.out.println("Live Square: " + sLiveSquare[i]);
                System.out.println("Heating: " + sHeating[i] );

            }
        }

    }
    void querty2 (){
    int search=100;
    System.out.println("3. Search house with number of flat > "+search+" :");
    for(int i=0;i<howMuch;i++) {

        if(Integer.parseInt(sNumberFlat[i])>search){
            System.out.println("Tenant: " + sTenant[i] );
            System.out.println("Phone: " + sPhone[i] );
            System.out.println("Number of flat: " + sNumberFlat[i]);
            System.out.println("Number of Entrance: " + sNumberEntrance[i] );
            System.out.println("General Square: " + sGeneralSquare[i] );
            System.out.println("Live Square: " + sLiveSquare[i]);
            System.out.println("Heating: " + sHeating[i] );
            System.out.println();
        }
    }

}
    public void endElement(String uri, String localName, String qName)
            throws SAXException {

    }

}

