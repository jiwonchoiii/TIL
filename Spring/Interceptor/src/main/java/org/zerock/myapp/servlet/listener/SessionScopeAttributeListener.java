package org.zerock.myapp.servlet.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor

@WebListener
public class SessionScopeAttributeListener
	implements HttpSessionAttributeListener {

    
	
	public void attributeAdded(HttpSessionBindingEvent event) {
    	log.debug("attributeAdded(event) invoked.");
    	
    	HttpSession session = event.getSession();
    	String name = event.getName();
    	Object value = event.getValue();
    	
    	log.info("\t+ session: " + session.getId());
    	log.info("\t+ name: " + name);
    	log.info("\t+ value: " + value);
    } // attributeAdded


	public void attributeRemoved(HttpSessionBindingEvent event) {
    	log.debug("attributeRemoved(event) invoked.");
    	
    	HttpSession session = event.getSession();
    	String name = event.getName();
    	Object value = event.getValue();
    	
    	log.info("\t+ session: " + session.getId());
    	log.info("\t+ name: " + name);
    	log.info("\t+ value: " + value);
    } // attributeRemoved


	public void attributeReplaced(HttpSessionBindingEvent event) {
    	// 과도하게 이 이름으로 값이 대체됨. 출력양을 줄이기 위해서 추가함
    	if("javax.servlet.jsp.jstl.fmt.request.charset".equals(event.getName())) {
    		return;
    	} // if
    	
    	log.debug("attributeReplaced(event) invoked.");
    	
    	HttpSession session = event.getSession();
    	String name = event.getName();
    	Object value = event.getValue();
    	
    	log.info("\t+ session: " + session.getId());
    	log.info("\t+ name: " + name);
    	log.info("\t+ value: " + value);
    } // attributeReplaced
	
} // end class
