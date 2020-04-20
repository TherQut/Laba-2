package sorts;

public class SelectSort extends AbstractSort{
    public String sortName;

    public SelectSort() {
        this.sortName = "SelectSort";
    }

    public SelectSort(String sortName) {
        this.sortName = sortName;
    }

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i+1; j < N; j++) {
               if (less(a[j], a[min])) min = j;
            }
            exch(a, i, min);
        }
    }

    @Override
    public String toString() {
        return sortName;
    }
}
