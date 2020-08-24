import java.util.*;
public class CrawlerDriverNoPanel
{
   public static void main(String[] args)
   {
   //all necessary primitive types are instantiated (board size variables, piece position variables, fifty/fifty (1 or 2))
      int randCols = (int)(Math.random() * 5) + 5;
      int randRows = (int)(Math.random() * 5) + 5;
      int randItemRows = (int)(Math.random() * (randRows - 2)) + 2;
      int randItemCols = (int)(Math.random() * (randRows - 2)) + 2;
      int randItemRows2 = (int)(Math.random() * (randRows - 2)) + 2;
      int randItemCols2 = (int)(Math.random() * (randRows - 2)) + 2;
      int randItemRows3 = (int)(Math.random() * (randRows - 2)) + 2;
      int randItemCols3 = (int)(Math.random() * (randRows - 2)) + 2;
      int randItemRows4 = (int)(Math.random() * (randRows - 2)) + 2;
      int randItemCols4 = (int)(Math.random() * (randRows - 2)) + 2;
      int randItemRows5 = (int)(Math.random() * (randRows - 2)) + 2;
      int randItemCols5 = (int)(Math.random() * (randRows - 2)) + 2;
      int randItemRows6 = (int)(Math.random() * (randRows - 2)) + 2;
      int randItemCols6 = (int)(Math.random() * (randRows - 2)) + 2;
      int randItemRows7 = (int)(Math.random() * (randRows - 2)) + 2;
      int randItemCols7 = (int)(Math.random() * (randRows - 2)) + 2;
      int randItemRows8 = (int)(Math.random() * (randRows - 2)) + 2;
      int randItemCols8 = (int)(Math.random() * (randRows - 2)) + 2;
      int fiftyfifty = (int)(Math.random() * 2 + 1);
   
   //game board instantiated
      SparseMatrix<String> dungeon = new SparseMatrix(randRows, randCols);
      
      //checks for and avoids overlapping objects on the board
      while((randItemRows == randItemRows2 && randItemCols == randItemCols2) || (randItemRows2 == randItemRows3 && randItemCols2 == randItemCols3) || (randItemRows3 == randItemRows4 && randItemCols3 == randItemCols4) || (randItemRows4 == randItemCols5 && randItemCols4 == randItemCols5) || (randItemRows5 == randItemCols6 && randItemCols5 == randItemCols6) || (randItemRows6 == randItemCols7 && randItemCols6 == randItemCols7) || (randItemRows7 == randItemCols8 && randItemCols7 == randItemCols8))
      {
         randItemRows = (int)(Math.random() * (randRows - 2)) + 2;
         randItemCols = (int)(Math.random() * (randRows - 2)) + 2;
         randItemRows2 = (int)(Math.random() * (randRows - 2)) + 2;
         randItemCols2 = (int)(Math.random() * (randRows - 2)) + 2;
         randItemRows3 = (int)(Math.random() * (randRows - 2)) + 2;
         randItemCols3 = (int)(Math.random() * (randRows - 2)) + 2;
         randItemRows4 = (int)(Math.random() * (randRows - 2)) + 2;
         randItemCols4 = (int)(Math.random() * (randRows - 2)) + 2;
         randItemRows5 = (int)(Math.random() * (randRows - 2)) + 2;
         randItemCols5 = (int)(Math.random() * (randRows - 2)) + 2;
         randItemRows6 = (int)(Math.random() * (randRows - 2)) + 2;
         randItemCols6 = (int)(Math.random() * (randRows - 2)) + 2;
         randItemRows7 = (int)(Math.random() * (randRows - 2)) + 2;
         randItemCols7 = (int)(Math.random() * (randRows - 2)) + 2;
         randItemRows8 = (int)(Math.random() * (randRows - 2)) + 2;
         randItemCols8 = (int)(Math.random() * (randRows - 2)) + 2;
      }
   
      
      //used for "w, a, s, d" movement controls
      Scanner moveInput = new Scanner(System.in);
      String move;
      //used for starting or quitting
      String response;
      //player piece and initial position
      String player = "@";
      int rowLoc = 0;
      int colLoc = 0;
      //gameplay variables
      int health = 100;
      int thirst = 100;
      int hunger = 100;
      int hungerLoss = 0;
      int thirstLoss = 0;
      String difficulty;
      //user name
      String name;
      //system prompts for user's name and stores as a string
      System.out.println("Hello, Stranger, what is your name?");
      Scanner input = new Scanner(System.in);
      name = input.next();
      //system prompts user for desired difficulty and adjusts game variables accordingly.
      System.out.println("On what difficulty do you wish to play? (E)asy, (M)edium, or (H)ard?");
      difficulty = input.next();
      if(difficulty.equals("E") || difficulty.equals("e"))
      {
         hungerLoss = 3;
         thirstLoss = 5;
      }
      else if(difficulty.equals("M") || difficulty.equals("m"))
      {
         hungerLoss = 6;
         thirstLoss = 8;
      }
      else if(difficulty.equals("H") || difficulty.equals("h"))
      {
         hungerLoss = 8;
         thirstLoss = 10;
      }
   
   
      
      //introduction and basic start/quit prompt
      System.out.println("The goal of this game is to journey to the opposite corner of the dungeon where treasure ($) lies." + "\n" + "With each move you make, your hunger and thirst meters decrease. If either reaches 0, you will die." + "\n" + "Move over (W)ater to improve thirst and (F)ood to improve hunger." + "\n" + "Traps (X) have a 50% chance of failing, or a 50% chance of dealing between 25 - 75 damage." + "\n" + "You may need to take a risky shortcut over a trap if running low on food or water.");
      System.out.println("Enter '1' to start, 'q' to quit.");
      response = moveInput.next();
      //fills board with user and objects
      dungeon.add(0, 0, "@");
      dungeon.add(randRows - 1, randCols - 1, "$");
      dungeon.add(randItemRows, randItemCols , "F");
      dungeon.add(randItemRows2, randItemCols2 , "F");
      dungeon.add(randItemRows3, randItemCols3, "W");
      dungeon.add(randItemRows4, randItemCols4, "W");
      dungeon.add(randItemRows5, randItemCols5, "W");
      dungeon.add(randItemRows6, randItemCols6, "W");
      dungeon.add(randItemRows7, randItemCols7, "X");
      dungeon.add(randItemRows8, randItemCols8, "X");
      //user control scheme, begins if user answers prompt with "1" (start)
      if(response.equals("1"))
      {
      //do while loop used in order to have initial run before checking that conditions in while loops are met/not met before breaking
         do
         {
         //necessary general game info displayed, board printed
            System.out.println(name + ", you are the '@' symbol.");
            System.out.println("'w' to move up, 's' to move down, 'a' to move left, 'd' to move right");
            System.out.println("Health: " + health);
            System.out.println("Thirst: " + thirst);
            System.out.println("Hunger: " + hunger);
            System.out.println(dungeon);
         //receives user input for movement
            move = moveInput.next();
         //upwards movement
            if(move.equals("w"))
            {
            //checks if (F)ood is present above, applies effects on stats and makes player piece take over the spot while removing the object.
               if(rowLoc - 1 >= 0 && dungeon.get((rowLoc - 1), colLoc) != null && dungeon.get((rowLoc - 1), colLoc).equals("F"))
               {
                  dungeon.set(rowLoc - 1, colLoc, player);
                  dungeon.remove(rowLoc, colLoc);
                  rowLoc--;
                  hunger += 5;
                  thirst -= thirstLoss;
               }
               //checks if (W)ater is present above, applies effects on stats and makes player piece take over the spot while removing the object.
               else if(rowLoc - 1 >= 0 && dungeon.get((rowLoc - 1), colLoc) != null && dungeon.get((rowLoc - 1), colLoc).equals("W"))
               {
                  dungeon.set(rowLoc - 1, colLoc, player);
                  dungeon.remove(rowLoc, colLoc);
                  rowLoc--;
                  hunger -= hungerLoss;
                  thirst += 10;
               }
               //checks if treasure ($) is present above, displays winning message and prompts user to close the game.
               else if(rowLoc - 1 >= 0 && dungeon.get((rowLoc - 1), colLoc) != null && dungeon.get((rowLoc - 1), colLoc).equals("$"))
               {
                  System.out.println("You survived and found the treasure! Enter 'q' to quit.");
                  response = moveInput.next();
               }
               //checks if a trap (X) is present above, applies effects on stats and makes player piece take over the spot wihle removing the object.
               else if(rowLoc - 1 >= 0 && dungeon.get((rowLoc - 1), colLoc) != null && dungeon.get((rowLoc - 1), colLoc).equals("X"))
               {
                  //fiftyfifty becomes either 1 or 2
                  fiftyfifty = (int)(Math.random() * 2 + 1);
                  //if 1, no effect and normal movement
                  if(fiftyfifty == 1)
                  {
                     dungeon.set(rowLoc - 1, colLoc, player);
                     dungeon.remove(rowLoc, colLoc);
                     rowLoc--;
                     hunger -= hungerLoss;
                     thirst -= thirstLoss;
                  }
                  //if 2, does 25-75 damage to player
                  else
                  {
                     dungeon.set(rowLoc - 1, colLoc, player);
                     dungeon.remove(rowLoc, colLoc);
                     rowLoc--;
                     hunger -= hungerLoss;
                     thirst -= thirstLoss;
                     health -= Math.random() * 50 + 25;
                  }
               }
               //if no objects but clear space, moves normally
               else if(rowLoc - 1 >= 0)
               {
                  dungeon.add(rowLoc - 1, colLoc, player);
                  dungeon.remove(rowLoc, colLoc);
                  rowLoc--;
                  hunger -= hungerLoss;
                  thirst -= thirstLoss;
               }
               //if against a wall, movement is denied and user has to redo turn
               else
               {
                  System.out.println("Can't move here!");
               }
            }
            //all the same effects as above except in the leftwards direction
            else if(move.equals("a"))
            {
               if(colLoc - 1 >= 0 && dungeon.get(rowLoc, (colLoc - 1)) != null && dungeon.get(rowLoc, (colLoc - 1)).equals("F"))
               {
                  dungeon.set(rowLoc, colLoc - 1, player);
                  dungeon.remove(rowLoc, colLoc);
                  colLoc--;
                  hunger += 5;
                  thirst -= thirstLoss;
               }
               else if(colLoc - 1 >= 0 && dungeon.get(rowLoc, (colLoc - 1)) != null && dungeon.get(rowLoc, (colLoc - 1)).equals("W"))
               {
                  dungeon.set(rowLoc, colLoc - 1, player);
                  dungeon.remove(rowLoc, colLoc);
                  colLoc--;
                  hunger -= hungerLoss;
                  thirst += 10;
               }
               
               else if(colLoc - 1 >= 0 && dungeon.get(rowLoc, (colLoc - 1)) != null && dungeon.get(rowLoc, (colLoc - 1)).equals("$"))
               {
                  System.out.println("You survived and found the treasure! Enter 'q' to quit.");
                  response = moveInput.next();
               }
               else if(colLoc - 1 >= 0 && dungeon.get(rowLoc, (colLoc - 1)) != null && dungeon.get(rowLoc, (colLoc - 1)).equals("X"))
               {
                  fiftyfifty = (int)(Math.random() * 2 + 1);
                  if(fiftyfifty == 1)
                  {
                     dungeon.set(rowLoc, colLoc - 1, player);
                     dungeon.remove(rowLoc, colLoc);
                     colLoc--;
                     hunger -= hungerLoss;
                     thirst -= thirstLoss;
                  }
                  else
                  {
                     dungeon.set(rowLoc, colLoc - 1, player);
                     dungeon.remove(rowLoc, colLoc);
                     colLoc--;
                     hunger -= hungerLoss;
                     thirst -= thirstLoss;
                     health -= Math.random() * 50 + 25;
                  }
               }
               else if(colLoc - 1 >= 0)
               {
                  dungeon.add(rowLoc, colLoc - 1, player);
                  dungeon.remove(rowLoc, colLoc);
                  colLoc--;
                  hunger -= hungerLoss;
                  thirst -= thirstLoss;
               }
               
               else
               {
                  System.out.println("Can't move here!");
               
               }
            }
            //all the same effects as above except in the downwards direction
            else if(move.equals("s"))
            {
               if(rowLoc + 1 < randRows && dungeon.get((rowLoc + 1), colLoc) != null && dungeon.get((rowLoc + 1), colLoc).equals("F"))
               {
                  dungeon.set(rowLoc + 1, colLoc, player);
                  dungeon.remove(rowLoc, colLoc);
                  rowLoc++;
                  hunger += 5;
                  thirst -= thirstLoss;
               }
               else if(rowLoc + 1 < randRows && dungeon.get((rowLoc + 1), colLoc) != null && dungeon.get((rowLoc + 1), colLoc).equals("W"))
               {
                  dungeon.set(rowLoc + 1, colLoc, player);
                  dungeon.remove(rowLoc, colLoc);
                  rowLoc++;
                  hunger -= hungerLoss;
                  thirst += 10;
               }
               
               else if(rowLoc + 1 < randRows && dungeon.get((rowLoc + 1), colLoc) != null && dungeon.get((rowLoc + 1), colLoc).equals("$"))
               {
                  System.out.println("You survived and found the treasure! Enter 'q' to quit.");
                  response = moveInput.next();
               }
               else if(rowLoc + 1 < randRows && dungeon.get((rowLoc + 1), colLoc) != null && dungeon.get((rowLoc + 1), colLoc).equals("X"))
               {
                  fiftyfifty = (int)(Math.random() * 2 + 1);
                  if(fiftyfifty == 1)
                  {
                     dungeon.set(rowLoc + 1, colLoc, player);
                     dungeon.remove(rowLoc, colLoc);
                     rowLoc++;
                     hunger -= hungerLoss;
                     thirst -= thirstLoss;
                  }
                  else
                  {
                     dungeon.set(rowLoc + 1, colLoc, player);
                     dungeon.remove(rowLoc, colLoc);
                     rowLoc++;
                     hunger -= hungerLoss;
                     thirst -= thirstLoss;
                     health -= Math.random() * 50 + 25;
                  }
               }
               else if(rowLoc + 1 < randRows)
               {
                  dungeon.add(rowLoc + 1, colLoc, player);
                  dungeon.remove(rowLoc, colLoc);
                  rowLoc++;
                  hunger -= hungerLoss;
                  thirst -= thirstLoss;
               }
               
               else
               {
                  System.out.println("Can't move here!");
                 
               }
            }
            //all the same effects as above except in the rightwards direction
            else if(move.equals("d"))
            {
               if(colLoc + 1 < randCols && dungeon.get(rowLoc, colLoc + 1) != null && dungeon.get(rowLoc, colLoc + 1).equals("F"))
               {
                  dungeon.set(rowLoc, colLoc + 1, player);
                  dungeon.remove(rowLoc,colLoc);
                  colLoc++;
                  hunger += 5;
                  thirst -= thirstLoss;
               }
               if(colLoc + 1 < randCols && dungeon.get(rowLoc, colLoc + 1) != null && dungeon.get(rowLoc, colLoc + 1).equals("W"))
               {
                  dungeon.set(rowLoc, colLoc + 1, player);
                  dungeon.remove(rowLoc,colLoc);
                  colLoc++;
                  hunger -= hungerLoss;
                  thirst += 10;
               }
               
               else if(colLoc + 1 < randCols && dungeon.get(rowLoc, colLoc + 1) != null && dungeon.get(rowLoc, colLoc + 1).equals("$"))
               {
                  System.out.println("You survived and found the treasure! Enter 'q' to quit.");
                  response = moveInput.next();
               }
               else if(colLoc + 1 < randCols && dungeon.get(rowLoc, colLoc + 1) != null && dungeon.get(rowLoc, (colLoc + 1)).equals("X"))
               {
                  fiftyfifty = (int)(Math.random() * 2 + 1);
                  if(fiftyfifty == 1)
                  {
                     dungeon.set(rowLoc, colLoc + 1, player);
                     dungeon.remove(rowLoc, colLoc);
                     colLoc++;
                     hunger -= hungerLoss;
                     thirst -= thirstLoss;
                  }
                  else
                  {
                     dungeon.set(rowLoc, colLoc + 1, player);
                     dungeon.remove(rowLoc, colLoc);
                     colLoc++;
                     hunger -= hungerLoss;
                     thirst -= thirstLoss;
                     health -= Math.random() * 50 + 25;
                  }
               }
               else if(colLoc + 1 < randCols)
               {
                  dungeon.add(rowLoc, colLoc + 1, player);
                  dungeon.remove(rowLoc, colLoc);
                  colLoc++;
                  hunger -= hungerLoss;
                  thirst -= thirstLoss;
               }
               
               else
               {
                  System.out.println("Can't move here!");
               }
            }
            //when hunger/health/thirst reach 0 or the user enters "q", the game ends.
         }  while(!move.equals("q") && health > 0 && thirst > 0 && hunger > 0 && !response.equals("q"));
         //system displays farewell message w/ thanks
         System.out.println("Game over. Thanks for playing!");
      } 
   }
}