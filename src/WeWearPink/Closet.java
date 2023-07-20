package WeWearPink;

import java.util.*;

public class Closet {
    Set<Clothing> clothingSet = new HashSet<>();
    Map<String, List<Clothing>> colorMap = new HashMap<>();

    public Closet(List<Clothing> resourceList) {
        for (Clothing c: resourceList) {
            clothingSet.add(c);
        }

        for (Clothing c: clothingSet) {
            if (!colorMap.containsKey(c.color)) {
                colorMap.put(c.color, new ArrayList<Clothing>());
            }
            colorMap.get(c.color).add(c);
        }
    }

    public List<Clothing> getItemsByDay(Map<String, String> dayToC, String day) {
        String targetColor = dayToC.get(day);
        return colorMap.get(targetColor);
    }

    public void enterEmoPhase(List<String> happyColors) {
        for (String color: happyColors) {
            for (Clothing c: colorMap.get(color)) {
                c.dyeColor("Black");
            }
        }
    }
}
