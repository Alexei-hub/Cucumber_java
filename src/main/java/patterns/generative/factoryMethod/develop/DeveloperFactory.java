package patterns.generative.factoryMethod.develop;

public class DeveloperFactory {

    public static String choose(String language) {
       return new DeveloperFactory().chooseDeveloper(language).codeWrite();
    }

    public IDeveloper chooseDeveloper(String language) {
        language = language.toLowerCase();
        return switch (language) {
            case "java" -> new JavaDeveloper();
            case "c" -> new CDeveloper();
            default -> null;
        };
    }
}
