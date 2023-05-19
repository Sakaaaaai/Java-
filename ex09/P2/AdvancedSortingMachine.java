public class AdvancedSortingMachine extends SortingMachine {
    private long executionTime;

    public AdvancedSortingMachine(Strategy strategy) {
        super(strategy);
    }

    @Override
    public void sort(int[] data) {
        long startTime = System.currentTimeMillis();
        super.sort(data);
        long endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
    }

    public long getExecutionTime() {
        return executionTime;
    }
}
