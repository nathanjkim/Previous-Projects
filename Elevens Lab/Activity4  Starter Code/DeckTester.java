/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
   public static void main(String[] args) {
   
      String[] deckRanks = new String[52];
      String[] deckSuits = {"Clubs", "Hearts", "Diamonds", "Spades"};
      int[] deckPointValues = new int[52];
   
      String[] ranks = {"jack", "queen", "king"};
      String[] suits = {"blue", "red"};
      int[] pointValues = {11, 12, 13};
      Deck d = new Deck(ranks, suits, pointValues);
   
      System.out.println("**** Original Deck Methods ****");
      System.out.println("  toString:\n" + d.toString());
      System.out.println("  isEmpty: " + d.isEmpty());
      System.out.println("  size: " + d.size());
      System.out.println();
      System.out.println();
   
      System.out.println("**** Deal a Card ****");
      System.out.println("  deal: " + d.deal());
      System.out.println();
      System.out.println();
   
      System.out.println("**** Deck Methods After 1 Card Dealt ****");
      System.out.println("  toString:\n" + d.toString());
      System.out.println("  isEmpty: " + d.isEmpty());
      System.out.println("  size: " + d.size());
      System.out.println();
      System.out.println();
   
      System.out.println("**** Deal Remaining 5 Cards ****");
      for (int i = 0; i < 5; i++) {
         System.out.println("  deal: " + d.deal());
      }
      System.out.println();
      System.out.println();
   
      System.out.println("**** Deck Methods After All Cards Dealt ****");
      System.out.println("  toString:\n" + d.toString());
      System.out.println("  isEmpty: " + d.isEmpty());
      System.out.println("  size: " + d.size());
      System.out.println();
      System.out.println();
   
      System.out.println("**** Deal a Card From Empty Deck ****");
      System.out.println("  deal: " + d.deal());
      System.out.println();
      System.out.println();
      
      for(int i = 0; i < 52; i++)
      {
         if(i >= 0 && i <= 3)
         {
            deckRanks[i] = ("King");
            deckPointValues[i] = 10;
         }
         else if(i > 3 && i <= 7)
         {
            deckRanks[i]=("Queen");
            deckPointValues[i] = 10;
         }
         else if(i > 7 && i <= 11)
         {
            deckRanks[i]=("Jack");
            deckPointValues[i] = 10;
         }
         else if(i > 11 && i <= 15)
         {
            deckRanks[i]=("10");
            deckPointValues[i] = 10;
         }
         else if(i > 15 && i <= 19)
         {
            deckRanks[i]=("9");
            deckPointValues[i] = 9;
         }
         else if(i > 19 && i <= 23)
         {
            deckRanks[i]=("8");
            deckPointValues[i] = 8;
         }
         else if(i > 23 && i <= 27)
         {
            deckRanks[i]=("7");
            deckPointValues[i] = 7;
         }
         else if(i > 27 && i <= 31)
         {
            deckRanks[i] = "6";
            deckPointValues[i] = 6;
         }
         else if(i > 31 && i <= 35)
         {
            deckRanks[i] = "5";
            deckPointValues[i] = 5;
         }
         else if(i > 35 && i <= 39)
         {
            deckRanks[i] = "4";
            deckPointValues[i] = 4;
         }
         else if(i > 39 && i <= 43)
         {
            deckRanks[i] = "3";
            deckPointValues[i] = 3;
         }
         else if(i > 43 && i <= 47)
         {
            deckRanks[i] = "2";
            deckPointValues[i] = 2;
         }
         else if(i > 47 && i <= 51)
         {
            deckRanks[i] = "Ace";
            deckPointValues[i] = 1;
         }
      }
   	/* *** TO BE COMPLETED IN ACTIVITY 4 *** */
   }
}
