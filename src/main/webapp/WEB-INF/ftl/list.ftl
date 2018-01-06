<html>
<head>
    <style>
        td{
            text-align:center;
        }
    </style>

</head>
<h2>用户列表</h2>
    <table border="1" cellspacing="0" bordercolor="#000000" width = "80%" style="border-collapse:collapse;">
        <thead>
            <tr>
                <th>用户id</th>
                <th>姓名</th>
                <th>密码</th>
            </tr>
        </thead>
        <tbody>
        <#list users as user>
            <tr>
                <td>${user.userId}</td>
                <td>${user.name}</td>
                <td>${user.passwd}</td>
            </tr>
        </#list>

        </tbody>
    </table>
</body>
</html>
