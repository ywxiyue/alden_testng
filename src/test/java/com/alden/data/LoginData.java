package com.alden.data;

import org.testng.annotations.DataProvider;

public class LoginData {

    @DataProvider
    public Object[][] getUsers() {
        return new Object[][]{
            {"admin","123","管理者登陆"},
                {"","111","用户名和密码不能为空"},
                {null,"123","用户名和密码不能为空"},
        };
    }
}
