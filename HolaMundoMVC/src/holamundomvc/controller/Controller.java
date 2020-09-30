/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.controller;

import holamundomvc.modelo.Model;
import holamundomvc.nview.View;
import holamundomvc.nview.utilidades.Util;


/**
 *
 * @author 2dam
 */
public class Controller {
    public void run (View vista, Model modelo){

            String saludo = modelo.getGreeting();
            vista.showGreeting(saludo);
 
        
    }
    
    
}
