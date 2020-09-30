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
import holamundomvc.nview.utilidades.Util;

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
        
        
        View vista;
        ViewFactory vistaFac = new ViewFactory();
        Model modelo;
        ModelFactory modelFac = new ModelFactory();

        int opc=0;
        System.out.println("Para modo consola: 1");
        System.out.println("Para modo grafico: 2");
        opc=Util.leerInt(1, 2);
        
        
        vista = vistaFac.getView(opc);
        modelo = modelFac.getModel();
        
        Controller controlador = new Controller();
        
        controlador.run(vista, modelo);
    }
    
}
