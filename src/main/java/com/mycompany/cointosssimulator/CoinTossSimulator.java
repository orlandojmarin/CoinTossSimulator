/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cointosssimulator;

/**
 *
 * @author orlandomarin
 */
public class CoinTossSimulator {

    public static void main(String[] args) 
    {
        // variables
        final int TOSSES = 20;  // creating the TOSSES constant so the number of tosses can be changed in one place if needed

        // create a coin object, which will be a quarter
        Coin quarter = new Coin();
        
        /* determine the initial side that is facing up on the quarter and
        print the results */
        System.out.println("The initial side facing up on the quarter is " + quarter.Coin() + ".");
        
        /* toss the coin several (TOSSES) times and list the results, 
        displaying the side of the coin that is facing up each time */
        
        System.out.println("Orlando will now toss the quarter " + TOSSES + " times and track the results!");
        
        for (int count = 1; count <= TOSSES; count ++)
        {
            quarter.toss();
            System.out.println(count + ". " + quarter.getSideUp());
        }
        
        /* count the total number of times heads and tails are facing up, and 
        display those total values after the loop finishes */
        
        System.out.println("Heads won " + quarter.getHeadsWins() + " out of " + TOSSES + " times, Orlando Marin.");
        System.out.println("Tails won " + quarter.getTailsWins() + " out of " + TOSSES + " times, Orlando Marin.");
    }
}
