package com.xml.validate;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

class SimpleErrorHandler implements ErrorHandler {

	@Override
	public void error(SAXParseException e) throws SAXException {
		// TODO Auto-generated method stub
		 System.out.println(e.getMessage());
	}

	@Override
	public void fatalError(SAXParseException e) throws SAXException {
		// TODO Auto-generated method stub
		System.out.println(e.getMessage());
	}

	@Override
	public void warning(SAXParseException e) throws SAXException {
		// TODO Auto-generated method stub
		System.out.println(e.getMessage());
	}

}
