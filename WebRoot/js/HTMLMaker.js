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
function starHTMLMaker(potitionId,id0,id1){
	var arr=new Array();
	var o=$('#'+potitionId);
	arr.push('<table><tr>');
	arr.push('<td>时间: 2010-03-16 <span class="pipe">|</span>评分：</td>');
	arr.push('<td><div id="star'+id0+id1+'" style="width:140px"/></td>');	
	arr.push('<td><div id="result'+id0+id1+'" style="display:none"/></td>');
	arr.push('</tr></table>');
	o.append(arr.join(' '));
}
function starHTMLMakerGrounp(potition,id0,number){
	for(var i=0;i<number;i++){
		starHTMLMaker(potition+id0+i,id0,i);	
		starOperation(id0,i);
	}
}
function countTextAreaMaker(potitionId,id0){
	var arr=new Array();
	var o=$('.'+potitionId);
	arr.push('<table width="630" border="0">');
	arr.push('<tr><textarea id="content'+id0+'" cols="85" rows="11" style="overflow: auto;"></textarea><tr>');
	arr.push('<tr><td><input id="button'+id0+'" type="submit" class="button" value="终于写好啦！提交" /></td>');
	arr.push('<td><div style="vertical-align: bottom; height: 20px; line-height: 20px; margin: 0px;color: Gray;">');
	arr.push('<label id="info2'+id0+'" style="float: right; font-size: 12px;">个字</label>');
	arr.push('<span id="info0'+id0+'" style="float: right; font-size: 20px; font-weight: bold;">400</span>');
	arr.push('<label id="info1'+id0+'" style="float: right; font-size: 12px;">还能输入</label>');
	arr.push('</div></td></tr></table>');
	o.append(arr.join(' '));
}
function countTextAreaMakerGrounp(potition,number){
	for(var i=0;i<number;i++){
		countTextAreaMaker(potition+i,i);
	}
}