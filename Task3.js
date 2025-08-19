
Function LikesMessage(Arr[] Arrray){

	if (Arrray == null || Arrray.length == 0) {

	return "no one likes this";
}
	else if (Arrray.length == 1){

	return "Peter likes this";
}	
	else if (Arrray.length == 2){
	
	return "Peter and Alex";
}
	else if (Arrray.length == 3){
	
	return "Peter , Jacob and Alex";
}
	else 
	return "Peter , Jacob and others likes this";
}
}

	Let Arrray = {"Peter", "Alex", "Jacob"};
	
	console.log(getLikesMessage(Str[], Arrray);
}