package datastructures.stackArraylist;

public class Main {

    static String reverseString(String str){
        Stack myStack = new Stack();
        String listString="";
        for(int i=0;i<str.length();i++)
        {
            myStack.push(str.charAt(i));

        }
        while(!myStack.isEmpty()){
            listString= listString+myStack.pop();
        }

        return listString;

    }

    static boolean isBalancedParentheses1(String str){
        if(str.length()%2 !=0){
            return false;
        }else {
            Stack open = new Stack();
            Stack close = new Stack();
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)=='('){
                    open.push(str.charAt(i));
                } else if (str.charAt(i)==')') {
                    close.push(str.charAt(i));
                }
            }
            if(open.size() == close.size()){
                return true;
            }
            return false;
        }

    }
    public static boolean isBalancedParentheses(String parentheses) {
        // Create an empty stack of characters
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the input string
        for (char p : parentheses.toCharArray()) {
            // If the current character is an opening parenthesis, push it onto the stack
            if (p == '(') {
                stack.push(p);
            }
            // If the current character is a closing parenthesis, check if the stack is empty or
            // if the top element of the stack is not an opening parenthesis. If either of these
            // conditions is true, return false, because the parentheses are not balanced.
            else if (p == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }

        // After iterating through all the characters in the input string, check if the stack is
        // empty. If the stack is empty, return true, because all the opening parentheses have been
        // matched with closing parentheses. Otherwise, return false, because there are still some
        // opening parentheses left on the stack that have not been matched with closing parentheses.
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.push(4);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();
 
        /*
            EXPECTED OUTPUT:
            ----------------
            Before sorting:
            4
            1
            5
            2
            3
            
            After sorting:
            1
            2
            3
            4
            5

        */
    }

    private static void sortStack(Stack<Integer> stack) {
        Stack<Integer> sortedStack= new Stack<>();
        sortedStack.push(stack.pop());
        while (!stack.isEmpty()){
            Integer topSorted= sortedStack.peek();
            Integer topStack= stack.peek();
            if (topSorted>topStack){
               Integer min= stack.pop();
               while (!sortedStack.isEmpty() && min<sortedStack.peek()){
                   stack.push(sortedStack.pop());
               }
               sortedStack.push(min);
            }else {
                sortedStack.push(stack.pop());
            }
        }
        while (!sortedStack.isEmpty()){
            stack.push(sortedStack.pop());
        }
    }

}
