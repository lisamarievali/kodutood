import java.util.LinkedList;

public interface WordInterface {
    public String read_my_file(String path);
    public String[] split_words_into_pieces(String text);
    public LinkedList<String> turn_words_to_lowercase(String[] wordArray);
    public int count_longer_than(LinkedList<String> linkWordArray, int letterCount);    
}