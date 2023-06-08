package patterns.behavioral.iterator;

//Своего рода кастоиный иттератор
//Последовательно осуществляет доступ к элементам объекта коллекции.
public class Launch {
    public static void main(String[] args) {
        ArrayClass arrayClass = new ArrayClass();
        Iterator iterator = arrayClass.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
