package com.ytinf.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@ContextConfiguration(locations = {"classpath:spring/spring-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTestTransactionBean {
    @Autowired
    private PlatformTransactionManager transactionManager ;
    @Autowired
    private JdbcTemplate jdbcTemplate ; // 注入一个数据库的操作对象
    @Test
    public void testTransaction() {
        // 如果要想进行传播属性的定义，那么肯定需要设置有一个传播属性的操作子类；
        // 如果要进行属性的设置只能够通过 DefaultTransactionDefinition子类完成
        DefaultTransactionDefinition transactionDefinition = new DefaultTransactionDefinition() ;
        // 设置事务的传播属性为“PROPAGATION_REQUIRED”
        transactionDefinition.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        // 设置事务的隔离级别由数据库自行进行处理
        transactionDefinition.setIsolationLevel(TransactionDefinition.ISOLATION_DEFAULT);
        transactionDefinition.setReadOnly(true); // 如果有需要可以设置为只读事务
        // 获取事务的当前的处理状态，以后的提交提交的是整个处理状态
        TransactionStatus transactionStatus = this.transactionManager.getTransaction(transactionDefinition);
        try {
            String sql = "DELETE FROM news WHERE nid=?";
            long nid = 2;
            int len = this.jdbcTemplate.update(sql, nid);
            System.out.println("更新行数：" + len);
            this.transactionManager.commit(transactionStatus);  // 手工提交事务
        } catch (Exception e) {
            e.printStackTrace();
            this.transactionManager.rollback(transactionStatus);    // 手工回滚事务
        }
    }
}
