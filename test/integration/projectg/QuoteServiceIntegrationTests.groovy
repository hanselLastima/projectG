package projectg

import static org.junit.Assert.*
import org.junit.*

class QuoteServiceIntegrationTests {

    @Before
    void setUp() {
        // Setup logic here
    }

    @After
    void tearDown() {
        // Tear down logic here
    }
	
	def quoteService
	
	@Test
	void testStaticQuote() {
		def staticQuote = quoteService.getStaticQuote()
		assertEquals("Anonymous", staticQuote.author)
		assertEquals("Real programmers don't eat quiche", staticQuote.content)
	}
}
