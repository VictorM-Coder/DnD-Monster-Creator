import coder.victorm.models.creature.enums.CreatureType;
import coder.victorm.randomizers.CreatureTypeRandomizer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class RandomCreatureTypeGeneratorTest {
    @Test
    @DisplayName("randomize should always return a valid Creature type when call")
    void test1() {
        for (int cont = 0; cont < 1000; cont++){
            var creatureType = CreatureTypeRandomizer.randomize();
            assertNotNull(creatureType);
            assertInstanceOf(CreatureType.class, creatureType);
        }
    }
}
