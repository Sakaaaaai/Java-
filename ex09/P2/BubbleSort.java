public class BubbleSort implements Strategy{
    public void sort(int[] a){
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < a.length; i++) {
                if (a[i-1] > a[i]) {
                    int w = a[i];
                    a[i] = a[i-1];
                    a[i-1] = w;
                    flag = true;
                }
            }
        }
    }
}