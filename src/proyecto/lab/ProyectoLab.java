/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.lab;

import java.util.Scanner;

/**
 *
 * @autores: Mateo Pacheco - cpachecof@unal.edu.co / Aldo Marquez - @unal.edu.co / Juan Esteban Muñoz - jemunozva@unal.edu.co
 */
public class ProyectoLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        String Pais, CP,Casa, Numero_Modelo,Nombre_Categoria;
        int Kilometraje, Precio;
        
        System.out.println("************** BIENVENIDOS ***************");
        System.out.println("PARA EMPEZAR DIGITE EL PAIS, CODIGO POSTAL "
                    +"\n"+"Y NUMERO DE CASA PARA REGISTRAR SU TIENDA:"+"\n");
        Pais = in.nextLine();
        CP = in.nextLine();
        Casa = in.nextLine();
        Tienda tienda1 = new Tienda(new Direccion(Pais, CP, Casa));
        
        System.out.println("DIGITE LOS DATOS DEL CARRO A INGRESAR:");
        System.out.println("INGRESE EL KILOMETRAJE, EL NUMERO DEL MODELO,"
                     +"\n"+"EL NOMBRE DE LA CATEGORIA Y EL PRECIO:");
        Kilometraje = in.nextInt();
        Numero_Modelo = in.nextLine();
        Nombre_Categoria = in.nextLine();
        Precio = in.nextInt();
        
        tienda1.addCarro(new Carro(new Model_Carro(Numero_Modelo, new Categoria(Nombre_Categoria), Precio), Kilometraje));
        System.out.println("¿ DESEA VER LA LISTA DE CARROS INGRESADOS ?");
        System.out.println("      1. SI                 2. NO");
        int desicion = in.nextInt();
        if(desicion==1)
            System.out.println(tienda1.listaCarros());
    }
    
}
