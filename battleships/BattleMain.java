package battleships;
import java.util.Scanner;

class BattleMain {

    public static void main(String[] args) {
     // assign 2 boats to an array which containts 5 items and 3 where the boats arent    
     String boatArray [] = new String [5];
     boatArray[0] = "Missileboat";
     boatArray[1] = "Miss";
     boatArray[2] = "Miss";
     boatArray[3] = "Shootingboat";
     boatArray[4]= "Miss";

    // ask the user to enter a number between 1 & 5 where the boat might be . the boat is 1 box 'large'
        Scanner userInput = new Scanner(System.in);
        int miss = 0;
        int hits = 0;
        while(miss < 4 && hits < 2){
        System.out.println("To try to hit a ship, enter a number between 0 & 4");
        int choice = userInput.nextInt();
            //if they guess correctly then send a message 'you sunk a ship!'
        if(boatArray[choice] != "Miss"){
            System.out.println("Holy smokes you sunk a ship! Nice! ");
            hits ++;
        }
            // if they miss then send a message " you missed!"
       else if(boatArray[choice] == "Miss"){
         miss ++;
         System.out.println("Oh dang you missed. " + miss + " misses so far ");
        }
    //if they missed two times then they loose the game 
    // if they hit all the ships then they win 

    }
    if(miss == 4){
    System.out.println("Snap you missed 4 times and lost the game. Try again looser");
    }else if(hits == 2){
        System.out.println("WOOH you sunk all the ships and won the game!");
    }
}
}