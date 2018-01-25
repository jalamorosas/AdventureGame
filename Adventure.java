import java.util.Scanner;
import java.util.Random;
import java.lang.Thread;
class Room{
   public move(String direction){
      
   }
}
class Game {
   public Game(){
   
   }
   public void start(){
      boolean exit = false;
      while(exit != true){
         System.out.println("Hello what is your name?");
         Scanner sc = new Scanner(System.in);
         String name = sc.next();
         sc.nextLine();
         System.out.println("Hello " + name);
         System.out.println("Welcome to my game.");
         System.out.println("Where would you like to go?");
         System.out.println("Cave, House, or Graveyard");
         String loc = sc.next();
         sc.nextLine();
         
         if(loc.equalsIgnoreCase("cave")){
            System.out.println("You walk into a dark and spooky cave...");
            try{
               Thread.sleep(1000);
            } catch (Exception e){
               
            }
            System.out.println("You then see a two tunnels. Which one do you go through?");
            System.out.println("On the left you see a tunnel with a bunch of signs that say 'KEEP OUT!'");
            System.out.println("On the left you see a tunnel with no signs at all");
            System.out.println("'Left' or 'Right'?");
            String tun = sc.next();
            sc.nextLine();
            
            if(tun.equalsIgnoreCase("left")){
               System.out.println("You found gold!");
               //find out a way to implement money system
               
            }
            
            if(tun.equalsIgnoreCase("right")){
               System.out.println("You find out that they put the sign on the wrong tunnel. You fall down a hole to your death.");
               exit = true;
            }
            
            if(loc.equalsIgnoreCase("House")){
               System.out.println("You enter the spooky house...");
               System.out.println("The floorboards creak as you enter");
               System.out.println("Where would you like to go? 'Upstairs', 'Kitchen' or 'Basement'.");
               String room = sc.next();
               sc.nextLine();
               if(room.equalsIgnoreCase("Upstairs")){
                  System.out.println("You are now upstairs");
               }
            }
            
            exit = true;
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
