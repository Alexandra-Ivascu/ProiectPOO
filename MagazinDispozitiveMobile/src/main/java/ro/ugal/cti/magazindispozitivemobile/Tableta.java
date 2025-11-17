/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.cti.magazindispozitivemobile;

/**
 *
 * @author Dorina
 */
public class Tableta extends DispozitivMobil {

    private boolean areStylus;
    private boolean tastaturaDetasabila;
    private int refreshRate;
    private boolean suportaSIM;

    public Tableta() {
        super();
    }

    public Tableta(String brand, double pret,
                   boolean areStylus, boolean tastaturaDetasabila,
                   int refreshRate, boolean suportaSIM) {
        super(brand, pret);
        this.areStylus = areStylus;
        this.tastaturaDetasabila = tastaturaDetasabila;
        this.refreshRate = refreshRate;
        this.suportaSIM = suportaSIM;
    }

    public Tableta(Tableta other) {
        super(other); 
        this.areStylus = other.areStylus;
        this.tastaturaDetasabila = other.tastaturaDetasabila;
        this.refreshRate = other.refreshRate;
        this.suportaSIM = other.suportaSIM;
    }

    public boolean isAreStylus() {
        return areStylus;
    }

    public void setAreStylus(boolean areStylus) {
        this.areStylus = areStylus;
    }

    public boolean isTastaturaDetasabila() {
        return tastaturaDetasabila;
    }

    public void setTastaturaDetasabila(boolean tastaturaDetasabila) {
        this.tastaturaDetasabila = tastaturaDetasabila;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public boolean isSuportaSIM() {
        return suportaSIM;
    }

    public void setSuportaSIM(boolean suportaSIM) {
        this.suportaSIM = suportaSIM;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Tableta: areStylus = " + areStylus
                + ", tastaturaDetasabila = " + tastaturaDetasabila
                + ", refreshRate = " + refreshRate
                + ", suportaSIM = " + suportaSIM;
    }
}