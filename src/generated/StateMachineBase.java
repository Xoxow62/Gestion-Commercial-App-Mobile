/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("ComboBox", com.codename1.ui.ComboBox.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "Connexion";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("ComboBox", com.codename1.ui.ComboBox.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Connexion");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.TextField findAffichageNomRGion(Component root) {
        return (com.codename1.ui.TextField)findByName("Affichage nom région", root);
    }

    public com.codename1.ui.TextField findAffichageNomRGion() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Affichage nom région", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Affichage nom région", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Component findConnexion(Component root) {
        return (com.codename1.ui.Component)findByName("Connexion", root);
    }

    public com.codename1.ui.Component findConnexion() {
        com.codename1.ui.Component cmp = (com.codename1.ui.Component)findByName("Connexion", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Component)findByName("Connexion", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer1(Component root) {
        return (com.codename1.ui.Container)findByName("Container1", root);
    }

    public com.codename1.ui.Container findContainer1() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findAffichageNBClientRegion(Component root) {
        return (com.codename1.ui.TextField)findByName("Affichage NB Client Region", root);
    }

    public com.codename1.ui.TextField findAffichageNBClientRegion() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Affichage NB Client Region", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Affichage NB Client Region", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findNomRGion(Component root) {
        return (com.codename1.ui.Label)findByName("Nom Région", root);
    }

    public com.codename1.ui.Label findNomRGion() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Nom Région", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Nom Région", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findChoisirRGion(Component root) {
        return (com.codename1.ui.ComboBox)findByName("Choisir Région", root);
    }

    public com.codename1.ui.ComboBox findChoisirRGion() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("Choisir Région", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("Choisir Région", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findCodeRGion(Component root) {
        return (com.codename1.ui.Label)findByName("Code Région", root);
    }

    public com.codename1.ui.Label findCodeRGion() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Code Région", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Code Région", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findCARGion(Component root) {
        return (com.codename1.ui.Label)findByName("CA Région :", root);
    }

    public com.codename1.ui.Label findCARGion() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("CA Région :", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("CA Région :", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findIdentifiant(Component root) {
        return (com.codename1.ui.Label)findByName("Identifiant", root);
    }

    public com.codename1.ui.Label findIdentifiant() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Identifiant", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Identifiant", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findId(Component root) {
        return (com.codename1.ui.TextField)findByName("id", root);
    }

    public com.codename1.ui.TextField findId() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("id", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("id", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findMdp(Component root) {
        return (com.codename1.ui.TextField)findByName("mdp", root);
    }

    public com.codename1.ui.TextField findMdp() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("mdp", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("mdp", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findNbClient(Component root) {
        return (com.codename1.ui.Label)findByName("nbClient", root);
    }

    public com.codename1.ui.Label findNbClient() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("nbClient", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("nbClient", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findMotDePasse(Component root) {
        return (com.codename1.ui.Label)findByName("Mot de passe", root);
    }

    public com.codename1.ui.Label findMotDePasse() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Mot de passe", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Mot de passe", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findAffichageCodeRGion(Component root) {
        return (com.codename1.ui.TextField)findByName("Affichage code région", root);
    }

    public com.codename1.ui.TextField findAffichageCodeRGion() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Affichage code région", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Affichage code région", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findAfficheCARGion(Component root) {
        return (com.codename1.ui.TextField)findByName("Affiche CA Région", root);
    }

    public com.codename1.ui.TextField findAfficheCARGion() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Affiche CA Région", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Affiche CA Région", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    protected void exitForm(Form f) {
        if("Connexion".equals(f.getName())) {
            exitConnexion(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitConnexion(Form f) {
    }


    protected void exitMain(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("Connexion".equals(f.getName())) {
            beforeConnexion(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeConnexion(Form f) {
    }


    protected void beforeMain(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("Connexion".equals(c.getName())) {
            beforeContainerConnexion(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerConnexion(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }

    protected void postShow(Form f) {
        if("Connexion".equals(f.getName())) {
            postConnexion(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postConnexion(Form f) {
    }


    protected void postMain(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("Connexion".equals(c.getName())) {
            postContainerConnexion(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerConnexion(Container c) {
    }


    protected void postContainerMain(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("Connexion".equals(rootName)) {
            onCreateConnexion();
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateConnexion() {
    }


    protected void onCreateMain() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("Connexion".equals(f.getName())) {
            getStateConnexion(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateConnexion(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("Connexion".equals(f.getName())) {
            setStateConnexion(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateConnexion(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }

    protected boolean setListModel(List cmp) {
        String listName = cmp.getName();
        if("Choisir Région".equals(listName)) {
            return initListModelChoisirRGion(cmp);
        }
        return super.setListModel(cmp);
    }

    protected boolean initListModelChoisirRGion(List cmp) {
        return false;
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("Connexion")) {
            if("id".equals(c.getName())) {
                onConnexion_IdAction(c, event);
                return;
            }
            if("mdp".equals(c.getName())) {
                onConnexion_MdpAction(c, event);
                return;
            }
            if("Connexion".equals(c.getName())) {
                onConnexion_ConnexionAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Main")) {
            if("Choisir Région".equals(c.getName())) {
                onMain_ChoisirRGionAction(c, event);
                return;
            }
            if("Affichage nom région".equals(c.getName())) {
                onMain_AffichageNomRGionAction(c, event);
                return;
            }
            if("Affichage code région".equals(c.getName())) {
                onMain_AffichageCodeRGionAction(c, event);
                return;
            }
            if("Affiche CA Région".equals(c.getName())) {
                onMain_AfficheCARGionAction(c, event);
                return;
            }
            if("Affichage NB Client Region".equals(c.getName())) {
                onMain_AffichageNBClientRegionAction(c, event);
                return;
            }
        }
    }

      protected void onConnexion_IdAction(Component c, ActionEvent event) {
      }

      protected void onConnexion_MdpAction(Component c, ActionEvent event) {
      }

      protected void onConnexion_ConnexionAction(Component c, ActionEvent event) {
      }

      protected void onMain_ChoisirRGionAction(Component c, ActionEvent event) {
      }

      protected void onMain_AffichageNomRGionAction(Component c, ActionEvent event) {
      }

      protected void onMain_AffichageCodeRGionAction(Component c, ActionEvent event) {
      }

      protected void onMain_AfficheCARGionAction(Component c, ActionEvent event) {
      }

      protected void onMain_AffichageNBClientRegionAction(Component c, ActionEvent event) {
      }

}
