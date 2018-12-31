<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- <script type="text/javascript" >alert("Hello js!");</script> -->
<script type="text/javascript" src="js/first.js"></script>
</head>
<body onload="testLoad();" onunload="alert('页面卸载');">
<!-- <input type="button" onclick="test1()" value="ceshi">
<input type="button" onclick="test2()" value="变量">
<input type="button" onclick="test3()" value="++测试">
<input type="button" onclick="test4()" value="类型测试">
<input type="button" onclick="test5()" value="类型转换">
<input type="button" onclick="test6()" value="数组">-->

<input type="button" onclick="testClick();" value="事件1">
<input type="button" ondblclick="testDbclick()" value="事件2">
<a href="https:www.baidu.com" ondblclick="testDbclick();" >事件2</a><br>
<a href="#" onmousemove="testMouseMove();" >事件3</a><br>
<input type="button" onblur="testBlur()" value="事件3"><br>
<input type="button" onfocus="testFocus()" value="事件4"><br>
<input type="text" onfocus="testFocus()" value="事件4"><br>
<input type="text" onchange="testChange()" value="事件5"><br>
<input type="button" onclick="Time()" value="事件6"><br>
<input type="button" onclick="testMath()" value="事件7"><br>
<input type="button" onclick="testString()" value="事件8"><br>

</body>
</html>