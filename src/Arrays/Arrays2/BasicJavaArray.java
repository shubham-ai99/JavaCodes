package Arrays.Arrays2;

public class BasicJavaArray {


    static void findEvenOdd(int[] arr){

        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2==0){
                System.out.println("Even : "+ arr[i]);
            }else
                System.out.println("Odd : "+ arr[i]);
        }
    }


    static void maxMinNumber(int[] arr){
        int min = arr[0];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }else if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("max: " + max + " Min: "+ min);
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 3, 9, 8, 7};
        maxMinNumber(arr);
        findEvenOdd(arr);
    }
}