public class BinarySearch {
    static int binarySearch(int [] array, int value) {
        int lowItem = 0;
        int highItem = array.length - 1;
        int count = 0;
        while (lowItem <= highItem) {
            count++;
            int middleItem = (lowItem + highItem) / 2;
            int x = array[middleItem];

            if (x == value) {
                System.out.println("Number of loop => " + count );
                return x;
            }
            if (x < value) {
                lowItem = middleItem + 1;
            }
            else{
                highItem = middleItem - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,13,15,17,19,30,56};
        int value = BinarySearch.binarySearch(array, 17);
        if (value == -1) {
            System.out.println("Element not present");
        }else{
            System.out.println("Element found. Index = " + value);
        }
    }
}
