package patterns.behavioral.iterator;

public class ArrayClass {

    int[] arr = {1, 2, 3};

    public Iterator getIterator() {
        return new CustomIterator();
    }

    private class CustomIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return (index < arr.length) ? true : false;
        }

        @Override
        public Object next() {
//            return hasNext() ? arr[index++] : null;
            return arr[index++]; //????
        }
    }
}
