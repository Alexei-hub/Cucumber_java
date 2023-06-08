package patterns.generative.factory;

public class Factory {
    public IBrowser initBrowser(String browser) {
        browser = browser.toLowerCase();
        return switch (browser) {
            case "chrome" -> new Chrome();
            case "safari" -> new Safari();
            default -> null;
        };
    }
}
