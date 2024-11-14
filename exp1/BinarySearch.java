public class BinarySearch {
    int binary(int a[], int s) {
        int i = 0, r = a.length - 1;
        while (i <= r) {
            int mid = (i + r) / 2;
            if (a[mid] == s) {
                return mid;
            } else if (a[mid] < s) {
                i = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        BinarySearch bs = new BinarySearch();
        int a[] = {1, 2, 3, 7, 8, 10};
        int s = 7;
        int result = bs.binary(a, s);
        if (result != -1) {
            System.out.println("The element is found at index " + result);
        } else {
            System.out.println("The element is not found");
        }
    }
}
