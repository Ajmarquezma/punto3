/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.lab;

/**
 *
 * @author lenovo
 */
public class Model_Carro {
    private String Numero_Modelo;
    private Categoria categoria;
    private int Precio;

    public Model_Carro(String Numero_Modelo, Categoria categoria, int Precio) {
        this.Numero_Modelo = Numero_Modelo;
        this.categoria = categoria;
        this.Precio = Precio;
    }

    public String getNumero_Modelo() {
        return Numero_Modelo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getPrecio() {
        return Precio;
    }
    
    
}
