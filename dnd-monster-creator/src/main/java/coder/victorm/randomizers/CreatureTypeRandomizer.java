package coder.victorm.randomizers;

import coder.victorm.models.creature.enums.CreatureType;

public final class CreatureTypeRandomizer {
    private CreatureTypeRandomizer(){}
    public static CreatureType randomize() {
        return ArrayRandomizer.getRandomItem(CreatureType.values());
    }
}
