public class Queue {
    int[] queue = new int[5];
    int size;
    int front;
    int rear;


    public void enqueue(int data){
        if(!isFull()) {

            queue[rear] = data;
            rear++;
            size++;
        }
        else{
            System.out.println("Its Full");
        }
    }
    public void dequeue(){
        if(!isEmpty()) {
            front++;
            size--;
        }
        else{
            System.out.println("Its empty");
        }
    }

    public int getSize(){
        return size;
    }
    public boolean isFull(){
        return getSize()== queue.length;
    }
    public boolean isEmpty(){
        return getSize() == 0;
    }

    public void show(){
        for (int i =0;i < size; i++){
            System.out.print(queue[front+i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(11);
        q.enqueue(12);
        q.enqueue(13);
       q.enqueue(14);
        System.out.println(q.getSize());
        System.out.println(q.isFull());
        System.out.println(q.isEmpty());
        q.show();
     q.enqueue(15);
        q.dequeue();
        q.show();
        q.dequeue();
        q.show();




    }
}


