/*=============================================
  class YoRPG -- Driver file for Ye Olde Role Playing Game.
  Simulates monster encounters of a wandering adventurer.
  Required classes: Warrior, Monster
  =============================================*/

import java.io.*;
import java.util.*;

public class YoRPG {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    //change this constant to set number of encounters in a game
    public final static int MAX_ENCOUNTERS = 5;

    //each round, a Warrior and a Monster will be instantiated
    private Character pat;   //Is it man or woman?
    
    private Character smaug; //Friendly generic monster name, eh?

    private int moveCount;
    private boolean gameOver;
    private int difficulty;

    private InputStreamReader isr;
    private BufferedReader in;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    public YoRPG() {
        moveCount = 0;
        gameOver = false;
        isr = new InputStreamReader( System.in );
        in = new BufferedReader( isr );
        newGame();
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

    /*=============================================
      void newGame() -- facilitates info gathering to begin a new game
      pre:  
      post: according to user input, modifies instance var for difficulty 
      and instantiates a Warrior
      =============================================*/
    public void newGame() {

        String s;
        String t;
        int i;
        String name = "";
        s = "Welcome to Ye Olde RPG!\n";

        s += "\nChoose your difficulty: \n";
        s += "\t1: Easy\n";
        s += "\t2: Not so easy\n";
        s += "\t3: Sauron hath nothing on me. Bring it on.\n";
        s += "Selection: ";
        System.out.print( s );

        try {
            difficulty = Integer.parseInt( in.readLine() );
        }
        catch ( IOException e ) { }

        s = "Brave warrior of Middle-Earth, what doth thy call thyself? (State your name): ";
        System.out.print( s );

        try {
            name = in.readLine();
        }
        catch ( IOException e ) { }

        t = "\nWhat class shall you choose?\n";
        t += "\t1:Warrior\n";
        t += "\t2:Elf\n";
        t += "\t3:Dwarf\n";
        t += "\t4:Wizard\n";
        t += "\t5:Hobbit\n";
        System.out.println(pat.about());
        
        i = 1;
        try {
                i = Integer.parseInt( in.readLine() );
        }
        catch ( IOException e) { }
        
        if (i == 1) {
                pat = new Warrior(name);
                 }
        else if (i == 2) {
                pat = new Elf(name);
                }
        else if (i == 3) {
                pat = new Dwarf(name);
                }
        else if (i == 4) {
                pat = new Wizard(name);
                }
        else if (i == 5) {
                pat = new Hobbit(name);
                }
        


        //instantiate the player's character
        ;

    }//end newGame()


    /*=============================================
      boolean playTurn -- simulates a round of combat
      pre:  Warrior pat has been initialized
      post: Returns true if player wins (monster dies).
            Returns false if monster wins (player dies).
      =============================================*/
    public boolean playTurn() {

        int i = 1;
        int d1, d2;
        double diff = (difficulty / 3.0);
        double MonsterRan = Math.random();

        if ( Math.random() >=  diff  )
            System.out.println( "Nothing to see here. Move along!" );

        else {
            
            if (MonsterRan > (1.0 - diff)) {
                    smaug = new Urakhai();
                System.out.println( "A powerful enemy emerges!" );}

            else {
                smaug = new Monster();
                System.out.println( "Lo, yonder monster approacheth!" );}

            while( smaug.isAlive() && pat.isAlive() ) {

                // Give user the option of using a special attack:
                // If you land a hit, you incur greater damage,
                // ...but if you get hit, you take more damage.
                try {
                    System.out.println( "What shall you do?" );
                    System.out.println( "\t1: Normal Attack!\n\t2: Increase ATT but Lower Def!\n\t3:SPECIAL ATTACK!!!\n\t4:HEAL!");
                    i = Integer.parseInt( in.readLine() );
                }
                catch ( IOException e ) { }
                d1 = 0;
		
                if (i == 4) {
			int heal = (int)(Math.random() * 20);
                    	pat.lowerHP(0 - heal);
                	System.out.println( "You dealt  a total of 0  points of damage, but you have healed" + " " + heal + " " + "HP."); }
                
		else if (i == 3)
                        d1 = pat.specialAtt (smaug);

                else {

                        if ( i == 2 )
                            pat.specialize();
                        else if ( i == 1 )
                            pat.normalize();

                        d1 = pat.attack( smaug ); 
                }
                
                d2 = smaug.attack( pat );

                System.out.println( "You dealt  a total of " + d1 +
                                     " points of damage.");

                System.out.println( "Ye Olde Monster hit back for " + d2 +
                                    " points of damage.");
                System.out.println("You have " + pat.getHP() + "HP");
                    System.out.println("Ye Monster has " + smaug.getHP() + "HP");
            }//end while

            //option 1: you & the monster perish
            if ( !smaug.isAlive() && !pat.isAlive() ) {
                System.out.println( "'Twas an epic battle, to be sure... " + 
                                    "You cut ye olde monster down, but " +
                                    "with its dying breath ye olde monster. " +
                                    "laid a fatal blow upon thy skull." );
                return false;
            }
            //option 2: you slay the beast
            else if ( !smaug.isAlive() ) {
                System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
                return true;
            }
            //option 3: the beast slays you
            else if ( !pat.isAlive() ) {
                System.out.println( "Ye olde self hath expired. You got dead." );
                return false;
            }
        }//end else

        return true;
    }//end playTurn()
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    public static void main( String[] args ) {

        //As usual, move the begin-comment bar down as you progressively 
        //test each new bit of functionality...

        //loading...
        YoRPG game = new YoRPG();

        int encounters = 0;

        while( encounters < MAX_ENCOUNTERS ) {
            if ( !game.playTurn() )
                break;
            encounters++;
            System.out.println();
        }

        System.out.println( "Thy game doth be over." );
        /*=============================================

          =============================================*/

    }//end main

}//end class YoRPG
