/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saxparser;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Aga
 */
public class Handler extends DefaultHandler {
   @Override
   public void startDocument() throws SAXException {
       System.out.println("Start parsing...");
   }
   @Override
   public void endDocument() {
       System.out.println("End parsing...");
   }
}
