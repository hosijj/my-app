package ir.org.acm.session15.collections;

import java.util.ArrayList;
import java.util.Stack;

public class TestConvert {

    public static void main(String[] args) {

        Stack<String> stack = new Stack();
        stack.push("3");
        stack.push("4");

        ArrayList<String> list = new ArrayList();
        list.add("1");
        list.add("2");

        list.addAll(stack);

        for (String str : list)
            System.out.println( str );

    }

}
