package com.stupidplebs.howmany;

import static java.util.stream.Collectors.joining;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class HowManyWithStreams {
    public static void main(String[] args) {
        final Map<Integer,Integer> solution = new HowManyWithStreams().solve();
        
        System.out.println(solution.keySet().stream().
                                    map(k -> solution.get(k) + " " + k + "'s").
                                    collect(joining(", ", "This sentence contains ", ".")));
        
    }
    
    public HowManyWithStreams() {}
    
    public Map<Integer,Integer> solve() {
        final Map<Integer,Integer> d = new HashMap<>();

        Stream.generate(new AtomicInteger()::getAndIncrement).
                map(i -> i % 10).
                map(i -> d.put(i, countOccurences(i, d.values()))).
                anyMatch(i -> isSolved(d) );

        return d;

    }
    
    // since we're not initializing the map, bail early if it hasn't been fully populated yet
    // otherwise, return true if the value for each key is the number of instances of that
    // number between key and value
    private Boolean isSolved(final Map<Integer,Integer> d) {
        return d.size() == 10 && d.entrySet().stream().
                allMatch(i -> countOccurences(i.getKey(), d.values()) == i.getValue());
    }
    
    private Integer countOccurences(final Integer i, final Collection<Integer> counts) {
        return (int)(counts.stream().filter(val -> val == i).count()) + 1;
    }    
    
}
