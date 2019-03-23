package priv.dengjl.activemq.spring;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReceiverStart {
	public static void main(String[] args) {
		
		Logger logger = LoggerFactory.getLogger(ReceiverStart.class);
		
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext(
                        "classpath:service-jms-sender.xml");

        SenderService service = context.getBean(SenderService.class);

        service.sendQueue("测试消息  1");
        service.sendQueue("测试消息  2");
        service.sendTopic("测试消息  3");
        
        logger.debug("发送成功！！！");
    }
}
