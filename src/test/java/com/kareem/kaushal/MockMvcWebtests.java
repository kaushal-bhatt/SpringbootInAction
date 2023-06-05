//package com.kareem.kaushal;
//
//import com.kareem.kaushal.model.Book;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//
//public class MockMvcWebtests {
//
//
//    private MockMvc mockMvc;
//    @Autowired
//    private WebApplicationContext webContext;
//
//    @Before
//    public void setupMockMvc() {
//        mockMvc = MockMvcBuilders
//                .webAppContextSetup(webContext)
//                .build();
//    }
//
//    @Test
//    public void postBook() throws Exception {
//        mockMvc.perform(post("/readingList")
//                        .contentType(MediaType.APPLICATION_FORM_URLENCODED)
//                        .param("title", "SpringBoot")
//                        .param("author", "kaushal")
//                        .param("isbn", "1234567890")
//                        .param("description", "springboot in action"))
//                .andExpect(status().is3xxRedirection())
//                .andExpect(header().string("Location", "/readingList"));
//        Book expectedBook = new Book();
//        expectedBook.setId(1L);
//        expectedBook.setReader("craig");
//        expectedBook.setTitle("SpringBoot");
//        expectedBook.setAuthor("kaushal");
//        expectedBook.setIsbn("1234567890");
//        expectedBook.setDescription("springboot in action");
//        mockMvc.perform(get("/readingList"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("readingList"));
//    }
//}
