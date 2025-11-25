import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> uniqueNums = new HashSet<>();
        for(int num : nums){
            if(uniqueNums.contains(num)){
                return true;
            }else {
                uniqueNums.add(num);
            }
        }
       return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = sc.nextInt();
        }
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.containsDuplicate(nums));
    }
}
