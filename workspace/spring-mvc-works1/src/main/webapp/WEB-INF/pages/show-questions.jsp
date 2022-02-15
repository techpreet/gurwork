<%@ include file="./header.jspf" %>

	
	<div class="alert alert-danger">
		<div class="container">
			<h3 style="text-align:center">${TITLE }</h3>
		</div>
	</div>
	
	<div style="min-height: 450px">
		<table class="table table-striped">
			<thead>	
				<tr>
					<th>SL NO</th>
					<th>Question</th>
					<th>Option A</th>
					<th>Option B</th>
					<th>Option C</th>
					<th>Option D</th>
				</tr>
			</thead>
			
			
			<tbody>
				<nav:forEach items="${QUESTIONS }" var="q" varStatus="status">
				
					<tr>
						<td>${status.index +1 }</td>
						<td>${q.question }</td>
						<td>${q.option1 }</td>
						<td>${q.option2 }</td>
						<td>${q.option3 }</td>
						<td>${q.option4 }</td>
					</tr>
				</nav:forEach>
			</tbody>
		</table>
	</div>
	
 
 
<%@ include file="./footer.jspf" %>