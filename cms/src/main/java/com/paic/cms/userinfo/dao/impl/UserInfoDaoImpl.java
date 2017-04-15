//package com.paic.cms.userinfo.dao.impl;
//
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.support.SqlSessionDaoSupport;
//import org.springframework.stereotype.Repository;
//
//import com.paic.cms.userinfo.dao.IUserInfoDao;
//import com.paic.cms.userinfo.dto.UserInfo;
//
//@Repository
//public class UserInfoDaoImpl extends SqlSessionDaoSupport implements IUserInfoDao{
//
////	@Autowired
////	private SqlSessionFactory sessionFactory;
//	
//	@Resource
//    public void setSuperSessionFactory(SqlSessionFactory sessionFactory){
//        this.setSqlSessionFactory(sessionFactory);
//    }
//	
//	@Override
//	public UserInfo getUserListByPage() {
//		
//		System.out.println("UserInfoDaoImpl is invoked");
//		
//		List users = this.getSqlSession().selectList("getUserListByPage");
//		 
//		return null;
//	}
//
//}
