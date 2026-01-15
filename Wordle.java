// keeping this here: 🟩🟨⬛ (1 possible way to do colors, will test if it works)
import java.util.Scanner;
import java.io.file;

public class Wordle
{
  //final so I dont accidentally change word after it's set
  private final String WORD;

  public Wordle()
  {
    //take the scanner to scan the wordlist file, go down to the line you want (random) and then take that word.
    Scanner wordleScanner = new Scanner(wordList.txt);
    int lineNum = Math.round((Math.random() * 14854) + 1);
    wordleScanner.useDelimiter("\n");
    for (i = 0; i < lineNum; i++)
    {
      wordleScanner.next();
    }
    WORD = wordleScanner.next();
    System.out.println(lineNum + " " + WORD);
  }
}
