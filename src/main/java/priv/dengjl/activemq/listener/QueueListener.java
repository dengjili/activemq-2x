package priv.dengjl.activemq.listener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class QueueListener implements MessageListener{
	Logger logger = LoggerFactory.getLogger(QueueListener.class);

    @Override
    public void onMessage(Message message) {
        try {
            logger.debug("消息队列收到：{}", ((TextMessage)message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
