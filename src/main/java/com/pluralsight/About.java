package com.pluralsight;


public class About {
    static String title = "Our Business | About us | 2i Testing";
    static String url = "https://2itesting.com/about/our-business/";
    public void goTo() {
        Browser.goTo(url);
    }

    public boolean isAt() {
        return Browser.title().equals(title);
    }
}
