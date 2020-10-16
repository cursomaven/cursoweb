package curso.gfi.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class UnoTest {

	
	@Test
	public void uno() {
		
		assertEquals("uno", "uno");
	}

}
