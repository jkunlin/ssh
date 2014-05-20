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
	
    	<p class="text-info">这是您在<strong><em> <s:property value="journal_title"/> </em></strong>杂志<strong><em> <s:property value="article_title"/> </em></strong>文章中<strong><em> <s:property value="chapter_title"/> </em></strong>章第<s:property value="sequence+1"/>段的文字</p>
    	<form action="modifyParagraph">
    		<input type="text" name="paragraph_id" style="display: none;" value="${request.paragraph_id }">
            <textarea rows="5" cols="100" name="content" id="note" style="overflow: auto;"><s:property value="#request.paragraph.content"></s:property></textarea>
            <div align="center">
                <button type="submit" class="btn">Submit</button>
                <a href="deleteParagraph.action?paragraph_id=${request.paragraph_id }"><button type="button" class="btn">delete</button></a>
    		</div>
        </form>
    </div>
</body>
</html>