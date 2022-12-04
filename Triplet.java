/* Given an integer array nums, return all the triplets [nums[i], nums[j],  nums[k]] such that
 i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 Notice that the solution set must not contain duplicate triplets.*/

 import java.util.*;

 public class Triplet{
     public static void find(int array[]){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                for(int k=j+1;k<array.length;k++){
                    if(array[i]+array[j]+array[k]==0){
                        System.out.print("["+array[i]+" "+array[j]+" "+array[k]+"]");
                        
                    }
                }
            }
        }
    
     }
    public static void main(String[] args) {
        int nums[] = {-1, 3,  1, 2, -1, -4};
       find(nums);
    }
 }