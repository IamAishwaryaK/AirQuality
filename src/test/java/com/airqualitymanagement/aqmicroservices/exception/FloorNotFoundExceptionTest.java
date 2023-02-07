package com.airqualitymanagement.aqmicroservices.exception;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class FloorNotFoundExceptionTest {


	@InjectMocks
	private FloorNotFoundException floorexcep;

	@Test
	public void testfloornotfond() {
		String reason = "Floor not found";
		assertEquals(reason, "Floor not found");
	}
}
