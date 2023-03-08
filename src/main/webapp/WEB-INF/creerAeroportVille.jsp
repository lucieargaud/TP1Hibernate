<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nouvel aéroport et nouvelle ville</title>
</head>
<body>

<form method="post">
<div class="mb-3">
			<label for="inputAeroport" class="form-label">Nom aéroport </label>
			<input type="text" name="nom" class="form-control"id="inputAeroport">
		</div>
		<div class="mb-3">
			<label for="inputVille" class="form-label">Ville</label>
			<input type="text" name="ville" class="form-control"id="inputVille">
		</div>
		
		<button type="submit" class="btn btn-primary">Submit</button>
		<button type="reset" class="btn btn-danger">Annuler</button>
		</form>
</body>
</html>