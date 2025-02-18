import java.util.Stack;

class Solution {
    public String smallestNumber(String pattern) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int num = 1;  // Start with 1

        for (int i = 0; i <= pattern.length(); i++) {
            stack.push(num++); // Push current number

            // If it's the last iteration OR we encounter 'I', process the stack
            if (i == pattern.length() || pattern.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());  // Pop from stack and add to result
                }
            }
        }
        return result.toString();
    }
}
