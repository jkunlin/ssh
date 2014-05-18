function menuInitialize(){
	$('#float-close').click(function(){
		menu_close("float-news","float-open");
		return false;
	});
	$('#open-btn').click(function(){
		menu_open("float-open","float-news");
		return false;
	});
	$('#float-close2').click(function(){
		menu_close("float-news2","float-open2");
		return false;
	});
	$('#open-btn2').click(function(){
		menu_open("float-open2","float-news2");
		return false;
	});
	//设置
	$('#float-close-new-set').click(function(){
		menu_close("float-new-set","float-news2");
		return false;
	});
	$('#float-subopen1').click(function(){
		menu_open("float-news2","float-new-set");
		return false;
	});
	//章节设置
	$('#float-close-new').click(function(){
		menu_close("float-new","float-new-set");
		return false;
	});
	//编辑文章信息
	$('#float-close-edit').click(function(){
		menu_close("float-edit","float-news2");
		return false;
	});
	$('#float-subopen2').click(function(){
		newEditArticleListHTMLmaker();
		menu_open("float-news2","float-edit");
		return false;
	});
	$('#float-close-delete').click(function(){
		menu_close("float-delete","float-news2");
		return false;
	});
	$('#float-subopen3').click(function(){
		menu_open("float-news2","float-delete");
		return false;
	});
}


function menu_open(id0,id1){
//关闭id0 打开id1
	$('#'+id0).animate({
		left: '-900px'
	}, 100, function(){
		$('#'+id1).delay(50).animate({
			left: '0px'
		}, 300);
	});
}

function menu_close(id0,id1){
//关闭id0 打开id1
	$('#'+id0).animate({
	left: '-900px'
	}, 300, function(){
		$('#'+id1).delay(50).animate({
			left: '-2px'
		}, 300);
	});
}
function open_new_article(){
	ans=parseInt(document.getElementById("article_number_set").value);
	cns=parseInt(document.getElementById("chapter_number_set").value);
	if(!check_number(document.getElementById("article_number_set").value))
		alert("新杂志文章数必须为整数");
	else if (!check_number(document.getElementById("chapter_number_set").value))
		alert("新杂志每篇文章章数必须为整数");	
	else if (ans<1)
		alert("新杂志至少要有一篇文章");
	else if(ans>12)
		alert("新杂志文章数不得多于12篇");
	else if(cns<1)
		alert("新杂志每篇文章至少要有一章");
	else if(cns>10)
		alert("新杂志每篇文章不得多于10章");
	else{
		//填充新杂志
		newJournalListHTMLmaker(ans,cns);
		newEditeJournalListHTMLmaker(cns);
		//打开新杂志页面
		menu_open("float-new-set","float-new");
	}
}
function edit_article(id){
	var cn = parseInt(document.getElementById("chapter_number").value);//获得文章号
	document.getElementById("article_id").value = id;//保存调用的文章号
	document.getElementById("article_edit_title").value=document.getElementById("new1title"+id).value;//读标题
	document.getElementById("article_edit_content").value=document.getElementById("new1content"+id).value;//读简介
	for(var i=1;i<cn+1;i++)
		document.getElementById("newchapter"+i).value=document.getElementById("new"+id+"chapter"+i).value;//读章节名称
	menu_open('float-new','float-edit-windows');//打开编辑窗口
}
function save_article(){
	var id = document.getElementById("article_id").value;//获得文章号
	var cn = parseInt(document.getElementById("chapter_number").value);//获得文章号
	document.getElementById("new1title"+id).value=document.getElementById("article_edit_title").value;//保存标题
	document.getElementById("new1content"+id).value=document.getElementById("article_edit_content").value;//保存简介
	for(var i=1;i<cn+1;i++)
		document.getElementById("new"+id+"chapter"+i).value=document.getElementById("newchapter"+i).value;//保存章节名称
	document.getElementById("new"+id).innerHTML = id+" "+document.getElementById("article_edit_title").value;//显示标题
	menu_close('float-edit-windows','float-new')//关闭编辑窗口
}
function newJournalListHTMLmaker(ArticleNumber,ChapterNumber){
	var arr=new Array();
	arr.push('<ul><li>刊号：<input type="text" name="ISSN"/></li><li>标题：<input type="text"  name="journal_title"/></li>');
	for(var i=1;i<ArticleNumber+1;i++){
		arr.push('<li><a href="javascript:edit_article('+i+')"><div id="new'+i+'">'+i+' 点击编辑</div><a/>');
		arr.push('<input name="articles_title['+(i-1)+']" id="new1title'+i+'" style="display:none" type="text" value=""/>');
		arr.push('<input name="articles_outline['+(i-1)+']" id="new1content'+i+'" style="display:none" type="text" value=""/>');
		for (var j=1;j<ChapterNumber+1;j++)
			arr.push('<input name="chapters_title['+((i-1)*ChapterNumber+j-1)+']" id="new'+i+'chapter'+j+'" style="display:none" type="text"  value=""/>');
		arr.push('</li>');
	}
	arr.push('<li><input class="submit" type="submit" value="新建"></li></ul>');
	document.getElementById("new-joural-html").innerHTML = arr.join(' ');
}
function newEditeJournalListHTMLmaker(ChapterNumber){
	var arr=new Array();
	arr.push('<ul>');
	for(var i=1;i<ChapterNumber+1;i++)
		arr.push('<li align="right">第'+i+'章标题:<input id="newchapter'+i+'"  style="width:200px" type="text"  value=""/></li>');
	arr.push('</ul>');
	document.getElementById("new-edit-joural-html").innerHTML = arr.join(' ');
	document.getElementById("chapter_number").value=ChapterNumber;
}
function newEditArticleListHTMLmaker(){
	var arr=new Array();
	var title;//文章的标题
	articleNumber=parseInt(document.getElementById("current_article_number").value)
	arr.push('<ul>');	
	for (var i=1;i<articleNumber+1;i++){
		title=document.getElementById("article_title"+(i-1)).innerText;
		if (title.length>40)
			title=title.substring(0,40)+"..."
		arr.push('<li><a href="javascript:edit_article_ifm('+i+')"><div id="eidt'+i+'">'+i+' '+title+'</div></a>');
	}
	arr.push('</ul>');
	document.getElementById("edit-Article-html").innerHTML = arr.join(' ');
}

function edit_article_ifm(id){
	document.getElementById("current_article_index").value = id;//保存文章号
	var arr=new Array();
	var aid=document.getElementById("article_id"+(id-1)).value;//文章在数据库中的id
	var title=document.getElementById("article_title"+(id-1)).innerText;//文章的标题
	var content=document.getElementById("article_content"+(id-1)).innerText;//文章的简介
	document.getElementById("current_article_id").value=aid;//设置文章在数据库中的id
	arr.push('<table><tr><td>标题：<input name="article_title" id="edit_article_title" type="text" style="width:200px" value="'+title+'"></td></tr>');
	arr.push('<tr><td>描述：</td></tr>');
	arr.push('<tr><td align="right"><textarea name="article_outline" id="edit_article_content" rows="3" cols="33">'+content+'</textarea><td></tr>');
	arr.push('<tr><td align="right"><input class="submit" type="submit" value="确定" onclick=""></td></tr></table>');//提交按钮
	arr.join(' ');
	document.getElementById("edit-Article-imf").innerHTML = arr.join(' ');
	menu_open('float-edit','float-edit-article');//打开编辑窗口
}


function check_number(value){
    //定义正则表达式部分
    var reg = /^\d+$/;
    if( value.constructor === String ){
        var re = value.match( reg );
        return re;
    }
    return false;
}