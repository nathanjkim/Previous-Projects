import java.util.*;
    
public class FindPrimes
{
   private static ArrayList<Integer> myList = new ArrayList();
   
   //post: returns true if value is a prime number
   public static boolean isPrime(int a)
   {
   //same as method used in Superprime
      for(int i = 2; i < a; i++)
      {
         if(a % i == 0)
            return false;
      }
      return true;
   }
   
   //post:  returns the index of the first non-prime number in myList.
   //			returns -1 if all numbers are prime
   private static int findNotPrime()
   {
      for(int i = 0; i< myList.size(); i++)
      {
         if(isPrime(myList.get(i)) == false)
         {
            return i;
         }
      }
   
      /*ex:	[60] will return 0
      		[2,30] will return 1
      		[2,2,15] returns 2
      		[2,2,3,5] returns -1
      */
      return -1;		//temporary return so program compiles
   }
   
   //post:  returns the smallest factor of a number
   private static int findSmallestFactor(int num)
   {
      for(int i = 2; i <= num; i++)
      {
         if(num % i == 0)
         {
            return i;
         }
      }
         /* ex:findSmallestFactor(8) -> 2
         		findSmallestFactor(9) -> 3
      			findSmallestFactor(7) -> 7
         */
      return -1;		//temporary return so program compiles
   }
   
   //post:	recursive method that places the prime factorization into myList
   //
   private static void generateList()
   {
      while(findNotPrime() != -1)
      {
         int index = findNotPrime();
         int value = myList.get(index);
         int smallestFactor = findSmallestFactor(value);
         int biggestFactor = value / smallestFactor;
         myList.set(index, smallestFactor);
         myList.add(biggestFactor);
      }
      /*	Hint:	Check the list to find the first non-prime factor.
      			If all the numbers are prime, you are done.
      			Otherwise,	* find the smallest factor of the first non-prime and its cofactor.
      							* replace the first non-prime with its smallest factor and add the cofactor to the end
      							* repeat the whole process  */
   }
   //post:  calcualtes the prime factorization of number and returns the list containing factors
   public static ArrayList<Integer> calculateFactors(int number)
   {
         /*	place number in myList, generate the prime factorizations and return the list.*/
      myList.add(new Integer(number));
      generateList();
      return myList;
   }	
      
   public static void main(String[] arg)
   {
      
      System.out.println(8 + ":" + calculateFactors(8));
      myList.clear();
      System.out.println(60 + ":" + calculateFactors(60));
      myList.clear();
      System.out.println(75 + ":" + calculateFactors(75));
      myList.clear();
      System.out.println(75 + ":" + calculateFactors(100));
      myList.clear();
      System.out.println(75 + ":" + calculateFactors(90));
   }
}