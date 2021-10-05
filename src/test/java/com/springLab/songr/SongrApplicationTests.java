package com.springLab.songr;

import com.springLab.songr.models.Album;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
class SongrApplicationTests {

	@Test
	public void albumConstructorTest() {
		Album sut = new Album("Test Album Title", "Test Artist", 10, 1000, "testUrl");
		assertEquals("Test Album Title", sut.getTitle());
		assertEquals("Test Artist", sut.getArtist());
		assertEquals(10, sut.getSongCount());
		assertEquals(1000, sut.getLength());
		assertEquals("testUrl", sut.getImageUrl());
	}

}
