<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<html lang="en">
    <head>
        <title>Item Blur Effect with CSS3 and jQuery</title>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <meta name="description" content="Item Blur Effect with CSS3 and jQuery - Using Box Shadows, Transform and Transitions" />
        <meta name="keywords" content="blur, css3, transition, jquery, box shadow, text shadow, articles, scale, transform, animation" />
        <meta name="author" content="Codrops" />
		<script src="js/modernizr.custom.34978.js"></script>
		<script src="js/floatmenu.js"></script>
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/style.css" />
		<link rel="stylesheet" type="text/css" href="css/floatmenu.css" />
		<script type="text/javascript">
			$(function() {		
				var $container	= $('#ib-container'),
					$articles	= $container.children('article'),
					timeout;
				
				$articles.on( 'mouseenter', function( event ) {
						
					var $article	= $(this);
					clearTimeout( timeout );
					timeout = setTimeout( function() {
						
						if( $article.hasClass('active') ) return false;
						
						$articles.not( $article.removeClass('blur').addClass('active') )
								 .removeClass('active')
								 .addClass('blur');
						
					}, 65 );
					
				});
				
				$container.on( 'mouseleave', function( event ) {
					
					clearTimeout( timeout );
					$articles.removeClass('active blur');
					
				});
				//初始化菜单
				menuInitialize();
				

			});
			
		</script>
    </head>
    <body>
		
        <div class="container">
			<header>
				<s:if test="#session.username != null">
			    	<h5 style="float:right;">Welcome Back! <a href="userManage.action"><s:property value="#session.username"></s:property></a><a href="logout.action">&emsp;log out</a></h5><br>
			    </s:if>
			    <s:else>
			    	<h5 style="float:right;"><a href="wellcome.jsp">&emsp;log in</a></h5><br>
			    </s:else>
			    
				<h1>Article <span>Wanted!</span></h1>
				<h2>Using Box Shadows, Transform and Transitions</h2>
			</header>
			<section class="ib-container" id="ib-container">
			<s:iterator value="#request.article_list" id = "article" status="st">
				<article>
					<input type="text" id="article_id${st.index}" style="display:none;" value="${article[0]}">
					<header>
						<h3>
							<s:a target="_blank" href="showArticle.action?article_id=%{#article[0]}">
								<div id="article_title${st.index}">	
									<s:property value="#article[1]"/>
								</div>
							</s:a>
						</h3>
						<!-- <span>December 8, 2011 by Gisele Muller</span> -->
					</header>
					<p>
						<div id="article_content${st.index}">
							<s:property value="#article[2]"/>
						</div>	
					</p>
				</article>
			</s:iterator>

				
			</section>
        </div>
		
		<!--悬浮菜单-->
		<div class="float-open" id="float-open" style="left:-2px; top:100px;background:url(images/history.png) no-repeat;background-size:90% 90%;background-position:center;">
			<a class="open-btn" id="open-btn" href="javascript:void(0);">&gt;</a>
		</div>
		<div class="float-news" id="float-news" style="left:-450px; top:75px; width:320px;height:500px">
			<a class="float-close" id="float-close" style="background:url(images/x.png) no-repeat;background-size:100% 100%;" href="javascript:void(0);">X</a>
			<div class="newslist">
				<h3>选择杂志</h3>
				<ul>
					<s:iterator value="#request.journal_list" id = "journal">
						<li>
							<s:a href="listJournal.action?journal_id=%{#journal[0]}"><s:property value="#journal[2]"></s:property>  <s:property value="#journal[1]"/> </s:a>
						</li>
					</s:iterator>
					
				</ul>
			</div>
		</div>
		<!--菜单-->
		</div>
		<s:if test="#session.admin == true">
			<div class="float-open" id="float-open2" style="left:-2px; top:300px;background:url(images/admin.png) no-repeat;background-size:90% 90%;background-position:center;">
			<a class="open-btn" id="open-btn2" href="javascript:void(0);">&gt;</a>
		</div>
		
		<div class="float-news" id="float-news2" style="left:-450px; top:250px; width:48px;height:200px">
			<table>
				<tr>
					<td>
						<a class="submenu" id="float-subopen1" href="javascript:void(0);">
							<img class="submenuimg" border="0" src="images/new.png" />
						</a>
					<td>
				</tr>
				<tr>
					<td>
						<a class="submenu" id="float-subopen2" href="javascript:void(0);">
							<img class="submenuimg" border="0" src="images/edit.png" />
						</a>
					<td>
				</tr>
								<tr>
					<td>
						<a class="submenu" id="float-subopen3" href="javascript:void(0);">
							<img class="submenuimg" border="0" src="images/delete.png" />
						</a>
					<td>
				</tr>
				<tr>
					<td>
						<a class="submenu" id="float-close2" href="javascript:void(0);">
							<img class="submenuimg" border="0" src="images/x.png" />
						</a>
					</td>
				</tr>
			</table>
		</div>
		
		
		
		<!--新建杂志设置-->
		<div class="float-news" id="float-new-set" style="left:-300px; top:200px; width:200px;height:200px">
			<a class="float-close" id="float-close-new-set" style="background:url(images/x.png) no-repeat;background-size:100% 100%;" href="javascript:void(0);"></a>
			<div class="newslist">
				<h3>设置新杂志</h3>
				
				<table>
					<tr><td>新杂志文章数目(1-12)</td></tr>
					<tr><td><input type="text" id="article_number_set" style="width:185px" value=8 /></td></tr>
					<tr><td>每篇文章章数(1-10)</td></tr>
					<tr><td><input type="text" id="chapter_number_set" style="width:185px" value=5 /></td></tr>
					<tr>
						<td style="height:50px" align="left"><input class="submit" type="button" value="确定" onclick="javascript:open_new_article()"></td>
					</tr>
				</table>
				
			</div>
		</div>
		
		<!--新建杂志菜单-->
		<div class="float-news" id="float-new" style="left:-300px; top:75px; width:200px;height:550px">
			<a class="float-close" id="float-close-new" style="background:url(images/x.png) no-repeat;background-size:100% 100%;" href="javascript:void(0);">X</a>
			<div class="newslist">
			<s:form action="addJournal" id="new-journal">
				<h3>新建杂志</h3>
				<div id="new-joural-html"/>
			</s:form>
			</div>
		</div>
		
		<!--编辑文章标题简介窗口-->
		<div class="float-news" id="float-edit-windows" style="left:-450px; top:75px; width:280px;height:525px">
			<a class="float-close" id="float-close" style="background:url(images/x.png) no-repeat;background-size:100% 100%;" href="javascript:menu_close('float-edit-windows','float-new')">X</a>
				<input id="article_id" style="display:none"  value=""/><!--放文章编号-->
				<input id="chapter_number" style="display:none"  value=""/><!--放文章章节数-->
				<div class="newslist">
					<h3>文章详情</h3>
					<table>
						<tr>
							<td>标题：<input id="article_edit_title" type="text" style="width:200px"></td>
						</tr>
						<tr>
							<td>描述：</td>
						</tr>
						<tr>
							<td align="right"><textarea id="article_edit_content" rows="3" cols="30"></textarea><td>
						</tr>
						<tr>
							<td>章列表</td>
						</tr>
						<td>
						<div id="new-edit-joural-html"/>
						</td>
						<tr>
							<td align="right"><input class="submit" type="button" value="确定" onclick="javascript:save_article()"></td>
						</tr>
					</table>
				</div>
		</div>
		
		

		
		
		<!--编辑杂志菜单-->
		<div class="float-news" id="float-edit" style="left:-600px; top:100px; width:400px;height:450px">
			<!--需要设置当前文章数-->
			<input id="current_article_number" style="display:none" value='${request.article_list.size()}'/>
			<a class="float-close" id="float-close-edit" style="background:url(images/x.png) no-repeat;background-size:100% 100%;" href="javascript:void(0);">X</a>
			<div class="newslist">
				<h3>编辑文章信息</h3>
				请选择要编辑的文章
				<div id="edit-Article-html"/>
			</div>
		</div>
		
		<!--编辑文章信息-->
		<div class="float-news" id="float-edit-article" style="left:-450px; top:225px; width:280px;height:200px">
			<a class="float-close" style="background:url(images/x.png) no-repeat;background-size:100% 100%;" href="javascript:menu_close('float-edit-article','float-edit')">X</a>
			<s:form action="editJournal" id="edit-journal-form">
				<input name="journal_id" style="display:none;" value="${request.journal_id}">
				<input id="current_article_index" style="display:none"  value=""/>
				<div class="newslist">
					<h3>文章详情</h3>
					<input name="article_id" id="current_article_id" style="display:none" value=""/><!--在数据库中的文章id-->
					<div id="edit-Article-imf"/><!--用于生成文章信息-->
				</div>
			</s:form>
		</div>
		
		
		<!--删除杂志菜单-->
		<div class="float-news" id="float-delete" style="left:-450px; top:250px; width:200px;height:170px">
			<a class="float-close" id="float-close-delete" style="background:url(images/x.png) no-repeat;background-size:100% 100%;" href="javascript:void(0);">X</a>
			<div class="newslist">
				<h3>删除杂志</h3>
				<table>
					<tr>
						<td align="center"><img class="submenuimg" border="0" src="images/warning.png" /><td>
					</tr>
					<tr>
						<td align="center"><h4>确定删除当前杂志？<h4></td>
					</tr>
					<tr>
						<td align="center">
							<s:a href="deleteJournal.action?journal_id=%{#request.journal_id}"><input class="submit" type="button" value="确定"> </s:a>
						</td>
					</tr>
				</table>
			</div>
		</div>
		
		</s:if>
	</body>
</html>
