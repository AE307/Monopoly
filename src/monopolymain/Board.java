/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monopolymain;

/**
 *
 * @author Lenovo
 */


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

/**
 *
 * @author Huda Amr
 */
public class Board extends JPanel {

    private ArrayList<Square> allSquares = new ArrayList<Square>();
    private ArrayList<Square> unbuyableSquares = new ArrayList<Square>(); // squares like "Go", "Chances" etc...

    public ArrayList<Square> getUnbuyableSquares() {
        return unbuyableSquares;
    }

    public ArrayList<Square> getAllSquares() {
        return allSquares;
    }

    public Square getSquareAtIndex(int location) {
        return allSquares.get(location);
    }

    public Board(int xCoord, int yCoord, int width, int height) {
        setBorder(new LineBorder(new Color(0, 0, 0)));
        setBounds(xCoord, yCoord, 912, 912);
        this.setLayout(null);
        initializeSquares();
    }

    private void initializeSquares() {
        // TODO Auto-generated method stub
        String[] squareNames = {
            "Go",
            "Oriental Ave",
            "Community Chest",
            "Vermont Ave",
            "Connecticut Ave",
            "Roll once",
            "St. Charles Place",
            "Chance",
            "States Ave",
            "Virginia Ave",
            "Free Parking",
            "St. James Place",
            "Community Chest",
            "Tennessee Ave",
            "New York Ave",
            "Squeeze Play",
            "Pacific Ave",
            "North Carolina Ave",
            "Chance",
            "Pennsylvania Ave",
            "CHANCE",
            "JAIL",
            "Mediterranean Avenue",
            "Baltic Avenue",
            "Park Place",
            "Board Walk"

        };

        // squares on the top
        Square square00 = new Square(6, 6, 100, 100, squareNames[0], 135);
        this.add(square00);
        allSquares.add(square00);
        unbuyableSquares.add(square00);

        Square square01 = new Square(106, 6, 100, 100, squareNames[1], 180);
        this.add(square01);
        allSquares.add(square01);

        Square square02 = new Square(206, 6, 100, 100, squareNames[2], 180);
        this.add(square02);
        allSquares.add(square02);
        unbuyableSquares.add(square02);

        Square square03 = new Square(306, 6, 100, 100, squareNames[3], 180);
        this.add(square03);
        allSquares.add(square03);

        Square square04 = new Square(406, 6, 100, 100, squareNames[4], 180);
        this.add(square04);
        allSquares.add(square04);

        Square square22 = new Square(506, 6, 100, 100, squareNames[22], 180);
        this.add(square22);
        allSquares.add(square22);
        
        Square square23 = new Square(606, 6, 100, 100, squareNames[23], 180);
        this.add(square23);
        allSquares.add(square23);
        

        Square square05 = new Square(706, 6, 100, 100, squareNames[5], -135);
        this.add(square05);
        allSquares.add(square05);
        unbuyableSquares.add(square05);

        // squares on the right
        Square square06 = new Square(706, 106, 100, 100, squareNames[6], -90);
        this.add(square06);
        allSquares.add(square06);

        Square square07 = new Square(706, 206, 100, 100, squareNames[7], -90);
        this.add(square07);
        allSquares.add(square07);
        

        Square square08 = new Square(706, 306, 100, 100, squareNames[8], -90);
        this.add(square08);
        allSquares.add(square08);

        Square square09 = new Square(706, 406, 100, 100, squareNames[9], -90);
        this.add(square09);
        allSquares.add(square09);

        Square square10 = new Square(706, 506, 100, 100, squareNames[25], -45);
        this.add(square10);
        allSquares.add(square10);
       

        // squares on the bottom
        Square square25 = new Square(706, 606, 100, 100, squareNames[10], 0);
        this.add(square25);
        allSquares.add(square25);
        unbuyableSquares.add(square25);

        Square square11 = new Square(406, 606, 100, 100, squareNames[11], 0);
        this.add(square11);
        allSquares.add(square11);

        Square square12 = new Square(306, 606, 100, 100, squareNames[12], 0);
        this.add(square12);
        allSquares.add(square12);
        unbuyableSquares.add(square12);

        Square square13 = new Square(206, 606, 100, 100, squareNames[13], 0);
        this.add(square13);
        allSquares.add(square13);

        Square square14 = new Square(106, 606, 100, 100, squareNames[14], 0);
        this.add(square14);
        allSquares.add(square14);

        Square square15 = new Square(6, 506, 100, 100, squareNames[15], 45);
        this.add(square15);
        allSquares.add(square15);
        unbuyableSquares.add(square15);

        // squares on the left
        Square square16 = new Square(6, 406, 100, 100, squareNames[16], 90);
        this.add(square16);
        allSquares.add(square16);

        Square square17 = new Square(6, 306, 100, 100, squareNames[17], 90);
        this.add(square17);
        allSquares.add(square17);
        //unbuyableSquares.add(square17);

        Square square18 = new Square(6, 206, 100, 100, squareNames[18], 90);
        this.add(square18);
        allSquares.add(square18);
        unbuyableSquares.add(square18);

        Square square19 = new Square(6, 106, 100, 100, squareNames[19], 90);
        this.add(square19);
        allSquares.add(square19);
        Square square24 = new Square(606, 606, 100, 100, squareNames[24], 0);
        this.add(square24);
        allSquares.add(square24);
        unbuyableSquares.add(square24);
//        Square square10 = new Square(706, 506, 100, 100, squareNames[25], -45);
//        this.add(square10);
//        allSquares.add(square10);
//        unbuyableSquares.add(square10);
//         Square square25= new Square(706,606,100,100,squareNames[10],0);
//        this.add(square25);
//        allSquares.add(square25);
//        unbuyableSquares.add(square25);

        Square square20 = new Square(506, 606, 100, 100, squareNames[20], -45);
        this.add(square20);
        allSquares.add(square20);
        unbuyableSquares.add(square20);

        Square square21 = new Square(6, 606, 100, 100, squareNames[21], 90);
        this.add(square21);
        allSquares.add(square21);
        unbuyableSquares.add(square21);
        // setting prices
        square01.setPrice(100);
        square03.setPrice(100);
        square04.setPrice(120);

        square06.setPrice(140);
        square08.setPrice(140);
        square09.setPrice(160);

        square11.setPrice(180);
        square13.setPrice(180);
        square14.setPrice(200);

        square16.setPrice(300);
        square17.setPrice(300);
        square19.setPrice(320);

        square22.setPrice(310);
        square23.setPrice(350);
        square24.setPrice(370);
        square25.setPrice(300);

        // setting rent prcies
        square01.setRentPrice(6);
        square03.setRentPrice(6);
        square04.setRentPrice(8);

        square06.setRentPrice(10);
        square08.setRentPrice(10);
        square09.setRentPrice(12);

        square11.setRentPrice(14);
        square13.setRentPrice(14);
        square14.setRentPrice(16);

        square16.setRentPrice(26);
        square17.setRentPrice(26);
        square19.setRentPrice(28);

        square22.setRentPrice(26);
        square23.setRentPrice(26);
        square24.setRentPrice(28);
        square25.setRentPrice(28);
        //MONOPOLY LABEL
        JLabel lblMonopoly = new JLabel("MONOPOLY") {
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                AffineTransform aT = g2.getTransform();
                Shape oldshape = g2.getClip();
                double x = getWidth() / 2.0;
                double y = getHeight() / 2.0;
                aT.rotate(Math.toRadians(-35), x, y);
                g2.setTransform(aT);
                g2.setClip(oldshape);
                super.paintComponent(g);
            }
        };
        lblMonopoly.setForeground(Color.WHITE);
        lblMonopoly.setBackground(Color.RED);
        lblMonopoly.setOpaque(true);
        lblMonopoly.setHorizontalAlignment(SwingConstants.CENTER);
        lblMonopoly.setFont(new Font("Lucida Grande", Font.PLAIN, 45));
        lblMonopoly.setBounds(279, 330, 300, 75);
        this.add(lblMonopoly);
        //CHANCE LABEL
        JLabel lblChance = new JLabel("CHANCE") {
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                AffineTransform aT = g2.getTransform();
                Shape oldshape = g2.getClip();
                double x = getWidth() / 2.0;
                double y = getHeight() / 2.0;
                aT.rotate(Math.toRadians(-35), x, y);
                g2.setTransform(aT);
                g2.setClip(oldshape);
                super.paintComponent(g);
            }
        };
        lblChance.setForeground(Color.BLACK);
        lblChance.setBackground(new Color(255, 255, 255));
        lblChance.setOpaque(true);
        lblChance.setHorizontalAlignment(SwingConstants.CENTER);
        lblChance.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
        lblChance.setBounds(230, 230, 150, 75);
        this.add(lblChance);
        //Community Chest LABEL
        JLabel lblCommunity = new JLabel("Community Chest") {
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                AffineTransform aT = g2.getTransform();
                Shape oldshape = g2.getClip();
                double x = getWidth() / 2.0;
                double y = getHeight() / 2.0;
                aT.rotate(Math.toRadians(-35), x, y);
                g2.setTransform(aT);
                g2.setClip(oldshape);
                super.paintComponent(g);
            }
        };
        lblCommunity.setForeground(Color.BLACK);
        lblCommunity.setBackground(new Color(255, 255, 255));
        lblCommunity.setOpaque(true);
        lblCommunity.setHorizontalAlignment(SwingConstants.CENTER);
        lblCommunity.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
        lblCommunity.setBounds(430, 420, 150, 75);
        this.add(lblCommunity);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    

}