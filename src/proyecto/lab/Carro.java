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
public class Carro {
    private Model_Carro Modelo_carro;
    private int Kilometraje;

    public Carro(Model_Carro Modelo_carro, int Kilometraje) {
        this.Modelo_carro = Modelo_carro;
        this.Kilometraje = Kilometraje;
    }

    public Model_Carro getModelo_carro() {
        return Modelo_carro;
    }

    public int getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(int Kilometraje) {
        this.Kilometraje = Kilometraje;
    }
    
    
}
