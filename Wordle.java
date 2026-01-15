// keeping this here: 🟩🟨⬛ (1 possible way to do colors, will test if it works)
import java.util.Scanner;
import java.io.File;
import java.time.Instant;

public class Wordle
{
  // final so I dont accidentally change word after it's set
  private final String WORD;
  private int guesses;
  private Instant time;

  public Wordle()
  {
    // Save the time, we'll store it in a file soon
    time = Instant.now();
    // take the scanner to scan the wordlist file, go down to the line you want (random) and then take that word.
    try:
    {
      File wordList = new File("wordList.txt");
      Scanner wordleScanner = new Scanner(wordList.txt);
      int lineNum = Math.round((Math.random() * 14854) + 1);
      wordleScanner.useDelimiter("\n");
      for (i = 0; i < lineNum; i++)
      {
        wordleScanner.next();
      }
      WORD = wordleScanner.next();
    }
   catch (FileNotFoundException e)
    {
      
    }
    // JUST FOR TESTING! REMOVE THIS LINE AFTER!!
    System.out.println(lineNum + " " + WORD);
    // JUST FOR TESTING! REMOVE THIS LINE AFTER!!
    // Time storage!
    if 
  }

  public String guess()
  {
    
  }
}
