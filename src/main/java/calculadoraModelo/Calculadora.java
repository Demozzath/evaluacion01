/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraModelo;

/**
 *
 * @author demozath
 */
public class Calculadora {
     private double interesAnual;
    private Integer cantidadAnios;
    private double capitalTotal;
    
    public Calculadora(){
        
    }
    
    public double calculaInteres(){
    double resultado = this.capitalTotal*(this.interesAnual/100)*this.cantidadAnios;
    return resultado;
}

    public double getInteresAnual() {
        return interesAnual;
    }

    public Integer getCantidadAnios() {
        return cantidadAnios;
    }

    public double getCapitalTotal() {
        return capitalTotal;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    public void setCantidadAnios(Integer cantidadAnios) {
        this.cantidadAnios = cantidadAnios;
    }

    public void setCapitalTotal(double capitalTotal) {
        this.capitalTotal = capitalTotal;
    }
    
    
}
