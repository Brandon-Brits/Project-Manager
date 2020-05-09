///Warwick Clark
///03/03/2020
///newContractor.java

package poised;

import javax.swing.JOptionPane;


public class newContractor{
    String name = JOptionPane.showInputDialog("CONTRACTOR DETAILS: \nENTER CONTRACTOR NAME: ");
    int num = Integer.parseInt(JOptionPane.showInputDialog("ENTER PHONE NUMBER: "));
    String email = JOptionPane.showInputDialog("ENTER EMAIL ADDRESS: ");
    String address = JOptionPane.showInputDialog("ENTER ADDRESS: ");

    newContractor(String name, int num, String email, String address){
//To change body of generated methods, choose Tools | Templates.
        ///throw new UnsupportedOperationException("NOT SUPPORTED."); 
    }

    newContractor(){
//To change body of generated methods, choose Tools | Templates.
        ///throw new UnsupportedOperationException("NOT SUPPORTED."); 
    }
}
