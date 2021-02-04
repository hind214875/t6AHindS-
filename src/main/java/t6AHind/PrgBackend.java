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
public class PrgBackend extends ProgramerWeb {

    //Attributos
    private double salarioBackendPrg;

    //constrectores
    public PrgBackend(double SalarioPW, String nombre, String Appelido, String nif, double salario, double salarioBackendPrg) {
        super(SalarioPW, nombre, Appelido, nif, salario);
        this.salarioBackendPrg = salarioBackendPrg;
    }

    public PrgBackend() {
        super();
    }

    //getters y setters
    public double getSalarioBackendPrg() {
        return salarioBackendPrg;
    }

    public void setSalarioBackendPrg(double salarioBackendPrg) {
        this.salarioBackendPrg = salarioBackendPrg;
    }

    //toString
    @Override
    public String toString() {
        return "PrgBackend{" + "salarioBackendPrg=" + salarioBackendPrg + '}';
    }

    //Sobrescribe el methodo programar 
    @Override
    public void Programar() {
        System.out.println(" has programado tu primera aplicación ");
        this.salario++;
    }

    //hachcode y equals
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.salarioBackendPrg) ^ (Double.doubleToLongBits(this.salarioBackendPrg) >>> 32));
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
        final PrgBackend other = (PrgBackend) obj;
        if (Double.doubleToLongBits(this.salarioBackendPrg) != Double.doubleToLongBits(other.salarioBackendPrg)) {
            return false;
        }
        return true;
    }

}
