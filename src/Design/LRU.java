package Design;

import java.util.HashMap;
import java.util.Objects;



// Idea is creating dummy nodes at the head and tail for the reference.

//  head(dummy node object) ---> node1  --> node2 ---> node3 --> tail(dummy node object)


class DoubleLinkedList {
    int key;
    int data;
    DoubleLinkedList prev, next;
    DoubleLinkedList head, tail;
    int capacity;

    DoubleLinkedList(int capacity) {
        head = new DoubleLinkedList(0, 0);
        tail = new DoubleLinkedList(-1, -1);
        head.next = tail;
        tail.prev = head;
        this.capacity = capacity;
    }

    DoubleLinkedList(int key, int data) {
        this.key = key;
        this.data = data;
    }

    @Override
    public String toString() {
        return key + " " + data;
    }

}

public class LRU {

    private int capacity;
    private DoubleLinkedList head;
    private DoubleLinkedList tail;
    private HashMap<Integer, DoubleLinkedList> cache = new HashMap<>();

    public LRU(int capacity, DoubleLinkedList head, DoubleLinkedList tail) {
        this.capacity = capacity;
        this.head = head;
        this.tail = tail;
    }


    public void print() {
        DoubleLinkedList node = head.next;
        while (node!=tail) {
            System.out.println(node);
            node = node.next;
        }
        System.out.println("-------------------------------");
    }

    public void printReverse() {
        DoubleLinkedList node = tail.prev;
        while (node!=head) {
            System.out.println(node);
            node = node.prev;
        }
        System.out.println("-------------------------------");
    }

    private Integer get(int key) {
        DoubleLinkedList node = cache.getOrDefault(key, null);
        if (Objects.isNull(node)) return -1;
        node.prev.next = node.next;
        node.next.prev = node.prev;
        moveToHead(node);
        return node.data;
    }

    private void put(int key, int value) {
        // If the key exists, update its value and move it to the head
        if (cache.containsKey(key)) {
            DoubleLinkedList node = cache.get(key);
            node.data = value;
            node.prev.next = node.next;
            node.next.prev = node.prev;
            moveToHead(node);
            return;
        }

        // If the cache is full, remove the least recently used node
        if (cache.size() >= this.capacity) {
            cache.remove(tail.prev.key);
            DoubleLinkedList node = tail.prev.prev;
            node.next = tail;
            tail.prev = node;
        }
        DoubleLinkedList newNode = new DoubleLinkedList(key, value);
        moveToHead(newNode);
        cache.put(key, newNode);
    }

    private void moveToHead(DoubleLinkedList node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }


    public static void main(String[] args) {

        int capacity = 3;
        DoubleLinkedList linkedList = new DoubleLinkedList(capacity);
        LRU lru = new LRU(capacity, linkedList.head, linkedList.tail);


        lru.put(10, 10);
        lru.put(11, 11);
        lru.put(12, 12);
        lru.put(13, 13);
        lru.print();
        lru.printReverse();
        System.out.println(lru.cache);

        System.out.println(lru.get(10));
        System.out.println(lru.get(11));
        lru.print();

        lru.put(14, 14);
        lru.print();

        lru.put(13, 1311111);
        lru.print();
        lru.printReverse();
        System.out.println(lru.cache);
    }



}
