package TestsObject;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by sveta on 03.10.16.
 */
public class TestForUnregisteredUser extends TestBase {

    //checking- that unregistered user can search some items
    @Test
    public void testSearchItem() {
        LOG.info ("Begin start seach some item");
        BasePage.searchItems ("iphone");
        Assert.assertEquals (ResultSearchPage.getTitle (), "Amazon.com: iphone");
    }

    //checking- unregistered user inputs empty into 'search' field
    @Test
    public void testSearchEmpty() {
        LOG.info ("Begin start seach empty item");
        BasePage.searchItems ("");
        Assert.assertEquals (ResultSearchPage.getTitle (), "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }
}
