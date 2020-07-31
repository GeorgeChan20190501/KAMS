function toggleClass(index){
	  		var hh='hh'+index;
	  		var jj='jj'+index;
	  	
	  		
			var cur=$('#'+hh).hasClass('icon-wenjianjia') ? 'icon-wenjianjia' : 'icon-ic_folder';
			//全部设置成默认格式：文件闭合，箭头向下
	  		$('.hh').removeClass('icon-ic_folder');
	  		$('.jj').removeClass('icon-shangjiantou');
	  		$('.hh').addClass('icon-wenjianjia');
	  		$('.jj').addClass('icon-xiajiantou');
	  		//完毕
			if(cur=='icon-wenjianjia'){
				$('#'+hh).removeClass(cur);
				$('#'+jj).removeClass('icon-xiajiantou');
				$('#'+hh).addClass('icon-ic_folder');
				$('#'+jj).addClass('icon-shangjiantou');
			}
			else{
				$('#'+hh).removeClass(cur);
				$('#'+jj).removeClass('icon-shangjiantou');
				$('#'+hh).addClass('icon-wenjianjia');
				$('#'+jj).addClass('icon-xiajiantou');
			}         
  }

function cal(index){
	toggleClass(index);
}
function href(myhref){
	ifra.location.href=myhref;
}

function userBG(item){
	var bg="Bisque";
	switch(item){
		case 'A':
		   bg="Aqua";
		   break;
        case 'B':
		   bg="Brown";
		   break;
		case 'C':
		   bg="Coral";
		   break;

		case 'D':
		   bg="DarkCyan";
		   break;
        case 'E':
		   bg="Indigo";
		   break;
		case 'F':
		   bg="Fuchsia";
		   break;
		case 'G':
		   bg="Gray";
		   break;
		case 'H':
		   bg="HotPink";
		   break;
        case 'I':
		   bg="IndianRed";
		   break;
		case 'J':
		   bg="DarkSlateGray";
		   break;

		case 'K':
		   bg="Green";
		   break;
        case 'L':
		   bg="MediumPurple";
		   break;
		case 'M':
		   bg="LightSkyBlue";
		   break;
		case 'N':
		   bg="Navy";
		   break;
		case 'O':
		   bg="Orange";
		   break;
        case 'P':
		   bg="PaleVioletRed";
		   break;
		case 'Q':
		   bg="Purple";
		   break;

		case 'R':
		   bg="Red";
		   break;
        case 'S':
		   bg="SaddleBrown";
		   break;
		case 'T':
		   bg="Thistle";
		   break;
		case 'U':
		   bg="SlateGray";
		   break;
        case 'V':
		   bg="SlateBlue";
		   break;
		case 'W':
		   bg="Sienna";
		   break;

		case 'X':
		   bg="RoyalBlue";
		   break;
        case 'Y':
		   bg="Plum";
		   break;
		case 'Z':
		   bg="Olive";
		   break;
	     default:
			break;
	}
	return bg;
}

