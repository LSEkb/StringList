package org.laserova;

public class StringListImpl implements StringList {
    private int size;

    private String[] innerArray;

    private final int DEFAULT_INITIAL_CAPACITY = 10;

    public StringListImpl() {
        this.innerArray = new String[DEFAULT_INITIAL_CAPACITY];
        size = 0;
    }

    public StringListImpl(int length) {
        this.innerArray = new String[length];
        size = 0;
    }

//    public StringArrayListImpl(String... items) {
//
//    }


    @Override
    public String add(String item) {
        if (size == innerArray.length) {
            this.grow(innerArray.length);
        }
        innerArray[size] = item;
        size++;
        return item;
    }

    @Override
    public String add(int index, String item) {
        if (checkIndex(index)) {
            throw new OutOfBoundsException();
        }
        if (size == innerArray.length) {
            this.grow(innerArray.length);
        }
        for (int i = size; i > index; i--) {
            innerArray[i] = innerArray[i - 1];
        }
        size++;
        return innerArray[index] = item;
    }

    @Override
    public String set(int index, String item) {
        if (checkIndex(index)) {
            throw new OutOfBoundsException();
        }
        return innerArray[index] = item;
    }

    @Override
    public String remove(String item) {
        for (int i = 0; i < size; i++) {
            if (innerArray[i].equals(item)) {
                for (int j = i; j < size - 1; j++) {
                    innerArray[j] = innerArray[j + 1];
                }
                innerArray[size - 1] = null;
                size--;
                return item;
            }
        }
        throw new ItemNotFoundException();
    }

    @Override
    public String remove(int index) {
        if (checkIndex(index)) {
            throw new ItemNotFoundException();
        }
        for (int i = 0; i < size - 1; i++) {
            innerArray[i] = innerArray[i + 1];
        }
        innerArray[size - 1] = null;
        size--;
        return innerArray[index];
    }

    @Override
    public boolean contains(String item) {
        for (int i = 0; i < size; i++) {
            if (innerArray[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        for (int i = 0; i < size; i++) {
            if (innerArray[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        for (int i = size - 1; i >= 0; i--) {
            if (innerArray[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        if (checkIndex(index)) {
            throw new ItemNotFoundException();
        }
        return innerArray[index];
    }

    @Override
    public boolean equals(StringList otherList) {
        if (otherList == null) {
            throw new RuntimeException("Null is not accepted");
        } else {
            if (this.size() == otherList.size()) {
                for (int i = 0; i < size; i++) {
                    innerArray[i].equals(otherList.get(i));

                }
            }
        }
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            innerArray[i] = null;
        }
        size = 0;
    }

    @Override
    public String[] toArray() {
        String[] stringArray = new String[size];
        for (int i = 0; i < size; i++) {
            stringArray[i] = innerArray[i];
        }
        return stringArray;
    }

    private void grow(int length) {
        length = length * 3 / 2 + 1;
        String[] newInnerArray = new String[length];
        if (size >= 0) System.arraycopy(innerArray, 0, newInnerArray, 0, size);
        innerArray = newInnerArray;
    }

    private boolean checkIndex(int index) {
        return index > size;
    }
}
