public class BinaryRecursiveSearch implements Practice03Search {
    @Override
    public String searchName() {
        return "Binary Recursive Search";
    }

    @Override
    public int search(int[] arr, int target) {
        {
            return binaryRecSearch(arr, target, 0, arr.length-1);
        }
    }

    private int binaryRecSearch(int[] arrayz, int target, int low, int upper) {
        if (low > upper) {
            return -1;
        }
        int mid = (low + upper) / 2;

        if (arrayz[mid] == target) {
            return mid;
        } else if (target < arrayz[mid]) {
            return binaryRecSearch(arrayz, target, low, mid - 1);
        } else {
            return binaryRecSearch(arrayz, target, mid + 1, upper);
        }
    }
}
