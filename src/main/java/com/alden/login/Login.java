package com.alden.login;

public class Login {

    public String loginByNamePwd(String name,String pwd) {
        if(null==name || name.equals("") ){
            return  "用户名和密码不能为空";
        }else if(name.equals("admin") && pwd.equals("123")) {
            return  "管理者登陆";
        }else{
            return  "欢迎" + name;
        }
    }

    public String loginByCode(String code) {
        if(code.equals("aaa")){
            System.out.println("login success!");
            return "aaa";
        }else {
            return  null;
        }
    }
}
