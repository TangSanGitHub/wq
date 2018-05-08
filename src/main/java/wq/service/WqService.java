package wq.service;

import wq.entity.Message;

/**
 * Created by x on 2018/5/7.
 */
public interface WqService {
    int doPostMessage(Message message);
}
