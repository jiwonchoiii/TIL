package org.zerock.myapp.controller;

import java.util.Objects;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
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
import lombok.extern.log4j.Log4j;



@Log4j
@NoArgsConstructor


// Annotation for testing the controller.
@WebAppConfiguration

//@RunWith(SpringRunner.class)
@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations= {
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
public class BoardControllerTests {
	
//	@Setter(onMethod_= { @Autowired })
//	@Setter(onMethod_= { @Inject })
	
//	@Setter(onMethod_= { @Resource })
//	@Setter(onMethod_= { @Resource(type=WebApplicationContext.class) })
	
//	@Setter(onMethod_= @Autowired)
//	@Setter(onMethod_= @Inject)
	
//	@Setter(onMethod_= @Resource)
//	@Setter(onMethod_= @Resource(type=WebApplicationContext.class))
	
//	@Inject
//	@Autowired
	
//	@Resource
	@Resource(type = WebApplicationContext.class)
	private WebApplicationContext ctx;				// Spring Context (Bean Container)
	
//	private MockMvc mockMvc;
	
	
	@Before
	public void setup() {
		log.debug("setup() invoked.");
		
		Objects.requireNonNull(ctx);
		log.info("\t+ ctx: " + ctx);
	} // setup
	
	
	@Test(timeout=1000)
	public void testList() throws Exception {
		log.debug("testList() invoked.");
		
		//----------------------------------------------------------------------//
		
//		MockMvcBuilder mockMvcBuilder = MockMvcBuilders.webAppContextSetup(ctx);
//		log.info("\t(1) mockMvcBuilder: " + mockMvcBuilder);
//		
//		MockMvc mockMvc = mockMvcBuilder.build();
//		log.info("\t(2) mockMvc: " + mockMvc);
//
//		RequestBuilder reqBuilder = MockMvcRequestBuilders.get("/board/list");
//		log.info("\t(3) reqBuilder: " + reqBuilder);
//		
//		ResultActions resultActions = mockMvc.perform(reqBuilder);
//		log.info("\t(4) resultActions: " + resultActions);
//		
//		MvcResult mvcResult = resultActions.andReturn();
//		log.info("\t(5) mvcResult: " + mvcResult);
//		
//		ModelAndView modelAndView = mvcResult.getModelAndView();
//		log.info("\t(6) modelAndView: " + modelAndView);
//		
//		Map<String, Object> model = modelAndView.getModel();
//		log.info("\t(7) model: " + model);
//		
//		String viewName = modelAndView.getViewName();
//		log.info("\t(8) viewName: " + viewName);
//		
//		View view = modelAndView.getView();
//		log.info("\t(9) view: " + view);
		
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
		
		modelMap.forEach((t, u) -> {
			log.info("\t+ t: " + t);
			log.info("\t+ u: " + u);
		}); // forEach
		
		modelMap.clear();
		modelMap = null;
	} // testList
	
	
	@Test(timeout=1000)
	public void testListPerPage() throws Exception {
		log.debug("testListPerPage() invoked.");
		
		//----------------------------------------------------------------------//
		
//		MockMvcBuilder mockMvcBuilder = MockMvcBuilders.webAppContextSetup(ctx);
//		log.info("\t(1) mockMvcBuilder: " + mockMvcBuilder);
//		
//		MockMvc mockMvc = mockMvcBuilder.build();
//		log.info("\t(2) mockMvc: " + mockMvc);
//
//		RequestBuilder reqBuilder = MockMvcRequestBuilders.get("/board/list");
//		log.info("\t(3) reqBuilder: " + reqBuilder);
//		
//		ResultActions resultActions = mockMvc.perform(reqBuilder);
//		log.info("\t(4) resultActions: " + resultActions);
//		
//		MvcResult mvcResult = resultActions.andReturn();
//		log.info("\t(5) mvcResult: " + mvcResult);
//		
//		ModelAndView modelAndView = mvcResult.getModelAndView();
//		log.info("\t(6) modelAndView: " + modelAndView);
//		
//		Map<String, Object> model = modelAndView.getModel();
//		log.info("\t(7) model: " + model);
//		
//		String viewName = modelAndView.getViewName();
//		log.info("\t(8) viewName: " + viewName);
//		
//		View view = modelAndView.getView();
//		log.info("\t(9) view: " + view);
		
		//----------------------------------------------------------------------//
		
		MockMvcBuilder mockMvcBuilder = MockMvcBuilders.webAppContextSetup(ctx);
		MockMvc mockMvc = mockMvcBuilder.build();
		
		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.get("/board/listPerPage");
		reqBuilder.param("currPage", "1");
		reqBuilder.param("amount", "20");
		reqBuilder.param("pagesPerPage", "10");
		
		// ModelMap => LinkedHashMap<String, ArrayList>
		ModelMap modelMap = 
			mockMvc.
				perform(reqBuilder).
				andReturn().
				getModelAndView().
				getModelMap();
		
		//----------------------------------------------------------------------//
		
		modelMap.forEach((t, u) -> {
			log.info("\t+ t: " + t);
			log.info("\t+ u: " + u);
		}); // forEach
		
		modelMap.clear();
		modelMap = null;
	} // testListPerPage
	
	
	@Test(timeout=1000)
	public void testRegister() throws Exception {
		log.debug("testResult() invoked.");
		
		MockMvcBuilder mockMvcBuilder = MockMvcBuilders.webAppContextSetup(ctx);
		MockMvc mockMvc = mockMvcBuilder.build();
		
		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.post("/board/register");
		reqBuilder.param("title", "TITLE_NEW");
		reqBuilder.param("content", "CONTENT_NEW");
		reqBuilder.param("writer", "WRITER_NEW");
		
		String viewName = 
			mockMvc.
				perform(reqBuilder).
				andReturn().
				getModelAndView().
				getViewName();
		
		log.info("\t+ viewName: " + viewName);
	} // testRegister
	
	
	@Test(timeout=1000)
	public void testGet() throws Exception {
		log.debug("testGet() invoked.");
		
		MockMvcBuilder mockMvcBuilder = MockMvcBuilders.webAppContextSetup(ctx);
		MockMvc mockMvc = mockMvcBuilder.build();
		
		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.get("/board/get");
		reqBuilder.param("bno", "84");
		
		ModelMap modelMap =
			mockMvc.
				perform(reqBuilder).
				andReturn().
				getModelAndView().
				getModelMap();
		
		//----------------------------------------------------------------------//
		
		modelMap.forEach((t, u) -> {
			log.info("\t+ t: " + t);
			log.info("\t+ u: " + u);
		}); // forEach
		
		modelMap.clear();
		modelMap = null;
	} // testGet
	
	
	@Test(timeout=1000)
	public void testModify() throws Exception {
		log.debug("testModify() invoked.");
		
		MockMvcBuilder mockMvcBuilder = MockMvcBuilders.webAppContextSetup(ctx);
		MockMvc mockMvc = mockMvcBuilder.build();
		
		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.post("/board/modify");
		reqBuilder.param("bno", "84");
		reqBuilder.param("title", "TITLE_MODIFIED");
		reqBuilder.param("content", "CONTENT_MODIFIED");
		reqBuilder.param("writer", "WRITER_MODIFIED");
		
		String viewName =
			mockMvc.
				perform(reqBuilder).
				andReturn().
				getModelAndView().
				getViewName();
		
		log.info("\t+ viewName: " + viewName);
	} // testModify
	
	
	@Test(timeout=1000)
	public void testRemove() throws Exception {
		log.debug("testModify() invoked.");
		
		MockMvcBuilder mockMvcBuilder = MockMvcBuilders.webAppContextSetup(ctx);
		MockMvc mockMvc = mockMvcBuilder.build();
		
		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.post("/board/remove");
		reqBuilder.param("bno", "84");
		
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
