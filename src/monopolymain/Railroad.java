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
public class Railroad extends Property {
    public Railroad(String name){
        super(name, 200, 0);
    }

    @Override
    public int getRent() {
        int rent;

//        switch(owner.getNumRailroads()){
//            case 1:
//                rent = 25;
//                break;
//            case 2:
//                rent = 50;
//                break;
//            case 3:
//                rent = 100;
//                break;
//            case 4:
//                rent = 200;
//                break;
//            default:
//                rent = -1;
//                break;
//        }

        //return rent;
        return 0;
    }
}
