package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

    @Test
    void fire_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(true, result);
    }
    @Test 
    void fire_Failure() {
        TorpedoStore store = new TorpedoStore(0);
        assertThrows(IllegalArgumentException.class, () -> {
            store.fire(1);
        }); 
    }
    @Test 
    void fireFailureRate() {
        TorpedoStore store = new TorpedoStore(1, 1.0);
        boolean result = store.fire(1);

       
        assertEquals(false, result);
    }
    @Test
    void emptyTest(){
        TorpedoStore store = new TorpedoStore(0,0);
        boolean empty = store.isEmpty();
        assertEquals(true, empty);
    }

}
