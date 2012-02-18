package projectg

class QuoteController {

	def scaffold = true
	def quoteService
	
	def home =  {
		render "<h1> Read programmers do not eat quiche! </h1>"
	}
	
    def index = { 
		redirect (action:list)
	}
	
	def random = {
		def randomQuote = quoteService.getRandomQuote()
		
		[quote : randomQuote]
	}
	
	def ajaxRandom = {
		def randomQuote = quoteService.getRandomQuote()
		
		[quote : randomQuote]
	}
}
