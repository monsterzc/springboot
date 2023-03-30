package com.can.recevier;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @className: TopicTotalReceiver
 * @description: 主题交换机监听类
 * @author: zhengcan
 * @date: 2023/3/30
 **/

@Component
@RabbitListener(queues = "topic.woman")
public class TopicTotalReceiver {

    @RabbitHandler
    public void process(Map messageMap) {
        System.out.println("TopicTotalReceiver消费者收到消息："+messageMap.toString());
    }
}
