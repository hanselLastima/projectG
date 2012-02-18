package projectg

class QuoteController {

	def scaffold = true
	
	def home =  {
		render "<h1> Read programmers do not eat quiche! </h1>"
	}
	
    def index = { 
		redirect (action:home)
	}
	
	def random = {
		def randomQuote = new Quote(author:"Larry Wall", content:"There is more than one method to our madness")
		
		[author:randomQuote.author , content:randomQuote.content ]
	}
}
