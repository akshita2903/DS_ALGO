package heap;
import java.util.*;
public class rearrange_string_with_no_same_adjacent_char {
    class Solution {
        public String reorganizeString(String s) {
          return organising(s,s.length());
            
        }
      String organising(String x,int n)
      {
        if(n==1) return x;
      int freq[]=new int[26];
        char ch[]=new char[n];
        //if a char is occurig>(n+1)/2 it is impossible to Rearrange string
        //for ex->aaabb freq[a]=3 freq[b]=2
        //3>(5+1)/2->(3>3) false so rearranged string is ababa
        //if s="aaaabb" f[a]=4 f[b]=2 4>(3) true not pissible any rearrangement

        count_freq(x,freq); //stroing freq of each char of string
      char maxoc=find_char(freq,26); //find char with max freq(occurence)
        int count=freq[maxoc-'a']; //getting max_freq char
        int index=0;

        //chk if count of max_freq char exceeds the haf of len of string 
        //if(yes)->impossible to rearrange the string given
        if(count>(n+1)/2) return "";
        else{

        //  if possible then storing max_freq char at even index
          while(count!=0){
            ch[index]=maxoc;
            index+=2;
            count--;
          }
           freq[maxoc-'a']=0; //setting the freq of max_freq char=0 after putting it in string
          //filling the remaining char having fre!=0 and fre<max_freq
          
        for(int i=0;i<26;i++){
          while(freq[i]!=0)
          {
            //chk if max_freq char has already been filled till last or not 
            //if yes set inex t 1 to fill at char at odd index
            //else start fill from that index only
            index=(index>=n)?1:index;
            ch[index]=(char)(i+97);
            index+=2;
            freq[i]--;
          }
        }
          String res=String.valueOf(ch);
          return res;
        }
        
          
      }
    //func to count ffreq of each char of string
      void count_freq(String x,int f[]){
        for(int i=0;i<x.length();i++)
          f[x.charAt(i)-'a']++;
      }
      char find_char(int f[],int n)
      {
        char ans='\0'; int max=0;
        for(int i=0;i<n;i++)
        {
          if(max<f[i]){
            max=f[i];
            ans=(char)(i+97);
          }
        }
        return ans;
        
      }
     
      int max(int a,int b)
      {
        return(a>=b)?a:b;
      }
    }
    
}
