package com.jslee.operator.op03_TRANSFORMATION;

import java.util.*;

public class Searcher {
    public Map<String, List<String>> map = new HashMap<>();

    {
        map.put("M", Arrays.asList("Macau", "Malaysia", "Maldives", "Mexico", "Myanmar", "Macedonia"));
        map.put("Ma", Arrays.asList("Macau", "Malaysia", "Maldives", "Macedonia"));
        map.put("Mal", Arrays.asList("Malaysia", "Maldives"));
        map.put("Malay", Arrays.asList("Malaysia"));
    }

    public List<String> search(String keyword){
        List<String> results = map.get(keyword);
        if(results == null){
            results = new ArrayList<>();
        }
        return results;
    }
}
