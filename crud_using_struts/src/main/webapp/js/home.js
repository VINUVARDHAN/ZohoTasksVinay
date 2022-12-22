
//request for set of records
var request;
function loadData(start, action, range) {
	$.ajax({
		type: "POST",
		data: {
			start: start,
			action: action,
			range: range
		},
		url: "/crud_using_struts/range",
		success: function(response) {
			document.getElementById('data_next_before').innerHTML = response;
		}
	});
}

//request for create page
function getCreateDiv() {
	document.getElementById("common_place").style.width = "500px";
	try {
		$.ajax({
			type: "POST",
			data: {
			},
			url: "/crud_using_struts/jsp/create.jsp",
			success: function(response) {
				document.getElementById('common_place').innerHTML = response;
			}
		});
	} catch (e) {
		alert("Unable to connect to server");
	}
}

function createLead() {
	try {
		$.ajax({
			type: "POST",
			data: {
				leadName: document.getElementById('leadName').value,
				company: document.getElementById('company').value,
				source: document.getElementById('source').value,
				phoneNo: document.getElementById('phoneNo').value,
				email: document.getElementById('email').value,
				start: 0,
				range: document.getElementById('range_selection').value,
				action: "next",
				message: "none"
			},
			url: "/crud_using_struts/insertRecord",
			success: function(response) {
				document.getElementById('data_next_before').innerHTML = response;
				document.getElementById("common_place").style.width = "0px";
				messagePopUp("insertedMessage");
			},
			error: function() {
				messagePopUp("duplicate");
			}
		});
	}
	catch (e) {
		console.log(e);
	}
}

//request for update page
function getUpdateDiv(rollno) {
	document.getElementById("common_place").style.width = "500px";
	leadName = document.getElementById(rollno + "a").innerText;
	company = document.getElementById(rollno + "b").innerText;
	source = document.getElementById(rollno + "c").innerText;
	phoneNo = document.getElementById(rollno + "d").innerText;
	email = document.getElementById(rollno + "e").innerText;

	var url = "/crud_using_struts/jsp/update.jsp?leadName=" + leadName + "&company=" + company + "&source=" + source + "&phoneNo=" + phoneNo + "&email=" + email;
	request = new XMLHttpRequest();

	try {
		request.onreadystatechange = function() {
			if (request.readyState == 4) {
				var val = request.responseText;
				document.getElementById('common_place').innerHTML = val;
			}
		};
		request.open("GET", url, false);
		request.send();
	} catch (e) {
		alert("Unable to connect to server");
	}
}


function updateLead(oldName) {
	try {
		$.ajax({
			type: "POST",
			data: {
				oldName: oldName,
				leadName: document.getElementById('newLeadName').value,
				company: document.getElementById('company').value,
				source: document.getElementById('source').value,
				phoneNo: document.getElementById('phoneNo').value,
				email: document.getElementById('email').value,
				start: 0,
				range: document.getElementById('range_selection').value,
				action: "next",
				message: "none"
			},
			url: "/crud_using_struts/updateRecord",
			success: function(response) {
				messagePopUp("updatedMessage");
				document.getElementById('data_next_before').innerHTML = response;
				document.getElementById("common_place").style.width = "0px";
			},
			error: function() {
				document.getElementById('newLeadName').value = oldName;
				messagePopUp("duplicate");
			}
		});
	}
	catch (e) {
		console.log(e);
	}
}


function deleteLead(leadName) {
	try {
		$.ajax({
			type: "POST",
			data: {
				leadName: leadName,
				start: 0,
				range: document.getElementById('range_selection').value,
				action: "next",
				message: "none"
			},
			url: "/crud_using_struts/deleteRecord",
			success: function(response) {
				document.getElementById('data_next_before').innerHTML = response;
			}
		});
	}
	catch (e) {
		console.log(e);
	}
}

function searchRequest() {
	try {
		$.ajax({
			type: "POST",
			data: {
				pattern: document.getElementById('searchValue').value,
			},
			url: "/crud_using_struts/jsp/search.jsp",
			success: function(response) {
				document.getElementById('search_results').style.height = "250px";
				document.getElementById('search_results').innerHTML = response;
			},
		});
	}
	catch (e) {
		console.log(e);
	}
}

//record range selection
function setPageRange() {
	range = document.getElementById("range_selection").value;
	loadData(0, 'next', range);
}

function messagePopUp(messageType) {
	if (messageType == "duplicate") {
		var x = document.getElementById("duplicateError");
		x.className = "show";
		setTimeout(function() { x.className = x.className.replace("show", ""); }, 3000);
	}
	else if (messageType == "insertedMessage") {
		var x = document.getElementById("insertedMessage");
		x.className = "show";
		setTimeout(function() { x.className = x.className.replace("show", ""); }, 3000);
	}
	else if (messageType == "updatedMessage") {
		var x = document.getElementById("updatedMessage");
		x.className = "show";
		setTimeout(function() { x.className = x.className.replace("show", ""); }, 3000);
	}
}


function login() {
	try {
		$.ajax({
			type: "POST",
			data: {
				userName: document.getElementById('userName').value,
				psw: document.getElementById('psw').value,
			},
			url: "/crud_using_struts/loginDetails",
			error: function() {
				console.log("error");
			}
		});
	}
	catch (e) {
		console.log(e);
	}
}


