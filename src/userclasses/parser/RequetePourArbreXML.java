package userclasses.parser;

import com.codename1.io.ConnectionRequest;
import com.codename1.io.NetworkManager;
import com.codename1.io.Util;
import com.codename1.xml.Element;
import com.codename1.xml.XMLParser;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import static userclasses.paramreseau.ParametresReseau.RACINE_SERVICE_REST;

/**
 *
 * @author rsmon
 */
public class RequetePourArbreXML extends ConnectionRequest
{
    private Element      racine;
    
    public  Element      getRacine() { return racine; }
    
    @Override
    protected void postResponse() { }  

    @Override
    protected void readResponse(InputStream input) throws IOException {
            
       Reader   rd      = new InputStreamReader(new ByteArrayInputStream(Util.readInputStream(input)));
        
       racine  = new XMLParser().parse(rd); 
    }
    
    public void executer(String url ){
       
       setPost(false);         
       setUrl(RACINE_SERVICE_REST + url);
       NetworkManager.getInstance().addToQueueAndWait(this);   
    }
 
    public  void executer(String url,boolean get, boolean attendre ){
       
       setPost(!get);         
       setUrl(RACINE_SERVICE_REST + url); 
       if (attendre)NetworkManager.getInstance().addToQueueAndWait(this);
       else NetworkManager.getInstance().addToQueue(this); 
    }     
}

