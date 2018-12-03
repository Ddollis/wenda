package com.nowcoder.async;

import java.util.List;

/**
 * 事件处理程序
 */
public interface EventHandler {
    /**
     * 处理程序
     * @param model 事件类型
     */
    void doHandler(EventModel model);

    /**
     * 获取支持的事件类型
     * @return 事件类型的列表
     */
    List<EventType> getSupportEventType();
}
