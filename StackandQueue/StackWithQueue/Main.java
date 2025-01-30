package StackandQueue.StackWithQueue;

public class Main {
    public static void main(String[] args) {
        StackWithQueue queue = new StackWithQueue();
        queue.enqueue(12);
        queue.enqueue(654);
        queue.enqueue(65);
        queue.enqueue(78);
        queue.enqueue(89);
        queue.enqueue(45);
        System.out.println("Peek Element:"+queue.peek());
        queue.enqueue(69);
        System.out.println("dequeue element: "+queue.dequeue());
        System.out.println("dequeue element: "+queue.dequeue());
        System.out.println("dequeue element: "+queue.dequeue());
        System.out.println("Peek Element:"+queue.peek());
        //Here queue is not empty
        if(queue.isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            System.out.println("Queue is not Empty");
        }
        //Empty the queue
        while(!queue.isEmpty()){
            System.out.println("dequeue element: "+queue.dequeue());
        }
        //Checking if queue is empty or not
        if(queue.isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            System.out.println("Queue is not Empty");
        }
    }
}
