package com.ytinf.util.action;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.beans.PropertyEditorSupport;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class AbstractAction {
    private static final DateTimeFormatter LOCAL_DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd") ;
    @InitBinder
    public void initBinder(WebDataBinder binder) {  // 通过此绑定设置处理转换
        binder.registerCustomEditor(java.util.Date.class,new PropertyEditorSupport(){
            @Override
            public void setAsText(String text) throws IllegalArgumentException {
                LocalDate localDate = LocalDate.parse(text,LOCAL_DATE_FORMAT) ; // 设置本地日期实例
                ZoneId zoneId = ZoneId.systemDefault() ;
                Instant instant = localDate.atStartOfDay().atZone(zoneId).toInstant() ;
                super.setValue(java.util.Date.from(instant)); // 字符串与日期转换
            }
        });
    }
    public HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest() ;
    }
    public HttpServletResponse getResponse() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
    }
    public HttpSession getSession() {
        return this.getRequest().getSession() ;
    }
    public ServletContext getApplication() {
        return this.getRequest().getServletContext() ;
    }
}
