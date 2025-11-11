/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.cti.magazindispozitivemobile;

/**
 *
 * @author ai402
 */
public class BrataraFitness extends DispozitivMobil {
    private boolean monitorizarePuls;
    private boolean monitorizareTensiune;
    private boolean monitorizareSomn;
    private boolean monitorizareSpo2;
    private boolean monitorizareCalorii;
    private boolean pedometru;
    private boolean rezistentaApa;
    public BrataraFitness(){
    super();}
    public BrataraFitness(String brand,double pret,boolean puls,boolean tensiune,boolean somn,boolean spo2,boolean calorii,boolean pedometru, boolean rezistentaApa){
        super(brand,pret);
        this.monitorizareCalorii=calorii;
        this.monitorizarePuls=puls;
        this.pedometru=pedometru;
        this.monitorizareSomn=somn;
        this.monitorizareTensiune=tensiune;
        this.monitorizareSpo2=spo2;
        this.rezistentaApa=rezistentaApa;
        
    }
    public BrataraFitness(BrataraFitness bf)
    {
        super(bf);
        this.monitorizareCalorii=bf.monitorizareCalorii;
        this.monitorizarePuls=bf.monitorizarePuls;
        this.monitorizareSomn=bf.monitorizareSomn;
        this.monitorizareSpo2=bf.monitorizareSpo2;
        this.monitorizareTensiune=bf.monitorizareTensiune;
        this.pedometru=bf.pedometru;
        this.rezistentaApa=bf.rezistentaApa;
    }
    public boolean getMonitorizareSomn()
    {
        return monitorizareSomn;
    }
    public boolean getMonitorizareTensiune()
    {
        return monitorizareTensiune;
    }
    public boolean getMonitorizarePuls()
    {
        return monitorizareSpo2;
    }
    public boolean getMonitorizareCalorii()
    {
        return monitorizareCalorii;
    }
    public boolean getMonitorizareSpo2()
    {
        return monitorizareSpo2;
    }
    public boolean getPedometru()
    {
        return pedometru;
    }
    public boolean getRezistentaApa()
    {
        return rezistentaApa;
    }
    public void setMonitorizareTensiune(boolean tensiune)
    {
        this.monitorizareTensiune=tensiune;
    }
    public void setMonitorizareCalorii(boolean calorii)
    {
        this.monitorizareCalorii=calorii;
    }
    public void setMonitorizarePuls(boolean puls)
    {
        this.monitorizarePuls=puls;
    }
    public void setMonitorizareSpo2(boolean spo2)
    {
        this.monitorizareSpo2=spo2;
    }
    public void setMonitorizareSomn(boolean somn)
    {
        this.monitorizareSomn=somn;
    }
    public void setRezistentaApa(boolean rezistentaApa)
    {
        this.rezistentaApa=rezistentaApa;
    }
    public void setPedometru(boolean pedometru)
    {
        this.pedometru=pedometru;
    }
    @Override
    public String toString()
    {
        String mesaj=super.toString()+" .Bratara fitness cu functii de: ";
        if(this.monitorizareCalorii)
            mesaj=mesaj+"monitorizare a caloriilor ";
        if(this.monitorizareTensiune)
            mesaj=mesaj+"monitorizare a tensiunii ";
        if(this.monitorizarePuls)
            mesaj=mesaj+"monitorizare a pulsului ";
        if(this.monitorizareSpo2)
            mesaj=mesaj+"monitorizare a Spo2 ";
        if(this.monitorizareSomn)
            mesaj=mesaj+"monitorizare a somnului ";
        if(this.pedometru)
            mesaj=mesaj+"pedometru";
        if(this.rezistentaApa)
            mesaj=mesaj+"resistenta la apa";
     
        
        return mesaj;
    }
     public int numaraFunctionalitati()
    {
        int nr=0;
        if(this.monitorizareCalorii)
            nr++;
        if(this.monitorizareTensiune)
            nr++;
        if(this.monitorizarePuls)
            nr++;
        if(this.monitorizareSpo2)
            nr++;
        if(this.monitorizareSomn)
            nr++;
        if(this.pedometru)
           nr++;
        if(this.rezistentaApa)
           nr++;
        return nr;
    }
     public boolean brandValid()
     {
         return (this.getBrand().equals("Xiaomi") || this.getBrand().equals("Samsung"));
     }
}
