// keeping this here: 🟩🟨⬛ (1 possible way to do colors, will test if it works)
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.time.Instant;

public class Wordle
{
  // final so I dont accidentally change word after it's set
  private final String WORD;
  private int guesses;
  private Instant time;
  
  /* Todo: create a file after asking for pathname (If it doesnt exist already) and then store info.
  * If the file exists, say welcome back and check if time is over 24 hours since last game.
  
  * Lets do streaks too, where the program will check if its been over 24 hours since last game, 
  * and if it does it sets streaks to 0 and informs the user that their streak was broken.
  
  * lets also do one where if its a current game in progress ("currentGame = true" in the file), then the game will continue with the stored word and guesses.
  * If currentGame = false, then the currentGame info will be deleted, making sure that there is no more info there.
  * The word selected will be stored and encrypted by some sort of very simple cypher, where the letters are shifted over by 2 places or something.
  * Make a cypher class that can encrypt() or unencrypt()
  */
  public Wordle()
  {
    // I'm just trying this, lets see if it works or if it gives me some problems
    // (in which I would need to go input the full pathname after asking the user for it).
    File info = new File("wordleStats.txt");
    boolean wordleStatsExists = info.createNewFile("wordleStats.txt");
    if (wordleStatsExists)
    {
      // go through the file to check the time and streak.
    }
    
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
      System.out.println("Sorry, the wordlist was not found. try reinstalling the program and making sure the wordlist is in the same directory (folder) as the game.")
    }
    // JUST FOR TESTING! REMOVE THIS LINE AFTER!!
    System.out.println(lineNum + " " + WORD);
    // JUST FOR TESTING! REMOVE THIS LINE AFTER!!
    // Time storage!
  }

  public String guess()
  {
    
  }
}
