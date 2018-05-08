<%--
  Created by IntelliJ IDEA.
  User: x
  Date: 2018/5/7
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>$Title$</title>
      <script src="jQuery/jquery-3.2.1.min.js"></script>
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <link rel="stylesheet" href="css/bootstrap/bootstrap.min.css"/>
      <script src="js/bootstrap.min.js"></script>

    <!--为了防止导航栏将内容遮挡住，添加此行样式-->
    <style>
      .margin
      {
          margin-top:3px;
          margin-bottom:3px;
      }
    </style>
  </head>
    <body>
        <ul class="nav nav-tabs" id="myTab">
            <li class="active"><a href="#home">首页</a></li>
            <li><a href="#info">统计信息</a></li>
        </ul>
        <script>
            $(function () {
                $('#myTab a:first').tab('show');
            })
            $('#myTab a').click(function (e) {
                e.preventDefault();
                $(this).tab('show');
            })
        </script>
    <div class="tab-content">
        <div class="tab-pane active" id="home">
    <!--以下为内容区域-->
    <div class="container">
        <div class="panel panel-warning">
            <div class="panel-heading">
                <h4 class="panel-title" style= "text-align:center;line-height:18px; ">注意</h4>
            </div>
            <div class="panel-body">
                <h3 style= "text-align:center;line-height:30px; ">此网站只针对万科理想城业主wq信息统计，不做其他使用</h3>
            </div>
        </div>
        <form name="myForm" method="post" enctype="multipart/form-data" id="fm">
            <%--<input name="name" type="text" id="name_id"/>--%>
            <div class="form-group">
                <div>
                    <span class="label label-info" style= "text-align:center;line-height:18px; ">你的房号</span>
                </div>
                <div class="margin">
                    <input type="text" class="form-control" id="name_id" placeholder="请输入你的房号">
                </div>
            </div>
            <div class="form-group">
                <div>
                    <h3 class="label label-info" style= "line-height:18px;">你的想法</h3>
                </div>
                <div class="margin">
                    <textarea class="form-control" id="info_id" style= "line-height:18px;" rows="3"></textarea>
                </div>
            </div>
            <button id="btnSubmit" class="btn btn-primary" type="button" >提交</button>
        </form>
    </div>
    <script>
        $(function(){
            $('#btnSubmit').click(function(){
                console.log('jinlaile');
                var us = $("#name_id").val();
                var inf = $("#info_id").val();
                var message = {'name':us,'info':inf};
                $.ajax({
                    type:"post",
                    url:"/wq/postMessage.do",
                    data: JSON.stringify(message),
                    contentType:'application/json',
                    dataType:"json",
                    success : function(result) {
                        if (result.code == -1) {
                            alert("你已提交成功");
                            $("#name_id").val("");
                            $("#info_id").val("");
                        } else {
                            alert(result.message);
                        }
                    }
                })
            })
        })
    </script>
        </div>
        <div class="tab-pane" id="info">正在开发中...</div>
    </div>
    </body>


</html>



