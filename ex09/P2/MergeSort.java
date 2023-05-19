public class MergeSort implements Strategy {
    @Override
    public void sort(int[] a) {
        mergeSort(a, 0, a.length - 1);
    }

    private void mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);
            merge(a, left, mid, right);
        }
    }

    private void merge(int[] a, int left, int mid, int right) {
        int[] temp = new int[a.length];
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (a[i] <= a[j]) {
                temp[k] = a[i];
                i++;
            } else {
                temp[k] = a[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = a[i];
            i++;
            k++;
        }

        while (j <= right) {
            temp[k] = a[j];
            j++;
            k++;
        }

        for (k = left; k <= right; k++) {
            a[k] = temp[k];
        }
    }
}
