/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cointosssimulator;
import java.util.Random;

/**
 *
 * @author orlandomarin
 */
public class Coin 
{
    // instance fields
    private String sideUp;
    private int numberOfHeadsWins = 0;
    private int numberOfTailsWins = 0;
    
    
    /* Coin is a no argument constructor that randomly determines the side 
    of the coin that is facing up, heads or tails, and initializes the 
    sideUp field accordingly */
    
    public String Coin()
    {
        Random side = new Random();
        if (side.nextInt(2) == 0)
        {
            sideUp = "heads";
        }
        else
        {
            sideUp = "tails";
        }
        
        return sideUp;
    }
    
    /* the toss method simulates tossing a coin by selecting a random integer 
    from 0 to 1. if the random integer is 0, than the side up is heads and a 
    heads win will be coounted. If the random integer is 1, then the side up 
    is tails and a tails win will be counted*/
    
    public void toss()
    {
        Random side = new Random();
        
        if (side.nextInt(2) == 0)
        {
            sideUp = "heads";
            numberOfHeadsWins++;
        }
        else 
        {
            sideUp = "tails";
            numberOfTailsWins++;
        }
    }
    
    // the getSideUp method returns the value of the sideup field
    public String getSideUp()
    {
        return sideUp;
    }
    
    // the getHeadsWins method returns the number of times that Heads was the side up
    public int getHeadsWins()
    {
        return numberOfHeadsWins;
    }
    
    // the getTailsWins method returns the number of times that Tails was the side up
    public int getTailsWins()
    {
        return numberOfTailsWins;
    }
}
