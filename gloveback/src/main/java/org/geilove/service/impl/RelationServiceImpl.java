package org.geilove.service.impl;

import java.util.Map;
import javax.annotation.Resource;
import org.geilove.dao.DoubleFansMapper;
import org.geilove.pojo.DoubleFans;
import org.geilove.service.RelationService;
import org.springframework.stereotype.Service;

@Service("relation")
public class RelationServiceImpl implements RelationService{
     @Resource
     private  DoubleFansMapper  dfMapper;     
 
     @Override
     public Integer watchManService(DoubleFans doubleFans){
    	 Integer tagCode=null;  	 
    	 tagCode=dfMapper.insert( doubleFans);
    	 return tagCode;
     }
     
     @Override
    public Integer unWatchManService(Map<String,Object> map){
    	int unTagCode=0;
    	unTagCode=dfMapper.cancelWatch(map);
    	//unTagCode=dfMapper.deleteByDoubleUserIDs(list);//这个稍后改
    	return unTagCode;
    	 
     }    
}
