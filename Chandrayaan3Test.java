import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.*;

public class Chandrayaan3Test {

    @Test
    public void testExampleCommands() {

        // Test case 1
        int[] initialPosition = { 0, 0, 0 };
        char initialDirection = 'N';
        char[] commands = { 'f', 'r', 'u', 'b', 'l' };
        Chandrayaan3 spacecraft = new Chandrayaan3(initialPosition, initialDirection);
        int[] finalPosition = spacecraft.executeCommands(commands);
        assertArrayEquals(new int[] { 0, 1, -1 }, finalPosition);
        assertEquals('N', spacecraft.getDirection());

        // Test case 2
        initialPosition = new int[] { 0, 0, 0 };
        initialDirection = 'N';
        commands = new char[] { 'f', 'r', 'u', 'b', 'l' };
        spacecraft = new Chandrayaan3(initialPosition, initialDirection);
        finalPosition = spacecraft.executeCommands(commands);
        assertArrayEquals(new int[] { 0, 1, -1 }, finalPosition);
        assertEquals('N', spacecraft.getDirection());

        // Test case 3
        initialPosition = new int[] { 2, 3, -1 };
        initialDirection = 'S';
        commands = new char[] { 'f', 'r' };
        spacecraft = new Chandrayaan3(initialPosition, initialDirection);
        finalPosition = spacecraft.executeCommands(commands);
        assertArrayEquals(new int[] { 2, 2, -1 }, finalPosition);
        assertEquals('W', spacecraft.getDirection());

        initialPosition = new int[] { -3, 1, 2 };
        initialDirection = 'E';
        commands = new char[] { 'b', 'l' };
        spacecraft = new Chandrayaan3(initialPosition, initialDirection);
        finalPosition = spacecraft.executeCommands(commands);
        assertArrayEquals(new int[] { -4, 1, 2 }, finalPosition);
        assertEquals('N', spacecraft.getDirection());

        initialPosition = new int[] { 0, 0, 0 };
        initialDirection = 'E';
        commands = new char[] { 'u', 'b' };
        spacecraft = new Chandrayaan3(initialPosition, initialDirection);
        finalPosition = spacecraft.executeCommands(commands);
        assertArrayEquals(new int[] { 0, 0, -1 }, finalPosition);
        assertEquals('U', spacecraft.getDirection());

        initialPosition = new int[] { -2, 4, -1 };
        initialDirection = 'S';
        commands = new char[] { 'd', 'f' };
        spacecraft = new Chandrayaan3(initialPosition, initialDirection);
        finalPosition = spacecraft.executeCommands(commands);
        assertArrayEquals(new int[] { -2, 4, -2 }, finalPosition);
        assertEquals('D', spacecraft.getDirection());

        initialPosition = new int[] { 1, -2, 3 };
        initialDirection = 'W';
        commands = new char[] { 'f', 'l', 'l' };
        spacecraft = new Chandrayaan3(initialPosition, initialDirection);
        finalPosition = spacecraft.executeCommands(commands);
        assertArrayEquals(new int[] { 0, -2, 3 }, finalPosition);
        assertEquals('E', spacecraft.getDirection());

    }

    // Add more tests for other commands and scenarios.
}
