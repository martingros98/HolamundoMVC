/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.nview;

/**
 *
 * @author 2dam
 */
public class ViewFactory {
    
    public View getView(int n){
        if(n == 1){
        
            return new ViewImplementation();
        }
        else{
            return new GraphicViewImplementation();
        }
        
    }
    
}
