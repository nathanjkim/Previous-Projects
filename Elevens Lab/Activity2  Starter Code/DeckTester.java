/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
   public static void main(String[] args)
   {
   	/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
      String[] rank1 = {"a", "b", "c"};
      String[] rank2 = {"aa", "bb", "cc", "d"};
      String[] rank3 = {"dd", "e"};
      
      String[] suit1 = {"clubs", "spades", "asdf"};
      String[] suit2 = {"diamonds", "hearts", "qwerty", "jkl"};
      String[] suit3 = {"hooplah", "boop"};
      
      int[] value1 = {1, 3, 2};
      int[] value2 = {5, 4, 9, 6};
      int[] value3 = {8, 7};
      
      Deck deck1 = new Deck(rank1, suit1, value1);
      Deck deck2 = new Deck(rank2, suit2, value2);
      Deck deck3 = new Deck(rank3, suit3, value3);
      
      System.out.println(deck1 + "\n" + deck2 + "\n" + deck3);
      System.out.println(deck1.isEmpty() + "\n" + deck2.isEmpty() + "\n" + deck3.isEmpty());
      System.out.println(deck1.size() + "\n" + deck2.size() + "\n" + deck3.size());
      System.out.println(deck1.deal() + "\n" + deck2.deal() + "\n" + deck3.deal());
      
   }
}
