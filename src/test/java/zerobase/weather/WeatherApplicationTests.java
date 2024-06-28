package zerobase.weather;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class WeatherApplicationTests {

	@Test
	void eqaulsTest() { // 객체 a,b가 일치함을 확인, 객체에 정의된 equals를 통해 비교
		assertEquals(1, 1);
	}

	@Test
	void nullTest() { // 객체 a가 null인지 확인
		//assertNull(1);
		assertNull(null);
	}

	@Test
	void trueTest() { // 객체 a가 참인지 확인
		//assertNull(1);
		assertTrue(1==1);
	}
}
