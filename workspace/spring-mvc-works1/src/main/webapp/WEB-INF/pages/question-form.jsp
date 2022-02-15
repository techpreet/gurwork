<%@include file="./header.jspf"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>


<div class="row">
	<div class="col">
		<sf:form modelAttribute="question" action="save-question"
			method="post">

	<div class="row">
		<div class="col col-md-6">
		
			<div class="row mb-3">
				<label for="question" class="col-sm-2 col-form-label">Question</label>
				<div class="col-sm-10">
					<sf:input path="question" cssClass="form-control"/>
				</div>
			</div>


			<div class="row mb-3">
				<label for="option1" class="col-sm-2 col-form-label">Option A</label>
				<div class="col-sm-10">
					<sf:input path="option1" cssClass="form-control"/>
				</div>
			</div>


			<div class="row mb-3">
				<label for="option2" class="col-sm-2 col-form-label">Option B</label>
				<div class="col-sm-10">
					<sf:input path="option2" cssClass="form-control"/>
				</div>
			</div>


			<div class="row mb-3">
				<label for="option3" class="col-sm-2 col-form-label">Option C</label>
				<div class="col-sm-10">
					<sf:input path="option3" cssClass="form-control"/>
				</div>
			</div>


			<div class="row mb-3">
				<label for="option4" class="col-sm-2 col-form-label">Option D</label>
				<div class="col-sm-10">
					<sf:input path="option4" cssClass="form-control"/>
				</div>
			</div>

			
			<div class="form-group row">
				<button class="btn btn-danger">Submit</button>
			</div>

		
		
		</div>
		<div class="col col-md-6">
			<p>Some other details</p>
		</div>
	</div>


		</sf:form>
	</div>
</div>




<%@include file="./footer.jspf"%> 