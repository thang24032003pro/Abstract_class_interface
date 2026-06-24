import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TennisGameTest {

    @Test
    public void testDraw0And0() {
        assertEquals("Love-All", TennisGame.getScore("John", "Bill", 0, 0));
    }

    @Test
    public void testDraw4And4() {
        assertEquals("Deuce", TennisGame.getScore("John", "Bill", 4, 4));
    }

    @Test
    public void testAdvantagePlayer1() {
        assertEquals("Advantage player1", TennisGame.getScore("John", "Bill", 4, 3));
    }

    @Test
    public void testWinForPlayer2() {
        assertEquals("Win for player2", TennisGame.getScore("John", "Bill", 2, 4));
    }

    @Test
    public void testNormalScore() {
        assertEquals("Fifteen-Thirty", TennisGame.getScore("John", "Bill", 1, 2));
    }
}