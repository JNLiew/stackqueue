package Queue_Array;

import java.util.ArrayList;
import java.util.List;

public class LIFOQUEUE implements IQueuable {
    private List<String> queue;

    // Initialize arraylist
    LIFOQUEUE(){
        this.queue = new ArrayList<>();
    }

    // Adding 'value' to the start of the queue
    public String[] enqueue(String value) {
        this.queue.add(0, value);
        return this.getQueue();
    }

    // Since it is FIFO, we remove the first 'value' of the queue
    public String dequeue() {
        // Removing index = 0
        return this.queue.remove(0);
    }

    @Override
    public String[] getQueue(){
        return this.queue.toArray(new String[0]);
    }

    public int size() {
        return this.queue.size();
    }
}
