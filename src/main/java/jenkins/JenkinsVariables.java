package jenkins;

public class JenkinsVariables {

    private String BROWSER_NAME;

    {
        BROWSER_NAME = (System.getProperty("BrowserFromJenkins"));
    }

    public String getBROWSER_NAME() {
        return BROWSER_NAME;
    }

}
