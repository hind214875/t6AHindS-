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
public class ProgramerWeb extends Programadore {
    private double SalarioPW;
    
    //constrectores
    public ProgramerWeb(double SalarioPW, String nombre, String Appelido, String nif, double salario) {
        super(nombre, Appelido, nif, salario);
        this.SalarioPW = SalarioPW;
    }

    public ProgramerWeb() {
        super();
    }

    public double getSalarioPW() {
        return SalarioPW;
    }

    public void setSalarioPW(double SalarioPW) {
        this.SalarioPW = SalarioPW;
    }
    
    //Sobrescribe el methodo programar 
    @Override
    public void Programar(){
         System.out.println(" has programado tu primera aplicación ");
         this.salario++;
     }
    
    //methodo Programar webSite
    public void ProgramarWeb(){
        System.out.println(" has programado tu primera pagina web ");
        this.SalarioPW++;
    }
    
    //ToString
    @Override
    public String toString() {
        return "ProgramerWeb{" + "SalarioPW=" + SalarioPW + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.SalarioPW) ^ (Double.doubleToLongBits(this.SalarioPW) >>> 32));
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
        final ProgramerWeb other = (ProgramerWeb) obj;
        if (Double.doubleToLongBits(this.SalarioPW) != Double.doubleToLongBits(other.SalarioPW)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
  
    
    
    
    
}
