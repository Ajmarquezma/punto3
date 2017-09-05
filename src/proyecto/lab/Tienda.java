/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.lab;

import java.util.ArrayList;

/**
 *
 * @autores: Mateo Pacheco - cpachecof@unal.edu.co / Aldo Marquez - @unal.edu.co / Juan Esteban Muñoz - jemunozva@unal.edu.co
 */
public class Tienda {
    private ArrayList<Carro> Carros;
    private Direccion Direccion;

    public Tienda(Direccion Direccion) {
        this.Direccion = Direccion;
        this.Carros = new ArrayList<Carro>();
    }
    
    public Direccion getDireccion() {
        return Direccion;
    }
    
    public void addCarro(Carro carro){
        Carros.add(carro);
    }
    
    public String listaCarros(){
        String info = "";
        for(int i = 0; i < Carros.size(); i++){
            info += "Carro " + (i+1) + ":\n";
            info += "Kilometraje: " + Carros.get(i).getKilometraje() + "\n";
            info += "Precio: " + Carros.get(i).getModelo_carro().getPrecio()+ "\n";
            info += "Numero modelo: " + Carros.get(i).getModelo_carro().getNumero_Modelo()+ "\n";
            info += "Categoria: " + Carros.get(i).getModelo_carro().getCategoria().getNombre() + "\n\n";
        }
        return info;
    }
    
}
