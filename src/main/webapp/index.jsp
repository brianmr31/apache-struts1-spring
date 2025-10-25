<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html>
<head><title>Struts 1 Hello World</title></head>
<body>
    <h1>Selamat datang di Struts 1 Hello World Project</h1>
    <p>Dibangun dengan Maven dan siap dijalankan dengan Jetty.</p>
    <html:link page="/hello.do">
        Klik di sini untuk melihat pesan hello
    </html:link>
    </br>
    <html:link page="/test.do">
        Klik di sini untuk melihat pesan test  
    </html:link>
</body>
</html>