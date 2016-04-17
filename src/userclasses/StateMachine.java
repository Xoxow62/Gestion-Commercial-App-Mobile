package userclasses;

import generated.StateMachineBase;
import com.codename1.ui.*; 
import com.codename1.ui.events.ActionEvent;
import com.codename1.xml.Element;
import userclasses.parser.RequetePourArbreXML;


public class StateMachine extends StateMachineBase {
    
  RequetePourArbreXML   reqRest;  
  Element               racine; 
    
    public StateMachine(String resFile) {
        super(resFile);
    }
    
  @Override
  protected void postMain(Form f)    {
    
    super.postMain(f);
    
    reqRest= new RequetePourArbreXML();

  }


    @Override
    protected void onMain_ChoisirRGionAction(Component c, ActionEvent event) {
        super.onMain_ChoisirRGionAction(c, event);
        
        String choix = this.findChoisirRGion().getSelectedItem().toString();
        reqRest.executer("/suiviregions/resumeregion/"+choix);
        racine  = reqRest.getRacine();
                
        Element nomreg = racine.getFirstChildByTagName("nomreg");        
        this.findAffichageNomRGion().setText(nomreg.getChildAt(0).getText());
        
        Element codereg = racine.getFirstChildByTagName("codereg");   
        this.findAffichageCodeRGion().setText(codereg.getChildAt(0).getText());
        
        Element caAnnuel = racine.getFirstChildByTagName("caAnnuel");        
        this.findAfficheCARGion().setText(caAnnuel.getChildAt(0).getText());
        
        Element nbClient = racine.getFirstChildByTagName("nbClient");        
        this.findAffichageNBClientRegion().setText(nbClient.getChildAt(0).getText());
    }

    @Override
    protected void onConnexion_ConnexionAction(Component c, ActionEvent event) {
        super.onConnexion_ConnexionAction(c, event);
        
        
        String login = this.findId().getText();
        String mdp = this.findMdp().getText();
        
        if (login.equals("admin")&& mdp.equals("0000")){
        
            this.showForm("Main", null);
          }    
        
        }
        
       
        
    }



    
  

