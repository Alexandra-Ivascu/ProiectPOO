/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.cti.magazindispozitivemobile;

/**
 *
 * @author Maria-Irina
 */
//This PC
public class AccesoriiSmartwatch extends DispozitivMobil
{
    
    //private String brand;
    //private double pret;
    private String material;
    private String tip;
    
    public AccesoriiSmartwatch()
    {
        super();
    
    }
    public AccesoriiSmartwatch(String brand,double pret,String material,String tip)
    {
        super(brand,pret);
        
        //this.brand=brand;
        //this.pret=pret;
        this.material=material;
        this.tip=tip;
        
    }
    
    public AccesoriiSmartwatch (AccesoriiSmartwatch accesoriul1)
    {
        super(accesoriul1);
        //this.brand="BEST ACCESORIES";
        //this.pret=39.89;
        //this.material="silicon";
        //this.tip="curea";
        //this.brand=accesoriul1.brand;
        //this.pret=accesoriul1.pret;
        this.material=accesoriul1.material;
        this.tip=accesoriul1.tip;
    
    }
    
    @Override
    public String toString()
    {
        return super.toString()+"Accesoriu: brand: "+super.getBrand()+", pret: "+super.getPret()+", material: "+material+", tip: "+tip;
        
    
    }
    
    
}
