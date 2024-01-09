package coder.victorm.randomizers;

import java.util.Random;

public class ArrayRandomizer {
    private static final Random RANDOM = new Random();
    private ArrayRandomizer(){}
    public static <E> E getRandomItem(E[] array) {
        int index = RANDOM.nextInt(array.length);
        return array[index];
    }
}
