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
        String choice = userInput.nextLine();
        System.out.println(choice);
    //if they guess correctly then send a message 'you sunk a ship!'
    // if they miss then send a message " you missed!"
    //if the missed two times then they loose the game 
    // if they hit all the ships then they win 


}
}