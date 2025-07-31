public class queue{
    int size = 5;
    int myqueue [] = new int[size];
    int front = -1;
    int rear = -1;

    public void enqueue(int value){
        if(!isFull()){
            rear++;
            myqueue[rear] = value;
            System.out.println("Enqueued: " + value);
        } else {
            System.out.println("Queue is full, cannot enqueue " + value);
        }
    }

    public void dequeue(){
        if(!isEmpty()){
            front++;
            int de_queuedvalue = myqueue[front];
            System.out.println("Dequeued: " + de_queuedvalue);
        } else {
            System.out.println("Queue is empty, cannot dequeue");
        }
    }

    public boolean isEmpty(){
        if(rear == -1 && front == -1){
            return true;
        } else if(rear <= front){
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull(){
        if(rear +1 == size){
            return true;
        } else {
            return false;
        }
    }
}