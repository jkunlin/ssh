<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="css/style5.css" rel="stylesheet">
<link href="css/bootstrap.css" rel="stylesheet">
<title>Paragraph</title>
</head>

<body>
	<div class="container" align="center" id="paragraph">
    	<p class="text-info">这是您在第<strong><em> 1 </em></strong>期杂志第<strong><em> 2 </em></strong>篇文章中<strong><em> 3 </em></strong>第段的文字</p>
    	<form>
            <textarea rows="5" cols="100" id="note" style="overflow: auto;"></textarea>
            <div align="center">
                <button type="submit" class="btn">Submit</button>
                <button type="submit" class="btn">delete</button>
    		</div>
        </form>
    </div>
</body>
</html>