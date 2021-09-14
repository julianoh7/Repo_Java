package HomeWorkPackage;

import java.util.*;
import java.util.HashMap;

public class HW12REDO {
    public static void main(String[] args) {
        String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
                "green", "green","green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
                "green", "green","green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
                "green", "green","green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
                "green", "green","green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
                "green", "green"};
        HW12REDO s1 = new HW12REDO();
        Set<String> s2 = s1.getColorMaxTimes(arr);
        System.out.println(s2);



    }

        public Set<String> getColorMaxTimes (String[] arr) {


            Map<String, Integer> colorCount = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                if (!colorCount.containsKey(arr[i])) {
                    int count = 1;
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j].equalsIgnoreCase(arr[i])) {
                            count++;
                        }
                    }
                    colorCount.put(arr[i], count);
                }
            }
            System.out.println(colorCount);

            Set<String> maxColor = new HashSet<>();
            Collection<Integer> allColorCount = colorCount.values();
            Integer maxValue = 0;
            for (Integer value : allColorCount) {
                if (value > maxValue) {
                    maxValue = value;
                }
            }

            System.out.println(maxValue);
            Set<String> allColorNames = colorCount.keySet();

            for (String colorName : allColorNames) {
                if (colorCount.get(colorName) == maxValue) {
                    maxColor.add(colorName);
                }
            }
            //System.out.println(maxColor);
            return maxColor;


        }

}
