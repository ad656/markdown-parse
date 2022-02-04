import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {
    @Test
    public void maths() {
        assertEquals(9,3^2);
    }
    @Test
    public void getlink() throws IOException{
        String[] args = {"test-file.md"};
        Path fileName = Path.of(args[0]);
	    String contents = Files.readString(fileName);
        ArrayList<String> actual = MarkdownParse.getLinks(contents);
        ArrayList<String> expected = new ArrayList();
        expected.add("https://something.com");
        expected.add("https://something.com");
        assertEquals(actual,expected);
    }
    @Test
    public void test2() throws IOException{
        String[] args = {"test-file2.md"};
        Path fileName = Path.of(args[0]);
	    String contents = Files.readString(fileName);
        ArrayList<String> actual = MarkdownParse.getLinks(contents);
        ArrayList<String> expected = new ArrayList();
        expected.add("https://something.com");
        expected.add("https://something.com");
        assertEquals(actual,expected);
    }
    @Test
    public void test3() throws IOException{
        String[] args = {"test-file3.md"};
        Path fileName = Path.of(args[0]);
	    String contents = Files.readString(fileName);
        ArrayList<String> actual = MarkdownParse.getLinks(contents);
        ArrayList<String> expected = new ArrayList();
        expected.add("https://something.com");
        expected.add("https://something.com");
        assertEquals(actual,expected);
    }
}
