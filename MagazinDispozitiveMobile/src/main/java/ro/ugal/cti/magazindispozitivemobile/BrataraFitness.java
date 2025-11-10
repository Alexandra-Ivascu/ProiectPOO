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
}
