import java.util.Arrays;
import java.util.Scanner;

public class CountFrequencyofEachElement {

    public static int[] countFrequencyOfEachElement(int[] arr){
        int[] freq = new int[10];
        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i ++){
            arr[i] = sc.nextInt();  // Elements should be in between o to 9
        }

        System.out.println(Arrays.toString(countFrequencyOfEachElement(arr)));
    }
}
