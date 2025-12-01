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
        b4=new BrataraFitness("HUAWEI",139.59,true,false,false,true,false,true,true);
        b5=new BrataraFitness("HUAWEI",99.99,true,false,false,false,false,false,true);
        b6=new BrataraFitness("Fitbit",169.99,true,true,true,true,false,true,true);
        b7=new BrataraFitness("Xiaomi",134.99,true,false,true,false,true,false,true);
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
        ab5=new AccesoriuBrataraFitness("Xiaomi",24.24,"rosu","silicon",160,false);
        ab6=new AccesoriuBrataraFitness("HUAWEI",30.00,"albastru","plastic",170,true);
        ab7=new AccesoriuBrataraFitness("Fitbit",21.34,"negru","silicon",130,false);
        ab8=new AccesoriuBrataraFitness("Samsung",26.30,"roz","silicon",140,true);
        ab9=new AccesoriuBrataraFitness("Samsung",30.30,"roz","plastic",140,true);
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
       
        Telefon t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;
        t1 = new Telefon("Samsung", 3000, true, true, 3, 50);
        t2 = new Telefon("Apple", 5000, true, true, 2, 48);
        t3 = new Telefon(t1);
        t4 = new Telefon("Xiaomi", 1500, true, false, 3, 64);
        t5 = new Telefon("Huawei", 2200, false, false, 2, 40);
        t6 = new Telefon("Nokia", 800, false, false, 1, 13);
        t7 = new Telefon("Motorola", 1300, true, false, 2, 48);
        t8 = new Telefon("Realme", 1700, true, true, 3, 50);
        t9 = new Telefon("Google", 4500, true, true, 2, 50);
        t10 = new Telefon(t2);

        ArrayList<Object> telefoane = new ArrayList<>();
        telefoane.add(t1); telefoane.add(t2); telefoane.add(t3); telefoane.add(t4); telefoane.add(t5);
        telefoane.add(t6); telefoane.add(t7); telefoane.add(t8); telefoane.add(t9); telefoane.add(t10);

        System.out.println("Vector Telefon (ArrayList<Object>):");
        for (int i = 0; i < telefoane.size(); i++) {
            System.out.println(i + ". " + telefoane.get(i));
        }
        System.out.println();


        Tableta tb1, tb2, tb3, tb4, tb5, tb6, tb7, tb8, tb9, tb10;
        tb1 = new Tableta();
        tb2 = new Tableta("Samsung", 2500, true, true, 120, true);
        tb3 = new Tableta(tb2);
        tb4 = new Tableta("Apple", 4000, true, false, 120, false);
        tb5 = new Tableta("Lenovo", 1500, false, false, 60, true);
        tb6 = new Tableta("Huawei", 1800, true, false, 90, false);
        tb7 = new Tableta("Xiaomi", 1600, true, false, 120, false);
        tb8 = new Tableta("Microsoft", 3500, true, true, 60, true);
        tb9 = new Tableta("Amazon", 900, false, false, 60, false);
        tb10 = new Tableta(tb4);

        Object[] tablete = { tb1, tb2, tb3, tb4, tb5, tb6, tb7, tb8, tb9, tb10 };

        System.out.println("Vector Tableta (Object[]):");
        for (int i = 0; i < tablete.length; i++) {
            System.out.println(i + ". " + tablete[i]);
        }
        System.out.println();
        
        
        Smartwatch s1=new Smartwatch("HUAWEI",499.00,"negru","Midnight","Android");
        Smartwatch s2=new Smartwatch("XIAOMI",199.00,"negru","Redmi Watch 5","Android/iOS");
        Smartwatch s3=new Smartwatch("APPLE",1353.99,"auriu","Apple Watch SE 3","iOS");
        Smartwatch s4=new Smartwatch("HAMA",299.99,"roz","HAMA 5000,","Android/iOS");
        Smartwatch s5=new Smartwatch("SAMSUNG",914.25,"gri inchis","Galaxy Watch7","Android");
        Smartwatch s6=new Smartwatch("AMAZFIT",499.00,"alb","Cheetah Square","Android/iOS");
        Smartwatch s7=new Smartwatch("CANYON",77.10,"rose-gold","Semifreddo SW-61","Android/iOS");
        Smartwatch s8=new Smartwatch("CANYON",77.10,"mov","Semifreddo SW-61","Android/iOS");
        Smartwatch s9=new Smartwatch("MYRIA",73.35,"roz","MY9525PK","Android/iOS");
        Smartwatch s10=new Smartwatch("PROMATE",499.90,"negru","XWatch-US13","Andorid/iOS");
         
        AccesoriiSmartwatch as1=new AccesoriiSmartwatch("BEST ACCESORIES",39.89,"silicon","curea");
        AccesoriiSmartwatch as2=new AccesoriiSmartwatch("AXROAD MALL",18.00,"plastic","incarcator magnetic USB");
        AccesoriiSmartwatch as3=new AccesoriiSmartwatch("OEM",14.83,"policarbonat/sticla securizata","carcasa");
        AccesoriiSmartwatch as4=new AccesoriiSmartwatch("CASEY STUDIOS",47.92,"metal","curea");
        AccesoriiSmartwatch as5=new AccesoriiSmartwatch("CASEY STUDIOS",31.91,"policarbonat","husa protectie");
        AccesoriiSmartwatch as6=new AccesoriiSmartwatch("JENUOS",12.00,"silicon","folie protectie");
        AccesoriiSmartwatch as7=new AccesoriiSmartwatch("APPLE",193.97,"plastic","AirTag ");
        AccesoriiSmartwatch as8=new AccesoriiSmartwatch("SAMSUNG",299.50,"piele ecologica","bratara");
        AccesoriiSmartwatch as9=new AccesoriiSmartwatch("GARMIN",107.99,"plastic","cablu securizare");
        AccesoriiSmartwatch as10=new AccesoriiSmartwatch("APPLE",249.00,"textil, otel inoxidabil","breloc AirTag");
        
        Smartwatch[] s={s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
        
        //System.out.println(s1);
        
        for(int i=0;i<s.length;i++)      //i=i+2) reda din 2 in 2
            System.out.println(i+"."+s[i]);
        System.out.println();
        
        AccesoriiSmartwatch[] as={as1,as2,as3,as4,as5,as6,as7,as8,as9,as10};
        
        //System.out.println(as1);     System.out.println(as[0]);  afis primul term din vector
        //System.out.println(as[as,length-1]);  afis ultim term din vector
        
        for(int i=0;i<as.length;i++)
            System.out.println(i+"."+as[i]);
        System.out.println();
        
        
        System.out.println("\n  Smartwatch-uri cu pret > 500 lei si sunt fabricate de SAMSUNG ");
        
        for (Smartwatch sw : s)
        {
            if (sw.getPret()>500 && sw.getBrand().toUpperCase().contains("SAMSUNG"))
            {System.out.println(sw);}
        
        }
        
        System.out.println("\n  Smartwatch-uri cu pret < 50 lei si sunt fabricate de CASEY STUDIOS ");
        
        for(AccesoriiSmartwatch acc : as)
        {
            if(acc.getBrand().toUpperCase().contains("CASEY STUDIOS") && acc.getPret()<50)
            {System.out.println(acc);}
        
        }
        /*
        System.out.println();
        System.out.println("Accesoriu Bratara Fitness: ");
        AccesoriuBrataraFitness.afisareCuConditii(ab);
        System.out.println("BrataraFitness: ");
        BrataraFitness.afisareCuConditii(b);
        */
        
        

        
    }
    
   
}
