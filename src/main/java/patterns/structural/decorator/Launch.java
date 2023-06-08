package patterns.structural.decorator;

//своего рода врапер над классом
//Добавляет новые функциональные возможности существующего объекта без привязки его структуры.
public class Launch {
    public static void main(String[] args) {
        UpperCaseFileReader upperCaseFileReader = new UpperCaseFileReader(new FileReader());
        upperCaseFileReader.read();
    }
}
