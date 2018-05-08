package wq.service;

import org.springframework.stereotype.Service;
import wq.dao.WqDao;
import wq.entity.Message;

import javax.annotation.Resource;

/**
 * Created by x on 2018/5/7.
 */
@Service
public class WqServiceImpl implements WqService {
    @Resource
    private WqDao wqDao;
    @Override
    public int doPostMessage(Message message) {
        int i = wqDao.doPostMessage(message);
        return i;
    }
}
