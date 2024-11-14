public class Queue {
    int SIZE = 5;
    int items[] = new int[SIZE];
    int front, rear;

    Queue() {
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        return front == 0 && rear == SIZE - 1;
    }

    boolean isEmpty() {
        return front == -1;
    }

    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            items[rear] = element;
            System.out.println("Inserted " + element);
        }
    }

    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println(element + " Deleted");
            return element;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index -> " + front);
            System.out.println("Items -> ");
            for (int i = front; i <= rear; i++) {
                System.out.print(items[i] + " ");
            }
            System.out.println("\nRear index -> " + rear);
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.deQueue();
        for (int i = 0; i < 5; i++) {
            q.enQueue(i);
        }
        q.enQueue(6);
        q.display();
        q.deQueue();
        q.display();
    }
}
