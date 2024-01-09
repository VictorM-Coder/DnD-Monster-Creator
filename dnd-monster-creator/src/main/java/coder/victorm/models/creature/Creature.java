package coder.victorm.models.creature;

import coder.victorm.models.creature.enums.*;

import java.util.HashSet;

public class Creature {
    private String name;
    private CreatureType creatureType;
    private CreatureSize size;
    private Alignment alignment;
    private int armorClass;
    private CreatureSpeed speed;
    private AbilityScore strength;
    private AbilityScore dexterity;
    private AbilityScore constitution;
    private AbilityScore wisdom;
    private AbilityScore charisma;
    private AbilityScore intelligence;
    private int challengeRating;
    private int proficiencyBonus;
    private HashSet<AbilityScore> proficientSavingThrows;
    private HashSet<Skills> proficientSkills;
    private HashSet<Language> languages;
    private Senses senses;
}
