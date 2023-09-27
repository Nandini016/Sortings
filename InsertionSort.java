public class InsertionSort {

    public static void InsertSort(int nums[]){
        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            int prev =i-1;

            while(prev>=0 && nums[prev]>curr){
                nums[prev+1] = nums[prev];
                prev--; 
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
          int nums[] ={1,3,2,4,6,5};
          InsertSort(nums);
          PrintNums(nums);
    }
    
}
