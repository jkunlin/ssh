<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>

    <head>
		<meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
        <title>Thumbnail Proximity Effect Demo with jQuery and CSS3</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <meta name="description" content="Thumbnail Proximity Effect with jQuery and CSS3" />
        <meta name="keywords" content="thumbnails, jquery, proximity, effect, css3, scale, mouse, hover" />
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/style3.css" />
       
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css">
	    <link href="css/bootstrap-responsive.css" rel="stylesheet" type="text/css">   	
	    <link rel="stylesheet" type="text/css" href="css/style4.css" />  	
		<script type="text/javascript" src="js/jquery-1.9.0.js"></script>
		<script type="text/javascript" src="js/bootstrap.js"></script>
	    <script type="text/javascript" src="assep.js"></script>
	    
    </head>
    <body id="page">
    
       <s:include value="message.jsp"></s:include>  
	
    
        <div class="container">
			<header>
				<h1>SFAPU <span>BuLaBuLa</span> System</h1>
			</header>
			<section class="pe-container">
				<ul id="pe-thumbs" class="pe-thumbs">
					<li><a href="#"><img src="images/thumbs/1.jpg" /><div class="pe-description"><h3>time</h3><p>Since time, and his predestinated end</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/2.jpg" /><div class="pe-description"><h3>hopeful</h3><p>Abridged the circuit of his hopeful days</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/3.jpg" /><div class="pe-description"><h3>virtue</h3><p>Whiles both his youth and virtue did intend</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/4.jpg" /><div class="pe-description"><h3>endeavors</h3><p>The good endeavors of deserving praise</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/5.jpg" /><div class="pe-description"><h3>monument</h3><p>What memorable monument can last</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/6.jpg" /><div class="pe-description"><h3>name</h3><p>Whereon to build his never-blemished name</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/7.jpg" /><div class="pe-description"><h3>life was graced</h3><p>But his own worth, wherein his life was graced</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/8.jpg" /><div class="pe-description"><h3>the same</h3><p>Sith as that ever he maintained the same?</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/9.jpg" /><div class="pe-description"><h3>oblivion</h3><p>Oblivion in the darkest day to come</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/10.jpg" /><div class="pe-description"><h3>sin shall tread</h3><p>When sin shall tread on merit in the dust</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/11.jpg" /><div class="pe-description"><h3>lamentable tomb</h3><p>Cannot rase out the lamentable tomb</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/12.jpg" /><div class="pe-description"><h3>short-lived deserts</h3><p>Of his short-lived deserts; but still they must</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/13.jpg" /><div class="pe-description"><h3>hearts and memories</h3><p>Even in the hearts and memories of men</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/14.jpg" /><div class="pe-description"><h3>respect</h3><p>Claim fit respect, that they, in every limb</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/15.jpg" /><div class="pe-description"><h3>comfort</h3><p>Remembering what he was, with comfort then</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/16.jpg" /><div class="pe-description"><h3>pattern</h3><p>May pattern out one truly good, by him</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/17.jpg" /><div class="pe-description"><h3>truly good</h3><p>For he was truly good, if honest care</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/18.jpg" /><div class="pe-description"><h3>harmless conversation</h3><p>Of harmless conversation may commend</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/19.jpg" /><div class="pe-description"><h3>recompensed</h3><p>Ill recompensed only in his end</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/20.jpg" /><div class="pe-description"><h3>tongue</h3><p>Nor can the tongue of him who loved him least</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/21.jpg" /><div class="pe-description"><h3>superlative</h3><p>To one superlative above the rest</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/22.jpg" /><div class="pe-description"><h3>steady faith</h3><p>Of many men in steady faith reprove</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/23.jpg" /><div class="pe-description"><h3>constant temper</h3><p>His constant temper, in the equal weight</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/24.jpg" /><div class="pe-description"><h3>thankfulness</h3><p>Of thankfulness and kindness: Truth doth leave</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/25.jpg" /><div class="pe-description"><h3>proof</h3><p>Sufficient proof, he was in every right</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/26.jpg" /><div class="pe-description"><h3>thankful</h3><p>As kind to give, as thankful to receive.</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/27.jpg" /><div class="pe-description"><h3>curious eye</h3><p>The curious eye of a quick-brained survey</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/28.jpg" /><div class="pe-description"><h3>scantly find</h3><p>Could scantly find a mote amidst the sun</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/29.jpg" /><div class="pe-description"><h3>too-shortened days</h3><p>Of his too-shortened days, or make a prey</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/30.jpg" /><div class="pe-description"><h3>faulty errors</h3><p>Of any faulty errors he had done</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/31.jpg" /><div class="pe-description"><h3>spleenful sense</h3><p>Not that he was above the spleenful sense</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/32.jpg" /><div class="pe-description"><h3>spite of malice</h3><p>And spite of malice, but for that he had</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/33.jpg" /><div class="pe-description"><h3>innocence</h3><p>Warrant enough in his own innocence</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/34.jpg" /><div class="pe-description"><h3>nature</h3><p>Against the sting of some in nature bad</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/35.jpg" /><div class="pe-description"><h3>absolutely blest</h3><p>Yet who is he so absolutely blest</p></div></a></li>
					<li><a href="#"><img src="images/thumbs/36.jpg" /><div class="pe-description"><h3>mortal frame</h3><p>That lives encompassed in a mortal frame</p></div></a></li>
				</ul>
			</section>
            <p class="codrops-demos">
           	   <form action="login" method="post">
			  		用户名: <input type="text" name="username" />
  					密码: <input type="text" name="password" />
  					
		  			<input class="submit" type="submit" value="登录" />
		  			<a href="#load_change_rule" data-toggle="modal"><input class="submit" type="button" value="注册" /></a>
				</form>
            </p>
        </div>
       
    <div class="modal hide fade" id="load_change_rule">
  		<div class="modal-header">
  			<a href="#" class="close" data-dismiss="modal">X</a>
  			<h4>User Register</h4>
   	    </div>
   	    <form action = "enroll" class="form-horizontal" method="post">
  		<div class="modal-body">
			
			 <div class="control-group">
			    <label class="control-label" for="inputName">User Name</label>
			    <div class="controls">
			      <input name = "username" type="text" id="inputName" placeholder="ID">
			    </div>
			  </div>
			  <div class="control-group">
			    <label class="control-label" for="inputEmail">Email</label>
			    <div class="controls">
			      <input name = "email" type="text" id="inputEmail" placeholder="Email">
			    </div>
			  </div>
			  <div class="control-group">
			    <label class="control-label" for="inputPassword">Password</label>
			    <div class="controls">
			      <input name="password" type="password" id="inputPassword" placeholder="Password">
			    </div>
			  </div>
			  <div class="control-group">
			    <label class="control-label" for="ConfirmPassword">Confirm</label>
			    <div class="controls">
			      <input name="confirm_password" type="password" id="ConfirmPassword" placeholder="Input Password Again">
			    </div>
			  </div>
			  
			
    	</div>
	    <div class="modal-footer">
	  		<button type="submit" class="btn btn-primary">Submit</button>
	 		 <button type="button" class="btn btn-primary" data-dismiss="modal" aria-hidden="true">Quit</button>
	  	</div>
	  	<form>
  	</div>
        
        
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/jquery.proximity.js"></script>
	 <script type="text/javascript">
			$(function() {
				
				var Photo	= (function() {
					
					var $list		= $('#pe-thumbs'),
						listW		= $list.width(),
						listL		= $list.offset().left,
						$elems		= $list.find('img'),
						$descrp		= $list.find('div.pe-description'),
						settings	= {
							maxScale	: 0.9,
							maxOpacity	: 0.9,
							minOpacity	: Number( $elems.css('opacity') )
						},
						init		= function() {
							
							settings.minScale = _getScaleVal();
							_loadImages( function() {
								
								_calcDescrp();
								_initEvents();
							
							});
						
						},
						_getScaleVal= function() {
						
							var st = window.getComputedStyle($elems.get(0), null),
								tr = st.getPropertyValue("-webkit-transform") ||
									 st.getPropertyValue("-moz-transform") ||
									 st.getPropertyValue("-ms-transform") ||
									 st.getPropertyValue("-o-transform") ||
									 st.getPropertyValue("transform") ||
									 "fail...";

							if( tr !== 'none' ) {	 

								var values = tr.split('(')[1].split(')')[0].split(','),
									a = values[0],
									b = values[1],
									c = values[2],
									d = values[3];

								return Math.sqrt( a * a + b * b );
							
							}
							
						},
						_calcDescrp	= function() {
							
							$descrp.each( function(i) {
							
								var $el		= $(this),
									$img	= $el.prev(),
									img_w	= $img.width(),
									img_h	= $img.height(),
									img_n_w	= settings.maxScale * img_w,
									img_n_h	= settings.maxScale * img_h,
									space_t = ( img_n_h - img_h ) / 2,
									space_l = ( img_n_w - img_w ) / 2;
								
								$el.data( 'space_l', space_l ).css({
									height	: settings.maxScale * $el.height(),
									top		: -space_t,
									left	: img_n_w - space_l
								});
							
							});
						
						},
						_initEvents	= function() {
						
							$elems.on('proximity.Photo', { max: 170, throttle: 10, fireOutOfBounds : true }, function(event, proximity, distance) {
								
								var $el			= $(this),
									$li			= $el.closest('li'),
									$desc		= $el.next(),
									scaleVal	= proximity * ( settings.maxScale - settings.minScale ) + settings.minScale,
									scaleExp	= 'scale(' + scaleVal + ')';
								
								var $desc		= $el.next();
								if( scaleVal === settings.maxScale ) {
									
									$li.css( 'z-index', 1000 );
									
									if( $desc.offset().left + $desc.width() > listL + listW ) {
										
										$desc.css( 'left', -$desc.width() - $desc.data( 'space_l' ) );
									
									}
									
									$desc.fadeIn( 800 );
									
								}	
								else {
									
									$li.css( 'z-index', 1 );
									
									$desc.stop(true,true).hide();
								
								}	
								
								$el.css({
									'-webkit-transform'	: scaleExp,
									'-moz-transform'	: scaleExp,
									'-o-transform'		: scaleExp,
									'-ms-transform'		: scaleExp,
									'transform'			: scaleExp,
									'opacity'			: ( proximity * ( settings.maxOpacity - settings.minOpacity ) + settings.minOpacity )
								});

							});
						
						},
						_loadImages	= function( callback ) {
							
							var loaded 	= 0,
								total	= $elems.length;
							
							$elems.each( function(i) {
								
								var $el = $(this);
								
								$('<img/>').load( function() {
									
									++loaded;
									if( loaded === total )
										callback.call();
									
								}).attr( 'src', $el.attr('src') );
							
							});
						
						};
					
					return {
						init	: init
					};
				
				})();
				
				Photo.init();
				
			});
	  </script>
    </body>
</html>