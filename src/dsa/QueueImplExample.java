package dsa;

public class QueueImplExample {
    public static void main(String[] args) {
        
    }
}

class Queue{
    int capacity;
    int size;
    int[] array;

    public Queue(int capacity){
        this.size = 0;
        this.capacity = capacity;
        this.array = new int[capacity];
    }

    public void pushElement(int element){
        if(!isQueueFull()){
            array[size] = element;
            size++;
        } else {
            System.out.println("Queue capacity is full..");
        }
    }

    public void popElement(){
        if(!isQueueFull()){
            for(int i = 0; i < size - 1; i++){
                array[i] = array[i + 1];
            }
        }else{
            System.out.println("Queue capacity is full..");
        }
    }

    private boolean isQueueFull(){
        return (capacity == size);
    }
}
