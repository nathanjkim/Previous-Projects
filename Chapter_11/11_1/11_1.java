import java.util.Scanner;

public class SentenceStats
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter a sentence: ");
			String input = reader.nextLine();
			if(input.equals(""))
				break;

			int wordCount = 0;
			int sentenceLength = 0;
			int beginPosition = 0;
			int endPosition = input.indexOf('');

			while(endPosition != -1)
			{
				if(endPosition > beginPosition)
				{
					wordCount++;
					String word = input.substring(beginPosition, endPosition);
					sentenceLength += word.length();
				}
				beginPosition = endPosition + 1;
				endPosition = input.indexOf('', beginPosition);
			}
			if(wordCount > 0)
			{
				System.out.println("Word count: " + wordCount);
				System.out.println("Sentence Length: " + sentenceLength);
				System.out.println("Average word length: " + sentenceLength/wordCount);
			}

		}
	}
}