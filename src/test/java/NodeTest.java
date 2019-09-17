import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NodeTest {

    private Node node;

    @Before
    public void setup() {
        this.node = new Node("teste", null);
    }

    @Test
    public void getNodeData() {
        Assert.assertEquals("teste", this.node.getData());
    }
}
