<table class="table table-bordered" style="margin-left: 15px;margin-top: 50px;">
				<thead>
					<tr>
						<th>Firstname</th>
						<th>Mobile Number</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${categories}" var="category">
						<tr class="">
							<td>${category.name}</td>
							<%-- <td>url(src="${images}/${category.imageURL}")</td>  --%>
							<td><img src="${images}/${category.imageURL}" height="250px" width="250px"></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
