class MyHashMap {
    private HashMap<Integer, Integer> mp;

    public MyHashMap() {
        mp = new HashMap<>();
    }

    public void put(int key, int value) {
        mp.put(key, value);
    }

    public int get(int key) {
        return mp.getOrDefault(key, -1);
    }

    public void remove(int key) {
        // Remove the key-value pair if it exists
        mp.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */