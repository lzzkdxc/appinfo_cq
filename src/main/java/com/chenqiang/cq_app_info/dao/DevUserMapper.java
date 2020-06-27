package com.chenqiang.cq_app_info.dao;

import com.chenqiang.cq_app_info.pojo.DevUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DevUserMapper {
	/**
	 * 通过userCode获取User
	 * @param devCode
	 * @return
	 * @throws Exception
	 */
	public DevUser getLoginUser(@Param("devCode") String devCode)throws Exception;
}
