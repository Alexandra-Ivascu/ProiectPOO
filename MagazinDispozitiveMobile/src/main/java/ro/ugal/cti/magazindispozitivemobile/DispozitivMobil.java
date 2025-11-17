/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.cti.magazindispozitivemobile;

/**
 *
 * @author ai402
 */
 abstract public class DispozitivMobil {
    private String brand;
    private double pret;
    public DispozitivMobil(){
    this.brand="Necunoscut";
    this.pret=100.00;
    }
    public DispozitivMobil(String brand,double pret)
    {
        this.brand=brand;
        this.pret=pret;
    }
    public DispozitivMobil(DispozitivMobil dm)
    {
        this.brand=dm.brand;
        this.pret=dm.pret;
    }
    @Override 
    public String toString(){
        return "Dispozitiv mobil: brand: "+brand+", pret: "+pret+", ";
    }
    //abstract public int numaraFunctionalitati();
    //abstract public boolean brandValid();
    public String getBrand()
    {
        return brand;
    }
    
    public double getPret()
    {
        
        
        
        return pret;
    }
    public void setBrand(String brand)
    {
        this.brand=brand;
    }
    public void setPret(double pret)
    {
        this.pret=pret;
    }
    
    
}
