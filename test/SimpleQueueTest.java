import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Anatolijus on 2017-07-19.
 */
public class SimpleQueueTest {

    SimpleQueue queue = new SimpleQueue(25);

    @Test public void canCreateQueueArrayWithMaxLength() { assertEquals(25, queue.array.length); }
    @Test public void canCreateQueueWithMaxSizeParameter() { assertEquals(25, queue.maxSize); }
    @Test public void canCreateFirstElementIndex() { assertEquals(0, queue.firstElement); }
    @Test public void canCreateLastElementIndex() { assertEquals(-1, queue.lastElement); }
    @Test public void canCreateQueueWithNumberOfElementsParameter() { assertEquals(0, queue.numberOfElements); }
    @Test public void canAddElementToQueue() {
        queue.addElement(42);
        assertEquals(42, queue.array[queue.lastElement]);
        assertEquals(1, queue.numberOfElements);
        queue.addElement(125);
        assertEquals(125, queue.array[queue.lastElement]);
        assertEquals(2, queue.numberOfElements);
    }
    @Test() public void canRemoveElementFromQueue() {
        queue.addElement(42);
        queue.addElement(43);
        queue.removeElement();
        assertEquals(43, queue.array[queue.firstElement]);
        assertEquals(1, queue.numberOfElements);
    }

}