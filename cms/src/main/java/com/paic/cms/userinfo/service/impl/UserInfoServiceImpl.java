package com.paic.cms.userinfo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paic.cms.userinfo.dao.IUserInfoDao;
import com.paic.cms.userinfo.dto.UserInfo;
import com.paic.cms.userinfo.service.IUserInfoService;

@Service
public class UserInfoServiceImpl implements IUserInfoService {

	@Autowired
	private IUserInfoDao userInfoDao;
	
	@Override
	public UserInfo getUserListByPage() {
		UserInfo userInfo = userInfoDao.getUserListByPage();
		System.out.println(userInfo);
		System.out.println("userInfoServiceImpl is invoked");
		return null;
	}
}
