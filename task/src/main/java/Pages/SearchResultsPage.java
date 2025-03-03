package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SearchResultsPage {
    private WebDriver driver;

    private By resultItems = By.cssSelector(".s-main-slot .s-result-item");
    private By brandFilter = By.xpath("//span[text()='Samsung']");
    private By priceFilter = By.id("low-price");
    private By applyPriceFilter = By.xpath("//input[@aria-labelledby='a-autoid-1-announce']");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void applyBrandFilter() {
        driver.findElement(brandFilter).click();
    }

    public void setPriceFilter(String minPrice) {
        driver.findElement(priceFilter).sendKeys(minPrice);
        driver.findElement(applyPriceFilter).click();
    }

    public List<WebElement> getSearchResults() {
        return driver.findElements(resultItems);
    }

    // Select the first product from search results
public void selectFirstProduct() {
    driver.findElements(By.cssSelector(".s-main-slot .s-result-item h2 a")).get(0).click();
}

}
