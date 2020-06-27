package com.chenqiang.cq_app_info.service.developer;

import com.chenqiang.cq_app_info.dao.DevUserMapper;
import com.chenqiang.cq_app_info.pojo.DevUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DevUserServiceImpl implements DevUserService {
	@Autowired
	private DevUserMapper mapper;
	@Override
	public DevUser login(String devCode, String devPassword) throws Exception {
		// TODO Auto-generated method stub
		DevUser user = null;
		user = mapper.getLoginUser(devCode);
		//匹配密码
		if(null != user){
			if(!user.getDevPassword().equals(devPassword))
				user = null;
		}
		return user;
	}

}
