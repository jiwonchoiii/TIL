package org.zerock.myapp.controller;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.WebApplicationContext;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

// Spring Beans Container 객체의 생성 + Spring MVC 흐름을 생성
@WebAppConfiguration

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
public class BoardControllerTests {

	@Setter(onMethod_ = @Autowired)
	private WebApplicationContext ctx; // Spring Beans Container 객체
	
	private MockMvc mockMvc; // Web Browser Emulator for only Spring MVC

	// Controller는 여타 다른 계층의 빈 객체처럼 주입받지 않는다.
//	@Setter(onMethod_ = @Autowired)
//	private BoardController controller; // DI

	@Before
	public void setUp() {
		log.debug("setUp() invoked.");

		assertNotNull(this.ctx);
		log.info("\t+ ctx: " + ctx);

//		String[] allBeans = ctx.getBeanDefinitionNames();
//		
//		int index = 1;
//		for (String beanName : allBeans) {
//			log.info("{}. beans: {}", index++, beanName);
//		}
	} // setUp

	@Test
	public void testList() throws Exception {
		log.debug("testList() invoked.");


	      
	      //----------------------------------------------------------------------//
	      // MockMvc 를 이용한 웨브라우저 에뮬레이션 수행( HTTP request 문서 생성 )
	      //----------------------------------------------------------------------//
	      
//	      MockMvcBuilder mockMvcBuilder = MockMvcBuilders.webAppContextSetup(ctx);
//	      log.info("\t(1) mockMvcBuilder: " + mockMvcBuilder);
//	      
//	      MockMvc mockMvc = mockMvcBuilder.build();
//	      log.info("\t(2) mockMvc: " + mockMvc);
//
//	      RequestBuilder reqBuilder = MockMvcRequestBuilders.get("/board/list");
//	      log.info("\t(3) reqBuilder: " + reqBuilder);
//	      
//	      // 지정된 RequestBuilder를 통해, HTTP Request를 만들어 보냄
//	      ResultActions resultActions = mockMvc.perform(reqBuilder);
//	      log.info("\t(4) resultActions: " + resultActions);
//	      
//	      // 위에서 요청을 보낸 결과로 HTTP Response를 받는 코드 
//	      MvcResult mvcResult = resultActions.andReturn();
//	      log.info("\t(5) mvcResult: " + mvcResult);
//	      
//	      ModelAndView modelAndView = mvcResult.getModelAndView();
//	      log.info("\t(6) modelAndView: " + modelAndView);
//	      
//	      Map<String, Object> model = modelAndView.getModel();
//	      log.info("\t(7) model: " + model);
//	      
//	      String viewName = modelAndView.getViewName();
//	      log.info("\t(8) viewName: " + viewName);
//	      
//	      View view = modelAndView.getView();
//	      log.info("\t(9) view: " + view);
		
	      //----------------------------------------------------------------------//
		  // (1) 가짜 웹브라우저와 HTTP request를 만들어서 요청을 보내서, 컨트롤러 메소드가 수행되고,
		  // 수행된 컨트롤러 메소드의 결과물인 Model과 View 이름을 얻어냄 
	      //----------------------------------------------------------------------//

		
	      MockMvcBuilder mockMvcBuilder = MockMvcBuilders.webAppContextSetup(ctx);
	      MockMvc mockMvc = mockMvcBuilder.build();
	      
	      RequestBuilder reqBuilder = MockMvcRequestBuilders.get("/board/list");
	      
	      // ModelMap => LinkedHashMap<String, ArrayList>
	      ModelMap modelMap = 
	         mockMvc.
	            perform(reqBuilder).
	            andReturn().
	            getModelAndView().
	            getModelMap();
	      
	      //----------------------------------------------------------------------//

	      modelMap.forEach((k,v) -> {
//	    	  log.info("\t+ k: " + k);
//	    	  log.info("\t+ v: " + v);
	    	  
	    	  log.info("\t + (key,value) = ({},{})", k, v);
	    	  
	      }); // forEach
	      
	      modelMap.clear();
	      modelMap = null;

	} // testList
	
	@Test
	public void testGet() throws Exception {
		log.debug("testGet() invoked.");
		
		
		MockMvcBuilder mockMvcBuilder = MockMvcBuilders.webAppContextSetup(this.ctx);
		MockMvc mockMvc = mockMvcBuilder.build(); // 가짜 브라우저 생성
		
		MockHttpServletRequestBuilder reqBuilder = 
				MockMvcRequestBuilders.get("/board/get"); // Request URI 생성
		reqBuilder.param("bno", "100"); // 전송파라미터의 설정
		
		ModelMap modelMap = mockMvc.perform(reqBuilder).andReturn().getModelAndView().getModelMap();
		
		
	      modelMap.forEach((k,v) -> {
//	    	  log.info("\t+ k: " + k);
//	    	  log.info("\t+ v: " + v);
	    	  
	    	  log.info("\t + (key,value) = ({},{})", k, v);
	    	  
	      }); // forEach
	      
	      modelMap.clear();
	      modelMap = null;

	} // testGet
	
	@Test
	public void testRemove() throws Exception {
		log.debug("testModify() invoked.");
		
		MockMvcBuilder mockMvcBuilder = MockMvcBuilders.webAppContextSetup(ctx);
		MockMvc mockMvc = mockMvcBuilder.build();
		
		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.post("/board/remove");
		reqBuilder.param("bno", "100");
		
		String viewName =
				mockMvc.
					perform(reqBuilder).
					andReturn().
					getModelAndView().
					getViewName();
		
		log.info("\t+ viewName: " + viewName);
	} // testRemove


	@After
	public void tearDown() {
		log.debug("tearDown() invoked.");
	
	} // tearDown

} // end class
