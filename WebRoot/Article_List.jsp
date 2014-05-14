<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
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
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<style type="text/css">
			/* weiduduan */
			.weiduduan{ width:550px; margin:15px auto 0 auto;}
			.float-news,.float-open{background:#fbfbfb;border:2px solid #e1e1e1;border-left:0 none;border-top-right-radius:4px;border-bottom-right-radius:4px;box-shadow:1px 1px 2px rgba(0, 0, 0, 0.5);display:inline-block;font-size:16px;}
			.float-news{height:380px;left:0px;padding:10px 15px;width:300px;z-index:100;top:117px;_margin-top:117px;}
			.float-open{height:48px;left:-70px;padding:4px 4px 4px 6px;width:48px;z-index:99;top:206px;_margin-top:206px;}
			.float-news,.float-open{position:fixed;*zoom:1;_position:absolute;_top:expression(eval(document.documentElement.scrollTop));}
			.float-close{overflow:hidden;height:48px;opacity:.6;filter:alpha(opacity=60);position:absolute;right:9px;text-indent:100%;top:10px;white-space:nowrap;width:48px;}
			.open-btn{display:block;overflow:hidden;height:48px;opacity:.6;filter:alpha(opacity=60);text-indent:100%;white-space:nowrap;width:48px;}
			.float-close:hover,.open-btn:hover{opacity:1;filter:alpha(opacity=100);}
			.newslist h3{color:#333;border-bottom:4px solid #F2F2F2;font-size:26px;height:54px;line-height:54px;font-family:Microsoft Yahei,simsun,arial,sans-serif;}
			.newslist ul{margin-top:10px;}
			.newslist li{position:relative;height:30px;line-height:30px;font-size:14px;border-bottom:1px #ccc dotted}
			.newslist li a{color:#404040;}
			.newslist li span{position:absolute;right:0;color:#ccc;}
			.newslist li:last-child{border-bottom:0;}
		</style>
		<link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/style.css" />
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
				function ml_close_demo() {
					$('#float-news').animate({
						left: '-450px'
					}, 300, function(){
						$('#float-open').delay(50).animate({
							left: '-2px'
						}, 300);
					});
				}
				function ml_open_demo() {
					$('#float-open').animate({
						left: '-70px'
					}, 100, function(){
						$('#float-news').delay(50).animate({
							left: '0px'
						}, 300);
					});
				}
				$('#float-close').click(function(){
					ml_close_demo();
					return false;
				});
				$('#open-btn').click(function(){
					ml_open_demo();
					return false;
				});
			});

		</script>
    </head>
    <body>

		
        <div class="container">
			<header>
				<h1>Article <span>Wanted!</span></h1>
				<h2>Using Box Shadows, Transform and Transitions</h2>
			</header>
			<section class="ib-container" id="ib-container">
				<s:iterator value="#request.article_list" id = "article">
					<article>
						<header>
							<h3><s:a target="_blank" href="http://tympanus.net/codrops/2011/12/08/25-examples-of-perfect-color-combinations-in-web-design/">
								<s:property value="#article.title"/>
							</s:a></h3>
							<span>December 8, 2011 by Gisele Muller</span>
						</header>
						<p><s:property value="#article.outline"/></p>
					</article>
				</s:iterator>
				<!-- 
				<article>
					<header>
						<h3><a target="_blank" href="http://tympanus.net/codrops/2011/12/08/25-examples-of-perfect-color-combinations-in-web-design/">25 Examples of Perfect Color Combinations in Web Design</a></h3>
						<span>December 8, 2011 by Gisele Muller</span>
					</header>
					<p>Today we will show you some examples of websites that are using beautiful and inspiring color combinations that match perfectly and create an eye candy...</p>
				</article>
				<article>
					<header>
						<h3><a target="_blank" href="http://tympanus.net/codrops/2011/12/08/design-it-to-build-it-what-to-consider-when-designing-for-the-web/">Design It to Build It: What to Consider When Designing for the Web</a></h3>
						<span>December 8, 2011 by Patrick Cox</span>
					</header>
					<p>For me, Photoshop is becoming more and more of a prototyping or blue printing tool: itâs basically just a canvas...</p>
				</article>
				<article>
					<header>
						<h3><a target="_blank" href="http://tympanus.net/codrops/2011/12/07/splash-and-coming-soon-page-effects-with-css3/">Splash and Coming Soon Page Effects with CSS3</a></h3>
						<span>December 7, 2011 by Mary Lou </span>
					</header>
					<p>CSS3 opens up so many crazy possibilities and today we want to show you how to go wild with splash and coming soon page effects using CSS3 animations.</p>
				</article>
				<article>
					<header>
						<h3><a target="_blank" href="http://tympanus.net/codrops/2011/12/05/lateral-on-scroll-sliding-with-jquery/">Lateral On-Scroll Sliding with jQuery</a></h3>
						<span>December 5, 2011 by Mary Lou </span>
					</header>
					<p>After getting the request, we are going to show you how to create a âslide-in on scrollâ effect. Youâve probably seen this cool effect on some websites, like on Nizo or in the portfolio section of brilliantly designed La Moulade. </p>
				</article>
				<article>
					<header>
						<h3><a target="_blank" href="http://tympanus.net/codrops/2011/12/01/6-questions-you-should-ask-yourself-when-choosing-fonts/">6 Questions You Should Ask Yourself When Choosing Fonts</a></h3>
						<span>December 1, 2011 by Patrick Cox </span>
					</header>
					<p>Typography is truly a science and many designers spend an entire career devoted to the study. But selecting effective fonts for your project doesn't require...</p>
				</article>
				<article>
					<header>
						<h3><a target="_blank" href="http://tympanus.net/codrops/2011/11/30/inspiring-examples-of-symbol-and-metaphor-use-in-web-design/">Inspiring Examples of Symbol and Metaphor Use in Web Design</a></h3>
						<span>November 30, 2011 by Mary Lou</span>
					</header>
					<p>There are many creative ways of showing what a website is about: the use of images, videos, descriptions and more. Symbolic graphics and metaphorical pictures...</p>
				</article>
				<article>
					<header>
						<h3><a target="_blank" href="http://tympanus.net/codrops/2011/11/28/typography-effects-with-css3-and-jquery/">Typography Effects with CSS3 and jQuery</a></h3>
						<span>November 28, 2011 by Mary Lou</span>
					</header>
					<p>Today we will create a set of nice typography effects for big headlines using CSS3 and jQuery. There are many things we can do with CSS3 animations and transitions and weâll...</p>
				</article>
				<article>
					<header>
						<h3><a target="_blank" href="http://tympanus.net/codrops/2011/11/24/top-10-reasons-to-use-html5-right-now/">Top 10 Reasons to Use HTML5 Right Now</a></h3>
						<span>November 24, 2011 by Patrick Cox </span>
					</header>
					<p>So you're still not using HTML5, huh? I guess you probably have your reasons; it's not fully adopted yet, it doesn't work in IE, you don't like users, you're out of touch or you are just...</p>
				</article>
				 -->
			</section>
        </div>
				<div class="float-open" id="float-open" style="left:-2px; top:100px;background:url(images/history.png) no-repeat;background-size:90% 90%;background-position:center;">
			<a class="open-btn" id="open-btn" href="javascript:void(0);">&gt;</a>
		</div>
		
		<div class="float-news" id="float-news" style="left:-450px; top:75px; width:320px;height:500px">
			<a class="float-close" id="float-close" style="background:url(images/x.png) no-repeat;background-size:100% 100%;" href="javascript:void(0);">X</a>
			<div class="newslist">
				<h3>what the hell</h3>
				<ul>
				<!-- 
					<li>
						<a href="#">2013-10 æä»¬æ¥èªç«æä¹?<a/>			
					</li>
					<li>
						<a href="#">2013-11 ææä¸çä½ <a/>		
					</li>
					<li>
						<a href="#">2013-12 çåéªå£«çä¸ç<a/>		
					</li>
					<li>
						<a href="#">2014-01 ç¯ççäººç±»<a/>		
					</li>
				-->
					<s:iterator value="#request.journal_list" id = "journal">
						<li>
							<s:a href="listJournal.action?journal_id=%{#journal[0]}"><s:property value="#journal[1]"/> </s:a>
						</li>
					</s:iterator>
				</ul>
				
				
			</div>
		</div>
    </body>
</html>