package Test;

import Aufgabe17.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    /*
    ()
    Füge A hinzu
    (A) A ist HEAD und TAIL

    Füge B hinzu
    (B -> A) B ist HEAD und A ist TAIL

    Füge C hinzu
    (A -> B -> C) A ist HEAD, A zeigt auf B, B zeigt auf C und C ist TAIL
     */

    private LinkedList<String> ll = new LinkedList();

    @Test
    public void shouldAddNodeToEnd() {
        String nodeDataA = "A";
        String nodeDataB = "B";
        //String nodeDataC = "C";
        ll.addNodeToEnd(nodeDataA);

        assertEquals(Integer.valueOf(1), ll.getNodeCount());
        assertEquals(nodeDataA, ll.getHead().getData());
        assertEquals(nodeDataA, ll.getTail().getData());

        ll.addNodeToEnd(nodeDataB);
        //ll.addNodeToStart(nodeDataC);
        //Integer expected = 2;
        Integer nodeCount = ll.getNodeCount();

        assertEquals(nodeDataB, ll.getHead().getNext().getData());
        //assertEquals(expected, nodeCount);
        assertEquals(nodeDataA, ll.getHead().getData());
        //assertEquals(nodeDataC, ll.getTail().getData());
    }

    @Test
    public void shouldAddNodeToStart() {
        String data = "1";
        String expected = "1";
        String result = ll.addNodeToEnd(data);

        assertEquals(expected, result);
    }
}
