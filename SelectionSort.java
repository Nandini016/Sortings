public class SelectionSort {
    public static void selectionsort(int nums[]){
        int n= nums.length;
        for(int i=0;i<n-1;i++){
            int minPose=i;
            for(int j=i+1;j<n;j++){
                if(nums[minPose]>nums[j]){
                    minPose=j;
                }
            }
            int temp=nums[minPose];
            nums[minPose] = nums[i];
            nums[i] = temp;
        }
    }
     public static void PrintArr(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
     }

    public static void main(String args[])
    {
        int nums[]={2,5,7,6};
        selectionsort(nums);
        PrintArr(nums);

    }
    
}
