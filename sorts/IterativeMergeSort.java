package sorts;

import sorts.AbstractSort;

public class IterativeMergeSort extends AbstractSort {
    private static Comparable[] aux;

    public String sortName;

    public IterativeMergeSort() {
        this.sortName = "IterativeMergeSort";
    }

    public IterativeMergeSort(String sortName) {
        this.sortName = sortName;
    }

    @Override
    public void sort(Comparable[] a) {
        int n = a.length;
        aux = new Comparable[n];
        for (int sz = 1; sz < n; sz = sz*2) {
            for (int lo = 0; lo < n-sz; lo += sz*2) {
                merge(a, lo, lo+sz-1,Math.min(lo+sz*2-1,n-1));
            }
        }
    }

    private static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {
            if (i>mid) a[k] = aux[j++];
            else if (j>hi) a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }

    @Override
    public String toString() {
        return sortName;
    }
}
