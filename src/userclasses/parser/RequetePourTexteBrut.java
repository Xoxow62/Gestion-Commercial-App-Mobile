
package userclasses.parser;

import com.codename1.io.ConnectionRequest;
import com.codename1.io.NetworkManager;
import com.codename1.io.Util;
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
public class RequetePourTexteBrut extends ConnectionRequest{
   
    private String       texte;

    public  String       getTexte() { return texte; }

    @Override
    protected void postResponse() { }  

    @Override
    protected void readResponse(InputStream input) throws IOException {
        
     Reader   rd     = new InputStreamReader(new ByteArrayInputStream(Util.readInputStream(input))); 
        
     StringBuilder sb= new StringBuilder(); 
       
     int c=rd.read();
     while(c>0){
            sb.append((char)c);
            c=rd.read();
     }
        
     texte=sb.toString();   
    } 
    
   
    
    public void executer(String url ){
       
       setPost(false);         
       setUrl(RACINE_SERVICE_REST + url);
       NetworkManager.getInstance().addToQueueAndWait(this);   
    }
 
    public  void executer(String url, boolean get, boolean attendre ){
       
       setPost(!get);         
       setUrl(RACINE_SERVICE_REST + url); 
       if (attendre)NetworkManager.getInstance().addToQueueAndWait(this);
       else NetworkManager.getInstance().addToQueue(this); 
    } 
    
    
   
}


