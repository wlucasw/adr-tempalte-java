<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page"
          xmlns:c="http://java.sun.com/jsp/jstl/core"
          version="2.0">
<jsp:directive.page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />

<html>
<head>
  <meta charset="utf-8" />
  <link href="style.css" rel="stylesheet" title="Normal" />
  <title>Title of the page</title>
</head>
<body>

<p>Here goes the content of the page.</p>

<p>Attributes set by the servlet are accessed like this: ${someAttribute}. This will insert whatever is
returned by the attribute object's toString() method.</p>

<p>If we instead write ${someAttribute.someField}, this will insert whatever is returned by the
attribute object's getSomeField() method (or throw an exception if that method does not exist). In other
words, the JSP engine capitalizes the first letter of "someField" and prefixes it with "get" to it to
find the name of the method to call.</p>

<p>Below is an example of a for loop in JSP. It outputs an HTML ordered list with each of the items
returned by someAttribute.getSomeListOfObjects():</p>

<ol>
<c:forEach items="${someAttribute.someListOfObjects}" var="oneObject">
  <li>${oneObject}</li>
</c:forEach>
</ol>


</body>
</html>
</jsp:root>