package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queuey {
    LinkedList queue;

    public Queuey() {
        this.queue = new LinkedList();
    }

    //Is our queue empty?
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    //Enqueueing an item to the last position
    public void enqueue(String n) {
        queue.addLast(n);
    }

    public String dequeue() {
       return (String) queue.remove(0);
    }

    //peek at the first item
    public String peek() {
        return (String) queue.get(0);
    }

    public static void main(String[] args) {
        Stack<String> stacky = new Stack<>();
        stacky.push("there!");
        stacky.push("Hi");
        System.out.print(stacky.pop()+" ");
        System.out.print(stacky.pop());
        System.out.println("Size: "+stacky.size());
        Queue<Integer> q = new LinkedList<>();


//        Queuey q = new Queuey();
//        q.enqueue("Aba");
//        q.enqueue("Haha");
//        q.enqueue("lolo");
//        q.enqueue("Nana");
//        System.out.print(q.dequeue() + " ");
//        System.out.print(q.peek()+".");
    }
}
