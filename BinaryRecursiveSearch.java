//JD
public class BinaryRecursiveSearch implements Practice03Search {
    @Override
    public String searchName() {
        return "binary-recursive";
    }

    @Override
    public int search(int[] arr, int target) {
        {
            return binaryRecSearch(arr, target, 0, arr.length-1);
        }
    }

    private int binaryRecSearch(int[] arr, int target, int low, int upper) {
        if (low > upper) {
            return -1;
        }
        int mid = (low + upper) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (target < arr[mid]) {
            return binaryRecSearch(arr, target, low, mid - 1);
        } else {
            return binaryRecSearch(arr, target, mid + 1, upper);
        }
    }
}
