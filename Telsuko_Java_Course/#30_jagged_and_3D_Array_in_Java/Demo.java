public class Demo {
    public static void main(String[] args) {
        
        // It is called jagged arrary.
        int nums[][] = new int[3][];
        
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
                nums[i][j] = (int)(Math.random() * 10);
        }

        for(int n[]:nums)
        {
            for(int m:n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        // 3D array

        int num3d [][][] = new int[3][4][4];
        
        // assign values to 3d array.
        
        for(int i=0;i<num3d.length;i++)
        {
            for(int j=0;j<num3d[i].length;j++)
            {
                for(int k=0;k<num3d[i][j].length;k++)
                {
                    num3d[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }

        System.out.println();
        // print 3d array values on console.
        for(int n[][]:num3d)
        {
            for(int m[]:n)
            {
                for(int o:m)
                {
                    System.out.print(o + " ");
                }
                System.out.println();
            }
            System.out.println();
        }


    }    
}
