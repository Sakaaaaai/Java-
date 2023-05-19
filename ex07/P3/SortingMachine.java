class SortingMachine {
    public void sort(Relatable[] p) {
        Relatable tmp;
        for (int i = 0; i < p.length - 1; i++) {
            for (int j = i + 1; j < p.length; j++) {
                if (p[i].isSmallerThan(p[j])) {
                    continue;
                } else {
                    tmp = p[i];
                    p[i] = p[j];
                    p[j] = tmp;
                }
            }
        }
    }
}