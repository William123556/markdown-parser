//Importing all of the Assert methods under junit. 
import static org.junit.Assert.*;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

//Importing necessary commands for junit, 
//so for our output it allowed us to run the actual tests.
import org.junit.*;
//Class declaration
public class MarkdownParseTest {
    //JUnit test annotation
    @Test 
    //JUnit test method declaration
    public void addition(){
        //Using the Assert methods 
        //implemented for testing
        assertEquals(2, 1+1);
    }

    @Test

    public void testFileMDtest() throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-page.html");
        assertEquals(expected, links);
    }

    @Test
    public void testFile2test() throws IOException{
        Path fileName = Path.of("testfile2.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> expected = new ArrayList<String>();
        expected.add("google.com");
        expected.add("google");
        expected.add("microsoft.com");
        expected.add("youtube.com");

        assertEquals(expected, links);
    }

    @Test
    public void testFile3test() throws IOException{
        Path fileName = Path.of("testfile3.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> expected = new ArrayList<String>();
        expected.add("google.com");
        expected.add("ucsd.edu");

        assertEquals(expected, links);
    }

}
