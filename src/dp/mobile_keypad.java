package dp;
class mobile_keypad{
    public long getCount(int N)
	{
		int[][] key=new int[10][];
		//neighbours of button pressed
		key[0]=new int[]{0,8};
		key[1]=new int[]{1,2,4};
		key[2]=new int[]{2,1,3,5}; 
		key[3]=new int[]{3,2,6};
		key[4]=new int[]{4,5,1,7};
		key[5]=new int[]{5,4,6,2,8};
		key[6]=new int[]{6,5,3,9};
		key[7]=new int[]{7,8,4};
		key[8]=new int[]{8,0,5,7,9};
		key[9]=new int[]{9,6,8};
		long[] dp=new long[10];
		Arrays.fill(dp,1L);
		for(int i=2;i<=N;i++){
		    long[] count=new long[10];
		    for(int j=0;j<=9;j++)  //press from 0-9
		    for(int k:key[j]) //possible combo
		    count[j]+=dp[k];
		    dp=count;
		}
		long ans=0L;
		for(long x:dp) ans+=x;
		return ans;
}