package com.xml.validate;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

class SchemaTest {
  public static void main (String args[]) throws ParserConfigurationException, SAXException, IOException {
	  DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	  factory.setValidating(false);
	  factory.setNamespaceAware(true);

	  DocumentBuilder builder = factory.newDocumentBuilder();

	  builder.setErrorHandler(new SimpleErrorHandler()); 
	  System.out.println("Starting");
	  Document document = builder.parse(new InputSource("document.xml"));
	  System.out.println("document " + document);
	  System.out.println("Successful");
  }
}