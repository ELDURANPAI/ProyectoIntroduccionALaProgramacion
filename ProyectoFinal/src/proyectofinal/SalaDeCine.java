/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

/**
 * Autores:
  
 * Anferny Sanabria
 * Byron Zumbado
 * Esteban Picado
 * Jorge Durán
 
 **/

public class SalaDeCine {
    // Atributos
    private String pelicula;
    private int dimesion;
    private Empleado[][] matrizEmpleados;

    // Constructor
    public SalaDeCine(String pelicula, int dimesion, Empleado[][] matrizEmpleados) {
        this.pelicula = pelicula;
        this.dimesion = dimesion;
        this.matrizEmpleados = matrizEmpleados;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public int getDimesion() {
        return dimesion;
    }

    public void setDimesion(int dimesion) {
        this.dimesion = dimesion;
    }

    public Empleado[][] getMatrizEmpleados() {
        return matrizEmpleados;
    }

    public void setMatrizEmpleados(Empleado[][] matrizEmpleados) {
        this.matrizEmpleados = matrizEmpleados;
    }
}
