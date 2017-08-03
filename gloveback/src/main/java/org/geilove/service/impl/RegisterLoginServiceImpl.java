package org.geilove.service.impl;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.geilove.dao.UserMapper;
import org.geilove.pojo.User;
import org.geilove.service.RegisterLoginService;

import java.util.Map;

@Service("registerloginservice")
public class RegisterLoginServiceImpl implements RegisterLoginService {
	
 
    @Resource
	private UserMapper  userMapper;
	
	@Override
	public User userLogin(String userEmail){
		//这里应该加入try..catch
		User user=userMapper.selectByUserEmail(userEmail);
		return user;
	}
	@Override
	public User byAtUserProfile(String usernickname){
		User user=userMapper.selectByUserNickName(usernickname);
		return user;
	}
	
	@Override
	public int userRegister(User record){	
		int tag=userMapper.insert(record);
		//System.out.println(tag); //确定下返回值
		return tag; 
	}	
	@Override
	public String selectMD5Password(Long userid){
		//System.out.println(userid);
		String userPassword=userMapper.selectMD5Password(userid);
		return userPassword;
	}
	@Override
	public String findPasswd(String userEmail){
		String password=userMapper.findPasswd(userEmail);
		return password;
	}
	@Override
	public int updateUserSelective(User record){
		int tag =userMapper.updateByPrimaryKeySelective(record);
		return tag;
	}

	@Override
	public User selectByNicknameOrEmail(Map<String,Object> map){ //根据昵称或者邮箱检查用户是否注册
        User user;
        user=userMapper.selectByNicknameOrEmail(map);
        return  user;
	}
}



















