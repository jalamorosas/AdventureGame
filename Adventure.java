/*
   KNOWN ISSUES:
   -Still no way to beat
   -Graveyard still hasn't been programmed.
*/


import java.util.Scanner;
import java.util.Random;
import java.lang.*;


class Player{
   int xp;
   int money;
   String name;
   int achievements;
   public Player(String name){
      this.xp = 0;
      this.money = 0;
      this.name = name;
      this.achievements = 0;
   }
   public String die(){
    return "\n" + "GAME OVER!"
    + "\nYou died with " + this.money + " coins and " + this.xp + " xp"
    + "\nYou completed " + this.achievements + " achievments!";
   }
}

class ExitException extends Exception {
}

class Game {
   public Game(){
   
   }
   public Player createPlayer(Scanner sc){
       
       System.out.println("Hello what is your name?");
         Player adventurer = new Player(sc.next());
         sc.nextLine();
        
         return adventurer;

   }
   
   public void gameLoop() throws ExitException {
   
    Scanner sc = new Scanner(System.in);                  //creates Scanner called sc
   String des1, des2, des3;                              //stores the different decisions a player makes
   String rip = "GAME OVER!";                            //stores string for when player loses
   boolean exit = false;                                 //allows the player to quit the game
   boolean exitmain = false;                             //allows you to exit to main navigation menu
   String nohack = "Error wrong response!";              //response to wrong input
    while(true) {
      Player adventurer = this.createPlayer(sc);
      System.out.println(
         "Hello " + adventurer.name
         + "\nWelcome to my game."
         + "\nBasic Commands:"
         + "\nExit: allows you to leave the game"
         + "\nNavigation:"
         + "\na, b, c: type these letters to navigate through some parts of the game"
         + "\nyes and no: type these to navigate through some parts of the game"
         + "\nUse these to navigate through some parts of game");
      exit = false;
      while (exit != true){
         System.out.println(
            "\nLevel 1:" 
            + "\nWhere would you like to go?"
            + "\n a) Cave"
            + "\n b) Spooky House"
            //+ "\n c) Graveyard"
            );
         des1 = sc.next();
         exitmain = false;
      
         switch(des1) {
            //allows user to manually exit the game
            case "Exit":
            case "exit":
               exit = true;
               break;
            
            default :
               System.out.println(nohack);
               exitmain = true;
               break;
               
            //Cave
            case "A":
            case "a":
               System.out.println(
                  "You walk into a dark and spooky cave..."
                  + "\nYou then see a two tunnels. Which one do you go through?"
                  + "\nOn the left you see a tunnel with a bunch of signs that say 'KEEP OUT!'"
                  + "\nOn the right you see a tunnel with no signs at all"
                  + "\n'Left' or 'Right'?");
               String tun = sc.next();
               sc.nextLine();
               
               switch(tun) {
                  case "left":
                  case "Left":
                     System.out.println("You found gold!");
                     adventurer.money = adventurer.money + 1000;
                     System.out.println("You have " + adventurer.money + " gold coins!");
                     exitmain = true;
                     break;
                  
                  case "right":
                  case "Right":
                     System.out.println(
                     "You find out that they accidentally put the sign on the wrong tunnel. "+
                     "Whoops. You fall down a hole to your death." +
                     adventurer.die());
                     exit = true;
                     break;
                  default:
                     System.out.println(nohack);
                     break;
                  //allows user to manually exit the game
                  case "Exit":
                  case "exit":
                     exit = true;
                     break;
               }
               break;
            //Spooky House
            case "B":
            case "b":
               System.out.println("You enter the spooky house..."
                  + "\nThe floorboards creak as you enter"
                  + "\nIts very dark so you light your candle"
                  + "\nWhere would you like to go?"
                  + "\n a) Upstairs"
                  + "\n b) Kitchen"
                  + "\n c) Basement");
               String place = sc.next();
               
               //Choose between Upstairs, Kitchen and Basement
               switch(place){
                  //allows user to manually exit the game
                  case "Exit":
                  case "exit":
                     throw new ExitException();                     
                  //default response
                  default :
                     System.out.println(nohack);
                     break;
                     
                  //Upstairs
                  case "A":
                  case "a":
                     System.out.println(
                        "You are now upstairs"
                        + "\nYou see a room at the end of the hall."
                        + "\nDo you want to enter it 'yes' or 'no'?");
                     String enter = sc.next();
                     
                     switch(enter){
                        case "Yes":
                        case "yes":
                           System.out.println(
                              "\nYou enter it and see a giant spider!"
                              + "\nYou are eaten alive!"
                              + adventurer.die());
                           exitmain = true;
                           break;
                        case "No":
                        case "no":
                           System.out.println(
                              "You decide it is too risky and go back downstairs");
                           exitmain = true;
                           break;
                           
                        default:
                           System.out.println(nohack);
                           break;
                        
                        //allows user to manually exit the game
                        case "Exit":
                        case "exit":
                           exit = true;
                           break;
                     }
                     break;
                  
                  //Kitchen
                  case "B":
                  case "b":
                     System.out.println(
                        "You start to near the kitchen"
                        + "\nThe smell of fresh food enters your nose"
                        + "\nYou quickly start to realize that someone else is in the house!"
                        + "\nYou find three weapons at the entrance to the kitchen."
                        + "\nWhich do you choose?"
                        + "\n a) Shotgun"
                        + "\n b) Knife"
                        + "\n c) Some white fruit");
                     String weapon = sc.next();
                     
                  //Outcomes for different weapons
                     switch(weapon){
                     //allows user to manually exit the game
                        case "Exit":
                        case "exit":
                           exit = true;
                           break;
                        
                        default :
                           System.out.println(nohack);
                           break;
                        
                        case "A":
                        case "a":
                           System.out.println(
                              "You walk inside the room and it turns their is a vampire inside!"
                              + "\nNo wonder the house was so dark."
                              + "\nYour shotgun is useless against the vampire!"
                              + "\nHe sucks your blood and you die :("
                              + adventurer.die());
                           exit = true;
                           break;
                     
                        case "B":
                        case "b":
                           System.out.println(
                              "You walk inside the room and it turns their is a vampire inside!"
                              + "\nNo wonder the house was so dark."
                              + "\nYour knife is useless against the vampire!"
                              + "\nHe sucks your blood and you die :("
                              + adventurer.die());
                           exit = true;
                           break;
                     
                        case "C":
                        case "c":
                           System.out.println(
                              "You walk inside the room and it turns their is a vampire inside!"
                              + "\nNo wonder the house was so dark."
                              + "\nBut instead of a shotgun or knife you pull out a bulb of garlic"
                              + "\nThis distracts the vampire enough for you open the windows"
                              + "\nThe light is too much for him to handle and he turns into dust"
                              + "\nACHIEVEMENT UNLOCKED!: Eliminating the vampire"
                              + "\n+1000 xp!");
                           adventurer.achievements = adventurer.achievements + 1;
                           adventurer.xp = adventurer.xp + 1000;
                           exitmain = true;
                           break;
                     }
                     break;
                 
                  //Basement
                  case "C":
                  case "c":
                     System.out.println(
                        "The steps creak as you walk down the stairs into the dark and creepy basement"
                        + "\nThe air smells of mold"
                        + "\nYou reach the bottom..."
                        + "\nTurn on the lights..."
                        + "\nAnd find a huge pile of gold coins!"
                        + "\nACHIEVEMENT UNLOCKED!: Down the stairs and to the right"
                        + "\n+1000xp");
                     adventurer.money = adventurer.money + 1000;
                     System.out.println(adventurer.money);
                     break;
               }
            }
         }
      }  
   }
   
   
   public void start(){
      
     
      
      try {
         this.gameLoop();
         // throw new ExitException();
      } catch (ExitException e) {
         System.out.println("Exit called");
      }
      
          
   }
}

public class Adventure {

   public static void main(String args[]){
      Game game = new Game();
      game.start();
   }
}
