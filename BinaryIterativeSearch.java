public class BinaryIterativeSearch implements Practice03Search {

    @Override
    public String searchName() {
        return "Binary Iterative Search";
    }

    @Override
    public int search(int[] arr, int target) {
        {
            int low = 0;
            int upper = arr.length - 1;

            while (low < upper) {
                int mid = (low + upper) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    low = mid +1;
                } else {
                    upper = mid - 1;
                }
            }
            return -1;
        }
    }
}
