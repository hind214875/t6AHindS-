/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6AHind;

import java.util.Objects;

/**
 *
 * @author hinda
 */
public class Programadore {

    //attributos
    String nombre;
    String Appelido;
    String nif;
    double salario;

    //constrectores
    public Programadore(String nombre, String Appelido, String nif, double salario) {
        this.nombre = nombre;
        this.Appelido = Appelido;
        this.nif = nif;
        this.salario = salario;

    }

    public Programadore() {
        this.nombre = "";
        this.Appelido = "";
        this.nif = "";
        this.salario = 20000;

    }
    
    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppelido() {
        return Appelido;
    }

    public void setAppelido(String Appelido) {
        this.Appelido = Appelido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //methodo toString
    @Override
    public String toString() {
        return "Programadores{" + "nombre=" + nombre + ", Appelido=" + Appelido + ", nif=" + nif + ", salario=" + salario + '}';
    }
    
    //methodo hashcode y equals

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.Appelido);
        hash = 53 * hash + Objects.hashCode(this.nif);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.salario) ^ (Double.doubleToLongBits(this.salario) >>> 32));
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
        final Programadores other = (Programadores) obj;
        if (Double.doubleToLongBits(this.salario) != Double.doubleToLongBits(other.salario)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.Appelido, other.Appelido)) {
            return false;
        }
        if (!Objects.equals(this.nif, other.nif)) {
            return false;
        }
        return true;
    }
    
    

}
