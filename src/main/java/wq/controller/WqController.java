package wq.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import wq.entity.Message;
import wq.entity.ResponseBean;
import wq.exception.ActivityServiceException;
import wq.service.WqService;

import javax.annotation.Resource;
import java.rmi.ServerException;

/**
 * Created by x on 2018/5/7.
 */
@Controller
@RequestMapping("/wq/")
public class WqController {
    @Resource
    private WqService wqService;
    @RequestMapping("postMessage.do")
    @ResponseBody
    public ResponseBean doPostMessage(@RequestBody Message message) {
        if(StringUtils.isEmpty(message)){
            throw new ActivityServiceException(1,
                    "请输入正确信息");
        }
        if(StringUtils.isEmpty(message.getName())){
            throw new ActivityServiceException(2,
                    "请输入正确的房号");
        }
        if(message.getName().length()>10){
            throw new ActivityServiceException(2,
                    "请输入正确的房号");
        }
        if(StringUtils.isEmpty(message.getInfo())){
            throw new ActivityServiceException(3,
                    "信息不能为空");
        }
        int i = wqService.doPostMessage(message);
        return new ResponseBean(i!=0);
    }
}
