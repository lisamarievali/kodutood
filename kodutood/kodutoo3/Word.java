import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.LinkedList;


public class Word implements Interface {
    public String read_my_file(String path){
        String text = "";
        Path file_path = Paths.get(path);
        try {
            byte[] file_content_in_bytes = Files.readAllBytes(file_path);
            String file_content = new String(file_content_in_bytes, StandardCharsets.UTF_8);
            text = file_content;
        } catch (IOException my_error) {
            my_error.printStackTrace();
        }
        return text;
    }
    public String[] split_words_into_pieces(String text){
        String[] wordArray = text.split("\\s");
        return wordArray;
    }

    public LinkedList<String> turn_words_to_lowercase(String[] wordArray) {
        LinkedList<String> linkList = new LinkedList<String>();
        for (String word : wordArray) {
            linkList.add(word.toLowerCase());
        }
        return linkList;
    }
    

    public int count_longer_than(LinkedList<String> linkWordArray, int letterCount) {
        int count = 0;
        for (String word : linkWordArray) {
            if (word.length() >= letterCount) {
                count ++;
            }
        }
        return count;
    }

    @Override
    public String read_my_file(String path) {
        return null;
    }

    @Override
    public String[] split_words_into_pieces(String text) {
        return null;
    }

    @Override
    public LinkedList<String> turn_words_to_lowercase(String[] wordArray) {
        return null;
    }

    @Override
    public int count_longer_than(LinkedList<String> linkWordArray, int letterCount) {
        return 0;
    }

}