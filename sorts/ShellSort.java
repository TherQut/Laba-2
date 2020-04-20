package sorts;

import sorts.AbstractSort;

public class ShellSort extends AbstractSort {
    public String sortName;

    public ShellSort() {
        this.sortName = "ShellSort";
    }

    public ShellSort(String sortName) {
        this.sortName = sortName;
    }

    @Override
    public void sort(Comparable[] a) {
        int n = a.length;
        int h = 1;
        while (h<n/3) {
            h = 3*h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && less(a[j], a[j-h]); j-=h) {
                    exch(a, j, j-h);
                }
            }
            h = h/3;
        }
    }
    public void sort(Comparable[] a, int n) {
        int h = 1;
        while (h<n/3) {
            h = 3*h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && less(a[j], a[j-h]); j-=h) {
                    exch(a, j, j-h);
                }
            }
            h = h/3;
        }
    }

    @Override
    public String toString() {
        return sortName;
    }
}
