import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Ability {
    private int score;

    private static Map<Integer, Integer> modifierMap;

    public Ability(int score) throws IllegalArgumentException {
        if (score < 1 || score > 20) {
            throw new IllegalArgumentException("Ability scores must be 1-20");
        }
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public int getModifier() {
        return getModifierMap().get(score);
    }

    private static Map<Integer, Integer> getModifierMap() {
        if (modifierMap != null) return modifierMap;

        Map<Integer, Integer> tempMap = new HashMap<>();
        tempMap.put(1, -5);
        tempMap.put(2, -4);
        tempMap.put(3, -4);
        tempMap.put(4, -3);
        tempMap.put(5, -3);
        tempMap.put(6, -2);
        tempMap.put(7, -2);
        tempMap.put(8, -1);
        tempMap.put(9, -1);
        tempMap.put(10, 0);
        tempMap.put(11, 0);
        tempMap.put(12, 1);
        tempMap.put(13, 1);
        tempMap.put(14, 2);
        tempMap.put(15, 2);
        tempMap.put(16, 3);
        tempMap.put(17, 3);
        tempMap.put(18, 4);
        tempMap.put(19, 4);
        tempMap.put(20, 5);

        modifierMap = Collections.unmodifiableMap(tempMap);
        return modifierMap;
    }
}
