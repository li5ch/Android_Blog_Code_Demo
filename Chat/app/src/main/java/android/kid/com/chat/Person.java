package android.kid.com.chat;

import cn.bmob.v3.BmobObject;

/**
 * Created by Administrator on 2015/11/16.
 */
public class Person extends BmobObject {
    private String name;
    private String age;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }



}
