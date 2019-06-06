package com.ytinf.config;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jms.connection.SingleConnectionFactory;
import org.springframework.jms.core.JmsTemplate;
import javax.jms.ConnectionFactory;
@Configuration          // 此时明确描述当前的类是一个配置的程序类
@PropertySource("classpath:config/activemq.properties")
public class ActiveMQConfig {
    @Value("${activemq.broker.url}")    // 导入资源中的配置项
    private String brokerUrl ;
    @Value("${activemq.user.name}")
    private String userName ;
    @Value("${activemq.user.password}")
    private String password ;
    @Value("${activemq.queue.name}")
    private String queueName ;
    // 1、创建一个ActiveMQ的连接工厂类的实例
    @Bean   // 表示当前是基于Bean的配置模式完成的
    public ActiveMQConnectionFactory getTargetConnectionFactory() {
        ActiveMQConnectionFactory targetConnectionFactory = new ActiveMQConnectionFactory() ;
        targetConnectionFactory.setBrokerURL(this.brokerUrl);
        targetConnectionFactory.setUserName(this.userName);
        targetConnectionFactory.setPassword(this.password);
        return targetConnectionFactory ;
    }
    // 2、配置Spring的消息连接工厂
    @Bean("connectionFactory")
    public ConnectionFactory getSingleConnectionFactory(
            @Autowired
            ActiveMQConnectionFactory targetConnectionFactory
    ) {
        SingleConnectionFactory connectionFactory = new SingleConnectionFactory() ;
        connectionFactory.setTargetConnectionFactory(targetConnectionFactory);
        return connectionFactory ;
    }
    // 3、设置队列消息的目标
    @Bean("destination")
    public ActiveMQQueue getDestination() {
        ActiveMQQueue destination = new ActiveMQQueue(this.queueName) ;
        return destination ;
    }
    // 4、设置JmsTemplate以方便消息的发送处理
    @Bean("jmsTemplate")
    public JmsTemplate getJmsTemplate(
            @Autowired
            ConnectionFactory connectionFactory
    ) {
        JmsTemplate jmsTemplate = new JmsTemplate() ;
        jmsTemplate.setConnectionFactory(connectionFactory);
        return jmsTemplate ;
    }
}
