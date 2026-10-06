class MinStack {
    List<List<Integer>> st;
    public MinStack() {
        st = new ArrayList<>();
    }
    
    public void push(int val) {
        List<Integer> res = new ArrayList<>();

        res.add(val);
        if(!st.isEmpty())
           res.add(Math.min(val , st.get(st.size()-1).get(1)));
        else res.add(val);
        st.add(res);
    }
    
    public void pop() {
        st.remove(st.size()-1);
    }
    
    public int top() {
        return st.get(st.size()-1).get(0);
    }
    
    public int getMin() {
        return st.get(st.size()-1).get(1);
    }
}
