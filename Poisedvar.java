package com.mycompany.task;

public class Poisedvar{
	
///DECLARE VARIABLES
    private int projID;
    private int pronum;
    private String proname;
    private String building;
    private String Address;
    private int erfnum;
    private double cost;
    private double paid;
    private String deadline;
    private String cusname;
    private int cusnum;
    private String cusemail;
    private String cusaddress;
    private String aname;
    private int anum;
    private String aemail;
    private String aaddress;
    private String conname;
    private int connum;
    private String conemail;
    private String conaddress;    
/// CREATE OBJECT
    public Poisedvar(int inpronum, String inproname, String inbuilding, String inAddress, int inerfnum, double incost, double inpaid, String indeadline, String incusname, int incusnum, String incusemail, String incusaddress,String inaname, int inanum, String inaemail, String inaaddress,String inconname, int inconnum, String inconemail, String inconaddress){    	
/// NEW PROJECT
        pronum = inpronum;
        proname = inproname;
        building = inbuilding;
        Address = inAddress;
        erfnum = inerfnum;
        cost = incost;
        paid = inpaid;
        deadline = indeadline;
        cusname = incusname;
        cusnum = incusnum;
        cusemail = incusemail;
        cusaddress = incusaddress;
        aname = inaname;
        anum = inanum;
        aemail = inaemail;
        aaddress = inaaddress;
        conname = inconname;
        connum = inconnum;
        conemail = inconemail;
        conaddress = inconaddress;
    }    
/// CREATE OBJECT
    public Poisedvar(int inprojID, int inpronum, String inproname, String inbuilding, String inAddress, int inerfnum, double incost, double inpaid, String indeadline, String incusname, int incusnum, String incusemail, String incusaddress,String inaname, int inanum, String inaemail, String inaaddress,String inconname, int inconnum, String inconemail, String inconaddress){    	
/// NEW PROJECT
        projID = inprojID;
        pronum = inpronum;
        proname = inproname;
        building = inbuilding;
        Address = inAddress;
        erfnum = inerfnum;
        cost = incost;
        paid = inpaid;
        deadline = indeadline;
        cusname = incusname;
        cusnum = incusnum;
        cusemail = incusemail;
        cusaddress = incusaddress;
        aname = inaname;
        anum = inanum;
        aemail = inaemail;
        aaddress = inaaddress;
        conname = inconname;
        connum = inconnum;
        conemail = inconemail;
        conaddress = inconaddress;
    }
/// GETTER FOR THE VARIABLES
    public int getProjID(){
        return projID;
    }
    public int getPronum(){
        return pronum;
    }
    public String getProname(){
        return proname;
    }
    public String getBuilding(){
        return building;
    }
    public String getAddress(){
        return Address;
    }
    public int getErfnum(){
        return erfnum;
    }
    public double getCost(){
        return cost;
    }
    public double getPaid(){
        return paid;
    }
    public String getDeadline(){
        return deadline;
    }
    public String getCusname(){
        return cusname;
    }
    public int getCusnum(){
        return cusnum;
    }
    public String getCusemail(){
        return cusemail;
    }
    public String getCusaddress(){
        return cusaddress;
    }
    public String getAname(){
        return aname;
    }
    public int getAnum(){
        return anum;
    }
    public String getAemail(){
        return aemail;
    }
    public String getAaddress(){
        return aaddress;
    }
    public String getConname(){
        return conname;
    }
    public int getConnum(){
        return connum;
    }
    public String getConemail(){
        return conemail;
    }
    public String getConaddress(){
        return conaddress;
    }
    
/// SETTERS FOR THE VARIABLES

    public void setProjID(int projID){
        this.projID = projID;
    }
    public void setPronum(int pronum){
        this.pronum = pronum;
    }
    public void setProname(String proname){
        this.proname = proname;
    }
    public void setBuilding(String building){
        this.building = building;
    }
    public void setAddress(String Address){
        this.Address = Address;
    }
    public void setErfnum(int erfnum){
        this.erfnum = erfnum;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    public void setPaid(double paid){
        this.paid = paid;
    }
    public void setDeadline(String deadline){
        this.deadline = deadline;
    }
    public void setCusname(String cusname){
        this.cusname = cusname;
    }
    public void setCusnum(int cusnum){
        this.cusnum = cusnum;
    }
    public void setCusemail(String cusemail){
        this.cusemail = cusemail;
    }
    public void setCusaddress(String cusaddress){
        this.cusaddress = cusaddress;
    }
    public void setAname(String aname){
        this.aname = aname;
    }
    public void setAnum(int anum){
        this.anum = anum;
    }
    public void setAemail(String aemail){
        this.aemail = aemail;
    }
    public void setAaddress(String aaddress){
        this.aaddress = aaddress;
    }
    public void setConname(String conname){
        this.conname = conname;
    }
    public void setConnum(int connum){
        this.connum = connum;
    }
    public void setConemail(String conemail){
        this.conemail = conemail;
    }
    public void setConaddress(String conaddress){
        this.conaddress = conaddress;
    }
}
