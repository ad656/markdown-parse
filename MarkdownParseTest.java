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
    public void test1() throws IOException{
        
        assertEquals(1,3);
    }
    @Test
    public void test2() throws IOException{
        
        assertEquals("cow","cow");
    }
   
}
