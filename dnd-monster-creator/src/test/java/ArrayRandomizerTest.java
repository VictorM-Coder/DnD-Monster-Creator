import coder.victorm.randomizers.ArrayRandomizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

class ArrayRandomizerTest {
    @Test
    @DisplayName("getRandomItem should return a random value from a array of objects")
    void test1(){
        Integer[] values = {1, 2, 3};
        for (int cont = 0; cont < 500; cont++) {
            var value = ArrayRandomizer.getRandomItem(values);
            if (value != 1 && value != 2 && value != 3) fail();
        }
    }
}
