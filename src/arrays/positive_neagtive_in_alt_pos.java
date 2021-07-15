package arrays;

public class positive_neagtive_in_alt_pos {
    void rearrange(int arr[], int n) {
        arrange(arr,n);;
        }
        void rotate(int a[],int to,int from){
            int x=a[from];;
            for(int i=from;i>to;i--){
                a[i]=a[i-1];
              
            }
               a[to]=x;
           
        }
        void arrange(int a[],int n){
            int wi=-1,f=0;
            if(a[0]>=0) f=1;
            for(int i=0;i<n;i++){
                if(wi!=-1){
                    if((a[wi]>=0 && a[i]<0) ||(a[wi]<0 && a[i]>=0))
                    {
                        rotate(a,wi,i);
                        if((i-wi)>=2) wi+=2;
                        else wi=-1;
                    }
                }
             
                    //if it has to be arrange acc to wheter (negative) comes first in array
                 //   or positive in inputs
            //     if(f==0){
                 //only this cndn if given " onlynegative to come first"
            //  if((a[i]>=0 && i%2==0) || (a[i]<0 && i%2==1))
            //     wi=i;
            //     }
                else if(f==1){
                //only this cndn if gicen "only positive to come first"
                  if((a[i]>=0 && i%2==1) || (a[i]<0 && i%2==0))  
                  wi=i;
                }
            }
            }
        }
    
    

//space->O(1) and timr->O(n*n)