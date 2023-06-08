package patterns.generative.factory;

//Объеденения объектов одного типа в фабрику
public class Launch {
    public static void main(String[] args) {
        IBrowser chrome = new Factory().initBrowser("chrome");
        chrome.init();
    }
}
