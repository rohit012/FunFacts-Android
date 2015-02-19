package net.rohitchopra.funfacts;

import java.util.Random;

/**
 * Created by rohitchopra on 2/17/15.
 */
public class FactBook {

    public String getFact(){

        String[] facts = {"apples can not be compared to oranges",
                "Humpty dumpty sat on a wal",
                "Stay hungry, stay foolish"  ,
                "No other fact recorded Bro!!",
                "Bummer!! Facts missing!!"};

        //button clicked, update fact

        String newFact="";

        //Select fact randomly
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);

        newFact = facts[randomNumber];

        return newFact;




    }


}
