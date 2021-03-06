/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

/**
 *
 * @author Adarsh
 */
import java.awt.*;
abstract class Piece
{
    private int power;
    private char ability;
    private int distanceCapable;
    private Image face;

    public Piece(int p, char a, int d, Image f)
    {
        power = p;  
        ability = a;
        distanceCapable = d;
        face = f;
    }
    
    public boolean attack(Piece p)
    {
        //if attacks flag
        if(p.getPower() == 0)
        {
            return true;
        }
        //3 attacks bomb
        if(power == 3 && p.getPower() == 11)
        {
            return true;
        }
        //otherwise if attacks bomb, die
        if(p.getPower() == 11)
        {
            return true;
        }
        //if spy attacks 10
        if(power == 1 && p.getPower() == 10)
        {
            return true;
        }
        //otherwise compare power values
        return power >= p.getPower();
    }
    
    public int getPower()
    { return power; }

    public char getAbility()
    { return ability; }



    public int getDistanceCapable()
    { return distanceCapable; }

    public Image getFace()
    { return face; }
    
    public String toString()
    {
        return Integer.toString(power);
    }
}
