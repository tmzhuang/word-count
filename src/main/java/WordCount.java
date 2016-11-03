import java.util.*;

public class WordCount {
  private Map<String, Integer> wordCounts;

  public WordCount() {
  }

  public Map<String, Integer> phrase(String sentence) {
    this.wordCounts = new HashMap<String, Integer>();
    List<String> wordList = toWordList(sentence);
    for (String word : wordList) {
      if (wordCounts.get(word) == null) {
        wordCounts.put(word, 1);
      } else {
        wordCounts.put(word, wordCounts.get(word) + 1);
      }
    }

    return this.wordCounts;
  }

  private static List<String> toWordList(String sentence) {
    String[] sentenceArray = sentence.trim().split("\\s+");
    List<String> result = new ArrayList();
    for (String oldWord : sentenceArray) {
      String word = lettersOnly(oldWord);
      if (!word.equals("")) {
        result.add(word.toLowerCase());
      }
    }
    
    return result;
  }

  private static String lettersOnly(String oldString) {
    return oldString.replaceAll("[\\W]", "");
  }
}
