<%-- 
    Copyright 10/20/2015 Ryan Harrington and Zack Layne
--%>

<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Locale"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="includes/header.html" %>

    <body>
        <main>
            <h1>Future Value Calculator</h1>
            <jsp:useBean id="intrest" scope="request" class="edu.elon.cs.Intrest"/>
            <section>
                <div class="letterDiv"><label>Investment Amount:&nbsp;</label></div>
                <div class="numDiv"><span><jsp:getProperty name="intrest" property="invAmt"/></span><br></div>
                <div class="letterDiv"><label>Yearly Interest Rate:&nbsp;</label></div>
                <div class="numDiv"><span><jsp:getProperty name="intrest" property="rate"/></span><br></div>
                <div class="letterDiv"><label>Number of Years:&nbsp;</label></div>
                <div class="numDiv"><span><jsp:getProperty name="intrest" property="years"/></span><br></div>
                <div class="letterDiv"><label>Future Value:&nbsp;</label></div>
                <div class="numDiv"><span><jsp:getProperty name="intrest" property="result"/></span><br></div>
            </section>
        </main>
        <%@include file="includes/footer.html" %>
    </body>
</html>
