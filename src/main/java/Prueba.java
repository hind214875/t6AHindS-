
import java.util.ArrayList;
import t6AHind.FrontendPrg;
import t6AHind.Programadore;
import t6AHind.ProgramerWeb;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hinda
 */
public class Prueba {
    public static void main(String[] args) {
        
        ArrayList<Programadore> programadores=new ArrayList<Programadore>();
        
        //lista de programadores
        Programadore p1=new Programadore("juan","juan","AA5468L",1000);
        Programadore p2=new Programadore("jack","jack","AF8898L",1500);
        Programadore p3=new Programadore("maria","maria","FI8974M",1500);
        
        //lista de ProgaramadoresWeb
        ProgramerWeb pw1=new ProgramerWeb(1800,"juan","juan","AA5468L",1000);
        ProgramerWeb pw2=new ProgramerWeb(1900,"maria","maria","FI8974M",1500);
        
        //lista de frontend Programers
        FrontendPrg f1=new FrontendPrg(0,1800,"juan","juan","AA5468L",1000);
        FrontendPrg f2=new FrontendPrg(1600,1500,"zack","zack","ER5897L",1000);
        
        //lista de Backend Programers
        FrontendPrg fend1=new FrontendPrg(1500,1500,"alice","alice","As5698kl",0);
        FrontendPrg fend2=new FrontendPrg(1000,0,"juan","juan","AA5468L",1000);
        
        //anadir Programadores a la lista de Programadores
        programadores.add(new Programadore("juan","juan","AA5468L",1000));
        programadores.add(new Programadore("maria","maria","FI8974M",1500));
        
        
    }
}
