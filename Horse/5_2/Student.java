public class Student
{
   private String name;
   private int test1;
   private int test2;
   private int test3;


   public Student()
   {
      name ="";
      test1 = 0;
      test2 = 0;
      test3 = 0;
   
   }
   public Student(String nm, int t1, int t2, int t3)
   {
      name = nm;
      test1 = t1;
      test2 = t2;
      test3 = t3;
   }
   public Student(Student s)
   {
      name = s.name;
      test1 = s.test1;
      test2 = s.test2;
      test3 = s.test3;
   }
   //set a student's name
   public void setName(String nm)
   {
      name = nm;
   }
   //get a student's name
   public String getName()
   {
      return name;
   }
   //post: set test i to score
   public void setScore(int i, int score)
   {
      if(i == 1) test1 = score;
      if(i == 2) test2 = score;
      else test3 = score;
   
   }
   //post: return score i
   public int getScore(int i)
   {
      if(i == 1) 
         return test1;
      else if(i == 2) 
         return test2;
      else 
         return test3;
   }
   //post: compute and return average
   public int getAverage()
   {
      int average;
      average = (int) Math.round((test1+test2+test3)/3.0);
      return average;
   }
	//post: determine and return highest score
   public int getHighScore()
   {
      int highScore;
      highScore = test1;
      if(test2>highScore)highScore = test2;
      if(test3>highScore)highScore = test3;
      return highScore;
   
   }
   //post: construct and return string representation of  the student
   public String toString()
   {
      String str;
      str = "Name:    " + name  + "\n" +
         "Test 1:  " + test1 + "\n" +
         "Test 2:  " + test2 + "\n" +
         "Test 3:  " + test3 + "\n" +
         "Average: " + getAverage();
      return str;
   }
   public String validateData()
   {
      if(name.equals("") || name.equals(" "))
         return ("Enter a name!");
         
      if(test1 > 100 || test1 < 0 || test2 > 100 || test2 < 0 || test3 > 100 || test3 < 0)
         return ("Enter test scores between 1 and 100");
      else
         return null;
   }
}