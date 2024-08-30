import java.util.Arrays;

public class TrieNode {

    TrieNode[] children;
    boolean isEndOfWord;

    public TrieNode() {
        children = new TrieNode[26]; //only for the small english alphabets
        isEndOfWord = false;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "TrieNode [children=" + Arrays.toString(children) + ", isEndOfWord=" + isEndOfWord + "]";
    }

}
