import java.util.Scanner;

public class CountElementsGreaterThanX {

    public static int countElementsGreaterThanX(int[] arr, int x){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(countElementsGreaterThanX(arr, x));
    }
}
