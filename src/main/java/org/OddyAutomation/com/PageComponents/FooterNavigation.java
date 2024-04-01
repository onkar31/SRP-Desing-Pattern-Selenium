package org.OddyAutomation.com.PageComponents;

import org.OddyAutomation.com.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterNavigation extends AbstractComponent {


    By flights = By.cssSelector("[title='Flights']");
    By links = By.cssSelector("a");
    public FooterNavigation(WebDriver driver, By sectionElement) {
        // when you inherite parent class, you should invoke the parent class constructor in your own child constructor
        super(driver, sectionElement);
    }

    //method to handle flights
    //when Selenium executes any method in this class - scope of selenium should be in the footer only

    public String getFlightAttribute(){
        //custom findElement to restrict the scope
        return findElement(flights).getAttribute("class");
    }

    public int getLinkCounts(){
        return findElements(links).size();
    }
}
