/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author brigi
 */
public class calcular {
    private String nombre;
    private String direccion;
    private int numDiasTrabajados;
    private double valorDia, salario;
    
    public calcular (){
        this.nombre="";
        this.direccion="";
        this.numDiasTrabajados=0;
        this.valorDia=0;
        this.salario=0;
    }
    public void salario(){
        this.salario=this.numDiasTrabajados*this.valorDia;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the numDiasTrabajados
     */
    public int getNumDiasTrabajados() {
        return numDiasTrabajados;
    }

    /**
     * @param numDiasTrabajados the numDiasTrabajados to set
     */
    public void setNumDiasTrabajados(int numDiasTrabajados) {
        this.numDiasTrabajados = numDiasTrabajados;
    }

    /**
     * @return the valorDia
     */
    public double getValorDia() {
        return valorDia;
    }

    /**
     * @param valorDia the valorDia to set
     */
    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }
    
}
