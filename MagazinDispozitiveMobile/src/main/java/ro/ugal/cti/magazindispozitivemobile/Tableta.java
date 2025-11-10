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

    public Tableta() {}

    public Tableta(String brand, double pret, boolean areStylus,
                   boolean tastaturaDetasabila, int refreshRate, boolean suportaSIM) {
        super(brand, pret);
        this.areStylus = areStylus;
        this.tastaturaDetasabila = tastaturaDetasabila;
        this.refreshRate = refreshRate;
        this.suportaSIM = suportaSIM;
    }

    public Tableta(Tableta tab) {
        super(tab);
        this.areStylus = tab.areStylus;
        this.tastaturaDetasabila = tab.tastaturaDetasabila;
        this.refreshRate = tab.refreshRate;
        this.suportaSIM = tab.suportaSIM;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Tableta{areStylus=" + areStylus +
               ", tastaturaDetasabila=" + tastaturaDetasabila +
               ", refreshRate=" + refreshRate +
               ", suportaSIM=" + suportaSIM + "}";
    }
}