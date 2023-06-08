class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char a : s.toCharArray()){
            if (a =='(' || a == '{' || a == '[' ) {
                stack.push(a);
            } else {
                if (stack.empty()){
                    return false;
                }
                if ( a == ')' && stack.peek() == '(' ){
                    stack.pop();
                } else if ( a == '}' && stack.peek() == '{' ){
                    stack.pop();
                } else if ( a == ']' && stack.peek() == '[' ){
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}