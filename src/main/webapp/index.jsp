	<html>
		<body>
			<h2>Hello!</h2>
			Card 1 <%=com.jannemange.games.texasweb.Texasweb.getCard()%>
			<br />
			Card 2 <%=com.jannemange.games.texasweb.Texasweb.getCard()%>
			<br />
			<h3>Shuffle!</h3>
			<%
				com.jannemange.games.texasweb.Texasweb.ShuffleDeck();
			%>
			Card 1 <%=com.jannemange.games.texasweb.Texasweb.getCard()%>
			<br />
			Card 2 <%=com.jannemange.games.texasweb.Texasweb.getCard()%>
			<br />
		</body>
	</html>
