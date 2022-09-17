<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora Interés Simple</title>
    </head>
    <body>
        <h1>Calculadora Interés Simple</h1>
        <h3>Complete la información solicitada</h3>
        <form method="POST" action="CalculadoraControl">
            <div>
                <label for="capitalTotal" required>Ingrese su capital total: </label>
                <input type="number" name="capitalTotal">   
            </div>
        </br>
            <div>
                <label for="interesAnual" required>Ingrese su interes anual en %: </label>
                <input type="number" name="interesAnual" id="interesAnual">   
            </div>
        </br>
            <div>
                <label for="cantidadAnios" required>Ingrese la cantidad de años: </label>
                <input type="number" name="cantidadAnios" id="cantidadAnios">   
            </div>
        </br>
        <button type="submit"> Calcular </button>
        </form>
        
            

        </form>    
    </body>
</html>