<h1>This is my contact page</h1>

<div class="list-group">
	<c:forEach items="${categories}" var="category">
		<a href="#" class="list-group-item">${category.name}</a>
	</c:forEach>

</div>