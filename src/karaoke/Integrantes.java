
package karaoke;

import java.util.ArrayList;
import java.util.Scanner;


public class Integrantes {
   //Atributos integrantes
    private int cantidad;
    
    ArrayList lista=new ArrayList();
    ArrayList clonaParticipantes=new ArrayList();
    private String nombres;
    
    public void Integrantes(){
    
    }
    //Lista de participantes
    public void cantParticipantes(){
        this.cantidad=cantidad;
        String nombre;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de participantes");
        cantidad=leer.nextInt();
        
        
        System.out.println("Ingrese el nombre de todos los participantes");
        for (int i = 0; i < cantidad+1; i++) {
            nombre=leer.nextLine();
            lista.add(i, nombre);
            
        }
        
    }
  
    // Metodo para elegir participantes
    public void azarParticipantes(){
        ArrayList memoriaParticipantes=new ArrayList();
        memoriaParticipantes.addAll(lista);
        System.out.println("Eligiendo participantes....");
       while(lista.size()>=2){
        int num1 = (int)Math.floor(Math.random()*lista.size());
        int num2 = (int)Math.floor(Math.random()*lista.size());
           System.out.println(lista.size());  
  
        System.out.println(num1);
             System.out.println(num2);
        System.out.println("Pasan a cantar: "+lista.get(num1)+" y "+lista.get(num2));
        lista.remove(num1);
        lista.remove(num2);
       }
        if (lista.size()==1) {
            System.out.println("El ultimo participante es: "+lista.get(0));
            lista.remove(0);
        }
        if (lista.size()==0) {
            lista.addAll(memoriaParticipantes);
        }
       }
   
   
                
}
