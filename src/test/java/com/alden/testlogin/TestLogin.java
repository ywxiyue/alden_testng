package com.alden.testlogin;

import com.alden.data.LoginData;
import com.alden.login.Login;
import org.testng.Assert;
import org.testng.annotations.Test;
import static  org.hamcrest.CoreMatchers.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.closeTo;
import static org.mockito.Mockito.*;

/**
 * test
 */
public class TestLogin {

    @Test(dataProvider = "getUsers",dataProviderClass = LoginData.class)
    public void testLogin(String name1,String pwd1,String except1) {
        Login login = new Login();
        String ac = login.loginByNamePwd(name1,pwd1);
        Assert.assertEquals(ac,except1);
//        String rc = login.loginByNamePwd("admin","123");
//        Assert.assertEquals("管理者登陆",rc);
//        String name = "lucy";
//        String rc1 = login.loginByNamePwd(name1,pwd1);
//        Assert.assertEquals("欢迎" + name,rc1);
    }
    @Test
    public void testLogin1() {
        Login login = new Login();
//        String resulte = login.loginByNamePwd("","123");
//        Assert.assertEquals("用户名和密码不能为空",resulte);
//        String rc = login.loginByNamePwd("admin","123");
//        Assert.assertEquals("管理者登陆",rc);
        String name = "lucy";
        String rc1 = login.loginByNamePwd(name,"123");
        Assert.assertEquals("欢迎" + name,rc1);
    }
//    @Test
//    public void testLogin2() {
//        Login login = new Login();
//        String resulte = login.loginByNamePwd("","123");
//        Assert.assertEquals("用户名和密码不能为空",resulte);
//        String rc = login.loginByNamePwd("admin","123");
//        Assert.assertEquals("管理者登陆",rc);
////        String name = "lucy";
////        String rc1 = login.loginByNamePwd(name,"");
////        Assert.assertEquals("欢迎" + name,rc1);
//    }
//
//    @Test
//    public void testLogin3() {
//        Login login = new Login();
//        String resulte = login.loginByNamePwd("","123");
//        Assert.assertEquals("用户名和密码不能为空",resulte);
//        String rc = login.loginByNamePwd("admin","123");
//        Assert.assertEquals("管理者登陆",rc);
////        String name = "lucy";
////        String rc1 = login.loginByNamePwd(name,"");
////        Assert.assertEquals("欢迎" + name,rc1);
//        assertThat("value close to 10",10.0,closeTo(9.79,0.1));
//    }
//
//
//    @Test
//    public void testLogin4() {
//        assertThat("value close to 10",10.0,
//                anyOf(
//                        equalTo(9.99),
//                        closeTo(10.1,0.1)
//            )
//        );
//    }
    @Test
    public void testloginCode() {
        Login login = new Login();
        String result = login.loginByCode("aaa");
        assertThat("code is equal aaa",result,equalTo("aaa"));
    }
    @Test
    public void testMocklogin() {
        Login login = mock(Login.class);
        //如果调用该loginbycode方法，则返回hello
        when(login.loginByCode(anyString())).thenReturn("hello");
        String rc = login.loginByCode("aaa");
        assertThat(rc,equalTo("hello"));
        //判断是否调用过loginByCode("abc")函数
        verify(login).loginByCode("aaa");
    }
}
