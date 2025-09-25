<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formulário</h1>
        <form action="<%= request.getContextPath()%>/aulas/jsp;formulariojsp" method="post">
            <h2>Formulário</h2>
            <p>
                <label for="campoA">Campo A:</label>
                <input type="text" id="campoA" name="campoA" pattern="\d+" title="apenas dígitos" required/><br /><br />

                <label for="opcaoA">Opção A:</label>
                <input type="checkbox" id="opcaoA" name="opcaoA" value="opcaoA"/> <br/><br/>

                <label for="opcaoB">Opção B:</label>
                <input type="checkbox" id="opcaoB" name="opcaoB" value="opcaoB"/> <br/><br/>

                <input type="submit" name="btEnviar" value="Salvar">
            </p>
        </form>
    </body>
</html>
