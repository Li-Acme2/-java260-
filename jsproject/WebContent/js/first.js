var a = 1;
var b = 'b';            //全局变量

function test2() {
	c = 13;           //全局变量
	var d = 14;        //局部变量
	alert(b);
	alert(c);
	alert(d);
}
function test1() {
	var a = 1;
	var date = new Date();
	alert(c);
	alert(b);
	alert(date);
	alert("第一个js！"+a);
}
function test3() {
	var b = 1;
	alert(a++);
	alert(b++);
}
function test4() { //类型
	var s;
	c =NaN;
	var b = null;
	var s1 = "sdf'sdf'fdsf'fs'fdaf'df'";
	document.write(c);
	document.write(s1);
	document.write(s+"<br>");  //undefined
	document.write(b);  //null
}
function test5() {
	var s1 = 3;
	var s2 = "4";
	alert(s1+s2);//34 字符串拼接
	alert(s1*s2);//12 转换为数字相乘
}
function test6() {
	var arr1=[1,22,'sdf'];
	var arr2=new Array();
	arr2[0]=0;          //往arr2里面添加数据
	arr2[1]=1;
	arr2[2]=2;
//	arr1[3]=new Date(); //往arr1里面添加数据
//	arr1[0]=0;     //将数组arr1下标为0的数据替换
//	alert(arr1);
	alert(arr2);
//	alert(arr1.length);
//	arr1.length = 0;   //将数组长度置0，相当于移除数组的所有元素
//	alert(arr1);
	var lastadd = "lastadd";
	arr2.push(lastadd);        //在数组末尾添加一个元素
	alert(arr2);
	arr2.pop();                //将数组末尾的元素删除
	alert(arr2);
	var first ="first";            
	arr2.unshift(first);      //在数组第一个元素前面添加一个元素
	alert(arr2);
	arr2.shift();                  //删除数组的第一个元素
	alert(arr2);	
}
function testClick() {//被点击
	alert("click");
}
function testDbclick() {//被双击
	alert("double click");
}
function testBlur() {//失去焦点
	alert("testOnblur");
}
function testFocus() {//成为焦点
	alert("testFocus");
}
function testChange() {//选中的对象值发生改变
	alert("testChange");
}
function testLoad() {//页面加载
	alert("页面加载成功");
}
function testunLoad() {   //浏览器兼容，我的不能运行了
	document.write("页面卸载");
	alert("页面卸载");
}
function testMouseMove() {//鼠标移动
	alert("testMouseMove");
}
function Time() {
	var curr = new Date();
//	document.write(curr.getyear());
//	curr.setMonth(1, 2);
	document.write(curr.toLocaleString()+"<br>");//获取北京时间
	document.write(curr.toUTCString()+"<br>");//获取格林尼治GMT时间
	document.writeln(curr.getFullYear()+"<br>");//获取年份
	document.write((curr.getMonth()+1)+"<br>");//获取月份
	document.write(curr.getDate()+"<br>");//获取日
	document.write(curr.getDay()+"<br>");//获取星期
	document.write(curr.getHours()+"<br>");//获取小时
	document.write(curr.getMinutes()+"<br>");//获取分钟
	document.write(curr.getSeconds()+"<br>");//获取秒数
	document.write(curr.getTime()+"<br>");//获取从1900年到现在的毫秒数
}
function testMath() {//Math方法
	var r = Math.random();
	alert(r);
	alert(Math.round(r));//四舍五入
	alert(Math.floor(r));//向下取整
	alert(Math.ceil(r));//向上取整
}
function testString() {
	var s = "string";
	alert(s.substring(0,2));//从下标为0开始，取2个字符。2省略，取到字符串末尾
	alert(s.substr(0,3));//从下标0开始，到下标为3，不包括3；2省略，取得字符串末尾
}













