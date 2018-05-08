package wq.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import wq.entity.Message;

/**
 * Created by x on 2018/5/7.
 */
@Repository
public interface WqDao {
    int doPostMessage(@Param("message")Message message);
}
