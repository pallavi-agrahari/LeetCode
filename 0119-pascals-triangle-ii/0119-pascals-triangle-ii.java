class Solution {
    
    
    public List<Integer> getRow(int rowIndex) {
        int ans=1;
        List<Integer> ansRow=new LinkedList<>();
        ansRow.add(1);
        for(int col=1;col<=rowIndex;col++){
            for(int j=ansRow.size()-1;j>0;j--){
            // ans=ans*(rowIndex-col);
            // ans=ans/col;
            ansRow.set(j, ansRow.get(j) + ansRow.get(j - 1));
            
            }
            // ansRow.add(ans);
            ansRow.add(1);
        }
        return ansRow;
    }
}