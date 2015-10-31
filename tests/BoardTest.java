import static org.junit.Assert.*;
import org.junit.*;

public class BoardTest {

    Board b;
    int xMax = 10;
    int yMax = 10;
    @Before
    public void createBoard() {
        b = new Board(xMax,yMax,5,5,5);
    }

    @Test
    public void checkNodes() {
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                System.out.println(b.getNode(i,j));
    }

    @Test
    public void testValidMoves() {
        for (int i = 0; i < xMax; i++)
            for (int j = 0; j < yMax; j++)
                assertTrue(b.isValidMove(i,j));
    }

    @After
    public void removeBoard() {

    }

}
