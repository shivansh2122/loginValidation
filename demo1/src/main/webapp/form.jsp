    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
    <body>
        <!-- login.jsp -->

<center>
<form:form action="check" method="post" modelAttribute="imp">
<table>
<tr>
<td>Username:</td><td><form:input path="username"/></td>
<td><font color='red'><form:errors path="username"/></font></td>
</tr>
<td>Password:</td><td><form:password path="password"/></td>
<td><font color='red'><form:errors path="password"/></font></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="submit"></td>
</table>
</form:form>
<center>
    </body>
</html>