package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    private WebDriver driver;

    // Locators
    private By productTitle = By.id("productTitle");
    private By productPrice = By.xpath("//span[@class='a-price-whole']");
    private By addToCartButton = By.id("add-to-cart-button");
    private By cartConfirmationMessage = By.xpath("//span[contains(text(),'Added to Cart')]");

    // Constructor
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    // Get product title
    public String getProductTitle() {
        return driver.findElement(productTitle).getText();
    }

    // Get product price
    public String getProductPrice() {
        return driver.findElement(productPrice).getText();
    }

    // Click "Add to Cart" button
    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }

    // Verify item is added to the cart
    public boolean isItemAddedToCart() {
        return driver.findElement(cartConfirmationMessage).isDisplayed();
    }
}
