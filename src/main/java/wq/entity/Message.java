package wq.entity;

import java.io.Serializable;

/**
 * Created by x on 2018/5/7.
 */
public class Message implements Serializable {
    private static final long serialVersionUID = 5684055910696744365L;
    private String name;
    private String info;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
