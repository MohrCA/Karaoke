
package karaoke;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    //Lista de participantes
    ArrayList participantes=new ArrayList();
   
    //metodo menu
    public void menu(){
    Scanner op=new Scanner(System.in);
    Scanner leer=new Scanner(System.in);
        System.out.println("Bienvenidos a Karaoke");
        System.out.println("Elija una opcion");
        System.out.println("1 - Comenzar");
        System.out.println("2 - Salir de Karaoke");
        
        int opcion=op.nextInt();
        String nombres=leer.nextLine();
        
        switch(opcion){
            case 1:
               opcion=0;
                System.out.println("Presion 1 para cargar participantes");
                System.out.println("Presione 2 para inciar partida");
                opcion=op.nextInt();
                
                switch(opcion){
                    case 1:
                
                        String opcionSalida="N";
                        int contador=0; 
                        System.out.println("Ingrese participantes");
                
                        do {     
                   
                            System.out.println("Ingrese nombre del participante");
                            participantes.add(contador);
                            contador=contador+1;
                            System.out.println("Presione 'N' para cargar otro participante o 'S' para finalizar");
                            String condicionSalida=leer.nextLine();
                   
                        } while (!opcionSalida.equalsIgnoreCase("S"));
                
                                break;
                    case 2:
                        System.out.println("Que inicie el show");
                        
            }
            case 2:
               
                System.out.println("Saliendo....");
                break;
        }
            
        
        
    }
    
    
    
    
    
}
