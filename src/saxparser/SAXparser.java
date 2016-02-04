/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saxparser;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/**
 *
 * @author Aga
 */
public class SAXparser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Handler hd = new Handler();
        SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        try {
            
            SAXParser parser = parserFactory.newSAXParser();
            parser.parse(new File("config.xml"), hd);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(SAXparser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(SAXparser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SAXparser.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
