/*
KNOWN ISSUES:
-You can go to the same place over and over again to farm xp and coins
-Still no endgame
-Graveyard still hasn't been programmed.
*/


import java.util.Scanner;
import java.util.Random;
import java.lang.Thread;
class Room{
//   public move(String direction){

//   }
}
class Game {
   public Game(){
   
   }
   public void start(){
      
      Scanner sc = new Scanner(System.in);                  //creates Scanner called sc
      String name;                                          //stores name
      String des1, des2, des3;                              //stores the different decisions a player makes
      String rip = "GAME OVER!";                            //stores string for when player loses
      boolean exit = false;                                 //allows the player to quit the game
      int money = 0;                                        //thinking of adding money
      int xp = 0;                                           //thinking of adding xp
      boolean exitmain = false;                             //allows you to exit to main navigation menu
      String nohack = "Error wrong response!";              //response to wrong input
      
      while(exitmain != true){
         System.out.println("Hello what is your name?");
         name = sc.next();
         sc.nextLine();
         System.out.println(
            "Hello " + name
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
               "\nWhere would you like to go?"
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
                        money = money + 1000;
                        System.out.println("You have " + money + " gold coins!");
                        exitmain = true;
                        break;
                     
                     case "right":
                     case "Right":
                        System.out.println(
                           "You find out that they accidentally put the sign on the wrong tunnel. Whoops. You fall down a hole to your death."
                           + "\n" + rip
                           + "\nYou died with " + money + " coins and " + xp + " xp");
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
                        exit = true;
                        break;
                        
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
                                 + "\n" + rip
                                 + "\nYou died with " + money + " coins and " + xp + " xp");
                              exitmain = true;
                              break;
                           case "No":
                           case "no":
                              System.out.println(
                                 "You decide it is too risky and go back downstairs");
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
                                 + "\n" + rip
                                 + "\nYou died with " + money + " coins and " + xp + " xp");
                              exit = true;
                              break;
                        
                           case "B":
                           case "b":
                              System.out.println(
                                 "You walk inside the room and it turns their is a vampire inside!"
                                 + "\nNo wonder the house was so dark."
                                 + "\nYour knife is useless against the vampire!"
                                 + "\nHe sucks your blood and you die :("
                                 + "\n" + rip
                                 + "\nYou died with " + money + " coins and " + xp + " xp");
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
                                 + "\n+1000xp!");
                              xp = xp + 1000;
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
                           + "\nAnd find a huge pile of gold coins!");
                        money = money + 1000;
                        System.out.println(money);
                        break;
                  }
            }
         }
      }       
   }
}

public class Adventure {

   public static void main(String args[]){
      Game game = new Game();
      game.start();
   }
}
