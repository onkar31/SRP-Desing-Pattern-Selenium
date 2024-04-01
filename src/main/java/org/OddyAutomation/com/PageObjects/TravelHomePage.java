package org.OddyAutomation.com.PageObjects;

import org.OddyAutomation.com.PageComponents.FooterNavigation;
import org.OddyAutomation.com.PageComponents.NavigationBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TravelHomePage {

    By sectionElement = By.id("traveller-home");
    By footerNavSectionElement = By.id("buttons");
    WebDriver driver;

    public TravelHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goTo(){
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    }
    public NavigationBar getNavigationBar(){
        return new NavigationBar(driver, footerNavSectionElement);
    }

    public FooterNavigation getFooterNavigation(){
        return new FooterNavigation(driver, sectionElement);
    }

}
