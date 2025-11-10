/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.cti.magazindispozitivemobile;

/**
 *
 * @author ai402
 */
public class AccesoriuBrataraFitness extends DispozitivMobil {
    private String culoare;
    private String material;
    private int marime;
    public AccesoriuBrataraFitness(){
    super();}
    public AccesoriuBrataraFitness(String brand,double pret,String culoare,String material,int marime)
    {
        super(brand,pret);
        this.material=material;
        this.marime=marime;
        this.culoare=culoare;
    }
    public AccesoriuBrataraFitness(AccesoriuBrataraFitness a)
    {
        super(a);
        this.material=a.material;
        this.marime=a.marime;
        this.culoare=a.culoare;
    }
    @Override
    public String toString()
    {
        return super.toString()+". Accesoriu bratara fitness, culoare "+culoare+", marime"+marime+", material "+material;
    }
}
