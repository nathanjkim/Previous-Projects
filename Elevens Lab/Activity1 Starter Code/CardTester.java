/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
   public static void main(String[] args) {
      Card card1 = new Card("king", "clubs", 12);
      Card card2 = new Card("king", "clubs", 12);
      Card card3 = new Card("queen", "spades", 11);
   
      System.out.println(card1.equalityTest(card2));
      System.out.println(card2.equalityTest(card3));
      System.out.println(card3.equalityTest(card1));
   	/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
      System.out.println(card1.toString());
      System.out.println(card2.toString());
      System.out.println(card3.toString());
   }
}
