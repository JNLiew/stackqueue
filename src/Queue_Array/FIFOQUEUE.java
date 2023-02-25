package Queue_Array;

import java.util.ArrayList;
import java.util.List;

class FIFOQUEUE implements IQueuable {
    private List<String> queue;

    // Initialize ArrayList
    FIFOQUEUE(){
        this.queue = new ArrayList<>();
    }

    // Adding 'value' to the end of the queue
    public String[] enqueue(String value) {
        this.queue.add(value);
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
