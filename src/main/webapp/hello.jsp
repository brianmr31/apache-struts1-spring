<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html>
<head><title>Pesan Struts Berhasil</title></head>
<body>
    <h1>Pesan Berhasil:</h1>
    <p style="font-size: 1.2em; color: green;">
        <bean:write name="helloForm" property="message"/>
    </p>
    <a href="index.jsp">Kembali</a>
</body>
</html>