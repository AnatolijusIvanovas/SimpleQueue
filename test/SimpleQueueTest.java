import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Anatolijus on 2017-07-19.
 */
public class SimpleQueueTest {

    SimpleQueue queue = new SimpleQueue(25);

    @Test public void canCreateQueueArrayWithMaxLength() {
        assertEquals(25, queue.queue.length);
    }
    @Test public void canCreateQueueWithMaxSizeParameter() {
        assertEquals(25, queue.maxSize);
    }

}