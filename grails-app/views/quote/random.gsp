<html>
<head>
<title>Random Quote</title>
<g:javascript library="prototype" />
</head>
<body>

	<ul id="menu">
		<li><g:remoteLink action="random" update="quote"> New Quote </g:remoteLink></li>
		<li><g:link action="list"> Admin </g:link></li>
	</ul>

	<div id="quote">
		<q>
			${quote.content}
		</q>
		<p>
			author |
			${quote.author}
		</p>
	</div>
</body>
</html>