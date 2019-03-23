package priv.dengjl.activemq.spring;

import javax.jms.TextMessage;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class SenderService {

	@Autowired
	private JmsTemplate jmsTemplate;

	@Autowired
	private ActiveMQQueue queue;

	@Autowired
	private ActiveMQTopic topic;

	// 发送点对点
	public void sendQueue(String message) {
		jmsTemplate.send(queue, session -> {
			TextMessage textMessage = session.createTextMessage();
			textMessage.setText(message);
			return textMessage;
		});
	}
	
	// 发送发布订阅
	public void sendTopic(String message) {
		jmsTemplate.send(topic, session -> {
			TextMessage textMessage = session.createTextMessage();
			textMessage.setText(message);
			return textMessage;
		});
	}
}
