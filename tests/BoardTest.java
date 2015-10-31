import static org.junit.Assert.*;
import org.junit.*;

public class BoardTest {

    Board b;

    @Before
    public void createBoard() {
        b = new Board(5,5,5,5,5);
    }

    @Test
    public void checkNodes() {
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                System.out.println(b.getNode(i,j));
    }

    @After
    public void removeBoard() {

    }

}
