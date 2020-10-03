
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio Cesar Santaman Cruz.
 */
public class Main {
    public static void main(String[] args) {
        // Creamos un objeto de tipo Deck.
        Deck deck = new Deck();
        
        // Usamos los métodos de la clase Deck.
        deck.shuffle();
        deck.head();
        deck.pick();
        deck.hand();
    }
    
}
