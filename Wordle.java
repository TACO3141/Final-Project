// keeping this here: 🟩🟨⬛ (1 possible way to do colors, will test if it works)
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.time.Instant;

public class Wordle
{
  // final so I dont accidentally change word after it's set
  private static String word;
  private int guesses;
  private Instant time;
  
  /* Todo: create a file and folder after taking pathname and then store info.
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
    File folder = new file("C:\\Users\\" + System.getProperty("user.name") + "\\Wordle");
    File info = new File("wordleStats.txt"); // Create a file object for stats document
    boolean folderExists;
    boolean infoExists;
    try
    {
      folderExists = 
    }
    
    // Save the time, we'll store it in a file soon
    time = Instant.now();
    
    int lineNum = (int) Math.round((Math.random() * 14854) + 1.5);
		try
		{
			File wordList = new File("wordList.txt"); 
			BufferedReader wordFinder = new BufferedReader(new FileReader("wordList.txt"));
			for (int i = 0; i < lineNum - 1; i++)
			{
				word = wordFinder.readLine();
			}
			word = wordFinder.readLine();
    }
		catch (Exception e)
		{
      System.out.println("Sorry, an error occured. Please try running the program again. If that doesn't work, reinstall the program.");
		}


  public String guess()
  {
    
  }
}
