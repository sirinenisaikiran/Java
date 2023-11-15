public class Demo {
    public static void main(String[] args) {
        
        int nums[] = new int[4];

        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;

        // for(int i=0;i<nums.length;i++)
        // {
        //     System.out.println(nums[i]);
        // }

        for(int n : nums)
        {
            System.out.println(n);
        }

    }
}
