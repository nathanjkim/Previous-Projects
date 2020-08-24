//Rev Dr. D. R. Oberle  Feb 2015
import java.util.*;

public class HeapPriorityQueue implements PriorityQueue
{
   private static final int DFLT_CAPACITY = 1024;
   private Comparable [] items;		//index 0 will go unused
   private int numItems;

   public HeapPriorityQueue(int initialCapacity)
   {
      items = new Comparable[initialCapacity + 1];
      numItems = 0;
   }

   public HeapPriorityQueue()
   {
      this(DFLT_CAPACITY);
   }

   public boolean isEmpty()
   {
      return (numItems == 0);
   }

   public Comparable peek()
   {
      if (numItems == 0)
      {
         throw new NoSuchElementException();
      }
   
      return items[1];
   }
   
   private void reheapDown()
   {
      int index = 1;
      int leftChild = index * 2;
      int rightChild = leftChild + 1;
   
      while((leftChild <= numItems && items[leftChild].compareTo(items[index]) < 0) || (rightChild < numItems && items[rightChild].compareTo(items[index]) < 0))
      {
         if(rightChild >= numItems || items[leftChild].compareTo(items[index]) < 0)
         {
            swap(items, index, leftChild);
            index = leftChild;
         }
         else
         {
            swap(items, index, rightChild);
            index = rightChild;
         }
         leftChild = index * 2;
         rightChild = leftChild + 1;
      }
   }

   public Comparable remove()
   {
      if (numItems == 0)
      {
         throw new NoSuchElementException();
      }
   
      Comparable min = items[1];
      items[1] = items[numItems];
      numItems--;
      reheapDown();
      return min;
   }

   private static void swap(Comparable [] list, int a, int b)
   {
      Comparable temp = list[a];
      list[a] = list[b];
      list[b] = temp;
   }
   private void reheapUp()
   {
      int index = numItems;
      while(index != 1 && items[index].compareTo(items[index / 2]) < 0)
      {
         swap(items, index, index / 2);
         index = index / 2;
      }
   }

   public boolean add(Comparable obj)
   {
      numItems++;
      if (numItems >= items.length)
         doubleCapacity();
      items[numItems] = obj;
      reheapUp();
      return true;
   }

   private static boolean lowerPriority(Comparable obj1, Comparable obj2)
   {	//we will consider that low value == high priority
      return (obj1.compareTo(obj2) > 0);
   }

   public String toString()
   {
      String ans = "[";
      for (int i = 1; i <= numItems; i++)
      {
         ans += items[i];
         if(i <= numItems-1)
            ans += ", ";   
      }
      return ans+"]";
   }

   private void doubleCapacity()
   {
      Comparable tempItems[] = new Comparable[2 * items.length - 1];
      for (int i = 0; i <= numItems; i++)
         tempItems[i] = items[i];
      items = tempItems;
   }
}

