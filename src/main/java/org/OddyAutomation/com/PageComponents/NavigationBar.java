package org.OddyAutomation.com.PageComponents;

import org.OddyAutomation.com.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar extends AbstractComponent {

    By flights = By.cssSelector("[title='Flights']");
    By links = By.cssSelector("a");

    public NavigationBar(WebDriver driver, By sectionElement) {
        super(driver, sectionElement);
    }

    public String getFlightAttribute(){
        //custom findElement to restrict the scope
        return findElement(flights).getAttribute("class");
    }

    public int getLinkCounts(){
        return findElements(links).size();
    }
}
