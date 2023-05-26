package Project2;

// WebDriver interface representing common web driver behavior
public interface WebDriver {
    void open();        // Method to open the browser
    void close();       // Method to close the browser
    String getTitle();  // Method to get the title of the current webpage
}

// RemoteWebDriver interface extending WebDriver with additional navigation functionality
interface RemoteWebDriver extends WebDriver {
    void navigate();    // Method to navigate to a URL
}

// TakesScreenshot interface extending RemoteWebDriver with screenshot capture functionality
interface TakesScreenshot extends RemoteWebDriver {
    void getScreenshot();   // Method to capture a screenshot
}

// ChromeDriver class implementing RemoteWebDriver for Chrome browser
class ChromeDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("Open Chrome Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome Browser");
    }

    @Override
    public String getTitle() {
        return "Title";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to URL in Chrome Browser");
    }
}

// FirefoxDriver class implementing RemoteWebDriver for Firefox browser
class FirefoxDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("Open Firefox Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Firefox Browser");
    }

    @Override
    public String getTitle() {
        return "Title";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to URL in Firefox Browser");
    }
}

// SafariDriver class implementing RemoteWebDriver for Safari browser
class SafariDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("Open Safari Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Safari Browser");
    }

    @Override
    public String getTitle() {
        return "Title";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to URL in Safari Browser");
    }
}

