package org.zerock.myapp.controller;

import static org.junit.Assert.assertNotNull;

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

//@RunWith(SpringRunner.class)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {
//	"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"
	
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
public class BoardControllerTests {
	
	// Controller 는 여타 다른 계층의 빈 객체처럼 주입받지 않는다!!
//	@Setter(onMethod_=@Autowired)
//	private BoardController controller;
	
	@Setter(onMethod_=@Autowired)
	private WebApplicationContext ctx;	// Spring Beans Container 객체

	private MockMvc mockMvc;			// Web Browser Emulator for only Spring MVC
	
	
	@Before
	public void setup() {					// 사전처리
		log.debug("setup() invoked.");
		
		assertNotNull(this.ctx);
		log.info("\t+ ctx: {}", ctx);
		
//		String[] allBeans = ctx.getBeanDefinitionNames();
//		int index = 1;
//		for(String beanName : allBeans) {
//			log.info("{}. bean: {}", index++, beanName);
//		} // enhanced for
	} // setup
	
	
	@After
	public void tearDown() {				// 사후처리
		log.debug("tearDown() invoked.");

	} // tearDown
	
	
	@Test
	public void testList() throws Exception {
		log.debug("testList() invoked.");
		
		//----------------------------------------------------------------------//
		// (1) 가짜 웹브라우저와 HTTP Request를 만들어서 요청을 보내서, 컨트롤러 메소드가 수행되고,
		//     수행된 컨트롤러 메소드의 결과물인 Model과 View 이름을 얻어냄
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
		// (2) (1)에서 얻어낸 Model 객체의 모든 key와 value를 출력
		//----------------------------------------------------------------------//
		
		modelMap.forEach((k, v) -> {
//			log.info("\t+ k: " + k);
//			log.info("\t+ v: " + v);
			
			log.info("\t+ (key, value) = ({}, {})", k, v);
		}); // forEach
		
		modelMap.clear();
		modelMap = null;
	} // testList
	
	
	@Test(timeout=1000)
	public void testListPerPage() throws Exception {
		log.debug("testListPerPage() invoked.");
		
		//----------------------------------------------------------------------//
		// (1) 가짜 웹브라우저와 HTTP Request를 만들어서 요청을 보내서, 컨트롤러 메소드가 수행되고,
		//     수행된 컨트롤러 메소드의 결과물인 Model과 View 이름을 얻어냄
		//----------------------------------------------------------------------//
		
		MockMvcBuilder mockMvcBuilder = MockMvcBuilders.webAppContextSetup(ctx);
		MockMvc mockMvc = mockMvcBuilder.build();
		
		RequestBuilder reqBuilder = MockMvcRequestBuilders.get("/board/listPerPage");
		
		// ModelMap => LinkedHashMap<String, ArrayList>
		ModelMap modelMap = 
			mockMvc.
				perform(reqBuilder).
				andReturn().
				getModelAndView().
				getModelMap();
		
		//----------------------------------------------------------------------//
		// (2) (1)에서 얻어낸 Model 객체의 모든 key와 value를 출력
		//----------------------------------------------------------------------//
		
		modelMap.forEach((k, v) -> {
//			log.info("\t+ k: " + k);
//			log.info("\t+ v: " + v);
			
			log.info("\t+ (key, value) = ({}, {})", k, v);
		}); // forEach
		
		modelMap.clear();
		modelMap = null;
	} // testListPerPage
	
	
	@Test
	public void testGet() throws Exception {
		log.debug("testGet() invoked.");
		
		//----------------------------------------------------------------------//
		// (1) 가짜 웹브라우저와 HTTP Request를 만들어서 요청을 보내서, 컨트롤러 메소드가 수행되고,
		//     수행된 컨트롤러 메소드의 결과물인 Model과 View 이름을 얻어냄
		//----------------------------------------------------------------------//
		
		MockMvcBuilder mockMvcBuilder = MockMvcBuilders.webAppContextSetup(this.ctx);
		MockMvc mockMvc = mockMvcBuilder.build();					// 가짜 브라우저 생성
		
		MockHttpServletRequestBuilder reqBuilder = 
			MockMvcRequestBuilders.get("/board/get");	// Request URI 생성
		
		reqBuilder.param("bno", "999");				// 전송파라미터의 설정
		
		ModelMap modelMap = 
			mockMvc.
				perform(reqBuilder).
				andReturn().
				getModelAndView().
				getModelMap();
		
		//----------------------------------------------------------------------//
		// (2) (1)에서 얻어낸 Model 객체의 모든 key와 value를 출력
		//----------------------------------------------------------------------//
		
		modelMap.forEach((k, v) -> {
			log.info("\t+ (key, value) = ({}, {})", k, v);
		}); // forEach
		
		// 자원해제코드
		modelMap.clear();
		modelMap = null;
	} // testGet
	
	
	@Test
	public void testRemove() {		// /board/remove + bno
		log.debug("testGet() invoked.");
		
	} // testRemove

} // end class
