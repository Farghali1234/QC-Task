package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultsPage;
import utils.BaseTest;

import java.util.List;

public class SearchTests extends BaseTest {

    @Test
    public void testSearchWithSuggestions() {
        HomePage homePage = new HomePage(driver);
        homePage.enterSearchQuery("laptop");

        List<WebElement> suggestions = homePage.getSearchSuggestions();
        Assert.assertTrue(suggestions.size() > 0, "Search suggestions are not displayed");
    }

    @Test
    public void testSearchWithFilters() {
        HomePage homePage = new HomePage(driver);
        homePage.enterSearchQuery("smartphone");
        homePage.pressEnterToSearch();

        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.applyBrandFilter();
        searchResultsPage.setPriceFilter("300");

        List<WebElement> results = searchResultsPage.getSearchResults();
        Assert.assertTrue(results.size() > 0, "No products found after applying filters");
    }

}
