import static org.junit.Assert.*;
import org.junit.*;

public class Maintest{
    
    // Test case to check if contact method initiates contact with the specified person
    @Test
    public void testContact() {
        // Arrange
        Main.contacted = new boolean[Main.N];
        char person = 'A';
        
        // Act
        Main.contact(person);
        
        // Assert
        assertTrue(Main.contacted[person - 'A']);
    }
    
    // Test case to check if contact method contacts predefined friends when called for the first time
    @Test
    public void testContactFirstTime() {
        // Arrange
        Main.contacted = new boolean[Main.N];
        char person = 'B';
        
        // Act
        Main.contact(person);
        
        // Assert
        assertTrue(Main.contacted['C' - 'A']); // 'C' is a predefined friend of 'B'
        assertTrue(Main.contacted['J' - 'A']); // 'J' is a predefined friend of 'B'
    }
    
    // Test case to check if contactedFriends method contacts predefined friends based on the contacted person
    @Test
    public void testContactedFriends() {
        // Arrange
        Main.contacted = new boolean[Main.N];
        char person = 'L';
        
        // Act
        Main.contactedFriends(person);
        
        // Assert
        assertTrue(Main.contacted['M' - 'A']); // 'M' is a predefined friend of 'L'
        assertTrue(Main.contacted['N' - 'A']); // 'N' is a predefined friend of 'L'
        assertTrue(Main.contacted['A' - 'A']); // 'A' is a predefined friend of 'L'
    }
}

