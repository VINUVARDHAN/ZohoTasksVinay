
//Render data
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

//record range selection which intern calls the display to update the range
function setPageRange() {
	range = document.getElementById("range_selection").value;
	loadData(0, 'next', range);
}

//Post request for create page
function getCreateDiv() {
	document.getElementById("common_place").style.width = "30%";
	try {
		$.ajax({
			type: "POST",
			url: "/crud_using_struts/jsp/create.jsp",
			success: function(response) {
				document.getElementById('common_place').innerHTML = response;
			}
		});
	} catch (e) {
		alert("Unable to connect to server");
	}
}

//request to add Lead and getting response of updated data to display
function createLead() {
	try {
		leadName = document.getElementById('leadName').value;
		length = leadName.length;
		check = true;
		for (let i = 0; i < length; i++) {
			c = leadName.charCodeAt(i);
			if (c >= 48 && c <= 57 || c >= 67 && c <= 90 || c >= 97 && c <= 122 || c == 35 || c == 45 || c == 95 || c == 46 || c == 64 || c==32) {
			}
			else {
				check = false;
				break;
			}
		}
		if (check == true) {
			$.ajax({
				type: "POST",
				data: {
					leadName: leadName,
					company: document.getElementById('company').value,
					source: document.getElementById('source').value,
					phoneNo: document.getElementById('phoneNo').value,
					email: document.getElementById('email').value,
					start: 0,
					range: document.getElementById('range_selection').value,
					action: "next",
				},
				url: "/crud_using_struts/insertRecord",
				success: function(response) {
					document.getElementById('data_next_before').innerHTML = response;
					document.getElementById("common_place").style.width = "0px";
					message = "<b>" + leadName + "</b> added <i style='font-size: 24px' class='fa'>&#xf087;</i>"
					document.getElementById('successM').innerHTML = message;
					messagePopUp("success");
				},
				error: function() {
					message = "<b>" + leadName + "</b> already present <i style='font-size: 24px'class='fa'>&#xf165;</i>";
					document.getElementById('errorM').innerHTML = message;
					messagePopUp("error");
				}
			});
		}
		else {
			message = "<b>" + leadName + "</b> contains some special characters <i style='font-size: 24px'class='fa'>&#xf165;</i>";
			document.getElementById('errorM').innerHTML = message;
			messagePopUp("error");
		}
	}
	catch (e) {
		console.log(e);
	}
}

//request for update page
function getUpdateDiv(rollno) {
	document.getElementById("common_place").style.width = "30%";
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

//request to update Lead and getting response of updated data to display
function updateLead(oldName) {
	try {
		leadName = document.getElementById('newLeadName').value;
		company = document.getElementById('company').value
		$.ajax({
			type: "POST",
			data: {
				oldName: oldName,
				leadName: leadName,
				company: company,
				source: document.getElementById('source').value,
				phoneNo: document.getElementById('phoneNo').value,
				email: document.getElementById('email').value,
				start: 0,
				range: document.getElementById('range_selection').value,
				action: "next",
			},
			url: "/crud_using_struts/updateRecord",
			success: function(response) {
				document.getElementById('data_next_before').innerHTML = response;
				document.getElementById("common_place").style.width = "0px";
				message = "Updated Lead <b>" + leadName + "</b> <i style='font-size: 24px' class='fa'>&#xf087;</i>"
				document.getElementById('successM').innerHTML = message;
				messagePopUp("success");
			},
			error: function(response) {
				document.getElementById('newLeadName').value = oldName;
				console.log(response);
				message = "<b>" + leadName + "</b> already present <i style='font-size: 24px'class='fa'>&#xf165;</i>";
				document.getElementById('errorM').innerHTML = message;
				messagePopUp("error");
			}
		});
	}
	catch (e) {
		console.log(e);
	}
}

//Request to delete Lead and getting response of updated data to display 
function deleteLead(leadName) {
	try {
		$.ajax({
			type: "POST",
			data: {
				leadName: leadName,
				start: 0,
				range: document.getElementById('range_selection').value,
				action: "next",
			},
			url: "/crud_using_struts/deleteRecord",
			success: function(response) {
				document.getElementById('data_next_before').innerHTML = response;
				message = "Deleted Lead " + leadName + " <i style='font-size: 24px' class='fa'>&#xf087;</i>"
				document.getElementById('successM').innerHTML = message;
				messagePopUp("success");
			}
		});
	}
	catch (e) {
		console.log(e);
	}
}

//search request 
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

//Pop up message for some actions
function messagePopUp(messageType) {
	if (messageType == "error") {
		var x = document.getElementById("errorM");
		x.className = "show";
		setTimeout(function() { x.className = x.className.replace("show", ""); }, 3000);
	}
	else if (messageType == "success") {
		var x = document.getElementById("successM");
		x.className = "show";
		setTimeout(function() { x.className = x.className.replace("show", ""); }, 3000);
	}
}
