package org.ar;

import java.util.HashMap;
import java.util.Map;

public class DupCount {

    public static void main(String[] args) {
    	
        String[] strings = {"Ramesh", "riyo", "Kumar", "Ramesh", "Abu", "riyo", "Ramesh"};
        
        // Create a HashMap to store the frequency of each string
        Map<String, Integer> frequencyMap = new HashMap<>();
        
        // Count the frequency of each string
        for (String str : strings) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }
        
        // Remove duplicates and print the number of duplicates present
        int duplicates = 0;
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            String str = entry.getKey();
            int frequency = entry.getValue();
            
            if (frequency > 1) {
                duplicates++;
                System.out.println(str + " - " + frequency + " duplicates");
            }
        }
        
        System.out.println("Total duplicates: " + duplicates);
    }
}


