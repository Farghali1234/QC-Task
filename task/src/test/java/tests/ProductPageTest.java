package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchResultsPage;
import utils.BaseTest;

public class ProductPageTest extends BaseTest {

    @Test
    public void testAddProductToCart() {
        HomePage homePage = new HomePage(driver);
        homePage.enterSearchQuery("Samsung Galaxy");
        homePage.pressEnterToSearch();

        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.selectFirstProduct();

        ProductPage productPage = new ProductPage(driver);
        String productName = productPage.getProductTitle();
        Assert.assertNotNull(productName, "Product title is missing!");

        productPage.addToCart();
        Assert.assertTrue(productPage.isItemAddedToCart(), "Product was not added to the cart!");
    }
}
