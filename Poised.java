package com.mycompany.task;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Poised{
    public static void main(String[] args) throws FileNotFoundException{
///TRY AND CATCH
        try{
///LINK CLASS WITH THE DB
            DatabaseManager dblink = new DatabaseManager();
///IMPORT DATE
            String timestamp = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
            String stest = null;
            char option = JOptionPane.showInputDialog("What Would You Like To Do?: \nA) Add A Project \nB) Edit \nC) Finalize A Project \nD) Check Outdated Projects \nE) Find A Certain Project \nQ) Exit").toUpperCase().charAt(0);
///LOOP UNTIL EXIT
            if (option != 'Q'){
///USER OPTION MENU
                if (option == 'A'){
                    String pronum = JOptionPane.showInputDialog("PROJECT INFO!\n Enter A Project Number");
                    String proname = JOptionPane.showInputDialog("Enter Project Name: ");
                    String building = JOptionPane.showInputDialog("Building Type: ");
                    String address = JOptionPane.showInputDialog("Address: ");
                    String erfnum = JOptionPane.showInputDialog("ERF Number: ");
                    String cost = JOptionPane.showInputDialog("Total Project Value: ");
                    String paid = JOptionPane.showInputDialog("How Much Money Has Been Already Paid: ");
                    String deadline = JOptionPane.showInputDialog("Enter Deadline Date (YYYY-MM-DD): ");
                    String cusname = JOptionPane.showInputDialog("Customer Name: ");
                    String cuscpnum = JOptionPane.showInputDialog("Customer Number: ");
                    String cusemail = JOptionPane.showInputDialog("Email Address: ");
                    String cusaddress = JOptionPane.showInputDialog("Customer Address: ");
                    String aname = JOptionPane.showInputDialog("Enter Architect Details: \nEnter Name: ");
                    String anum = JOptionPane.showInputDialog("Enter Phone Number: ");
                    String aemail = JOptionPane.showInputDialog("Enter Email Address: ");
                    String aaddress = JOptionPane.showInputDialog("Enter Address: ");
                    String conname = JOptionPane.showInputDialog("Contractor Details: \nEnter Contractor Name: ");
                    String connum = JOptionPane.showInputDialog("Enter Phone Number: ");
                    String conemail = JOptionPane.showInputDialog("Enter Email Address: ");
                    String conaddress = JOptionPane.showInputDialog("Enter Address: ");
                    // = new newProject(plink.pronum, plink.proname, plink.building, plink.address, plink.erfnum, plink.cost, plink.paid, plink.deadline, plink.cusname, plink.cuscpnum, plink.cusemail, plink.cusaddress);
                    dblink.Insert(pronum, proname, building, address, erfnum, cost, paid, deadline, cusname, cuscpnum, cusemail, cusaddress, aname, anum, aemail, aaddress, conname, connum, conemail, conaddress);
                    System.out.println("Project Added! Project Number = " + pronum);
                }
///OTHER OPTIONS    
                if (option == 'B'){
                    char option2 = JOptionPane.showInputDialog("What Would You Like To Edit: \nA) Due Date \nB) Project Price \nE) Exit").toUpperCase().charAt(0);                    
                    if (option2 != 'E'){
                        if (option2 == 'A'){
                        	String deadline = "ProjectDeadline";
                        	String newdeadline = JOptionPane.showInputDialog("Enter The New Project Deadline (YYYY-MM-DD): ");
                        	int pnum = Integer.parseInt(JOptionPane.showInputDialog("Please Enter The Project Number: "));
                        	dblink.Update(deadline, newdeadline, pnum);
                        }
                    }
                    
                    if (option2 == 'B'){
                        String ptotal = "ProjectTotal";
                        String newptotal = JOptionPane.showInputDialog("Please Enter A New Project Total: ");
                        int pnum = Integer.parseInt(JOptionPane.showInputDialog("Please Enter The Project Number: "));
                        dblink.Update(ptotal, newptotal, pnum);
                    }
                    
                }
                if (option == 'C'){
                    String pnum = JOptionPane.showInputDialog("Which project would you like to finalize: ");
                    dblink.Finalize(pnum);
                }
                if (option == 'D'){
                    dblink.Overdue();
                }
                if (option == 'D'){
                    String pnum = JOptionPane.showInputDialog("Which project would you like to Check: ");
                    dblink.FindProject(pnum);
                }     
            }
        } catch (Exception e){
///CATCH ERROR MESSAGE
            System.out.println("Error!!!");
        }
    }
    private static CharSequence println(String string){
        return null;
    }
}
