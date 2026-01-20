import java.util.Scanner;

public class CheckIfArrayContainsDuplicate {

    public static boolean checkIfArrayContainsDuplicate(int[] arr){
        int[] freq = new int[10];
        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
            if(freq[arr[i]] > 1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();  // Elements should be in between o to 9
        }
        System.out.println(checkIfArrayContainsDuplicate(arr));
    }
}
