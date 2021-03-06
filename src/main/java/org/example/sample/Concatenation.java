package org.example.sample;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.3
 * Wed Dec 26 00:22:19 IST 2012
 * Generated source version: 2.2.3
 * 
 */
 
@WebService(targetNamespace = "http://www.example.org/sample/", name = "Concatenation")
@XmlSeeAlso({ObjectFactory.class})
public interface Concatenation {

    @WebResult(name = "s", targetNamespace = "")
    @RequestWrapper(localName = "stringConcatenation", targetNamespace = "http://www.example.org/sample/", className = "org.example.sample.StringConcatenation")
    @ResponseWrapper(localName = "stringConcatenationResponse", targetNamespace = "http://www.example.org/sample/", className = "org.example.sample.StringConcatenationResponse")
    @WebMethod(action = "http://www.example.org/sample/stringConcatenation")
    public java.lang.String stringConcatenation(
        @WebParam(name = "s1", targetNamespace = "")
        java.lang.String s1,
        @WebParam(name = "s2", targetNamespace = "")
        java.lang.String s2
    );

    @WebResult(name = "i", targetNamespace = "")
    @RequestWrapper(localName = "numberConcatenation", targetNamespace = "http://www.example.org/sample/", className = "org.example.sample.NumberConcatenation")
    @ResponseWrapper(localName = "numberConcatenationResponse", targetNamespace = "http://www.example.org/sample/", className = "org.example.sample.NumberConcatenationResponse")
    @WebMethod(action = "http://www.example.org/sample/numberConcatenation")
    public int numberConcatenation(
        @WebParam(name = "i1", targetNamespace = "")
        int i1,
        @WebParam(name = "i2", targetNamespace = "")
        int i2
    );
}
