package Day1.Puzzle5;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
//wrapping the linkedlist with another class in order for only certain methods to be visible in
// the main to the user. Otherwise all the methods that come with the linkedlist class would
// be visible in the main

    // these fields hold the main and max stacks
    private LinkedList<Integer> stack;
    private LinkedList<Integer> maxStack;
    //As a new integer is added to the main stack, the sme integer is added
    // to the max stack only if it is larger than any current integers being stored
    // in the maxstack


    //constructor
    public LinkedStack() {
        stack = new LinkedList<>();
        maxStack = new LinkedList<>();
    }

    public void push(Integer integer) {

        Integer max = integer;

        if (!maxStack.isEmpty() && max < maxStack.peek()) {
            max = maxStack.peek();
        }
        stack.push(integer);
        maxStack.push(max);
    }

    public void pop(){
         stack.pop();
         maxStack.pop();
        System.out.println();
    }

    public Integer getMax() {
        return maxStack.peek();
    }

    public Integer peek() {
        return stack.peek();
    }


    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        ListIterator<Integer> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }
}
