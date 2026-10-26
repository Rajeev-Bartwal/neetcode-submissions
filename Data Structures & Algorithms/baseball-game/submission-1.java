class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<operations.length;i++){
            String str = operations[i];

            if(Character.isDigit(str.charAt(0)) || str.charAt(0) == '-') st.push(Integer.parseInt(str));
            else if(str.equals("+")){
                st.push(st.peek() + st.get(st.size() -2));
            }else if(str.equals("D")){
                st.push(st.peek() * 2);
            }else{
                st.pop();
            }
        }

        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }

        return sum;
    }
}