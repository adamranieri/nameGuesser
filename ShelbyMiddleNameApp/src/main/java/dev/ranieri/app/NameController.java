package dev.ranieri.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class NameController {
	
	public static List<String> names = new ArrayList<String>();
	
	private static String correctname = null;
	
	public static int counter = 0;
	
	// initializes names
	static {	
		String [] nameray = "D'Anna D'Arcy D'Lisa D'nai Daaiyah Dacey Daci Dacia Daciana Dacy Daegan Daeja Daela Daelyn Daenerys Dafna Dafne Dafni Daggi Dagmar Dagmara Dagny Dahl Dahlia Dahye Dahyun Daiana Daija Dailey Daily Dailyn Daire Dairrica Daisey Daisha Daisia Daisy Daisy-Mae Daiya Daja Dajia Dakota Dalary Dale Dalee Dalena Daleyza Dalia Dalila Dalilah Dalinda Dalisay Dalisha Daliyah Dallace Dallas Dallis Dallyce Dalma Dalya Damara Damaris Damhnait Damiana Damiane Damita Dana Danae Danaiah Danalyn Danara Danataya Danaya Danby Daneen Daneira Danelle Danesah Danette Daneysha Danger Dani Dania Danica Daniela Daniele Daniella Danielle Danijah Danijela Danika Danila Danique Danisa Danita Daniyah Danjela Danna Danneel Dannica Dannie Danniella Dannielle Dannika Dannong Dannyn Danteja Danu Danuta Danya Danyella Danyelle Daphene Daphna Daphne Daphnée Daphnie Dara Daralyn Darbi Darbiana Darbie Darby Darcella Darcey Darcey-Mae Darci Darcie Darcy Daria Darian Darice Dariela Darien Darja Darla Darleen Darlena Darlene Darletta Darley Darlin Darline Darlynn Darquise Darra Darrah Darreth Darryn Darshan Darthula Darya Daryl Daryon Dasha Dashielle Dasia Dassah Datha Daton Dava Davalyn Davanee Daveigh Daveney Davette Davia Daviana Davida Davina Davinder Davinee Davita Dawn Dawna Dawnalee Dawsyn Day Daya Dayami Dayana Dayanara Dayja Dayla Dayle Daylee Dayleigh Daylen Dayna Dayne Daysha Dayton Daytona Dayvee Dea Dean Deana Deandra Deangela Deanica Deann Deanna Deanndra Deanne Dearbhail Dearbhla Deasia Deb Debbi Debbie Debbra Debby Debelah Debi Debjani Debora Deborah Debra Debrah December Dedra Dee DeeAnn DeeAnna Deedee Deena Deepika Deepti Defne Deianira Deidamia Deidra Deidre Deirdre Deisha Deisy Deja Dejah Dejalena Dejanae Dejani Dejanira Dejianna Dekotha Delaina Delaine Delainey Delana Delancey Delancy Delaney Delanie Delany Delara Delayna Delayne DeLaynie Delcie Delen Delenn Delentha Deletha Delfina Delfine Delgadina Delia Deliah Delicia Delight Delihla Delila Delilah Delina Delisa Delisha Dell Della Delma Delois Delora Delores Deloris Delpha Delphia Delphina Delphine Delphinia Delphinium Delta Delun Delwyn Delylah Delyn Delysia Delyth Dema Demaris Demelza Demeter Demetra Demetria Demetrice Demi Demitra Dena Denali Denaye Denbeigh Denee Deneen Deni Denia Denice Denielle Denika Denine Denisa Denise Denisha Denisia Denisse Deniz Denna Dennaleia Dennise Dennon Denver Denya Deogracia Deolinda Deona Deondra Deonna Dera Dereka Derrida Dervla Deryn Desdemona Deshae Desi Desideria Desirae Desiray Desire Desirea Desiree Desirie Desislava Desneiges Despina Dessa Dessie Dessy Desta Destanee Destany Destinee Destiney Destini Destinie Destiny Destri Destyni Deva Devan Devana Devanie Devannie Devany Devanya Deven Devere Devereaux Devi Devin Devina Devinder Devinne Devlyn Devoireh Devon Devona Devonie Devonne Devony Devora Devorah Devorgilla Devra Devri Devyn Devynn Dewayna Dexlee Deyanira Deyna Dezabia Dezirae Deziraye Dezzie Dganit Dhana Dharani Dharma Dhriti Di Dia Diadama Diamanda Diamanta Diamanto Diamira Diamond Dian Diana Diancia Diandra Diane Dianella Dianey Diann Dianna Dianne Dianora Diantha Diara Diavian Diba Dicey Dicy Didina Dido Diedre Diem Digna Dilara Dilay Dileyna Dillen Dillon Dillyn Dilys Dimitra Dimitri Dimitroula Dimity Dimple Dina Dinah Dinalee Dinara Dinella Dineo Dinesha Dinh Dinitia Dinorah Dione Dionna Dionne Diora Diotima Dirt Muncher Disa Dita Divanshi Diviana Divina Divine Divinity Divya Dixie Diya Djuna Dmitriana Docia Dodai Dodie Doireann Doliana Dolla Dolley Dollie Dolly Dolorea Dolores Doloris Dolorosa Dolphin Domenica Domicela Dominga Domini Dominica Dominika Dominique Domino Dominque Domonique Dona Donata Donatella Donea Donel Donella Donelle Donia Doniella Donielle Donita Donna Donna Jo Donnelly Donnie Doone Dora Doraine Dorathy Dorcas Dorea Doreen Doreena Dorene Dorete Doretha Dori Doria Dorian Doriana Doriane Dorianne Dorina Dorinda Dorine Doris Dorit Dorka Dorla Dorota Dorotea Dorotha Dorothea Dorothy Dorotta Dorottya Dorrie Dorrin Dorris Dorry Dorte Dortha Dorthy Dory Doshia Doshie Dot Dottie Dotty Doutzen Dove Dovey Dovie Draden Dragana Drametha Drea Dream Dreama Dree Drema Dresden Drew Drienne Drishya Drita Dru Drucilla Drue Druscilla Drusilla Dua Duana Dufa Dulce Dulcia Dulciana Dulcibella Dulcie Dulcina Dulcinea Dunia Dunja Duru Dusta Dusti Dustina Dusty Dutchess Dvorah Dwynwen Dyan Dyani Dyann Dyanna Dylan Dylanne Dylis Dylynn Dymphna Dysis Dzenana Dzintra Dzsenifer Dzsesszika".split(" ");
		names = Arrays.asList(nameray);
		System.out.println(names.size());
	}
	
	@RequestMapping(value = "/name", method = RequestMethod.GET)
	public String getName() {
		return names.get(counter);
	};
	
	@RequestMapping(value = "/name/{answer}", method = RequestMethod.GET)
	public String verifyName(@PathVariable int answer) {
		
		if(correctname != null) {
			return "";
		}
		if(answer == 0) {
			counter++;
			return "I will find that name eventually";		
		}
		else {
			correctname = names.get(counter);
			return "Hooray I found your name";
		}
	}
	
	@RequestMapping(value = "main", method = RequestMethod.GET)
	public String mainPage() {
		// I sad I wrote this
		
		return "\r\n" + 
				"<head>\r\n" + 
				"    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\r\n" + 
				"    <title>Name Guesser</title>\r\n" + 
				"    <meta http-equiv=\"Content-Security-Policy\" content=\"upgrade-insecure-requests\"> \r\n" + 
				"</head>\r\n" + 
				"\r\n" + 
				"<body>\r\n" + 
				"    \r\n" + 
				"    <div class=\"jumbotron\">\r\n" + 
				"    <h1>Welcome to the Shelby Middle name guesser</h1>\r\n" + 
				"\r\n" + 
				"    <h3 id=\"nameguess\"></h3>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    <button onclick=\"verify(1)\" type=\"button\" class=\"btn btn-primary\">yes</button>\r\n" + 
				"    <button onclick=\"verify(0)\" type=\"button\" class=\"btn btn-danger\">no</button>\r\n" + 
				"\r\n" + 
				"    <h3 id=\"result\"></h3>\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"<script>\r\n" + 
				"\r\n" + 
				"    function getName(){\r\n" + 
				"        \r\n" + 
				"    let xhttp = new XMLHttpRequest();\r\n" + 
				"\r\n" + 
				"    xhttp.onreadystatechange = function() {\r\n" + 
				"    if (this.readyState == 4 && this.status == 200) {\r\n" + 
				"     document.getElementById(\"nameguess\").innerHTML = this.responseText;\r\n" + 
				"    }\r\n" + 
				"  };\r\n" + 
				"  xhttp.open(\"GET\", \"http://ec2-54-234-22-212.compute-1.amazonaws.com:8080/name\", true);\r\n" + 
				"  xhttp.send();\r\n" + 
				"\r\n" + 
				"    };\r\n" + 
				"\r\n" + 
				"    getName();\r\n" + 
				"\r\n" + 
				"    function verify(choice){\r\n" + 
				"  let xhttp = new XMLHttpRequest();\r\n" + 
				"\r\n" + 
				"    xhttp.onreadystatechange = function() {\r\n" + 
				"    if (this.readyState == 4 && this.status == 200) {\r\n" + 
				"    //  document.getElementById(\"nameguess\").innerHTML = this.responseText;\r\n" + 
				"        getName();\r\n" + 
				"        document.getElementById(\"result\").innerHTML = this.responseText;\r\n" + 
				"    }\r\n" + 
				"  };\r\n" + 
				"  xhttp.open(\"GET\", \"http://ec2-54-234-22-212.compute-1.amazonaws.com:8080/name/\"+choice, true);\r\n" + 
				"  xhttp.send();\r\n" + 
				"        \r\n" + 
				"\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"</script>";
	}

}
