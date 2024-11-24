class que {
    private int[] heap;
    private int size;

    public que(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    public void add(int value) {
        if (size >= heap.length) {
            expandCapacity();
        }
        heap[size++] = value;

        quickSort.quickSorting(heap, 0, size-1);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int firstElement = heap[0];
        for (int i = 1; i < size; i++) {
            heap[i - 1] = heap[i]; // Shift elements to the left
        }
        size--;
        return firstElement;
    }

    public void Remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int firstElement = heap[0];
        for (int i = 1; i < size; i++) {
            heap[i - 1] = heap[i]; // Shift elements to the left
        }
        size--;

    }


    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return heap[0];
    }
    public int peekLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return heap[size-1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    private void expandCapacity() {
        int[] newHeap = new int[heap.length * 2];
        for (int i = 0; i < heap.length; i++) {
            newHeap[i] = heap[i];
        }
        heap = newHeap;
    }

    public void printQueue() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}