/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeappliances;

import GUI.Login;
public class HomeAppliances {

    
    public static void main(String[] args) {
       
           java.awt.EventQueue.invokeLater(new Runnable() {
          @Override
          public void run() {
               new Login().setVisible(true);
           }
});
        
    }
    
}
