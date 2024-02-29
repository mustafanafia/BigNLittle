import java.util.Scanner;
import java.util.Random;

public class TileDriver
{
    public static void main (String[] args)
    {
        
        Scanner scnr = new Scanner (System.in);
        
        Random randGen = new Random ();
        
 
        int childValue;                                                                  //declaring variables
        int parentValue;
        
        int childRandGen;
        int parentRandGen;
        
        String childColor;
        String parentColor;
        

        String biggestNumAnswer;
        String smallestNumAnswer;
        String myNumberAnswer;
        String yourNumberAnswer;
        
        
        boolean playAgain = true;

        
        
        while(playAgain){
          

            
        Tile child = new Tile();                                                            //creating the object child from the Tile class.
 

        childValue = randGen.nextInt(10) + 1;                                            //generating a # between 1 and 10. 
        childRandGen = randGen.nextInt(4) + 1;                                            //generating a # between 1 and four.
        
        
 
         
         if (childRandGen == 1) {                                                              //assigning a the numbers between 1 and 4 to the colors using if statements.           
            childColor = "Red";
        }

        else if (childRandGen == 2) {
            childColor = "Black";    
        }
        
    

         else  {
           
            childColor = "Yellow";
        }
    
        
         if (childRandGen == 4) {
          
            childColor = "Blue";
        }
        
                                                                               //using setters and getters and set the color to the child color and the value to the child value.

        child.setchildColor(childColor);        
        child.setchildValue(childValue);                                                 
        
        
        

                                                                             
        
        
        Tile parent = new Tile();                                              //creating an another object called parent in the Tile class.
        
        
        parentValue = randGen.nextInt(10) + 1;                                 //generating a # between 1 and 10.
        parentRandGen = randGen.nextInt(4) + 1;                                //generating a # between 1 and four.
        
        
        if (parentRandGen == 1) {                                              //assigning a the numbers between 1 and 4 to the colors using if statements.
            parentColor = "Red";
        }

        else if (parentRandGen == 2) {
            parentColor = "Black";    
        }
        
    

         else  {
           
            parentColor = "Yellow";
        }
    
        
         if (parentRandGen == 4) {
          
            parentColor = "Blue";
        }
        

        parent.setparentValue(parentValue);                                  //using setters and getters and set the color to the parent color and the value to the parent value.
        parent.setparentColor(parentColor);
        
        

        
        
        System.out.println(child);                                                                                   //printing out the results.
        System.out.println("Me: " + parent.getparentColor() + " " + parent.getparentValue());
        

        System.out.println();
        

        System.out.println("Who has the biggest number you or me or they are the same?");                       //verifying the child answers using if statements. 
        biggestNumAnswer = scnr.next();
        
        
        if (childValue > parentValue) { 
            System.out.println("You have the largest number (the child)");
        }
            else if (childValue == parentValue) {
                System.out.println("They are the same");
            }
             else {
                 System.out.println("I have the largest number"); 
                } 
            
        System.out.println();
        
        System.out.println("Who has the smallest number you or me or they are the same?");
        smallestNumAnswer = scnr.next();

        
        if (childValue > parentValue) { 
            System.out.println("I have the smallest number");
        }
            else if (childValue == parentValue) {
                System.out.println("They are the same");
            }
             else {
                 System.out.println("You have the smallest number"); 
                } 
        
                
        System.out.println();        
        
        System.out.println("What color is my number?");
        myNumberAnswer = scnr.next();
        
        
        System.out.println("I have the color " + parentColor);
        
        System.out.println();

        System.out.println("What color is your number?");
        yourNumberAnswer = scnr.next();
        
        
        System.out.println("You have the color " + childColor);
    
        
        System.out.println();
        System.out.println();
        
        
        System.out.println("Do you want to play again? To play again type y or any letter to quit.");
        String userLetter = scnr.next();
        
        
        if (userLetter.charAt(0) != 'y')
        playAgain = false;
        
        
     }
  }
}

    








    




        
        
    
    

        

    


    
    
    
    
    
    
    










    


    










    







    


    
    

    






    



        
        
        
        
  


