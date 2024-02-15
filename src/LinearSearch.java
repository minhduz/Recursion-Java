public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,6};
        int result = linearSearchRecursion(arr,2,0,arr.length-1);
        System.out.println(result);
    }

    private static int linearSearchRecursion(int[] arr, int target, int lo, int up) {
//        if(up == lo ){
//            return arr[lo] == target;
//        }else {
//            return (arr[up]==target) || linearSearchRecursion(arr,target,lo,up-1);
//        }



//        if (index >= arr.length) {
//            return -1;  // Element not found
//        } else if (arr[index] == target) {
//            return index;  // Element found at the current index
//        } else {
//            return linearSearchRecursion(arr,target,index + 1);  // Recursive call to search in the rest of the array
//        }


        if (up == lo) {
            return (arr[up] == target) ? lo : -1;
        } else {
            if(arr[up] == target){
                return up;
            }else {
                return linearSearchRecursion(arr,target,lo,up-1);
            }
        }

    }

    private static int linearSearchDuplicate(int[] arr, int target, int lo, int up){
        if (up == lo) {
            return (arr[up] == target) ? lo : -1;
        } else {
            if(arr[up] == target){
                return up;
            }else {
                return linearSearchRecursion(arr,target,lo,up-1);
            }
        }
    }
}
