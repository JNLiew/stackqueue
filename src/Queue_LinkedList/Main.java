package Queue_LinkedList;

class Main {
    public static void main (String[] args){
        // Testing fifoqueue
        FIFOQUEUE fifoqueue = new FIFOQUEUE();

        fifoqueue.enqueue("A");
        fifoqueue.enqueue("B");
        fifoqueue.enqueue("C");
        fifoqueue.enqueue("D");
        fifoqueue.enqueue("E");
        fifoqueue.enqueue("F");

        System.out.println("FIFO queue size: " + fifoqueue.size());

        // Dequeue and print all items in the queue
        while (fifoqueue.size() > 0) {
            String item_fifo = fifoqueue.dequeue();
            System.out.println("FIFOQueue item: " + item_fifo);
        }

        // Testing lifo queue
        LIFOQUEUE lifoqueue = new LIFOQUEUE();

        lifoqueue.enqueue("A");
        lifoqueue.enqueue("B");
        lifoqueue.enqueue("C");
        lifoqueue.enqueue("D");
        lifoqueue.enqueue("E");
        lifoqueue.enqueue("F");

        System.out.println("LIFO queue size: " + lifoqueue.size());

        // Dequeue and print all items in the queue
        while (lifoqueue.size() > 0) {
            String item_lifo = lifoqueue.dequeue();
            System.out.println("LIFOQueue item: " + item_lifo);
        }
    }
}
