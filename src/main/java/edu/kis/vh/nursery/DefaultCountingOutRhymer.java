package edu.kis.vh.nursery;

/**
 * Default rhymer implementation.
 * Acts like a LIFO stack.
 */
public class DefaultCountingOutRhymer {

    private static final int EMPTY = -1;
    private static final int DEFAULT = -1;
    private static final int CAPACITY = 12;
    private int[] numbers = new int[CAPACITY];

    public int total = EMPTY;

    /**
     * Puts the number inside the rhymer.
     * Doesn't do anything if the rhymer is full.
     * @param in Number to put in
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Checks if there are any numbers in the rhymer.
     * @return Whether there are any numbers in the rhymer.
     */
    public boolean callCheck() {
        return total == EMPTY;
    }

    /**
     * Checks if the rhymer is full.
     * @return Whether the rhymer is full or not.
     */
    public boolean isFull() {
        return total == CAPACITY-1;
    }

    /**
     * Peeks the last number.
     * @return The last number in the rhymer or -1 if there are no numbers.
     */
    protected int peekaboo() {
        if (callCheck())
            return DEFAULT;
        return numbers[total];
    }

    /**
     * Returns the last number and decrements the total amount of numbers.
     * @return Returns the last number or -1 if there are no numbers.
     */
    public int countOut() {
        if (callCheck())
            return DEFAULT;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }

}
