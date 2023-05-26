package Project2;

public class WebDriverTest {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        SafariDriver safariDriver = new SafariDriver();

        // Accessing methods available to ChromeDriver
        chromeDriver.open();
        chromeDriver.navigate();
        System.out.println("Title: " + chromeDriver.getTitle());
        chromeDriver.close();

        System.out.println();

        // Accessing methods available to FirefoxDriver
        firefoxDriver.open();
        firefoxDriver.navigate();
        System.out.println("Title: " + firefoxDriver.getTitle());
        firefoxDriver.close();

        System.out.println();

        // Accessing methods available to SafariDriver
        safariDriver.open();
        safariDriver.navigate();
        System.out.println("Title: " + safariDriver.getTitle());
        safariDriver.close();
    }
}
