/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc;

import holamundomvc.controller.Controller;
import holamundomvc.modelo.Model;
import holamundomvc.modelo.ModelFactory;
import holamundomvc.nview.View;
import holamundomvc.nview.ViewFactory;
import holamundomvc.nview.ViewImplementation;

/**
 * get view obtiene una vista
 * get mode obtiene el modelo
 * crea un objeto de la clase controlador
 * y lo envia con el run
 * @author 2dam
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        View pruebaVista;
        ViewFactory pruebaVistaFac = new ViewFactory();
        pruebaVista = pruebaVistaFac.getView();
        
        Model pruebaModel;
        ModelFactory pruebaModelFac = new ModelFactory();
        pruebaModel = pruebaModelFac.getModel();
        
        Controller prueba = new Controller();
        
        prueba.run(pruebaVista, pruebaModel);
    }
    
}
