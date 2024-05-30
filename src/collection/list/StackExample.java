package collection.list;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push("Shekhar");
        stack.push("Shivam");
        stack.push("Sangram");
        stack.push("Vishal");
        stack.push("Vikram");
        stack.push("");

        System.out.println(stack.empty());
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.search("Rahul"));
    }
}
