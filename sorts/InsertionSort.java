package sorts;

public class InsertionSort extends AbstractSort{
    public String sortName;

    public InsertionSort() {
        this.sortName = "InsertionSort";
    }


    public InsertionSort(String sortName) {
        this.sortName = sortName;
    }

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
                exch(a, j, j-1);
            }
        }
    }

    @Override
    public String toString() {
        return sortName;
    }
}
