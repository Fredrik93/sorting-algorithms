package battleships;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class BattleMain {

    public static void main(String[] args) {
     // assign 2 boats to an array which containts 5 items and 3 where the boats arent    
     ArrayList <Ship> array = new ArrayList();
     Ship ship1 = new Ship("YellowSubmarine");
     Ship ship2 = new Ship("Bombardier");
     Ship ship3 = new Ship("Cruise");
    array.add(ship1);
    array.add(ship2);
    array.add(ship3);
    
    for(Ship ship : array){
        System.out.println(ship.shipName);
    }
    // ask the user to enter a number between 1 & 5 where the boat might be . the boat is 1 box 'large'
        Scanner userInput = new Scanner(System.in);
        int miss = 0;
        int hits = 0;
        System.out.println("To try to hit a ship, enter a number between 0 & 4");
            //if they guess correctly then send a message 'you sunk a ship!'
       while(!array.isEmpty()){
        int choice = userInput.nextInt();

           if(!array.isEmpty()){
        System.out.println("SNAP you sunk the " + array.get(choice).getShipName() +" battleship!! ");
        array.remove(choice);
        for(Ship ship : array){
            System.out.println(ship.shipName);
        }
       }else{
           System.out.println("You missed the ships you looser");
       }
            // if they miss then send a message " you missed!"
     
    //if they missed two times then they loose the game 
    // if they hit all the ships then they win 
    }
}

}