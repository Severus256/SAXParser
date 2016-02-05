/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saxparser;

import java.util.HashMap;
import java.util.Map;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Aga
 */
public class Handler extends DefaultHandler {

    private String id;           // для значений id
    private String element;          // для значений элементов XML
    private Map<String, String> data = new HashMap<String, String>(); // для данных целиком
    
    private String[] elementsNames;
    private String[] elementsTransform;
    
    
    
    
    
    
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
        
      this.element = qName; // имя тега, клоторый парсится
    }

    @Override
    // срабатывает при завершении чтения каждого элемента. Не принимает атрибута в параметре
    public void endElement(String namespace, String LocalName, String qName) throws SAXException {
        this.element = "";
        this.id = "";             //При окончании тега, сбиваем значения переменных
    }

    @Override
   // данный метод будет читать информацию, находящуюся между тегами элемента
    // это будет массив символов cd, начиная от start и до end.
    public void characters(char[] ch, int start, int end) {
        String Data = new String(ch, start, end);     // в этой строке будет формироваться из символов xml файла строка с данными
        System.out.println(Data); // Вывод данных, между тегами элемента xml

    }

    public Map<String, String> getData() {         // Возвращает коллекцию Map

        return this.data;
    }

}
