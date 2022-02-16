import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	
	private GradeBook a;
	private GradeBook b;

	@BeforeEach
	void setUp() throws Exception {
		a = new GradeBook(5);
		b = new GradeBook(5);
		
		a.addScore(50);
		a.addScore(75);
		b.addScore(7);
		b.addScore(14);
	}

	@AfterEach
	void tearDown() throws Exception {
		a = null;
		b = null;
	}

	@Test
	void testAddScore() {
		assertTrue(a.toString().equals("50.0 75.0 "));
		assertTrue(b.toString().equals("7.0 14.0 "));
	}

	@Test
	void testSum() {
		assertEquals(125, a.sum(), .0001);
		assertEquals(21, b.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(50, a.minimum(), .001);
		assertEquals(7, b.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(75, a.finalScore(), .001);
		assertEquals(14, b.finalScore(), .001);
	}

}
