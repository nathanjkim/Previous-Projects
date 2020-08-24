   public class TestStudent
   {
      public static void main (String[] args)
      {
         Student s1, s2;
         
         s1 = new Student();
         s1.setName("Bill");
         s1.setScore(1, 84);
         s1.setScore(2, 86);
         s1.setScore(3, 88);
			System.out.println("\nHere is student s1\n" + s1);
			s2 = s1;
			s2.setName("Ann");
			System.out.println("\nName of s1 is now: " + s1.getName());
         
         Student s3 = new Student("Nathan", 100, 99, 98);
         System.out.println("\nHere is student s3\n" + s3);
         s1 = s3;
         System.out.println("\nName of s1 is now: " +s3.getName());
      }
   }