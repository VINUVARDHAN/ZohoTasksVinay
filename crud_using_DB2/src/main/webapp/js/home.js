
//request for set of records
var request;
function loadData(start, action) {
	var url = "/crud_using_DB2/jsp/getdata.jsp?action=" + action + "&start=" + start;
	request = new XMLHttpRequest();
	try {
		request.onreadystatechange = setOfRecords;
		request.open("GET", url, true);
		request.send();
	} catch (e) {
		alert("Unable to connect to server");
	}
}

function setOfRecords() {
	if (request.readyState == 4) {
		var val = request.responseText;
		document.getElementById('data_next_before').innerHTML = val;
	}
}


//request for create page
function openCreate() {
	document.getElementById('common_place').style.display = 'block';
	var url = "/crud_using_DB2/jsp/create.jsp";
	request = new XMLHttpRequest();

	try {
		request.onreadystatechange = createPage;
		request.open("POST", url, true);
		request.send();
	} catch (e) {
		alert("Unable to connect to server");
	}
}

function createPage() {
	if (request.readyState == 4) {
		var val = request.responseText;
		document.getElementById('common_place').innerHTML = val;
	}
}

//request for search results page
function searchRequest() {
	prefixPattern = document.getElementById("search_value").value;
	var url = "/crud_using_DB2/jsp/search.jsp?pattern=" + prefixPattern;
	request = new XMLHttpRequest();

	try {
		request.onreadystatechange = searchInfo;
		request.open("GET", url, true);
		request.send();
	} catch (e) {
		alert("Unable to connect to server");
	}
}

function searchInfo() {
	if (request.readyState == 4) {
		var val = request.responseText;
		document.getElementById('search_results').innerHTML = val;
	}
}

//update page
function openUpdatePage(rollno) {
	document.getElementById('common_place').style.display = 'block';
	oldnameU = document.getElementById(rollno + "a").innerText;
	lead_new_nameU = document.getElementById(rollno + "a").innerText;
	companyU = document.getElementById(rollno + "b").innerText;
	sourceU = document.getElementById(rollno + "c").innerText;
	phoneU = document.getElementById(rollno + "d").innerText;
	emailU = document.getElementById(rollno + "e").innerText;

	var url = "/crud_using_DB2/jsp/update.jsp?oldnameU=" + oldnameU + "&lead_new_nameU=" + lead_new_nameU + "&companyU=" + companyU + "&sourceU=" + sourceU + "&phoneU=" + phoneU + "&emailU=" + emailU;
	request = new XMLHttpRequest();

	try {
		request.onreadystatechange = updatePageInfo;
		request.open("GET", url, true);
		request.send();
	} catch (e) {
		alert("Unable to connect to server");
	}
}

function updatePageInfo() {
	if (request.readyState == 4) {
		var val = request.responseText;
		document.getElementById('common_place').innerHTML = val;
	}
}

//delete
function deleteLeadByName(name) {
	if (confirm('Are you sure you want to delete ' + name + ' ?')) {
		window.location = "http://localhost:8080/crud_using_DB2/delete?name=" + name;
	}
}

//update lead
function updateLeadByName(name) {
	oldname = name;
	newname = document.getElementById('lead_name_update').value;
	company = document.getElementById('company_update').value;
	source = document.getElementById('source_update').value;
	phoneno = document.getElementById('phone_no_update').value;
	email = document.getElementById('email_update').value;

	if (confirm('Are you sure you want to update ' + oldname + ' ?')) {
		window.location = "http://localhost:8080/crud_using_DB2/update?old_name=" + oldname + "&lead_name_update=" + newname + "&company_update=" + company + "&source_update=" + source + "&phone_no_update=" + phoneno + "&email_update=" + email;;
	}
}