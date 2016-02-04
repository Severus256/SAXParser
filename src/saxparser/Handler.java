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
       switch (qName) {
             
       }
   }
   @Override
   // срабатывает при завершении чтения каждого элемента. Не принимает атрибута в параметре
   public void endElement(String namespace, String LocalName, String qName) throws SAXException {
       
   }
   @Override
   // данный метод будет читать информацию, находящуюся между тегами элемента
   // это будет массив символов cd, начиная от start и до end.
   public void characters(char[] ch, int start, int end) {
       String Data = new String(ch, start, end);     // в этой строке будет формироваться из символов xml файла строка с данными
       System.out.println(Data); // Вывод данных, между тегами элемента xml
       
   }
}
