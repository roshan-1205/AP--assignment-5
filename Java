# AP--assignment-5
Program to find the largest and smallest elements in an array.
        
        public class FindLargestSmallest {
        public static void main(String[] args) {
    	
        int[] arr = {23, 5, 89, 1, 45, 77, 12};

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
    }
