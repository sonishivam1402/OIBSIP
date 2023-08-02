function myfun() {
    var radios = document.getElementsByName('type');
    for (var radio of radios)
    {
        if (radio.checked) {
            if(radio.value == "Celsius"){
            	var ctemp = document.getElementById("temperature").value;
				var cToFahr = ctemp * 9 / 5 + 32;
				var message = ctemp+'\xB0C is ' + cToFahr + ' \xB0F.';
            }else{
            	var fTemp =document.getElementById("temperature").value;
  				var fToCel = (fTemp - 32) * 5 / 9;
  				var message = fTemp+'\xB0F is ' + fToCel + '\xB0C.';
            }
      		document.getElementById("result").innerHTML = message;      
        }
    }
}