<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<link href="css/global.css" rel="stylesheet" type="text/css" />
<html>
  <head> 
  	<script type="text/javascript">
  		var falg="${flag}";
  		if(falg==1){
  			parent.location.reload();
  		 }	
  	</script>    
  </head>	  
  		<form action="selectByCondition" method="post">
    	<table class="inputtable" width="100%" style="margin-left:5px;">
            <tr> 
                <td class="leftlabel">周次：</td>
                <td style="width: 30px;">
                	<select name="c_weeks">
						<option value="1">第一周</option>
						<option value="2">第二周</option>
						<option value="3">第三周</option>
						<option value="4">第四周</option>
						<option value="5">第五周</option>
						<option value="6">第六周</option>
						<option value="7">第七周</option>
						<option value="8">第八周</option>
						<option value="9">第九周</option>
						<option value="10">第十周</option>
						<option value="11">第十一周</option>
						<option value="12">第十二周</option>
						<option value="13">第十三周</option>
						<option value="14">第十四周</option>
						<option value="15">第十五周</option>
						<option value="16">第十六周</option>
						<option value="17">第十七周</option>
						<option value="18">第十八周</option>
						<option value="19">第十九周</option>
						<option value="20">第二十周</option>
					</select>
				</td>
  				<td class="leftlabel">星期：</td>
  				<td style="width: 30px;">
  					<select name="c_week">
						<option value="1">周一</option>
						<option value="2">周二</option>
						<option value="3">周三</option>
						<option value="4">周四</option>
						<option value="5">周五</option>
					</select>
  				</td>
  				<td class="leftlabel">节次：</td>
  				<td style="width: 30px;">
  					<select name="c_begin" >
						<option value="1">第一节</option>
						<option value="2">第二节</option>
						<option value="3">第三节</option>
						<option value="4">第四节</option>
						<option value="5">第五节</option>
						<option value="6">第六节</option>
						<option value="7">第七节</option>
						<option value="8">第八节</option>
						<option value="9">第九节</option>
						<option value="10">第十节</option>
						<option value="11">第十一节</option>
					</select>
					<td>至</td>
					<td style="width: 30px;">
  					<select name="c_end">
						<option value="1">第一节</option>
						<option value="2">第二节</option>
						<option value="3">第三节</option>
						<option value="4">第四节</option>
						<option value="5">第五节</option>
						<option value="6">第六节</option>
						<option value="7">第七节</option>
						<option value="8">第八节</option>
						<option value="9">第九节</option>
						<option value="10">第十节</option>
						<option value="11">第十一节</option>
					</select>
				</td>
  				</td>
  				<td class="leftlabel">校区：</td>
  				<td style="width: 30px;">
  					<select name="c_location">
		   				<option value="白云校区">白云校区</option>
						<option value="河源校区">河源校区</option>
						<option value="东校区">东校区</option>
						<option value="西校区">西校区</option>
						<option value="北校区">北校区</option>
						
					</select>
  				</td>
  				<td>
  					<input type="submit" value="查询" style="background-color:#9ab5f1">
  					<input type="button" value="显示全部" style="background-color:#9ab5f1"></a>
  				</td>
  				</tr>
  			</table>			
  			</form>
  		</div>
  		<div style="margin-left: 30px;margin-top: 10px;">
  			  <table class="inputtable" width="95%" >
			<tr>
				<td class="leftlabel" style="text-align:center">场地编号ID</td>
				<td class="leftlabel" style="text-align:center">场地名称</td>
				<td class="leftlabel" style="text-align:center">校区</td>
				<td class="leftlabel" style="text-align:center">场地类别</td>
				<td class="leftlabel" style="text-align:center">座位数</td>
				<td class="leftlabel" style="text-align:center">场地借用类型</td>
				<td class="leftlabel" style="text-align:center">使用部门</td>
				<td class="leftlabel" style="text-align:center">点击预定</td>
			</tr>
			<c:forEach items="${list}" var="Meetroom">
				<tr>
					<td align="center">${Meetroom.meetRoomId}</td>
					<td align="center">${Meetroom.meetRoomName}</td>
					<td align="center">${Meetroom.meetRoomFloor}</td>
					<td align="center">${Meetroom.meetRoomNumber}</td>
					<td align="center">${Meetroom.meetRoomCount}</td>
					<td align="center">${Meetroom.meetRoomType}</td>
					<td align="center">${Meetroom.meetRoomAddress}</td>
					<td align="center"><a href="applyAction?flag=apply&meetroom.meetRoomId=${Meetroom.meetRoomId}"><input type="button" value="点击预定" style="background-color:#9ab5f1"/></a></td>
				</tr>
			</c:forEach>
		</table>
  </body>
</html>
