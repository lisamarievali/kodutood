import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

import org.junit.Test;

public class Test {

    @Test
    public void testIfReadFileExcisting(){
        String testFileName = "/home/lisaval/public_html/progep/kodutoo4/test.txt";
        SecondKT KTfile = new SecondKT();
        String result = KTfile.readFile(testFileName);
        assertTrue(result != null);
    }

    @Test
    public void testIfReadFileIsWorking(){
        String testFileName = "/home/lisaval/public_html/progep/kodutoo4/test.txt";
        String expected = "See siin on test";
        SecondKT KTfile = new SecondKT();
        String result = KTfile.readFile(testFileName);
        assertEquals(expected, result);
    }

    @Test
    public void testIfLowerCaseWorks(){
        String[] text = {"Suured", "täheD"};
        SecondKT KTfile = new SecondKT();
        LinkedList<String> result = KTfile.lowerCaseLetters(text);
        assertTrue(result != null);
    }    

}