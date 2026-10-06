class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        
        for(int i=0;i<tokens.length;i++){
            String str = tokens[i];

            if(str.equals("+") ||str.equals("-") ||str.equals("*") ||str.equals("/")){
                int a  = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());

                int result = switch(str){
                    case "+" -> b + a;
                    case "-" -> b - a;
                    case "*" -> b * a;
                    case "/" -> b / a;
                    default -> -1;
                };

                st.push(String.valueOf(result));
            }else{
                st.push(str);
            }
        }

        return Integer.parseInt(st.pop());
    }
}
