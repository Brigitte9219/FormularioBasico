<%-- 
    Document   : index
    Created on : 31 oct 2023, 10:56:09
    Author     : brigi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>FORMULARIO utilizando JSP y SERVLET</h1>
        <form>
            <table>
                <tr>
                    <td>Nombre</td>
                    <td><input type="text" name="usuario" placeholder="Nombre" /></td>
                </tr>
                <tr>
                    <td>Dirección</td>
                    <td><input type="text" name="direccion" placeholder="Dirección" /></td>
                </tr>
                <tr>
                    <td># Dias Trabajados</td>
                    <td><input type="text" name="dias" placeholder="# Dias Trabajados" /></td>
                </tr>
                <tr>
                    <td>Valor dia</td>
                    <td><input type="text" name="valor" placeholder="Valor dia" /></td>
                </tr>
                <tr>
                    <td><button type="submit">Calcular</button></td> 
                </tr>
            </table>
        </form>
    </body>
</html>
