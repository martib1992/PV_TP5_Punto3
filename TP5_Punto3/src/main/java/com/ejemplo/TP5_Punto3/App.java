package com.ejemplo.TP5_Punto3;

import java.util.Scanner;

public class App 
{
	
    public static void main( String[] args ){
    	
        boolean band=true;        
        Scanner leer = new Scanner(System.in); 
//---------------------Menu   
        do{
        	System.out.println("|----------------------------------------|");
        	System.out.println("|                   Menu                 |");
        	System.out.println("|----------------------------------------|");
        	System.out.println("| 1 - Saludar                            |");
        	System.out.println("| 2 - Test (Duran)                       |");
        	System.out.println("| 3 -                                    |");
        	System.out.println("| 4 -                                    |");
        	System.out.println("| 99- Salir                              |");
        	System.out.println("|----------------------------------------|");
        	System.out.print("| Seleccione una opcion: ");
        	int opc = leer.nextInt();;
        	System.out.println("|----------------------------------------|");
        	limpiarPantalla();                   
                                                     

            switch(opc){
                case 1: {
                	System.out.println("|----------------------------------------|");
                    System.out.println("|        Bienvenidos al MENU de          |");
                    System.out.println("|          Programacion Visual           |");
                	System.out.println("|----------------------------------------|");
                	presionarTecla();
                	limpiarPantalla();
                    break;
                    
                }
                
                // Agregar aca los case faltantes 
                
                case 99: {
                	band=false;
                	System.out.println("|----------------------------------------|");
                    System.out.println("|     Muchas gracias por tu visita       |");
                    System.out.println("|           UNJU - APU - 2022            |");
                	System.out.println("|----------------------------------------|");
                	presionarTecla();
                	limpiarPantalla();
                }
                   

            }
            
        }while (band);                                         
    }
    
    // Funcion para limpiar la pantalla
    
    public static void limpiarPantalla() {
    	for (int i=0; i<15; i++) {
    		System.out.println();
    	}	
    }
    
    public static void presionarTecla() {
    	System.out.println("| Pulse una tecla para continuar...      |");
    	System.out.println("|----------------------------------------|");
    	Scanner leer = new Scanner(System.in);
    	String aux = leer.nextLine();

    }
    
    
}

