class Solution {
    public int maxElement(int[][] arr,int n,int m, int col ){
        int max=-1;
        int index=-1;
        for(int i=0;i<n;i++){
            if(arr[i][col]>max){
                max=arr[i][col];
                index=i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        int ans[]=new int[2];
        Arrays.fill(ans,-1);
        int n= mat.length;
        int m=mat[0].length;
        int low=0;
        int high=m-1;
        while(low<=high){
            int mid=(low+high)/2;
            int maxRow= maxElement(mat,n,m,mid);
            int left=mid-1>=0?mat[maxRow][mid-1]:-1;
            int right=mid+1<m?mat[maxRow][mid+1]:-1;
            if(mat[maxRow][mid]>left && mat[maxRow][mid]>right){
                ans[0]=maxRow;
                ans[1]=mid;
                return ans;
            }
            else if(mat[maxRow][mid]<left){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}