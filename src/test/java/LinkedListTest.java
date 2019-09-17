import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

    private LinkedList linkedList;

    @Before
    public void setup() {
        this.linkedList = new LinkedList();
    }

    @Test
    public void shouldReturnEmptyListSize() {
        Assert.assertEquals(0, linkedList.getSize());
    }

    @Test
    public void shouldInsertANodeInHeadOfList() {
        linkedList.addNodeInLast(new Node("teste", null));
        Assert.assertEquals(1, linkedList.getSize());
    }
}
