package example.container;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerTest {

    @Test
    public void testAddMethod() {
        Container container = new Container();
        Item item = new Item(1);
        container.add(item);
        Item expected = item;
        Item actual = container.get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveMethod() {
        Container container = new Container();
        Item item1 = new Item(1);
        Item item2 = new Item(2);
        container.add(item1);
        int expected = 1;
        int actual = container.size();
        Assert.assertEquals(expected, actual);
    }


}