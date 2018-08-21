package com.gwg.shiro.web.controller;

import com.gwg.shiro.web.config.AuthUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;

public class BaseController {

    /**
     * 获取当前登录用户信息
     * @return
     */
    protected AuthUser getCurrentUser() {
        Session session = SecurityUtils.getSubject().getSession();
        AuthUser authUser = (AuthUser) session.getAttribute("userSession");
        return authUser;
    }

    /**
     * 获取当前登录userid
     * @return
     */
    protected String getCurrentUserId() {
        AuthUser authUser = getCurrentUser();
        if (null != authUser) {
            return authUser.getUserid();
        }
        return null;
    }

    /**
     * 获取当前登录用户名
     * @return
     */
    protected String getCurrentUsername() {
        AuthUser authUser = getCurrentUser();
        if (null != authUser) {
            return authUser.getUsername();
        }
        return null;
    }

}
