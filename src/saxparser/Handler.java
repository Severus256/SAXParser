/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saxparser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Aga
 */
public class Handler extends DefaultHandler {
   @Override
   public void startDocument() throws SAXException { //срабатывает при начале документа
       System.out.println("Start parsing...");
   }
   @Override
   public void endDocument() {  // при конце документа
       System.out.println("End parsing...");
   }
   @Override
   // при нахождении каждого элемента
   // attr - это атрибут присвоенный XML элементу. Например id="1"
   public void startElement(String namespace, String LocalName, String qName, Attributes attr) {
       
   }
   @Override
   // срабатывает при завершении чтения каждого элемента. Не принимает атрибута в параметре
   public void endElement(String namespace, String LocalName, String qName) throws SAXException {
       
   }
   
}
