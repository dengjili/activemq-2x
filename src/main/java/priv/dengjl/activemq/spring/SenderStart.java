package priv.dengjl.activemq.spring;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SenderStart {
	public static void main(String[] args) {

		Logger logger = LoggerFactory.getLogger(SenderStart.class);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:service-jms-reveiver.xml");
		logger.debug("消费端启动成功！！！");
	}
}
