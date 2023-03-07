<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajout client</title>
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
		<div >
			<label for="adresse">Address</label> <input type="text"
				 name="adresse" placeholder="1234 Main St">
		</div><br/><br/>
		<div >
			<label for="tel">Téléphone :</label> <input type="password"
				pattern="[0-9]{10}"  name="tel"
				placeholder="0610203040">
		</div><br/><br/>
		<div >
			<div >
				<label for="mail">Email :</label> 
				<input type="email"
					class="form-control" name="mail" placeholder="Email@exemple.com">
			</div><br/><br/>
		</div>

		<button type="submit" class="btn btn-primary" id="buttonNewUser">Enregistrer</button>
		<button type="reset" class="btn btn-primary" id="buttonResetNewUser">Annuler</button>
	</form>
</body>
</html>