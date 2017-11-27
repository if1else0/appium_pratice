package testcases.crossapp;

import common.BasicTestCase;
import org.testng.annotations.Test;

public class CrossApp extends BasicTestCase {

    @Test
    public void testCrossApp() throws Exception {
        pageHelper.getPageNews().clickNewsItem(1);
        pageHelper.getPageNewsDetail().clickShareBtn();
        pageHelper.getPageNewsDetail().clickShareToQQ();
        pageHelper.getPageQQLogin().enterName("277860602");
        pageHelper.getPageQQLogin().enterPwd("12345678");
    }
}
