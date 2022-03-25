package com.syntax.coding5;

interface WebDriver  {
    void open();
    void close();
    void getTitle();

}
interface TakesScreenshot {
    void getScreenshot();
}
interface RemoteWebDriverInterface extends WebDriver, TakesScreenshot{

    void navigate();

}

class ChromeDriver implements RemoteWebDriverInterface{

    @Override
    public void open() {
        System.out.println("Chrome Opens");
    }

    @Override
    public void close() {
        System.out.println("Chrome Closes");
    }

    @Override
    public void getTitle() {
        System.out.println("Chrome Gets title");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Chrome takes a screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Chrome navigates to given website");
    }
}


class FirefoxDriver implements RemoteWebDriverInterface{
    @Override
    public void open() {
        System.out.println("Firefox Opens");
    }

    @Override
    public void close() {
        System.out.println("Firefox Closes");
    }

    @Override
    public void getTitle() {
        System.out.println("Firefox Gets title");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Firefox takes a screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Firefox navigates to given website");
    }
}

class SafariDriver implements RemoteWebDriverInterface{
    @Override
    public void open() {
        System.out.println("Safari Opens");
    }

    @Override
    public void close() {
        System.out.println("Safari Closes");
    }

    @Override
    public void getTitle() {
        System.out.println("Safari Gets title");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Safari takes a screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Safari navigates to given website");
    }
}

class Tester{

    public static void main(String[] args) {

        RemoteWebDriverInterface [] remoteWebDriverInterfaces={new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};
        for(RemoteWebDriverInterface rWd:remoteWebDriverInterfaces){
            rWd.open();
            rWd.navigate();
            rWd.getTitle();
            rWd.getScreenshot();
            rWd.close();
        }
    }
}