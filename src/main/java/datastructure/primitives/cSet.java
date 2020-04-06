package datastructure.primitives;//package data_structure;
//
//public class cSet {
//    private Object[] elements;
//
//
//    public cSet() {
//    }
//
//    public cSet(Object... os) {
//        this.elements = os;
//    }
//
//    public void add(Object o) {
//        if (isUnique(o, this)) {
//            System.arraycopy(elements, 0, elements, elements.length - 1, elements.length + 1);
//            elements[elements.length - 1] = o;
//        }
//    }
//
//    public Object[] values() {
//        return elements;
//    }
//
//    public boolean isUnique(Object o) {
//        return isUnique(o, this);
//    }
//
//    private boolean isUnique(Object o, cSet set) {
//        for (Object el : set.values())
//            if (el.equals(o))
//                return false;
//        return true;
//    }
//
//    public cSet union(cSet candidate) {
//        int size = elements.length;
//        int subsetSize = candidate.size();
//        if (size >= subsetSize) return merge(this, candidate);
//        else return merge(candidate, this);
//    }
//
//    private cSet merge(cSet s1, cSet s2) {
//        int duplicate = 0;
//        Object[] sv1 = s1.values();
//        Object[] sv2 = s2.values();
//
//        for (Object o : sv1)
//            if (!isUnique(o, s2))
//                duplicates[duplicate++] = o;
//
//        int resSize = s1.size() + s2.size() - (duplicate * 2);
//        if (resSize > 0) {
//            Object[] result = new Object[resSize];
//            for (int i = 0; i < sv1.length; i++) {
//                if
//                result[i] = sv2[i];
//
//            }
//
//            return new cSet(result);
//        } else
//            return null;
//
//    }
//
//    private int[][] createDuplicateIndexMatrix(cSet s1, cSet s2) {
//        int dupN = 0;
//        for (Object o : s1.values())
//            if (!isUnique(o, s2))
//                dupN++;
//
//        int[][] dup = new int[dupN][dupN];
//        int[] dup1 = new int[dupN];
//        int[] dup2 = new int[dupN];
//
//        for (int i = 0, k = 0; i < s1.values().length; i++) {
//            if (!isUnique(s1.values()[i], s2)) {
//                dup1[k] = i;
//                k++;
//            }
//        }
//        for (int i = 0, k = 0; i < s2.values().length; i++) {
//            if (!isUnique(s2.values()[i], s1)) {
//                dup2[k] = i;
//                k++;
//            }
//        }
//
//        for (int i = 0; i < dupN; i++) {
//            dup[i][0] = dup1[i];
//            dup[i][1] = dup2[i];
//        }
//
//        return dup;
//    }
//
//    public cSet intersection(cSet candidate) {
//        if (size() >= candidate.size()) return intersection(this, candidate);
//        else return intersection(candidate, this);
//    }
//
//    private cSet intersection(cSet s1, cSet s2) {
//        cSet result;
//        Object[] sv1 = s1.values();
//        Object[] sv2 = s2.values();
//        int[][] dups = createDuplicateIndexMatrix(s1, s2);
//        int dupSize = dups.length * 2;
//
//        Object[] res = new Object[sv1.length + sv2.length - dupSize];
//
//        for (int f = 0, s = sv2.length - 1, d = 0; f < s1.size(); f++, s--) {
//            if ((f == dups[d][0] || f == dups[d][1]) && (s == dups[d][0] || s == dups[d][1])) {
//                // ????
//                d++;
//
//            } else {
//                res[f] = sv1[f];
//                res[s] = sv2[s];
//            }
//        }
//
//        return result = new cSet(res);
//    }
//
//    public cSet difference(cSet candidate) {
//
//
//    }
//
//    public cSet merge(cSet candidate) {
//
//
//    }
//
//    public int size() {
//        return elements.length;
//    }
//}
