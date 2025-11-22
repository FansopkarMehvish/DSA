import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public int[] twoSumBruteForce(int[] nums, int target) {
        int[] output = new int[2];
        outerLoop:
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 1; j <= nums.length - 1; j++) {
                if(i == j)
                    break; // avoid pairing number with itself
                if (nums[i] + nums[j] == target) {
                    output[0] = i;
                    output[1] = j;
                    break outerLoop; // stop both loops immediately
                }
            }
        }
        return output;
    }

    public int[] twoSumHashmap(int[] nums, int target) {
        int[] output = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= nums.length - 1; i++) {
            if(map.containsKey(target - nums[i])){
                output[0] = i;
                output[1] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i], i);
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        TwoSum twoSumClass = new TwoSum();
        System.out.println(Arrays.toString(twoSumClass.twoSumBruteForce(nums, target)));
        System.out.println(Arrays.toString(twoSumClass.twoSumHashmap(nums, target)));
    }
}
