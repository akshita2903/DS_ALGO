package BinaryTree.src.linklist;

public class multplytwoll {
multplytwoll next;
int data;

public long multiplyTwoLists(multplytwoll l1,multplytwoll l2){
    Long ans=0L,ans2=0L,mod=1000000007L;
    while(l1!=null)
    {
        ans=((ans*10)%mod+l1.data);
        l1=l1.next;
    }
     while(l2!=null)
    {
        ans2=((ans2*10)%mod+l2.data);
        l2=l2.next;
    }

    return ((ans%mod)*(ans2%mod))%mod;


}
    } //time->O(n) space->O(1)
