package Queue_LinkedList;

import java.util.LinkedList;

class FIFOQUEUE implements IQueuable {
    private LinkedList<String> fifoqueue;

    // Initiating linked-list
    FIFOQUEUE() {
        fifoqueue = new LinkedList<>();
    }

    //public String[] enqueue(String value) {
    public void enqueue(String value) {
        // Adding it to the tail of the queue
        fifoqueue.addLast(value);
    }

    public String dequeue() {
        // If queue is empty, throw exception
        if (fifoqueue.isEmpty()){
            throw new IllegalStateException("Empty Queue.");
        }
        // Removing the head of the queue
        return fifoqueue.removeFirst();
    }

    public String[] getQueue() {
        // Converting linked-list to array
        String[] arr = new String[fifoqueue.size()];
        return fifoqueue.toArray(arr);
    }

    public int size() {
        return fifoqueue.size();
    }
}