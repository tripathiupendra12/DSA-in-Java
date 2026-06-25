public class CircularQueue {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        public Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear+1) % size == front;
        }

        //add
        public void add(int data) { //O(1)
            if(isFull()) {
                System.out.println("Queue is full");
                return;
            }

            if(front == -1) { //add 1st element
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        //remove
        public int remove() { //O(1)
            if(isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            int res = arr[front];
            if(rear == front) {
                front = rear = -1;
            } else {
            front = (front + 1) % size;
            }
            return res;
        }

        //peek
        public int peek() {
            if(isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3); //1 2 3 
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);


        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}