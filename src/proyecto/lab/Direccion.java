/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.lab;

/**
 *
 * @autores: Mateo Pacheco - cpachecof@unal.edu.co / Aldo Marquez - @unal.edu.co / Juan Esteban Muñoz - jemunozva@unal.edu.co
 */
public class Direccion {
    
    private String Pais;
    private String Codigo_Postal;
    private String Casa;

    public Direccion(String Pais, String Codigo_Postal, String Casa) {
        this.Pais = Pais;
        this.Codigo_Postal = Codigo_Postal;
        this.Casa = Casa;
    }

    public String getPais() {
        return Pais;
    }

    public String getCodigo_Postal() {
        return Codigo_Postal;
    }

    public String getCasa() {
        return Casa;
    }
    
    
}
