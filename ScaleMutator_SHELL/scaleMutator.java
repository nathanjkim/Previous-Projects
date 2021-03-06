//Rev. Dr. Douglas R Oberle - Washington, DC
public class scaleMutator
{          
//pre:  a and b are valid index #s of list, which is not null
//post: swaps list[a] with list[b]  - modifies the array that is sent
//i.e., given list:[1,2,3,4], a:1, b:3 -> changes list to [1,4,3,2]
   public static void swap(int[] list, int a, int b)
   {
      int temp = list[a];
      list[a] = list[b];
      list[b] = temp;
   }

//pre:  list is not null
//post: nums is sorted in ascending order - modifies the array that is sent
//i.e., given list:[4,2,7,5] -> changes list to [2,4,5,7] 
//needs to work with an array of any size             
   public static void selSort(int[] list)
   {
      int min,index;
      for(int i =0; i<list.length; i++)
      {
         min = list[i];
         index = i;
         for(int k = i; k<list.length; k++)
         {
            if(list[k]<min)
            {
               min = list[k];
               index = k;
            }
         }
         swap(list, i, index);
      }
   }

//pre:   list is not null
//post:  returns a new array with the same elements of list, but scrambled (put in random order)
//needs to work with an array of any size
   public static int[] scramble(int[]list)
   {
      int[]retVal = list.clone();
      for(int i =0; i<list.length; i++)
      {
         int index = (int)((Math.random() * list.length) - 1);
         swap(retVal, i, index);
      }
      return retVal;
   }

//pre:  list is not null
//post: returns a new array with elements in list, but in reverse order
//i.e., given list:[1,2,3,4] -> returns [4,3,2,1]
//needs to work with an array of any size
   public static int[] reverse(int[]list)
   {
      int[] reverse = list.clone();
      for(int i = 0; i<=(reverse.length / 2) - 1;i++)
      {
         swap(reverse, i, reverse.length - 1 - i);
      }
      return reverse;
   }

//pre:  list is not null
//post: returns a new array (almost double the size of list) with the elements of list as a palindrome.
//i.e., given list:[1,2,3,4] -> returns [1,2,3,4,3,2,1]
//needs to work with an array of any size
   public static int[] makePalindrome(int[]list)
   {
      int[] palindrome = new int[list.length * 2 - 1];
      for(int i = 0; i<list.length;i++)
      {
         palindrome[i] = list[i];
      }
      for(int i = list.length; i < palindrome.length; i++)
      {
         palindrome[i] = palindrome[palindrome.length - i - 1];
      }
      return palindrome;
   }   

//pre:  neither a nor b are null, assume a.length == b.length
//post: returns a new array with elements shuffles in from two lists,
//alternating between advancing elements of lists a and b
//[a0, b0, a1, b1, a2, b2, a3, b3, a4, b4,...]
//i.e., given a:[0,1,2,3], b:[9,8,7,6] -> returns [0,9,1,8,2,7,3,6]
//needs to work with arrays of any size
   public static int[] shuffle(int[]a, int[]b)
   {
      int[]shuffle = new int[a.length + b.length];
      int count = 0;
      for(int i = 0; i<shuffle.length; i+=2)
      {
         shuffle[i] = a[count];
         shuffle[i+1] = b[count];
         count++;
      }
      return shuffle;
   }
 //pre:  list is not null	
 //post: returns a new array with elements of list, but shuffled- 
 //alternating between elements from the beginning moving right and elements from the end moving left
 //[1st elem, Last elem, 2nd elem, 2nd to last elem, 3rd elem, 3rd to last elem, 4th elem, 4th to last elem,...]
 //i.e., given list:[0,1,2,3,4,5,6,7] -> returns [0,7,1,6,2,5,3,4]
 //needs to work with an array of any size
   public static int[] shuffle(int[]list)
   {
      int[] shuffle = list.clone();
      int count = 0;
      for(int i=0; i<shuffle.length - 1; i+=2)
      {
         shuffle[i] = list[count];
         shuffle[i+1] = list[list.length-count-1];
         count++;
      }
      return shuffle;
   }

//pre:  list is not null, note is between 22 and 108
//post:  makes a new array containing each element of list, but where every other element is note
//[list0, note, list1, note, list2, note, list3, note, list4, note,...]
//if list:[2, 4, 6, 8] and note:1 -> returns [1,2,1,4,1,6,1,8]
//needs to work with an array of any size
   public static int[] mixWithNote(int[] list, int note)
   {
      int notes[] = new int[list.length * 2];
      int count = 0;
      for(int i = 0; i<notes.length; i++)
      {
         if(i%2 ==0)
         {
            notes[i] = note;
         }
         else
         {
            notes[i] = list[count];
            count++;
         }
      }
      return notes;
   }

//pre:  list is at least of length 3
//post:  makes a new array containing triads (groups of 3 consecutive notes in the scale), each starting with successive elements of list
//[1st elem, 2nd elem, 3rd elem, 2nd elem, 3rd elem, 4th elem, 3rd elem, 4th elem, 5th elem,...]
//if list:[1,2,3,4,5,6] -> returns [1,2,3,  2,3,4,  3,4,5, 4,5,6]
   public static int[] triads(int[] list)
   {
      int[] triad = new int[(list.length - 2)*3];
      int count = 0;
      for(int i = 0; i<triad.length; i+=3)
      {
         triad[i] = list[count];
         triad[i+1] = list[count+1];
         triad[i+2] = list[count+2];
         count++;
      }
      return triad;
   }
   
   //post:  student invents their own mutation to the scale
   public static int[] extraCredit(int[] list)
   {
     //*********WRITE THIS METHOD***************
     
      return list; 	//temporary statement to keep us compiling
     //*****************************************
   }
} 	

