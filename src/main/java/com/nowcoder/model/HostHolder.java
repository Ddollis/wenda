package com.nowcoder.model;

import org.springframework.stereotype.Component;

//不清楚是哪个层面用 component
@Component
public class HostHolder {
    private static ThreadLocal<User> users = new ThreadLocal<User>(); // 线程本地变量

    public User getUser() {
        return users.get();
    }

    public void setUser(User user) {
        users.set(user);
    }

    public void clear() {
        users.remove();
    }
}
