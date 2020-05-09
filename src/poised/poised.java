///Warwick Clark
///03/03/2020
///poised.java

package poised;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.swing.JOptionPane;
import poised.newArchitect;
import poised.newContractor;
import poised.newProject;

public class poised{
    @SuppressWarnings("deprecation")
	public static void main(String[] args) throws FileNotFoundException, IOException{
        
        Date date = new Date();
        System.out.println(date.getDate());
        newProject[] proobj = new newProject[5];
        int pnum = 0;
        newArchitect[] arcobj = new newArchitect[5];
        int arcnum = 0;
        newContractor[] conobj = new newContractor[5];
        int connum = 0;
        char option = JOptionPane.showInputDialog("WHAT WOULD YOU LIKE TO DO?:. \nA) ADD A PROJECT \nB) ADD AN ARCHITECT \nC) ADD A CONTRACTOR \nD) CHECK PROJECTS \nZ) EDIT \nQ) EXIT").toUpperCase().charAt(0);
        while (option != 'Q'){
            if (option == 'A'){
            	if (pnum > 4){
                    System.out.println("MAX NUMBER OF PROJECTS ADDED.");
                } 
            	else{
                    newProject plink = new newProject();
                    proobj[pnum] = new newProject(plink.pronum, plink.proname, plink.building, plink.address, plink.erfnum, plink.cost, plink.paid, plink.date, plink.cusname, plink.cuscpnum, plink.cusemail, plink.cusaddress);
                    pnum++;
                    System.out.println("PROJECT ADDED");
                }
            }
            if (option == 'B'){
                if (arcnum > 4){
                    System.out.println("MAX ARCHITECTS ADDED");
                } 
                else{
                    newArchitect alink = new newArchitect();
                    arcobj[arcnum] = new newArchitect(alink.name, alink.num, alink.email, alink.address);
                    arcnum++;
                }
            }
            if (option == 'C'){
                if (connum > 4){
                    System.out.println("MAX CONTRACTORS ADDED");
                } 
                else{
                    newContractor clink = new newContractor();
                    conobj[connum] = new newContractor(clink.name, clink.num, clink.email, clink.address);
                    connum++;
                }
            }
            if (option == 'D'){
            	PrintWriter writer = new PrintWriter("Completed project.txt");
            	
                int projectnum = Integer.parseInt(JOptionPane.showInputDialog("PLEASE ENTER THE PROJECT: "));
                if (proobj[projectnum].getCost() > 0.00){
                    System.out.println("OUTSTANDING: R" + proobj[projectnum].getCost());
                    writer.write("NAME: " + proobj[projectnum].cusname + "\n");
                    writer.write("EMAIL ADDRESS: " + proobj[projectnum].cusemail + "\n");
                    writer.write("PHONE NUMBER: " + proobj[projectnum].cuscpnum + "\n");
                    writer.write("ADDRESS: " + proobj[projectnum].cusaddress + "\n");
                    writer.write("PROJECT NUMBER: " + proobj[projectnum].pronum + "\n");
                    writer.write("PROJECT NAME: " + proobj[projectnum].proname + "\n");
                    writer.write("TYPE OF BUILDING: " + proobj[projectnum].building + "\n");
                    writer.write("ERF NUMBER: " + proobj[projectnum].erfnum + "\n");
                    writer.write("TOTAL: R" + proobj[projectnum].cost + "\n");
                    writer.write("DATE DUE: " + proobj[projectnum].date + "\n");              
                    writer.write(date.getDate());
                    writer.close();
                } 
                else{
                	System.out.println("You dont have any money outstanding");
                    writer.write("NAME: " + proobj[projectnum].cusname + "\n");
                    writer.write("EMAIL ADDRESS: " + proobj[projectnum].cusemail + "\n");
                    writer.write("PHONE NUMBER: " + proobj[projectnum].cuscpnum + "\n");
                    writer.write("ADDRESS: " + proobj[projectnum].cusaddress + "\n");
                    writer.write("PROJECT NUMBER: " + proobj[projectnum].pronum + "\n");
                    writer.write("PROJECT NAME: " + proobj[projectnum].proname + "\n");
                    writer.write("TYPE OF BUILDING: " + proobj[projectnum].building + "\n");
                    writer.write("ERF NUMBER: " + proobj[projectnum].erfnum + "\n");
                    writer.write("TOTAL: R" + proobj[projectnum].cost + "\n");
                    writer.write("DATE DUE: " + proobj[projectnum].date + "\n");              
                    writer.write(date.getDate());
                    writer.close();
                }
            }
            if (option == 'Z'){
                char option2 = JOptionPane.showInputDialog("WHAT WOULD YOU LIKE TO EDIT: \nA) DUE DATE \nB) PROFECT PRICE \nC) CONTRACTOR INFO \nQ) EXIT").toUpperCase().charAt(0);
                while (option2 != 'E'){
                    int projnum2 = Integer.parseInt(JOptionPane.showInputDialog("PLEASE ENTER THE PROJECT NUMBER YOU WISH TO EDIT: "));
                    if (option2 == 'A'){
                        if (proobj[projnum2].date.isEmpty()){
                            System.out.println("NO PROJECT EXISTS");
                        } 
                        else{
                            String change = JOptionPane.showInputDialog("ENTER DATE AS FOLLOWS 'YYYY/MM/DD': ");
                            System.out.println("DATE HAS BEEN AMMENDED TO: ");
                            System.out.println("OLD DATE: " + proobj[projnum2].date);
                            proobj[projnum2].date = change;
                            System.out.println("NEW DATE: " + proobj[projnum2].date);
                        }
                    }
                    if (option2 == 'B'){
                        double change = Double.parseDouble(JOptionPane.showInputDialog("Enter the new amount"));

                        System.out.println("PROJECT TOTAL CHANGED");
                        System.out.println("OLD TOTAL : R" + proobj[projnum2].cost);
                        proobj[projnum2].cost = change;
                        System.out.println("NEW TOTAL : R" + proobj[projnum2].cost);
                    }
                    if (option2 == 'C'){
                        conobj[projnum2].name = JOptionPane.showInputDialog("CONTRACTOR DETAILS: \nENTER NAME: ");
                        conobj[projnum2].num = Integer.parseInt(JOptionPane.showInputDialog("ENTER PHONE NUMBER: "));
                        conobj[projnum2].email = JOptionPane.showInputDialog("ENTER EMAIL ADDRESS: ");
                        conobj[projnum2].address = JOptionPane.showInputDialog("ENTER ADDRESS: ");
                    }
                }
            }
            option = JOptionPane.showInputDialog("WHAT WOULD YOU LIKE TO DO? A) ADD A PROJECT B) ADD AN ARCHITECT C) ADD A CONTRACTOR D) COMPLETE PROJECT Z) EDIT Q) EXIT").toUpperCase().charAt(0);
        }
    }
}
