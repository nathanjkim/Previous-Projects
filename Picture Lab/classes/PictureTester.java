/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */

//College Board Picture Lab Tester Program

public class PictureTester
{
   /** Method to test zeroBlue */
   public static void testZeroBlue()
   {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.zeroBlue();
      beach.explore();
   }
   
   /** Method to test mirrorVertical */
   public static void testMirrorVertical()
   {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.mirrorVertical();
      caterpillar.explore();
   }
   public static void testMirrorVerticalRightToLeft()
   {
      Picture knob = new Picture("McAfeeKnob.jpg");
      knob.explore();
      knob.mirrorVerticalRightToLeft();
      knob.explore();
   }
   public static void testMirrorHorizontal()
   {
      Picture knob = new Picture("McAfeeKnob.jpg");
      knob.explore();
      knob.mirrorHorizontal();
      knob.explore();
   }
   public static void testMirrorHorizontalBotToTop()
   {
   Picture knob = new Picture("McAfeeKnob.jpg");
   knob.explore();
   knob.mirrorHorizontalBotToTop();
   knob.explore();
   }
   /** Method to test mirrorTemple */
   public static void testMirrorTemple()
   {
      Picture temple = new Picture("temple.jpg");
      temple.explore();
      temple.mirrorTemple();
      temple.explore();
   }
   public static void testMirrorArms()
   {
   Picture snowman = new Picture("snowman.jpg");
   snowman.explore();
   snowman.mirrorArms();
   snowman.explore();
   }
   public static void testMirrorGull()
   {
   Picture gull = new Picture("seagull.jpg");
   gull.explore();
   gull.mirrorGull();
   gull.explore();
   }
   /** Method to test the collage method */
   public static void testCollage()
   {
      Picture canvas = new Picture("640x480.jpg");
      canvas.createCollage();
      canvas.explore();
   }
   
   /** Method to test edgeDetection */
   public static void testEdgeDetection()
   {
      Picture swan = new Picture("swan.jpg");
      swan.edgeDetection(10);
      swan.explore();
   }
   public static void testKeepOnlyBlue()
   {
      Picture knob = new Picture("McAfeeKnob.jpg");
      knob.explore();
      knob.keepOnlyBlue();
      knob.explore();
   }
   public static void testNegate()
   {
      Picture knob = new Picture("McAfeeKnob.jpg");
      knob.explore();
      knob.negate();
      knob.explore();
   }
   public static void testGrayscale()
   {
      Picture knob = new Picture("McAfeeKnob.jpg");
      knob.explore();
      knob.grayscale();
      knob.explore();
   }
   public static void testMyCollage()
   {
   Picture empty = new Picture("640x480.jpg");
   empty.myCollage();
   empty.explore();
   }
   /** Main method for testing.  Every class can have a main
     * method in Java */
   public static void main(String[] args)
   {
      // uncomment a call here to run a test
      // and comment out the ones you don't want
      // to run
      testMyCollage();
      testCollage();
      testMirrorArms();
      testMirrorTemple();
       testMirrorGull();
       testEdgeDetection();
      /*
      testMirrorHorizontalBotToTop();
      testMirrorHorizontal();
      testMirrorVerticalRightToLeft();
      testZeroBlue();
      testNegate();
      testKeepOnlyBlue();
      testGrayscale();
      //testKeepOnlyBlue();
      //testKeepOnlyRed();
      //testKeepOnlyGreen();
      //testNegate();
      //testGrayscale();
      //testFixUnderwater();
      testMirrorVertical();
      //testMirrorArms();
      //testMirrorDiagonal();
      testCollage();
      //testCopy();
      //testEdgeDetection2();
      //testChromakey();
      //testEncodeAndDecode();
      //testGetCountRedOverValue(250);
      //testSetRedToHalfValueInTopHalf();
      //testClearBlueOverValue(200);
      //testGetAverageForColumn(0);
      */
   }
}