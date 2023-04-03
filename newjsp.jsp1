<%-- 
    Document   : newjsp
    Created on : Mar 30, 2023, 8:20:53 PM
    Author     : hp
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="exp10.Order"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
       
    </head>
    <body>
        <%
         
            Order st=new Order("001","John Doe","2022-03-10");
            Order st1=new Order("002","JaneSmith","2022-03-12");
            Order st2=new Order("003","Bob Johnson","2022-03-15");
           
            ArrayList<Order> obj=new ArrayList<Order>();
            obj.add(st);
            obj.add(st1);
            obj.add(st2);

pageContext.setAttribute("obj", obj);
        %>
        <table border="1px"><tr><th>Order Id</th><th>Customer Name</th><th>Date</th></tr>
        <c:forEach items="${pageScope.obj}" var="i">
           
                <tr> <td>${i.getId()}</td>
                    <td>${i.getName()}</td>
                    <td>${i.getdate()}</td>
                </tr>
        </c:forEach>  
        </table>
       </table>
    </body>
</html>
