/*APPROACH-> Use doublt LL where head.next has most recently used key(MRU) and tail.prev has Least recently
key (LRU);/
//for get use hashmap to get t.c->O(1)
//we used hashmap of dattype int,node => to maintains LRU conditions
//S>C->O(capacity)
 for hashmap and ll*/

class LRUCache {
HashMap<Integer,Node> map;
  Node head,tail;
    int size=0;
    //tail is insertion(MRU) and head is LRU
    public LRUCache(int capacity) {
       this.size=capacity;
        this.map=new HashMap<>();
head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
        size=capacity;
    }
    
    public int get(int key) {
        if(map.size()==0) return -1;
        if(map.containsKey(key)==false) return -1;
        Node add=(Node)map.get(key);
        int value=add.data;
    //since we are using this key to gets it value,so it becomes MRU key,so to maintain LRU property,perform beloe operatons
    
        delete(add);
     
        insert(key,value);
     
        return value;
            
        
        
        
        
        
    }
    
    public void put(int key, int value) {
        //remove already present key,so that it can be made as MRU
if(map.containsKey(key))
{
    delete((Node)map.get(key));
 
}
        if(map.size()==size) //when capacity reached(duplicates is removed already)
        {
            delete(tail.prev); //remove LRU key isf cache is full(condn given already in ques)
          
        }
        insert(key,value); //now insert key (need not to care for property of LRU as it been checked in above steps)
        
        
    }
    //delete node from doubly ll
    void delete(Node x){
map.remove(x.key);

        x.prev.next=x.next;
                x.next.prev=x.prev;
    }
    void insert(int key,int value)
    {
        
        Node y=new Node(key,value);
       

        y.next=head.next;
        y.next.prev=y;
                head.next=y;
        y.prev=head;
 map.put(key,y);
        
        
    }
    
}
class Node{
    Node next,prev;
    int key,data;
    Node(){
        this.next=this.prev=null;
    }
    Node(int key,int data){
        this.prev=this.next=null;
        this.data=data;
        this.key=key;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
