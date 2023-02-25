package Queue_LinkedList;

import java.util.LinkedList;

class LIFOQUEUE implements IQueuable {
    private LinkedList<String> lifoqueue;

    // Initiating linked-list
    LIFOQUEUE() {
        lifoqueue = new LinkedList<>();
    }

    // public String[] enqueue(String value) {
    public void enqueue(String value){
        // Adding it to the head of the queue
        lifoqueue.addFirst(value);
    }

    public String dequeue() {
        // If queue is empty, throw exception
        if (lifoqueue.isEmpty()){
            throw new IllegalStateException("Empty Queue.");
        }
        // Removing the head of the queue
        return lifoqueue.removeFirst();
    }

    public String[] getQueue() {
        // Converting linked-list to array
        String[] arr = new String[lifoqueue.size()];
        return lifoqueue.toArray(arr);
    }

    public int size() {
        return lifoqueue.size();
    }
}