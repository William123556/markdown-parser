//Importing all of the Assert methods under junit. 
import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

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

    public void markdownparseTest() throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> expected = new ArrayList<String>();
        expected.add("https:something.com");
        expected.add("some-page.html");

        assertEquals(expected, links);
    }


}
