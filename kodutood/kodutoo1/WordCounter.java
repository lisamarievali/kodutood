import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class WordCounter {

    String path;
    String file_content;
    String[] array_of_words;
    // HashMap<String, Integer> word_counter = new HashMap<>();


    public WordCounter(String path){
        this.path = path;
        this.read_my_file();
        this.split_words_into_pieces();
        this.turn_words_to_lowercase();
   }

   public void read_my_file() {
    Path file_path = Paths.get(this.path);
    try {
        byte[] file_content_in_bytes = Files.readAllBytes(file_path);
        String file_content = new String(file_content_in_bytes, StandardCharsets.UTF_8);
        this.file_content = file_content;
    } catch (IOException e) {
        e.printStackTrace();
    }

    }

    public void split_words_into_pieces() {
        String[] array_of_words = this.file_content.split(" ");
        this.array_of_words = array_of_words;
    }

    public void turn_words_to_lowercase() {
        for (int i = 0; i < this.array_of_words.length; i++) {
            String word = this.array_of_words[i];
            this.array_of_words[i] = word.toLowerCase();
        }
    }

    public void count_words() {
        for (String word : this.array_of_words) {
            if(this.word_counter.get(word) == null){
                this.word_counter.put(word, 1);
            } else {
                int count = this.word_counter.get(word);
                this.word_counter.put(word, count+1);
            }
            System.out.println(word + " esines " + count + " korda.")
        }
        
    }

    public static void main(String[] args) {
        WordCounter count_the_words = new WordCounter("/home/lisaval/public_html/progep/kodutoo/jaagup2.txt");
    }
        
    
}