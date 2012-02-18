package projectg

class QuoteService {
	
	boolean transactional = false

    def getStaticQuote() {
		return new Quote(author: "Anonymous", content: "Real programmers don't eat quiche")
    }
	
	def getRandomQuote() {
		def allQuotes = Quote.list()
		def randomQuote = null
		
		if(allQuotes.size() > 0) {
			def randomIndex = new Random().nextInt(allQuotes.size)
			randomQuote = allQuotes[randomIndex]
		} else {
			randomQuote = getStaticQuote()
		}
		
		return randomQuote
	}
}
