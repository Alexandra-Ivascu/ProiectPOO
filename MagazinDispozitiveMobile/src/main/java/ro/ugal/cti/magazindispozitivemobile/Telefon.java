/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.cti.magazindispozitivemobile;

/**
 *
 * @author Dorina
 */
public class Telefon extends DispozitivMobil {
    private boolean dualSim;
    private boolean suport5G;
    private int nrCamere;
    private int cameraPrincipalMP;

    public Telefon() {}

    public Telefon(String brand, double pret, boolean dualSim, boolean suport5G,
                   int nrCamere, int cameraPrincipalMP) {
        super(brand, pret);
        this.dualSim = dualSim;
        this.suport5G = suport5G;
        this.nrCamere = nrCamere;
        this.cameraPrincipalMP = cameraPrincipalMP;
    }

    public Telefon(Telefon other) {
        super(other);
        this.dualSim = other.dualSim;
        this.suport5G = other.suport5G;
        this.nrCamere = other.nrCamere;
        this.cameraPrincipalMP = other.cameraPrincipalMP;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Telefon{dualSim=" + dualSim +
               ", suport5G=" + suport5G +
               ", nrCamere=" + nrCamere +
               ", cameraPrincipalMP=" + cameraPrincipalMP + "}";
    }
}
