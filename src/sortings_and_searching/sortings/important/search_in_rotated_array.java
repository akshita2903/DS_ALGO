class search_in_rotated_array{
  
  
   public int search(int[] a, int t) {
      int p=findpivot(a);
        if(p==-1)
            return search(a,t,0,a.length-1);
        if(a[p]==t) return p;
int f=search(a,t,0,p-1);
        if(f!=-1) return f;
        return search(a,t,p+1,a.length-1);
}
    int search(int[] a,int t,int s,int e){
        while(s<=e){
            int m=s+(e-s)/2;
            if(a[m]<t) s=m+1;
            if(a[m]>t) e=m-1;
            if(a[m]==t) return m;
        }
        return -1;
    }
    int max(int a,int b){
        return (a>=b)?a:b;
    }
      
    int findpivot(int[] a){
        int s=0,e=a.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(m<e && a[m]>a[m+1])
                return m;
            if(m>s && a[m-1]>a[m])
                return m-1;
            if(a[s]>=a[m]) e=m-1;
            if(a[s]<a[m]) s=m+1;
        }
        return -1;
    }
  
  
  
  
  
  
}
