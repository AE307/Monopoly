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
public abstract class Property extends Square {
    private final int price;
    private final int rent;
    protected Player owner;
    public boolean mortgaged;

    public Property(String name, int price, int rent){
       // super(name);
        this.price = price;
        this.rent = rent;
    }

    @Override
    public int getPrice(){
        return price;
    }

    public int getRent(){
        return rent;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player newOwner){
        owner = newOwner;
    }

//   public void offerBuy(Player currentPlayer){
////        System.out.println("Would you like to buy " + name + " for $" + price + "?"+"(yes/no)");
////        //String response = Input.read().toLowerCase();
////
////        if(response.contains("yes")){
////            bought(currentPlayer);
////        }
//    }

    public void bought(Player currentPlayer){
        owner = currentPlayer;
       // currentPlayer.buy(this);
    }

    public void doAction(Player currentPlayer) {
        if(currentPlayer == owner);
            //square is owned by the currentPlayer
        else if(owner != null) {
            //square is owned by someone else
            if(!mortgaged){
                System.out.println(currentPlayer.getName() + " paid " + owner.getName() + " $" + getRent() + " in rent");
      //          currentPlayer.pay(owner, getRent());
            }
        } else {
            //square can be bought
           // offerBuy(currentPlayer);
        }
    }
}