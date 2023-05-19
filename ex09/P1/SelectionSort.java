public class SelectionSort implements Strategy{
    public void sort(int[] a){
        for (int s = 0; s < a.length - 1; s++) {
                int pos = s; 
                for (int i = s + 1; i < a.length; i++) {
                    if (a[i] < a[pos]) {
                        pos = i;
                    }
                }
                int w = a[s];
                a[s] = a[pos];
                a[pos] = w; 
        }
    }
}