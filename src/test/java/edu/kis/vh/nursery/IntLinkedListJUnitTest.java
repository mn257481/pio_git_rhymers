package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.Node;
import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListJUnitTest {

    @Test
    public void testPush() {
        IntLinkedList list = new IntLinkedList();
        int testValue = 4;
        list.push(4);

        int result = list.pop();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testIsEmpty() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testIsFull() {
        IntLinkedList list = new IntLinkedList();
        final int NUMBER_COUNT = 12;
        for (int i = 0; i < NUMBER_COUNT; i++) {
            boolean result = list.isFull();
            Assert.assertFalse(result);
            list.push(888);
        }

        Assert.assertFalse(list.isFull());
    }

    @Test
    public void testTop() {
        IntLinkedList list = new IntLinkedList();
        int testValue = 9;
        list.push(9);

        int result = list.top();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testPop() {
        IntLinkedList list = new IntLinkedList();
        int testValue = 12;
        list.push(12);

        int result = list.top();
        Assert.assertEquals(testValue, result);
    }

}
