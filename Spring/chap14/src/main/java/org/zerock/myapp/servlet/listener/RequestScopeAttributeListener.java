package org.zerock.myapp.servlet.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor

@WebListener
public class RequestScopeAttributeListener
	implements ServletRequestAttributeListener {



    public void attributeRemoved(ServletRequestAttributeEvent event) {
    	log.debug("attributeRemoved(event) invoked.");
    	
    	String name = event.getName();
    	Object value = event.getValue();
    	
    	log.info("\t+ name: " + name);
    	log.info("\t+ value: " + value);
    } // attributeRemoved


    public void attributeAdded(ServletRequestAttributeEvent event) {
    	// 너무 많은 양을 출력하여, skip 처리함.
    	if("org.springframework.core.convert.ConversionService".equals(event.getName())) {
    		return;
    	} // if
    	
    	log.debug("attributeAdded(event) invoked.");
    	
    	String name = event.getName();
    	Object value = event.getValue();
    	
    	log.info("\t+ name: " + name);
    	log.info("\t+ value: " + value);
    } // attributeAdded


    public void attributeReplaced(ServletRequestAttributeEvent event) {
    	log.debug("attributeReplaced(event) invoked.");
    	
    	String name = event.getName();
    	Object value = event.getValue();
    	
    	log.info("\t+ name: " + name);
    	log.info("\t+ value: " + value);
    } // attributeReplaced
	
} // end class
