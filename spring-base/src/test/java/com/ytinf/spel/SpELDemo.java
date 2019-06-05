package com.ytinf.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.HashMap;
import java.util.Map;

public class SpELDemo {
    public static void main(String[] args) throws Exception {
        Map<String,String> data = new HashMap<>() ;
        data.put("黑娃娃","一个不怎么白的小哥哥") ;
        data.put("Hello","可爱的小李老师") ;
        String expString = "#{#allData.!['【' + #this.key + '】' + #this.value]}" ;
        SpelExpressionParser parser = new SpelExpressionParser() ;
        Expression expression = parser.parseExpression(expString,ParserContext.TEMPLATE_EXPRESSION);
        StandardEvaluationContext context = new StandardEvaluationContext();
        context.setVariable("allData",data); // 将集合设置为操作变量数据
        Object value = expression.getValue(context);
        System.out.println("【表达式执行结果】" + value);
        System.out.println("【原始集合】" + data);   // 输出原始的集合
        System.out.println(value.getClass());
    }
}