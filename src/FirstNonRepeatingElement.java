import java.util.Scanner;

public class FirstNonRepeatingElement {

    public static int firstNonRepeatingElement(int[] arr){
        int[] freq = new int[10];
        int firstNonRepeatingElement = -1;
        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }
        for(int j = 0; j < freq.length; j++){
            if(freq[j] == 1){
                firstNonRepeatingElement = j;
                break;
            }
        }
        return firstNonRepeatingElement;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();  // Elements should be in between o to 9
        }
        System.out.println(firstNonRepeatingElement(arr));
    }
}
