<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inscription passager</title>
</head>
<body>
	<form method="post">
		<div >
			<label for="nom">Nom :</label> 
			<input type="text" name="nom">
		</div>
		<br/><br/>
		<div >
			<label for="prenom">Prenom :</label> <input type="text"
				name="prenom">
		</div>
		<br/><br/>
		<button type="submit" class="btn btn-primary" id="buttonNewUser">Enregistrer</button>
		<button type="reset" class="btn btn-primary" id="buttonResetNewUser">Annuler</button>
	</form>
</body>
</html>