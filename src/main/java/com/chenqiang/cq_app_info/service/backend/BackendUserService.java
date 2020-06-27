package com.chenqiang.cq_app_info.service.backend;


import com.chenqiang.cq_app_info.pojo.BackendUser;

public interface BackendUserService {
	/**
	 * 用户登录
	 * @param userCode
	 * @param userPassword
	 * @return
	 */
	public BackendUser login(String userCode, String userPassword) throws Exception;
}
