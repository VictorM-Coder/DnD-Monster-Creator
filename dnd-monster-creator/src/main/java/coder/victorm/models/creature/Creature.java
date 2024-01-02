package coder.victorm.models.creature;

import coder.victorm.models.creature.enums.Alignment;
import coder.victorm.models.creature.enums.CreatureSize;
import coder.victorm.models.creature.enums.CreatureType;

public class Creature {
    private String name;
    private CreatureType creatureType;
    private CreatureSize size;
    private Alignment alignment;
    private int armorClass;
    private CreatureSpeed speed;
}