//package hello.web;
//
//import static org.hamcrest.Matchers.is;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
//import hello.Application;
//
//import java.nio.charset.Charset;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.context.WebApplicationContext;
//import org.springframework.web.servlet.ModelAndView;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = Application.class)
//@WebAppConfiguration
//public class TestGreetingController {
//	
//	  private MediaType json = new MediaType(MediaType.APPLICATION_JSON.getType(),
//	            MediaType.APPLICATION_JSON.getSubtype(),
//	            Charset.forName("utf8"));
//
//    private MockMvc mockMvc;
//
//    @Autowired
//    private WebApplicationContext webApplicationContext;
//
//    @Autowired
//    private GreetingController controller;
//    
//    @Before
//    public void setup() throws Exception {
//        this.mockMvc = webAppContextSetup(webApplicationContext).build();
//    }
//    
////    @Test
////    public void greetingOne() throws Exception {
////    	mockMvc.perform(get("/greeting"))
////    			.andDo(print())
////    			.andExpect(status().isOk())
////    			.andExpect(content().contentType(json))
////    			.andExpect(jsonPath("$.id", is(controller.getCounter())))
////    			.andExpect(jsonPath("$.content", is("Hello, World!")));
////    }
//    
//    @Test
//    public void greetingTom() throws Exception {
//    	mockMvc.perform(get("/greeting?name=Tom"))
//    			.andDo(print())
//    			.andExpect(status().isOk())
//    			.andExpect(content().contentType(json))
//    			.andExpect(jsonPath("$.id", is(controller.getCounter())))
//    			.andExpect(jsonPath("$.content", is("Hello, Tom!")));
//    }
// 
//
//    //Nuevo
//    
//    @RequestMapping("/greeting")
//    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
//        model.addAttribute("name", name);
//        return "greeting";
//    }
//}
