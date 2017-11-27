package testcases.login;

import common.BasicTestCase;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class LoginPermissionCheck extends BasicTestCase{

    @Test
    public void testLoginPermission() throws Exception {
        pageHelper.getPageCommon().goToMySettingsTab();
        pageHelper.getPageMySettings().clickMyMsgItem();
        check();

        pageHelper.getPageMySettings().clickMyMsgItem();
        check();


        pageHelper.getPageMySettings().clickMyActivityItem();
        check();

        pageHelper.getPageMySettings().clickMyTeamItem();
        check();
    }

    public void check(){
        assertTrue(pageHelper.getPageLogin().isLoginScreenOpened());
        pageHelper.getPageCommon().goBack();
    }
}
