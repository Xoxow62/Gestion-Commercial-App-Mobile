package userclasses.parser;

import com.codename1.xml.Element;
import java.io.UnsupportedEncodingException;

public class AideParserArbreXML {
    
    
    public static  String getValeur(Element element, String nomTag)  {
     
      String s=  element.getFirstChildByTagName(nomTag).getChildAt(0).getText();
   
      String us="";
      try {
            us = new String(s.getBytes(),"UTF8");
      }
      catch (UnsupportedEncodingException ex){}
      return us; 
    }       
}


