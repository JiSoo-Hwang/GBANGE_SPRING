<%@page import="com.kh.gbangeSpring.member.model.vo.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>지방이에 오신걸 환영합니다 :)</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
  
</head>
<style>
*{
    padding: 0;
    margin: 0;
}
ul,ol{
    list-style:none
}
a{
    text-decoration:none;color:black;font-size:20px
}
nav{
    width:100%; height: 70px; overflow:hidden;background-color:lightblue;
}
#nav2>a {
  display: block;
  float: left;
  font-size: 100px;
  font-weight: 900px;
  line-height: 80px;
  padding: 0 30px;
  margin-top: 5px;
}
#nav2>ul {
  float: right;
}
#nav2>ul li {
  float: left;
  padding: 0 30px;
  font-weight: 900;
  line-height: 80px;
  margin: auto;
  margin-top: -10px;
}
#top-nav ul li {
    display: inline-block;
    padding: 10px 20px;
}
#top-nav ul {
    background-color: lightcyan;
    text-align: right;
}
#nav2 > a > img.logo {
    height: 200px;
    max-width: 200px;
    vertical-align: middle;
    margin: auto;
  	margin-top: -70px;
}
</style>
<body>
<%-- <c:if test="${not empty alertMsg }">
	<script>
	alert("${alertMsg}");
	</script>
	<c:remove var="alertMsg"/>
</c:if> --%>


<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
  <nav id="top-nav">
    <ul>
    	<%-- <c:choose>
    		<c:when test="${empty loginUser }">
		        <li><input type="button" onclick="loginView();" value="로그인" class="btn btn-info"></li>
    		</c:when>
    		<c:otherwise>
    			<li><input type="button" onclick="myPage();" value="${loginUser.memberId}" class="btn btn-info"></li>
    		</c:otherwise>
    	</c:choose> --%>
        <li><a href="https://www.instagram.com/"><img style="width:32px; height:32px;" id="user-profile" src="/WEB-INF/views/common/img/free-icon-instagram-733558.png"></a> </li>
        <li><a href="https://www.facebook.com/?locale=ko_KR"><img style="width:32px; height:32px;" id="user-profile" src="/WEB-INF/views/common/img/free-icon-facebook-220200.png"></a></li>
    </ul>
</nav>
<nav id="nav2">
      <a href="/"> <img src="/WEB-INF/views/common/img/Logo-Black.png" alt="지방이" class="logo"></a>
        <ul>
          <li><a href="">공지사항</a></li>
          <li><a href="list.tr?currentPage=1">러닝일지 게시판</a></li>
          <li><a href="">대회참여인증 게시판</a></li>
          <li><a href="">Q/A</a></li>
        </ul>
      </nav>
      
<!--       <script>
      	function loginView(){
      		location.href="login.me";
      	}
      	
      	function myPage(){
      		location.href="mypage.me";
      	}
      </script> -->
</body>
</html>