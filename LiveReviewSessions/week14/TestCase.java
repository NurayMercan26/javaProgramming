package week14;

public class TestCase {
    Browser browser; //edge,,chrome,firefox...
    OS operatingSystem;// MAC, Windows, Linux

    public Browser getBrowser() {
        return browser;
    }

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    public OS getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OS operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "TestCase{" +
                "browser=" + browser +
                ", operatingSystem=" + operatingSystem +
                '}';
    }
}
