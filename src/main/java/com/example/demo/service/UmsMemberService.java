package com.example.demo.service;


import com.example.demo.common.api.CommonResult;

/**
 * 会员管理Service
 * Created by xitian on 2021/5/28.
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

}
