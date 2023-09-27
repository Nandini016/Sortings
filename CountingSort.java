public class CountingSort {
    public static void countsort(int nums[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            largest = Math.max(largest ,nums[i]);
        }
        int count[] =new int [largest+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
              int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                nums[j] =i;
                j++;
                count[i]--;
            }
        }
    }
    public static void PrintNums(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        int nums[]={1,4,2,4,3,4,3,6,1,5,6};
        countsort(nums);
        PrintNums(nums);

    }
    
}
