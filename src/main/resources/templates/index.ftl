<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>商品名称</td>
        <td>商品价格</td>
        <td>创建时间</td>
        <td>商品类型</td>
        <td>商品数量</td>
        <td>店铺名称</td>
        <td>商品图片</td>
        <td>描述信息</td>
        <td>操作</td>
    </tr>
    <tr>
        <#assign json=list?eval />
        <#list json.userlist as item>

            id:${item.id}, name:${item.name},sex:${item.sex}

        </#list>

        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>

</table>
</body>
</html>