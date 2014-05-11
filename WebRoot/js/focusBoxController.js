function focusBoxController(o,ind,number){
//o: focusBoxID ind:focusBox Index n:focuseBox number 
	if(!o) return;
	w=630;
	var i=0,l=0,arr=[];
	var oa = new Array(number),pagesLia=new Array(number),infoLia = new Array(number),ula= new Array(number),lena = new Array(number);
	oa[ind]=$('#'+o);
	infoLia[ind]=oa[ind].find('.banner_info li');
	lena[ind]= $(infoLia[ind]).length*2;
	ula[ind]=oa[ind].find('.banner_pic ul');
	ula[ind].append(ula[ind].html()).css({'width':lena[ind]*w, 'left': -lena[ind]*w/2});
	infoLia[ind].eq(0).addClass('current');
	//add banner_pages element
	arr.push('<div class="banner_pages"><ul>');
	infoLia[ind].each(function(i){
		if(i==0){
			arr.push('<li class="current"><span>'+ (i+1) +'</span></li>');
		}else{
			arr.push('<li><span>'+ (i+1) +'</span></li>');
		}
	});
	arr.push('</ul></div>');
	oa[ind].append(arr.join(''));
	pagesLia[ind] = oa[ind].find('.banner_pages li');
	//mouse
	pagesLia[ind].children('span').click(function(){
		var p = pagesLia[ind].index(oa[ind].find('.banner_pages li.current'));
		i = pagesLia[ind].children('span').index($(this));
		if(i==p) return;
		l = parseInt(ula[ind].css('left')) + w*(p-i);
		addCurrent(i,l,ind);
		return false;
	})
	oa[ind].children('a.btn_prev').click(function(){
		i = pagesLia[ind].index(oa[ind].find('.banner_pages li.current'));
		(i==0)? i=(lena[ind]/2-1):i--;
		l = parseInt(ula[ind].css('left')) + w;
		addCurrent(i,l,ind);
		return false;
	})
	oa[ind].children('a.btn_next').click(function(){
		i = (pagesLia[ind].index(oa[ind].find('.banner_pages li.current'))+1)%(lena[ind]/2);
		l = parseInt(ula[ind].css('left')) - w;
		addCurrent(i,l,ind);
		return false;
	})
	//add focus
	function addCurrent(i,l,ind){
		ula[ind]=oa[ind].find('.banner_pic ul');
		infoLia[ind] = oa[ind].find('.banner_info li')
		pagesLia[ind] = oa[ind].find('.banner_pages li');
		if(ula[ind].is(':animated')) return;
		ula[ind].animate({'left':l},500,function(){
			oa[ind].children('.banner_count').text(i+1);
			$(infoLia[ind]).not($(infoLia[ind]).eq(i).addClass('current')).removeClass('current');
			$(pagesLia[ind]).not($(pagesLia[ind]).eq(i).addClass('current')).removeClass('current');
			if(l== (1-lena[ind])*w){
				ula[ind].css({'left': (1-lena[ind]/2)*w});
			}else if(l== 0){
				ula[ind].css({'left': -lena[ind]*w/2});
			}
		});
	}
}