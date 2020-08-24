   
public class LightDriver
{
   
   public static void main(String[]arg)
   {
      LightBulb[] lights = new LightBulb[100];
      for(int i = 0; i < lights.length; i++)
      {
         lights[i] = new LightBulb();
      } 
      
      for(int k = 0; k < lights.length; k++)
      {
         if(lights[k].isOn() == true)
            System.out.print("I");
         else
            System.out.print("O");   
      }
      System.out.println("");
      System.out.println("100 lights, 20 students: ");
      runSimulation(lights, 20);
      int randStudents = (int)(Math.random() * 140) + 10;
      int randLights = (int)(Math.random() * 1400) + 100;
      LightBulb[] lights2 = new LightBulb[randLights];
       for(int y = 0; y < lights2.length; y++)
      {
         lights2[y] = new LightBulb();
      } 
      System.out.println("");
      System.out.println(randLights + " lights, " + randStudents + " students: ");
      runSimulation(lights2, randStudents);
      
      
      
      
   }
   public static void runSimulation(LightBulb[] a, int numStudents)
   {
      LightBulb[] hallway = new LightBulb[a.length];
      for(int x = 0; x < a.length; x++)
      {
         hallway[x] = a[x];
      }
      for(int k = 0; k < numStudents; k++)
      {
         for(int i = k; i < hallway.length; i+=2)
         {
            hallway[i].pullString();
         }
      }
      for(int k = 0; k < hallway.length; k++)
      {
         if(hallway[k].isOn() == true)
            System.out.print("I");
         else
            System.out.print("O");
      }
   }
}