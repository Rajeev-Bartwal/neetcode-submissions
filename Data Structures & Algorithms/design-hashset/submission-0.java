class MyHashSet {
    HashMap<Integer , MyHashSet> mp;

    public MyHashSet() {
        mp = new HashMap<>();
    }
    
    public void add(int key) {
        mp.put(key , new MyHashSet());
    }
    
    public void remove(int key) {
        mp.remove(key);
    }
    
    public boolean contains(int key) {
        if(mp.containsKey(key)) return true;
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