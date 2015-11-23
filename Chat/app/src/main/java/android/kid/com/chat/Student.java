package android.kid.com.chat;

import cn.bmob.v3.BmobObject;

/**
 * Created by Administrator on 2015/11/16.
 */
public class Student extends BmobObject {
    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
