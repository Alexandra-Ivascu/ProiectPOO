/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.cti.magazindispozitivemobile;

/**
 *
 * @author ai402
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class AccesoriuBrataraFitness extends DispozitivMobil implements Proprietati,Serializable {
    private String culoare;
    private String material;
    private boolean universal;
    private int marime;
    public AccesoriuBrataraFitness(){
    super();
    culoare="Necunoscuta";
    material="Necunoscut";
    }
    public AccesoriuBrataraFitness(String brand,double pret,String culoare,String material,int marime,boolean universal)
    {
        super(brand,pret);
        this.material=material;
        this.marime=marime;
        this.culoare=culoare;
        this.universal=universal;
    }
    public AccesoriuBrataraFitness(AccesoriuBrataraFitness a)
    {
        super(a);
        this.material=a.material;
        this.marime=a.marime;
        this.culoare=a.culoare;
        this.universal=a.universal;
    }
    public String getCuloare()
    {
        return culoare;
    }
    public String getMaterial()
    {
        return material;
    }
    public int getMarime()
    {
       return marime;  
    }
    public boolean getUniversal()
    {
        return universal;
    }
    public void setCuloare(String culoare)
    {
        this.culoare=culoare;
    }
    public void setMarime(int marime)
    {
        this.marime=marime;
    }
    public void setMaterial(String material)
    {
        this.material=material;
    }
    public void setUniversal(boolean universal)
    {
        this.universal=universal;
    }
 
    @Override
    public String toString()
    {   String u=" ";
        if(universal)
          u=" universal, ";
        return super.toString()+" Accesoriu bratara fitness,"+u+"culoare "+culoare+", marime "+marime+", material "+material;
    }
    public int numaraFunctionalitati()
    { int n=0;
        if(universal)
            n++;
        return n;
    }
    public String tipDispozitiv()
     {
         return "Accesoriu bratara fitness";
     }
    public static void afisareCuConditii(ArrayList<AccesoriuBrataraFitness> ab,double pretMax,String culoare)
    {
        /*Scanner in;
        in=new Scanner(System.in);
        System.out.println("Introduceti pretul maxim: ");
        double p=in.nextDouble();
        System.out.println("Introduceti culoarea dorita: ");
        in.nextLine();
        String c=in.nextLine();*/
        for(int i=0;i<ab.size();i++)
            if(pretMax>=ab.get(i).getPret() && culoare.toLowerCase().equals(ab.get(i).culoare.toLowerCase()))
                System.out.println(i+"."+ab.get(i));
    }
    public static void scrieFisierABF(ArrayList<AccesoriuBrataraFitness> abf, String numeFisier) {
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(numeFisier));
            oos.writeObject(abf);
            System.out.println("Scriere reusita accesoriu bratara fitness");
            oos.close();
        } catch(Exception e){
            System.out.println("eroare la scriere in fisier accesoriu bratara fitness");
        }
    }
      public static ArrayList<AccesoriuBrataraFitness> citesteABF(String numeFisier){
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(numeFisier));
            return  (ArrayList<AccesoriuBrataraFitness>) ois.readObject();
        }catch(Exception e){
            System.out.println("eroare la citire din fisier accesoriu bratara fitness");
            return new ArrayList<AccesoriuBrataraFitness>();
        }
    }
}
