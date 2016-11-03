import java.util.*;

public class WordCount {
  private Map<String, Integer> wordCounts;

  public WordCount() {
  }

  public Map<String, Integer> phrase(String sentence) {
    this.wordCounts = new HashMap<String, Integer>();
    String[] sentenceArray = sentence.split(" ");
    for (String word : sentenceArray) {
      if (wordCounts.get(word) == null) {
        wordCounts.put(word, 1);
      } else {
        wordCounts.put(word, wordCounts.get(word) + 1);
      }
    }

    return this.wordCounts;
  }
}
