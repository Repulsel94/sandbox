package org.example.generics;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class GenericUsage {
    public static void main(String[] args) {

        Box<Integer> box1 = new Box<>(1);
        Box<Integer> box2 = new Box<>(163);
        //for Double, can add d after value instead of xxx.0
        Box<Double> box3 = new Box<>(163d);

        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);

        Crate<Box<?>> crate = new Crate<>();
        crate.addBox(box1);
        crate.addBox(box2);
        crate.addBox(box3);

        System.out.println(crate);

        Crate<Box<?>> crate2 = new Crate<>();

        List<Integer> numbers = new Random()
                .ints(1, 500)
                .limit(100)
                .boxed()
                .collect(Collectors.toList());

        // TODO show how to crate these up
        for(Integer i : numbers) {
            new Box(i);
        }
    }
}