package userclasses.paramreseau;

public class ParametresReseau {
    
      
    private static String ADRESSESERVEUR      = "192.168.1.17";//192.168.1.7";
    private static String PORT                = "8080";
    private static String APPLI               = "webappligc_ppes_mission3a";
    private static String ENTREE_SERVICE      = "rest";
    
    public  static String RACINE_SERVICE_REST = "http://"+ADRESSESERVEUR+":"+PORT+"/"+
                                                 APPLI+"/"+ENTREE_SERVICE;          
}
