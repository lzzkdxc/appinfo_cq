package com.chenqiang.cq_app_info.service.developer;


import com.chenqiang.cq_app_info.pojo.DevUser;

public interface DevUserService {
	/**
	 * 用户登录
	 * @param devCode
	 * @param devPassword
	 * @return
	 */
	public DevUser login(String devCode, String devPassword) throws Exception;
}
