package com.example.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

/**
 * @author Alex Young
 * @since 2023/5/2 23:07
 */
@Service
public interface AuthorizeService extends UserDetailsService {
    
    /**
     * 向指定邮箱发送验证码
     * @param email 邮箱
     * @param sessionId 当前用户的sessionId
     * @param hasAccount 当前用户是否有账号，有：true，没有：false
     * @return 描述信息
     */
    String sendValidateEmail(String email, String sessionId, boolean hasAccount);
    
    /**
     * 注册时验证
     * @param username 注册用户名
     * @param password 注册密码
     * @param email 注册邮件
     * @param code 用户收到的验证码
     * @param sessionId 用户sessionId
     * @return 描述信息
     */
    String validateAndRegister(String username, String password, String email, String code, String sessionId);
    
    /**
     * 登录时验证
     * @param email 用户账号关联的邮箱
     * @param code 用户收到的验证码
     * @param sessionId 当前用户sessionId
     * @return 描述信息
     */
    String validateOnly(String email, String code, String sessionId);
    
    /**
     * 密码重置
     * @param password 新密码
     * @param email 用户账号关联的邮箱
     * @return 重置成功：true，否则：false
     */
    boolean resetPassword(String password, String email);
}
