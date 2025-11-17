/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ro.ugal.cti.magazindispozitivemobile;
import java.util.ArrayList;
/**
 *
 * @author ai402
 */
public class MagazinDispozitiveMobile {

    public static void main(String[] args) {
        BrataraFitness b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
        b1=new BrataraFitness();
        b2=new BrataraFitness("Xiaomi",88.99,true,false,true,true,false,false,true);
        b3=new BrataraFitness(b2);
        b4=new BrataraFitness("HUAWEI",139.59,true,false,true,true,false,true,true);
        b5=new BrataraFitness("HUAWEI",99.99,true,false,true,false,false,false,true);
        b6=new BrataraFitness("Fitbit",169.99,true,true,true,true,false,true,true);
        b7=new BrataraFitness("Xiaomi",134.99,true,false,true,true,true,false,true);
        b8=new BrataraFitness("Samsung",199.99,true,true,true,true,false,false,true);
        b9=new BrataraFitness("Samsung",119.99,true,false,true,true,true,false,true);
        b10=new BrataraFitness(b7);
        BrataraFitness[] b={b1,b2,b3,b4,b5,b6,b7,b8,b9,b10};
        for(int i=0;i<b.length;i++)
            System.out.println(i+"."+b[i]);
        System.out.println();
        
        AccesoriuBrataraFitness ab1,ab2,ab3,ab4,ab5,ab6,ab7,ab8,ab9,ab10;
        ab1=new AccesoriuBrataraFitness();
        ab2=new AccesoriuBrataraFitness("Xiaomi",20.34,"negru","inox",140,false);
        ab3=new AccesoriuBrataraFitness(ab2);
        ab4=new AccesoriuBrataraFitness("Samsung",40.25,"gri","silicon",150,true);
        ab5=new AccesoriuBrataraFitness("Xiaomi",25.24,"negru","silicon",160,false);
        ab6=new AccesoriuBrataraFitness("HUAWEI",30.00,"albastru","plastic",170,true);
        ab7=new AccesoriuBrataraFitness("Fitbit",21.34,"negru","silicon",130,false);
        ab8=new AccesoriuBrataraFitness("Samsung",26.30,"roz","silicon",140,true);
        ab9=new AccesoriuBrataraFitness(ab4);
        ab10=new AccesoriuBrataraFitness(ab7);
        ArrayList<AccesoriuBrataraFitness> ab=new ArrayList<AccesoriuBrataraFitness>();
        ab.add(ab1);
        ab.add(ab2);
        ab.add(ab3);
        ab.add(ab4);
        ab.add(ab5);
        ab.add(ab6);
        ab.add(ab7);
        ab.add(ab8);
        ab.add(ab9);
        ab.add(ab10);
        for(int i=0;i<ab.size();i++)
            System.out.println(i+"."+ab.get(i));
        System.out.println();
        
        DispozitivMobil d1,d2,d3,d4,d5,d6,d7,d8,d9,d10;
        d1=new DispozitivMobil();
        d2=new DispozitivMobil("Xiaomi",149.99);
        d3=new DispozitivMobil(d2);
        d4=new DispozitivMobil("Samsung",749.99);
        d5=new DispozitivMobil("Apple",899.99);
        d6=new DispozitivMobil("Fitbit",29.99);
        d7=new DispozitivMobil("Xiaomi",139.99);
        d8=new DispozitivMobil("Motorola",649.99);
        d9=new DispozitivMobil("HUAWEI",120.99);
        d10=new DispozitivMobil("Apple",1149.99);
        DispozitivMobil[] d={d1,d2,d3,d4,d5,d6,d7,d8,d9,d10};
        for(int i=0;i<d.length;i++)
            System.out.println(i+"."+d[i]);
        System.out.println();
    }
}
