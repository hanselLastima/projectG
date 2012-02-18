package projectg

class Quote {

	String author
	String content
	Date createDate = new Date()
	
    static constraints = {
    	author(blank:false)
		content(maxSize:1000, blank:false)	
    }
}
