package com.springLab.songr;

import com.springLab.songr.models.Album;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@AutoConfigureMockMvc
class SongrApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@Test
	public void albumConstructorTest() {
		Album sut = new Album("Test Album Title", "Test Artist", 10, 1000, "testUrl");
		assertEquals("Test Album Title", sut.getTitle());
		assertEquals("Test Artist", sut.getArtist());
		assertEquals(10, sut.getSongCount());
		assertEquals(1000, sut.getLength());
		assertEquals("testUrl", sut.getImageUrl());
	}

	@Test
	public void Test_helloWorld() throws Exception {
		mockMvc.perform(get("/hello"))
				.andDo(print())
				.andExpect(content().string(containsString("<h1>Hello, World!</h1>")))
				.andExpect(status().isOk());
	}

	@Test
	public void Test_Songr_App() throws Exception {
		mockMvc.perform(get("/albums"))
				.andDo(print())
				.andExpect(content().string(containsString("<h1>Albums</h1>")))
				.andExpect(status().isOk());
	}
}
