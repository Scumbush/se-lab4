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
    void store_Is_Empty() {
        // Arrange
        TorpedoStore store = new TorpedoStore(0);

        // Act
        boolean result = store.isEmpty();

        // Assert
        assertEquals(false, result);
    }

    @Test
    void store_Is_Not_Empty() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.isEmpty();

        // Assert
        assertEquals(false, result);
    }

    @Test
    void store_Count_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(2);

        // Act
        store.fire(1);

        // Assert
        assertEquals(1, store.getTorpedoCount());
    }

    @Test
    void fire_Failure() {
        // Arrange
        TorpedoStore store = new TorpedoStore(0);

        // Act
        
        // Assert
        assertThrows(IllegalArgumentException.class, () -> { store.fire(1); });
    }
}
