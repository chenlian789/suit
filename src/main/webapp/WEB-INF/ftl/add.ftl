<html>
    <head>
        <script type="text/javascript" src="/js/jquery-1.7.2.min.js"></script>
        <script type="text/javascript">
            $(function(){
                $("#subBtn").click(function(){
                    $.ajax({
                        type : "post",
                        url : "/user/doAdd.json",
                        dataType: "json",
                        data : "name="+$('#name').val()+"&passwd="+$('#passwd').val(),
                       success : function( res ){
                           if(res.code=="200"){
                               window.location.href="/user/list.ftl"
                           }else{
                               alert("code:"+res.code+", message:"+res.message)
                           }
                        },
                    });
                })
            });
        </script>

    </head>
    <body>
        <h2>add user!</h2>
        <form name="form" method="post">
            <input id="name" type="text" name="name" />
            <input id="passwd" type="text" name="passwd" />
            <input id="subBtn" type="button" value="提交" />
        </form>
    </body>
</html>
