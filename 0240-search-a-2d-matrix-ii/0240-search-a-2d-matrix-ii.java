class Solution {
    // public int bs(int[] arr,int target){
    //     int low=0;
    //     int high=arr.length-1;
    //     while(low<=high){
    //         int mid=(low+high)/2;
    //         if(arr[mid]==target){
    //             return mid;
    //         }
    //         else if(arr[mid]<target){
    //             low=mid+1;
    //         }
    //         else{
    //             high=mid-1;
    //         }
    //     }
    //     return -1;
    // }    
    public boolean searchMatrix(int[][] matrix, int target) {
    //     for(int i=0;i<matrix.length;i++){
    //         int idx=bs(matrix[i], target);
    //         if(idx!=-1){
    //             return true;
    //         }
    //     }
    int n=matrix.length;
    int m=matrix[0].length;
    int row=0; int col=m-1;
    while(row<n && col>=0){
        if(matrix[row][col]==target){
            return true;
        }
        else if(matrix[row][col]<target){
            row++;
        }
        else{
            col--;
        }
    }
        return false;
    }
}