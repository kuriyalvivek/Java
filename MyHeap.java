public class MyHeap {
    int heap [];
    int heapsize;
    int heapCapacity;

    MyHeap(int arr[]){
        heap=arr;
        heapCapacity=heap.length;
        heapsize=heap.length;
    }
    public void swap(int val1,int val2){
        int t=heap[val1];
        heap[val1]=heap[val2];
        heap[val2]=t;
    }
    public void printHeap(){
        for(int i =0;i<heapsize;i++){
            System.out.print(heap[i]+",");
        }
    }
    public void maxHeapify(int i){
        int largest=i;
        int lc=i*2+1;
        int rc=i*2+2;
        if (lc<heapsize && heap[lc]>heap[largest]){
            largest=lc;
        }
        if (rc<heapsize && heap[largest]<heap[rc]){
            largest=rc;
        }

        if(largest!=i){
            swap(i,largest);
            maxHeapify(largest);
        }

    }
    public void minHeapify1(int i){
        int min=i;
        int lc=i*2+1;
        int rc=i*2+2;
        if (lc<heapsize && heap[lc]<heap[min]){
            min=lc;
        }
        if (rc<heapsize && heap[rc]<heap[min]){
            min=rc;
        }

        if(min!=i){
            swap(i,min);
            minHeapify1(min);
        }

    }
    public void minHeapify2(int i){
            
        int min_element;
        while( (2*i+1) < heapsize ) {  // left child exits and also present in the range
            min_element = heap[i];
            min_element = Math.min( min_element, heap[2*i+1] );
            if( (2*i+2) < heapsize) {
                min_element = Math.min( min_element, heap[2*i+2] );
            }
            if( min_element == heap[i] ) { // parent itself is minimum..so no need to heapify()
               break;
            }
            else if( min_element == heap[2*i+1] ) {    // left child is minimum...so swap it with parent
                swap(i, 2*i+1 );
                i = 2*i+1;
            }
            else if( (2*i+2 < heapsize) && (min_element == heap[2*i+2] )) {  
                // right child is minimum...so swap it with parent
                swap( i, 2*i+2 );
                i = 2*i+2;
            }
        }

    }
    public void buildHeap(){
        //last nonleafe node is (n/2)-1;
        for(int i =heapsize/2-1; i>=0;i--){
            minHeapify1(i);
        }
    }
    public static void main(String[] args) {
        int [] arr = new int[]{5, 13, -2, 11, 27, 31, 0, 19};
        MyHeap h1 = new MyHeap(arr);
        h1.buildHeap();
        h1.printHeap();
    }
}
