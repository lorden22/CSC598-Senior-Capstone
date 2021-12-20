//processPublishSurvey.js


//this function gets the eventName and turns it into an Array
function getCreateRegistrationInfo(){
	let eventName = document.getElementById("eventName").value;
	
	let surveyName = [eventName];

	processSNInfo(surveyName);
	
}

//this function gets the feedback Name and turns it into an Array
function getCreateAnonFBInfo(){
	let fbName = document.getElementById("fbName").value;

	let surveyName = [fbName];

	processSNInfo(surveyName);
}

//this function gets the tShirt Name and turns it into an Array
function getCreateTSOrderInfo(){
	let tsName = document.getElementById("tsName").value;
	
	let surveyName = [tsName];

	processSNInfo(surveyName);
}

//this function takes the surveyName and display a thank you for submitting page
function processSNInfo(snArray) {
	header();
	//updateTakeSurveyPage();
	document.writeln('<h3>You have created the survey: <BIG>'+ snArray[0]+'</BIG></h3>');
	document.writeln('<p><a href="companysurveysite.html"> Go to Home</a></p>');
}

function header(){
	//this is the header format and can be used throughout all pages
	document.writeln('<head><meta charset = "utf-8"><title>The Creighton ROTC Survey Destination</title><link rel="stylesheet" href="surveyhome.css"><script src="processRegistration.js"></script></head><body> <div class="head"><img id "logo3" alt="Logo" src="cuschoollogo.png"><h1> The Creighton ROTC Survey Destination </h1><img id "logo1" alt="Logo" src="rotclogo.png"></div><nav class = "navbar"><ul><li><a href="companysurveysite.html"> Home</a></li><li><a href="createsurveyoption.html"> Create survey</a></li><li><a href="takesurveys.html"> Take survey</a></li><li><a href="https://www.creighton.edu/groups/armyrotc/whatisarmyrotc/"> About Us</a></li><li><a href="contactus.html"> Contact Us</a></li><ul></nav>');
}

function updateTakeSurveyPage(){
	document.getElementById('surveys').innerHTML += 'Insert surveys here';
}
	