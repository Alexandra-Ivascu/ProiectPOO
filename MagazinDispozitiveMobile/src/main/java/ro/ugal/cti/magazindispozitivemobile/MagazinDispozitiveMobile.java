/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ro.ugal.cti.magazindispozitivemobile;

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
        
        
    }
}
