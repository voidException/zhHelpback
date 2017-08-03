package org.geilove.service;

import java.util.List;
import java.util.Map;

import org.geilove.pojo.User;
import org.geilove.sqlpojo.PartHelpPojo;
import org.geilove.sqlpojo.OtherPartHelpPojo;
public interface HelpService {
	
	//public List<PartHelpPojo> getPartHelpList(Map<String,Object> map); //获取帮助人-被帮助人关系对列表

	public List<PartHelpPojo> getGuyIHelp(Map<String,Object> map);

	public List<PartHelpPojo> getGodHelpMe(Map<String,Object> map);

	public List<OtherPartHelpPojo> getOtherPartHelpList(List<Long> lst);// 根据一组userid值，获得一组用户的部分信息

	public User getUserPartProfileByID(Long  userid); //根据用户的id获取用户的
}
