package com.company;

public class Main {

    public static void main(String[] args) {
        Bag bag = new Bag(5,
                new Bag.Item(1,6),
                new Bag.Item(3,12),
                new Bag.Item(2,10));
        System.out.println(bag.getBag());
    }

    private static void task4() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.putRight(3);
        linkedList.putRight(3);
        linkedList.putRight(3);

        LinkedList.Iterator iterator = linkedList.getIterator();

        for (; iterator.hasNext(); ) {
            iterator.remove();
        }
        System.out.println(linkedList.getSize());
        System.out.println(iterator);
        linkedList.putRight(1);
        System.out.println(iterator);
    }
}
