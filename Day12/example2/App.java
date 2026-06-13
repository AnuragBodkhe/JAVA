package Day12.example2;

public class App {
    public static void main(String[] args){

        BrowserHistory browser = new BrowserHistory();

        browser.visitPage("Amazon");
        browser.visitPage("Google");
        browser.visitPage("Facebook");
        browser.visitPage("Youtube");

        browser.displayHistory();

        // browser.PrintCurrentPage();

        browser.goBack();
        browser.goBack();

        // browser.goForward();
        // browser.goForward();
        // browser.goForward();

        browser.visitPage("Geeksforgeeks");

        browser.goForward();

    }
}
