/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monopolymain;

import java.io.PrintWriter;
public class CardDraw extends Square{
    private Deck deck;

    public CardDraw(Deck deck, String name){
       // super(name);
        this.deck = deck;
    }
    public void doAction(Player player) {
        //deck.playTop(player);
    }
}
