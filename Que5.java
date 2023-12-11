package Assignment;

import java.util.LinkedList;
import java.util.Queue;

    public class Que5 {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public Que5() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        // Move all elements from queue1 to queue2
        while (!queue1.isEmpty()) {
            queue2.add(queue1.poll());
        }

        // Add the new element to queue1
        queue1.add(x);

        // Move all elements back from queue2 to queue1
        while (!queue2.isEmpty()) {
            queue1.add(queue2.poll());
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return queue1.poll();
    }

    public int top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return queue1.peek();
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        Que5 stack = new Que5();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top());
        System.out.println("Pop element: " + stack.pop()); 
        System.out.println("Pop element: " + stack.pop()); 
        
        stack.push(123);
        System.out.println("Updated: " + stack.top());
    }
}