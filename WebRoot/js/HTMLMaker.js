//生成鼠标悬停显示内容
function starOperation(id0,id1){
	$('#star'+id0+id1).raty({
		hints: ['嘘爆', '嘘', '马马虎虎', '赞', '极品'],
		score: 2,
		path:"images/star",
		size:24,
		target: '#result'+id0+id1,
		targetKeep : true
	});
}
//生成评分以及评分上面的东西
function starHTMLMaker(potitionId,id0,id1){
	var arr=new Array();
	var o=$('#'+potitionId);
	arr.push('<table><tr>');
	arr.push('<td>时间: 2010-03-16 <span class="pipe">|</span>评分：</td>');
	//arr.push('<td><div id="star'+id0+id1+'" style="width:140px"/></td>');	
	//arr.push('<td><div id="result'+id0+id1+'" style="display:none"/></td>');
	
	arr.push('<td><form action="logout" method="post" target="id_iframe"><select id="pointList" name="pointList">');
	arr.push('<option value="1">1</option>');
	arr.push('<option value="2">2</option>');
	arr.push('<option value="3">3</option>');
	arr.push('<option value="4">4</option>');
	arr.push('<option value="5">5</option>');
	arr.push('</select>');
	arr.push('<input type="submit" value="提交" />');
	arr.push('</form>');
	arr.push('<iframe id="id_iframe" name="id_iframe" style="display:none;"></iframe>');
	
	arr.push('</tr></table>');
	o.append(arr.join(' '));
}
function starHTMLMakerGrounp(potition,id0,number){
	for(var i=0;i<number;i++){
		starHTMLMaker(potition+id0+i,id0,i);	
		//starOperation(id0,i);
	}
}
//这个函数会用来生成"我的看法"
function countTextAreaMaker(potitionId,id0){
	var arr=new Array();
	var o=$('.'+potitionId);
	arr.push('<form action="addParagraph" id="gogogo"><table width="630" border="0">');//"我的看法"的表单开始
	arr.push('<input type="text" name="sequence" style="display:none;" value="'+id0+'">');
	arr.push('<input type="text" name="article_id" style="display:none;" value="'+document.getElementById("addParagraph_article_id").attributes["value"].value+'">');
	arr.push('<input type="text" name="chapter_id" style="display:none;" value="'+document.getElementById("addParagraph_chapter_id").attributes["value"].value+'">');
	arr.push('<tr><textarea name="content" id="content'+id0+'" cols="85" rows="11" style="overflow: auto;"></textarea><tr>');
	arr.push('<tr><td><input id="button'+id0+'" type="submit" class="button" value="终于写好啦！提交" /></td>');//"我的看法"的提交按钮在这个地方的！
	arr.push('<td><div style="vertical-align: bottom; height: 20px; line-height: 20px; margin: 0px;color: Gray;">');
	arr.push('<label id="info2'+id0+'" style="float: right; font-size: 12px;">个字</label>');
	arr.push('<span id="info0'+id0+'" style="float: right; font-size: 20px; font-weight: bold;">400</span>');
	arr.push('<label id="info1'+id0+'" style="float: right; font-size: 12px;">还能输入</label>');
	arr.push('</div></td></tr></table></form>');//"我的看法"的表单结尾
	o.append(arr.join(' '));
}
//这个函数会调用countTextAreaMaker来生成"我的看法"
function countTextAreaMakerGrounp(potition,number){
	for(var i=0;i<number;i++){
		countTextAreaMaker(potition+i,i);
	}
}