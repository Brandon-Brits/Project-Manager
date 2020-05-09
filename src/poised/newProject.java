///Warwick Clark
///03/03/2020
///newProject.java

package poised;

import javax.swing.JOptionPane;
public class newProject{
    int num = 0;
    // Inputs
    int pronum = Integer.parseInt(JOptionPane.showInputDialog("PROJECT INFO\nENTER A PROJECT NUMBER"));
    String proname = JOptionPane.showInputDialog("ENTER NAME: ");
    String building = JOptionPane.showInputDialog("BUILDING TYPE: ");
    String address = JOptionPane.showInputDialog("ADDRESS: ");
    int erfnum = Integer.parseInt(JOptionPane.showInputDialog("ERF NUMBER: "));
    double cost = Double.parseDouble(JOptionPane.showInputDialog("TOTAL PROJECT VALUE: "));
    double paid = Double.parseDouble(JOptionPane.showInputDialog("MONEY ALREADY PAID"));
    String date = JOptionPane.showInputDialog("DUE DATE (please use this format 'YYYY/MM/DD')");
    String cusname = JOptionPane.showInputDialog("CUSTOMER NAME: ");
    int cuscpnum = Integer.parseInt(JOptionPane.showInputDialog("CUSTOMER NUMBER: "));
    String cusemail = JOptionPane.showInputDialog("EMAIL ADDRESS: ");
    String cusaddress = JOptionPane.showInputDialog("CUSTOMER ADDRESS: ");
    int slocation = cusname.indexOf(" ") + 1;
    String cussurname = cusname.substring(slocation);

//    NewProject[num] pobj = {pronum, pname, building, address, erfnum, cost, paid, date, cusnmae, cuscpnum, cusemail, cusaddress};
    newProject(int pnum, String pname, String building, String address, int erfnum, double tcost, double cpaid, String date, String cusname, int cuscpnum, String cusemail, String cusaddress){
        ///throw new UnsupportedOperationException("NOT SUPPORTED."); //To change body of generated methods, choose Tools | Templates.
    }
    public double getCost(){
        double sum = cost - paid;
        return sum;
    }
    newProject(){
        ///throw new UnsupportedOperationException("NOT SUPPORTED."); //To change body of generated methods, choose Tools | Templates.
    }
}
