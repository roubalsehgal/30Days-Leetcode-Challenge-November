// Wasn't able to solve this

class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> set = new HashSet();
        set.add(ds(p1, p2));
        set.add(ds(p1, p3));
        set.add(ds(p1, p4));
        set.add(ds(p2, p3));
        set.add(ds(p2, p4));
        set.add(ds(p3, p4));
        return !set.contains(0) && set.size() == 2;
    }
    
	// distance square method
    private int ds(int[] a, int[] b) {
        return (a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]);
    }
}