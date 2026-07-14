package leetcode;

public class DequeueTest {
        public static void main(String[] args) {
            DeQueue deQueue = new DeQueue(5);
            deQueue.insertRear(20);
            deQueue.insertRear(80);
            deQueue.insertFront(1000);
            deQueue.insertFront(600);
            deQueue.insertRear(1400);
            deQueue.display();

            System.out.println("size : "+deQueue.size());
            System.out.println("rear data: "+deQueue.getRear());
            System.out.println("front data: "+deQueue.getFront());

            deQueue.deleteFront();
            deQueue.deleteRear();

            deQueue.display();

        }
    }

