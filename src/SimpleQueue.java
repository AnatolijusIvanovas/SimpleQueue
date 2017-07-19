/**
 * Created by Anatolijus on 2017-07-19.
 */
public class SimpleQueue {

    int[] array;
    int maxSize;
    int firstElement;
    int lastElement;
    int numberOfElements;

    public SimpleQueue(int maxSize) {
        this.array = new int[maxSize];
        this.maxSize = maxSize;
        this.firstElement = 0;
        this.lastElement = -1;
        this.numberOfElements = 0;
    }

    public void addElement(int element) {
        array[++lastElement] = element;
        numberOfElements++;
    }
}
