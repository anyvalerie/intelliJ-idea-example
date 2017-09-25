package com.xml;
import org.xml.sax.*;

public class x3Err implements ErrorHandler
{
    public void error(SAXParseException e)
    {
        System.out.println("Error: "+e.getMessage() );
    }
    public void warning(SAXParseException e)
    {
        System.out.println("Warning: "+e.getMessage() );
    }
    public void fatalError(SAXParseException e)
    {
        System.out.println("Warning: "+e.getMessage() );
    }
}