package org.OddyAutomaion.com;

import org.OddyAutomation.com.PageObjects.TravelHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {

    @Test
    public void flightTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\onkar\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        TravelHomePage travelHomePage = new TravelHomePage(driver);
        travelHomePage.goTo();
        String footerNavAttribute = travelHomePage.getFooterNavigation().getFlightAttribute();
        String navBarAttribute =travelHomePage.getNavigationBar().getFlightAttribute();
        int footerLinks = travelHomePage.getFooterNavigation().getLinkCounts();
        int navBarLinks = travelHomePage.getNavigationBar().getLinkCounts();
        System.out.println("Footer Navigation Attribute: "+ footerNavAttribute+" & Links: "+footerLinks);
        System.out.println("Navigation Bar Attribute: "+ navBarAttribute+" & Links: "+navBarLinks);
    }
}
