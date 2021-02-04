/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6AHind;

/**
 *
 * @author hinda
 */
public class FrontendPrg extends ProgramerWeb {

    private double SalarioFrontendP;

    //constrectores
    public FrontendPrg(double SalarioFrontendP, double SalarioPW, String nombre, String Appelido, String nif, double salario) {
        super(SalarioPW, nombre, Appelido, nif, salario);
        this.SalarioFrontendP = SalarioFrontendP;
    }

    public FrontendPrg() {
        super();
    }

    //getters y setters 
    public double getSalarioFrontendP() {
        return SalarioFrontendP;
    }

    public void setSalarioFrontendP(double SalarioFrontendP) {
        this.SalarioFrontendP = SalarioFrontendP;
    }

    //toString
    @Override
    public String toString() {
        return "FrontendPrg{" + "SalarioFrontendP=" + SalarioFrontendP + '}';
    }

    //hachcode y equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.SalarioFrontendP) ^ (Double.doubleToLongBits(this.SalarioFrontendP) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FrontendPrg other = (FrontendPrg) obj;
        if (Double.doubleToLongBits(this.SalarioFrontendP) != Double.doubleToLongBits(other.SalarioFrontendP)) {
            return false;
        }
        return true;
    }

}
