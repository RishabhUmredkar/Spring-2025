<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Student Details</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

<style>
/* General Styling */
body {
	background: linear-gradient(135deg, #1c1c1c, #444);
	color: #fff;
	font-family: 'Poppins', sans-serif;
	padding: 20px;
	display: flex;
	justify-content: center;
	align-items: center;
	min-height: 100vh;
}

/* Container */
.container {
	background: rgba(255, 255, 255, 0.1);
	padding: 30px;
	border-radius: 15px;
	box-shadow: 0 10px 30px rgba(0, 0, 0, 0.3);
	backdrop-filter: blur(10px);
	max-width: 1000px;
	width: 100%;
	animation: fadeIn 0.8s ease-in-out;
}

/* Table */
.table-container {
	overflow-x: auto;
}

.table {
	border-radius: 12px;
	overflow: hidden;
	margin-bottom: 0;
}

/* Adjusting Column Widths */
th:nth-child(2), td:nth-child(2) {
	width: 20%; /* Stream column is wider */
}

/* Table Headers */
thead th {
	background: rgba(255, 255, 255, 0.2);
	color: white;
	text-transform: uppercase;
	padding: 12px;
	font-weight: 600;
}

/* Table Row Hover */
tbody tr:hover {
	background: rgba(255, 255, 255, 0.1);
	cursor: pointer;
}

/* Buttons */
.btn-custom {
	border: none;
	padding: 8px 12px;
	border-radius: 5px;
	transition: 0.3s;
}

.btn-edit {
	background: #f39c12;
	color: white;
}

.btn-edit:hover {
	background: #e67e22;
}

.btn-delete {
	background: #e74c3c;
	color: white;
}

.btn-delete:hover {
	background: #c0392b;
}

.action-buttons {
	display: flex;
	justify-content: center;
	gap: 10px;
}

/* Pagination */
.pagination {
	margin-top: 15px;
	display: flex;
	justify-content: center;
	gap: 8px;
}

.pagination button {
	background: #ff758c;
	color: white;
	border: none;
	padding: 8px 15px;
	border-radius: 5px;
	cursor: pointer;
	transition: 0.3s;
}

.pagination button:hover {
	background: #e74c3c;
}

.pagination button:disabled {
	background: gray;
	cursor: not-allowed;
}

/* Fade-in Animation */
@keyframes fadeIn {
	from {
		opacity: 0;
		transform: translateY(-20px);
	}
	to {
		opacity: 1;
		transform: translateY(0);
	}
}
</style>
</head>

<body>
	<div class="container">
		<h2 class="text-center mb-4">📋 Student Details</h2>
		<div class="table-container">
			<table class="table table-hover text-center text-white" id="studentTable">
				<thead>
					<tr>
						<th>Name</th>
						<th class="w-25">Stream</th> <!-- Increased Width -->
						<th>Passout Year</th>
						<th>Email</th>
						<th>Mobile No</th>
						<th>Ratings</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="student" items="${std}">
						<tr>
							<td>${student.name}</td>
							<td>${student.stream}</td>
							<td>${student.passOut}</td>
							<td>${student.email}</td>
							<td>${student.phone}</td>
							<td>${student.rating}</td>
							<td class="action-buttons">
								<!-- Update Button -->
								<a href="updateStudent?id=${student.id}" class="btn btn-custom btn-edit">✏ Edit</a>

								<!-- Delete Button -->
								<a href="deleteStudent?id=${student.id}" class="btn btn-custom btn-delete"
								   onclick="return confirm('Are you sure you want to delete this student?');">
									🗑 Delete
								</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

		<!-- Pagination -->
		<div class="pagination">
			<button id="prevPage" disabled>⬅ Prev</button>
			<span id="pageNumber">1</span>
			<button id="nextPage">Next ➡</button>
		</div>
	</div>

	<script>
		$(document).ready(function () {
			let rowsPerPage = 5;
			let rows = $("#studentTable tbody tr");
			let totalRows = rows.length;
			let totalPages = Math.ceil(totalRows / rowsPerPage);
			let currentPage = 1;

			function showPage(page) {
				rows.hide();
				rows.slice((page - 1) * rowsPerPage, page * rowsPerPage).show();

				// Update button states
				$("#prevPage").prop("disabled", page === 1);
				$("#nextPage").prop("disabled", page === totalPages);

				$("#pageNumber").text(page);
			}

			$("#prevPage").click(function () {
				if (currentPage > 1) {
					currentPage--;
					showPage(currentPage);
				}
			});

			$("#nextPage").click(function () {
				if (currentPage < totalPages) {
					currentPage++;
					showPage(currentPage);
				}
			});

			// Initialize first page
			showPage(1);
		});
	</script>

</body>
</html>
