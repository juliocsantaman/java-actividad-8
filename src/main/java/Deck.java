
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
public class Deck {
    // Atributos.
    private List<Card> deckList = new ArrayList<>();
    private Card card = new Card();
    
    // Método constructor.
    public Deck() {
        crearCartas("Tréboles", "Negro");
        crearCartas("Corazones", "Rojo");
        crearCartas("Picas", "Negro");
        crearCartas("Diamantes", "Rojo");
    }
    
    // Métodos.
    /*
    Método que crea 13 cartas dependiendo
    de los parámetros que se le pasen (palo, color).
    */
    public void crearCartas(String palo, String color) {
        // Creamos las cartas.
        for(int i=2; i<15; i++) {
            card.setPalo(palo);
            card.setColor(color);
            card.setValor(Integer.toString(i));
            
            switch(i) {
                case 11: card.setValor("A");
                break;
                case 12: card.setValor("J");
                break;
                case 13: card.setValor("Q");
                break;
                case 14: card.setValor("K");
                break;
            }
            
            deckList.add(card);
            card = new Card();
        }
    }
    
    /*
    Método que mezcla el Deck.
    */
    public void shuffle() {
        System.out.println("Método utilizado: shuffle.");
        System.out.println("Se mezcló el Deck.");
        System.out.println();
    }
    
    /*
    Método que muestra la primera carta del Deck
    y la remueve.
    */
    public void head() {
        System.out.println("Método utilizado: head.");
        System.out.println("Palo: " + deckList.get(0).getPalo() + ", Color: " + deckList.get(0).getColor()
        + ", Valor: " + deckList.get(0).getValor());
        deckList.remove(0);
        System.out.println("Quedan " + deckList.size() + " cartas.");
        System.out.println();
    }
    
    /*
    Método que muestra una carta al azar
    y la remueve.
    */
    public void pick() {
        System.out.println("Método utilizado: pick.");
        int cartaRandom = (int) (Math.random()*(deckList.size()-1)+0);
        System.out.println("Palo: " + deckList.get(cartaRandom).getPalo() + ", Color: " + deckList.get(cartaRandom).getColor()
        + ", Valor: " + deckList.get(cartaRandom).getValor());
        deckList.remove(cartaRandom);
        System.out.println("Quedan " + deckList.size() + " cartas.");
        System.out.println();
    }
    
    /*
    Método que regresa cinco cartas
    del Deck y las remueve.
    */
    public void hand() {
        System.out.println("Método utilizado: hand.");
        for(int i=0; i<5; i++) {
            System.out.println("Palo: " + deckList.get(i).getPalo() + ", Color: " + deckList.get(i).getColor()
        + ", Valor: " + deckList.get(i).getValor());
        }
        
        for(int i=0; i<5; i++) {
            deckList.remove(i);
        }
        
        System.out.println("Quedan " + deckList.size() + " cartas.");
        System.out.println();
    }
    
    /*
    Método que muestra todas las cartas existentes en el Deck.
    */
    public void mostrarCartas() {
        for(int i=0; i<deckList.size()-1; i++) {
            System.out.println("Palo: " + deckList.get(i).getPalo() + ", Color: " + deckList.get(i).getColor()
        + ", Valor: " + deckList.get(i).getValor());
        }
        
        System.out.println("Número de cartas: " + deckList.size());
        System.out.println();
    }
}
