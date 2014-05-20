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
	
    	<p class="text-info">这是您在<strong><em> <s:property value="journal_title"/> </em></strong>杂志<strong><em> <s:property value="article_title"/> </em></strong>文章中<strong><em> <s:property value="chapter_title"/> </em></strong>章第<s:property value="sequence"/>段的文字</p>
    	<form>
    		
            <textarea rows="5" cols="100" id="note" style="overflow: auto;"><s:property value="#request.paragraph.content"></s:property></textarea>
            <div align="center">
                <button type="submit" class="btn">Submit</button>
                <button type="submit" class="btn">delete</button>
    		</div>
        </form>
    </div>
</body>
</html>