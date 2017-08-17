package org.geilove.controller;



import org.geilove.pojo.RedMoney;
import org.geilove.pojo.User;
import org.geilove.requestParam.UseRedMoneyParam;
import org.geilove.service.SelRedMoneyService;
import org.geilove.util.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/person")
public class AShipPersonController {

    @Resource
    private SelRedMoneyService selRedMoneyService;

    @RequestMapping(value="/myCoupon.do",method= RequestMethod.POST)
    @ResponseBody
    public Object checkMyCoupon(@RequestBody RedMoney redMoney, HttpServletRequest request, HttpServletResponse response){

        Response<List<RedMoney>> resp=new Response<List<RedMoney>>();

        if(redMoney == null){
        resp.failByNoInputData("传入的用户为空");
        return resp;
        }

        else if(redMoney.getUseruuid()==null||redMoney.getUseruuid()==""){
            resp.failByNoInputData("传入的uuid为空");
            return resp;
        }


        List<RedMoney> redMoneyList= null;
        try {
            String useruuid=redMoney.getUseruuid();
            Date redMoneyDate=redMoney.getRedmoneydate();
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String redMoneyDateString =simpleDateFormat.format(redMoneyDate);
            HashMap<String,Object> hashMap=new HashMap<>();
            hashMap.put("useruuid",useruuid);
            hashMap.put("redMoneyDate",redMoneyDateString);
            redMoneyList = selRedMoneyService.selAllRedMoney(hashMap);
            //数据库查询数据
        } catch (Exception e) {
            e.printStackTrace();
            resp.failByException();
            return resp;
        }

        if(redMoneyList== null){
            resp.failByNoData();
        }else{
            resp.success(redMoneyList);

        }
        System.out.println('q');
        return resp;
    }

    /**
     * 使用红包的功能
     * @param
     * @return
     */
    @RequestMapping(value="useMyRedMoney.do",method= RequestMethod.POST)
    @ResponseBody
    public Response<String> useMyRedMoney (@RequestBody UseRedMoneyParam useRedMoneyParam,  HttpServletRequest request, HttpServletResponse response){
        Response<String> resp=new Response<>();



        return resp;
    }
}
