/**
 * Created by Anatolijus on 2017-07-19.
 */
public class SimpleQueue {

    int[] queue;
    int maxSize;
    int firstElement;
    int lastElement;

    public SimpleQueue(int maxSize) {
        this.queue = new int[maxSize];
        this.maxSize = maxSize;
        this.firstElement = 0;
        this.lastElement = -1;
    }

}
