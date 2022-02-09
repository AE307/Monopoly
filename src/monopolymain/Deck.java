/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monopolymain;

/**
 *
 * @author Lenovo
 */
import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;

public class Deck {
    private LinkedList<Card> deck = new LinkedList<>();

    //plays top card and puts it on bottom of deck
    public void playTop(Player player){
        Card topCard = deck.removeFirst();
        add(topCard);
        topCard.play(player);
    }

    public void add(Card card){
        deck.addLast(card);
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }
}