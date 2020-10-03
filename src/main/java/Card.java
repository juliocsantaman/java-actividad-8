/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio Cesar Santaman Cruz.
 */
public class Card {
    // Atributos.
    private String palo;
    private String color;
    private String valor;
    
    // Métodos getters.
    public String getPalo() {
        return palo;
    }
    
    public String getColor() {
        return color;
    }
    
    public String getValor() {
        return valor;
    }
    
    // Métodos setters.
    public void setPalo(String palo) {
        this.palo = palo;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setValor(String valor) {
        this.valor = valor;
    }
}
