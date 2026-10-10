class MyHashSet {
    boolean[] mp;

    public MyHashSet() {
        mp = new boolean[1_000_001];
    }
    
    public void add(int key) {
        mp[key] = true;
    }
    
    public void remove(int key) {
        mp[key] = false;
    }
    
    public boolean contains(int key) {
        if(mp[key]) return true;
        else return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */