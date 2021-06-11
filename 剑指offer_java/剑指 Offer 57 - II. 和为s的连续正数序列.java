class Solution {
    public int[][] findContinuousSequence(int target) {
        List<int[]> vec=new ArrayList<int[]>();
        for(int l=1,r=2;l<r;){
            int sum=(l+r)*(r-l+1)/2;
            if(sum==target){
                int[] res=new int[r-l+1];
                for(int i=l;i<=r;i++){
                    res[i-l]=i;
                }
                vec.add(res);
                l++;
            }else if(sum<target) r++;
            else l++;
        }
        return vec.toArray(new int[vec.size()][]);
    }

}
