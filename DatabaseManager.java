
package com.mycompany.task;

import java.io.File;
import java.sql.*;
import java.time.LocalDate;

public class DatabaseManager
{
    private Connection conn;
    String filename = (new File("PoisePMS.accdb")).getAbsolutePath();
    private Object UpcomingSupply;
    
///CONNECT TO DB
    public DatabaseManager(){
        try{
///CONECTION
            conn = DriverManager.getConnection("jdbc:ucanaccess://" + filename);
            System.out.println("CONNECTED");
        }         
        catch (SQLException e){
            System.out.println("COULD NOT CONNECT: " + e);
        }
    }
///CREATE A NEW PROJECT
    public void Insert(String pronum, String proname, String building, String address, String erfnum, String cost, String paid, String deadline, String cusname, String cuscpnum, String cusemail, String cusaddress, String aname, String acpnum, String aemail, String aaddress, String conname, String concpnum, String conemail, String conaddress) throws SQLException{
        Statement s = conn.createStatement();
        String q = "INSERT INTO TABLE(ProjectNum, ProjectName, BuildingType, ProjectAddress, ERFNumber, ProjectTotal, FeePaid, ProjectDeadline, ArchName, ArchNumber, ArchEmail, ArchAddress, ConName, ConNumber, ConEmail, ConAddress, CusName, CusNumber, CusEmail, CusAddress)\n"
            + "VALUES "
            + "('" + pronum + "', '" + proname + "', '" + building + "', '" + address + "', '" + erfnum + "', '" + cost + "', '" + paid + "', '" + deadline + "', '" + aname + "', '" + acpnum + "', '" + aemail + "', '" + aaddress + "', '" + conname + "', '" + concpnum + "', '" + conemail + "', '" + conaddress + "', '" + cusname + "', '" + cuscpnum + "', '" + cusemail + "', '" + cusaddress + "')";        
        System.out.println(q);
        s.executeUpdate(q);
    }    
    public void Finalize(String projecnum) throws SQLException{
        String num = projecnum;
        Statement s = conn.createStatement();
        String q = "INSERT INTO TABLE * FROM tblCurrentProject WHERE ProjectNum = " +num;
        System.out.println(q);
        s.executeUpdate(q);
    }    
    public void Update(String column, String update, int PID) throws SQLException{  
        Statement s = conn.createStatement();
        String q = "UPDATE tblCurrentProject SET "+column+" = '"+update+"' WHERE ProjectNum = "+PID+";";
        System.out.println(q); 
        s.executeUpdate(q);
    }    
    public void Overdue() throws SQLException{
        Statement s = conn.createStatement();
        String q = "SELECT * \nFROM tblCurrentProject WHERE ProjectDeadline < " + Date.valueOf(LocalDate.MIN);
        System.out.println(q);
        s.executeQuery(q);
    }    
    public void FindProject(String number) throws SQLException{
        Statement s = conn.createStatement();
        String q = "SELECT * \nFROM tblCurrentProject WHERE ProjectNum = " + number;
        System.out.println(q);
        s.executeQuery(q);
    }

    
}

