package testcases.addtofavorites;

import common.BasicTestCase;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class AddToFavorites extends BasicTestCase {

    @Test
    public void testAddToFavorites() throws Exception {
        pageHelper.getPageCommon().goToMySettingsTab();
        pageHelper.getPageMySettings().clickLoginIcon();
        pageHelper.getPageLogin().login("735723619@qq.com","12345678");
        pageHelper.getPageCommon().goToHomeTab();
        String title = pageHelper.getPageNews().getNewsTitle(1);
        pageHelper.getPageNews().clickNewsItem(1);
        pageHelper.getPageNewsDetail().clickAddToFavorites();
        Thread.sleep(1000);
        pageHelper.getPageCommon().goBack();
        pageHelper.getPageCommon().goToMySettingsTab();
        pageHelper.getPageMySettings().clickFavoritesLayout();
        assertTrue(title.contains(pageHelper.getPageFavoritesList().getFavoritesTitle(1)));
    }
}
