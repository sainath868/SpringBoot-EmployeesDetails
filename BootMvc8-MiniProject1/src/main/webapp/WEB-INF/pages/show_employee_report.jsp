<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<%@ page isELIgnored="false" %>
<c:choose>
<c:when text="${!empty empsList}">
<h1>Employess Report</h1>
<table>
<tr><th>empno</th><th>empno name</th><th>job</th><th>salary</th><th>deptno</th></tr>
<c:forEach var="emp" items="${empsList}">
<tr>
<td>${emp.empno}</td>
<td>${emp.ename}</td>
<td>${emp.job}</td>
<td>${emp.sal}</td>
<td>${emp.deptno}</td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h1>Employess Not Found</h1>
</c:otherwise>
</c:choose>
