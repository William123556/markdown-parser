//Importing all of the Assert methods under junit. 
import static org.junit.Assert.*;
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
}
