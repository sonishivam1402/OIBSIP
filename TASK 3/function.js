function myfun() {
    var n = document.getElementById("temperature").value;
    if(isNaN(n)){
        alert("Enter only numberic value");
    }else{

        var radios = document.getElementsByName('type');
        var to_radios = document.getElementsByName('types');

        for(var tradio of to_radios){
            if (tradio.checked) {
                var rad1 = tradio.value;
            }
        }

        for(var radio of radios){
            if (radio.checked) {
                var rad2 = radio.value;
            }
        }

        if (rad2 == 'Celsius' && rad1 == 'Fahrenheits'){
            var ctemp = document.getElementById("temperature").value;
            var cToFahr = ctemp * 9 / 5 + 32;
            var message = ctemp+'\xB0C is ' + cToFahr + ' \xB0F.';
        } 

        else if (rad2 == 'Celsius' && rad1 == 'Kelvins') {
            var ctemp = document.getElementById("temperature").value;
            var cToK = ctemp * 1 + 273.15;
            var message = ctemp+'\xB0C is ' + cToK + ' \xB0K.';
        } 

        else if (rad2 == 'Fahrenheit' && rad1 == 'Celsiuss') {
            var fTemp =document.getElementById("temperature").value;
            var fToCel = (fTemp - 32) * 5 / 9;
            var message = fTemp+'\xB0F is ' + fToCel + '\xB0C.';
        } 

        else if (rad2 == 'Fahrenheit' && rad1 == 'Kelvins') {
            var fTemp =document.getElementById("temperature").value;
            var fToK = (fTemp - 32) * 5 / 9 + 273.15;
            var message = fTemp+'\xB0F is ' + fToK + '\xB0K.';
        }

        else if (rad2 == 'Kelvin' && rad1 == 'Celsiuss') {
            var fTemp =document.getElementById("temperature").value;
            var fToCel = fTemp* 1 - 273.15;
            var message = fTemp+'\xB0F is ' + fToCel + '\xB0K.';
        }

        else if (rad2 == 'Kelvin' && rad1 == 'Fahrenheits') {
            var fTemp =document.getElementById("temperature").value;
            var fToK = (fTemp - 273.15) * 9 / 5 + 32;
            var message = fTemp+'\xB0F is ' + fToK + '\xB0K.';
        }

        else if(rad2 == 'Celsius' && rad1 == 'Celsiuss' || rad2 == 'Fahrenheit' && rad1 == 'Fahrenheits' ||rad2 == 'Kelvin' && rad1 == 'Kelvins'){
            alert("Choose degree properly !! ");
        }

        document.getElementById("result").innerHTML = message;

}   }