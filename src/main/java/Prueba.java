
import java.util.ArrayList;
import t6AHind.FrontendPrg;
import t6AHind.PrgBackend;
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
        Programadore p2=new ProgramerWeb(1800,"juan","juan","AA5468L",1000);
        Programadore p3=new FrontendPrg(1600,1500,"zack","zack","ER5897L",1000);
        Programadore p4=new PrgBackend(1500,"alice","alice","As5698kl",0,2000);
        
       
        
        //anadir Programadores a la lista de Programadores
        programadores.add(p1);
        programadores.add(p2);
        programadores.add(p3);
        programadores.add(p4);
      
        //llamar los métodos propios de cada clase
        System.out.println("-----------------------------");
        for (Programadore aux : programadores) {
            System.out.println(aux);   
            aux.Programar();
            // Conversiones explícitas
            if (aux instanceof ProgramerWeb){
                ((ProgramerWeb) aux).TestarPaginaWeb();
            }
            if (aux instanceof FrontendPrg){
                FrontendPrg tmp = (FrontendPrg) aux;
                tmp.PgoramarFrontend();;
            }
            if (aux instanceof PrgBackend){
                PrgBackend tmp = (PrgBackend) aux;
                tmp.PgoramarBackend();
            }
            
        }
        
    }
}
