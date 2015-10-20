<%-- 
Copywrite Ryan Harrington, Zack Layne 2015
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="includes/header.html" %>
    <body>
        <main>
            <h1>Future Value Calculator</h1>
            <p><i>Please use positive numbers only</i></p>
                <form action="calculate" method="post">
                    <input type="hidden" name="action" value="calculate">
                    <div class="letterDiv"><label>Investment Amount: </label></div>
                    <div class="numDiv"><input type="text" pattern="^[+]?([.]\d+|\d+([.]\d+)?)$" name="investment" autofocus required></div>
                    <div class="letterDiv"><label>Yearly Interest Rate: </label></div>
                    <div class="numDiv"><input type="text" pattern="^[+]?([.]\d+|\d+([.]\d+)?)$" name="interestRate"  placeholder="ex: '5' is 5%" required></div>
                    <div class="letterDiv"><label>Number of Years: </label></div>
                    <div class="numDiv"><input type="number" min="0" name="numberYears"  placeholder="integer number of years" required></div>
                    <div class="letterDiv"><label>&nbsp;</label></div>
                    <div class="numDiv"><input  type="submit" name="calculate"></div>
                </form>

            
        </main>
        <%@include file="includes/footer.html" %>
    </body>
</html>
