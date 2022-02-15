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
					<th>StudentID</th>
					<th>Student Name</th>
					<th>Student DOB</th>
				</tr>
			</thead>
			
			
			<tbody>
				<nav:forEach items="${Students}" var="q" varStatus="status">
				
					<tr>
						<td>${status.index +1 }</td>
						<td>${q.studentId }</td>
						<td>${q.studentName }</td>
						<td>${q.studentDob }</td>

					</tr>
				</nav:forEach>
			</tbody>
		</table>
		<a href="home">Home</a>
	</div>
	
 
 
<%@ include file="./footer.jspf" %>