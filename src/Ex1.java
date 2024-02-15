public class Ex1 {
    static int max = 0;
    public static void main(String[] args) {
        int[] arr = {2,5,-3,10,4,6,2,9,8};

        int[] maxAndMin = findMaxRecursion(arr,0,arr.length-1);

        System.out.println("Maximum value = " + arr[maxAndMin[0]]);
        System.out.println("Minimum value = " + arr[maxAndMin[1]]);

        int n = 10;
        long[] mem = new long[n+1];
        System.out.println(fibMem(n,mem));
    }

    private static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    private static int[] findMaxRecursion(int[] arr, int first, int last) {
        if(first == last){
            return new int[] {last,last};
        }else {
            int[] x = findMaxRecursion(arr,first,last-1);
            int idMax = (arr[x[0]] > arr[last]) ? x[0] : last;
            int idMin = (arr[x[1]] < arr[last]) ? x[1] : last;
            return new int[] {idMax,idMin};
        }
    }

    /*
    T(n) = T(n-1) + c (c: số phép tính trong 1 lần đệ quy)
         = T(n-2) + 2 * c
         = T(n-3) + 3 * c
         ......
         = T(n-(n-1) + (n-1) * c
         = T(1) + (n-1)
         = c + (n-1) * c
         = n * c
     */
    private static int tinhRec(int n){
        if(n==1){
            return 1;
        }else {
            return tinhRec(n-1) + n;
        }
    }


    /*
    T(n) , n = end - start
    T(n) = T(n-2) + 1*c
         = T(n-4) + 2*c
         = T(n-6) + 3*c
         ...
         = T(n-n) + n/2 * c
         = c + n/2 * c
         = (n/2+1) * c

     */
    private static int tinh(int start, int end){
        if(start == end){
            return end;
        }else {
            return tinh(start + 2,end) + start;
        }
    }


    public static int fib(int n){
        if(n <= 2) return 1;
        return fib(n-1) + fib(n-2);
    }

    //memorization technique -> O(n)
    private static long fibMem(int n, long[] mem){
        if(n<=2){
            mem[n] = 1;
        }else {
            if(mem[n]==0){
                mem[n] = fibMem(n-1,mem) + fibMem(n-2,mem);
            }
        }
        return mem[n];
    }

    //Space complexity

    int sum(int n){
        int i,sum=0;
        for (i = 0; i < n; i++) {
            sum=sum+i;
        }
        return sum;
    }
    /*
    Input space: ont variable n of type int - 4 bytes
    Auxiliary space: two variables (i,sum) of type int - 8 byte

    It takes a constant space 12 byte
    Space complexities

     */

}