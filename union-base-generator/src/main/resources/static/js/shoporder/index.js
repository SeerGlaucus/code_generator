$(document).ready(function() {
    layui.use(['form', 'table','layer'], function() {

        var $ = layui.jquery,
            table = layui.table,
            form = layui.form;

        table.render({
            elem: '#listDataTable01',
            filter: 'listDataTable01Filter',
            cellMinWidth: 80,//全局定义常规单元格的最小宽度，layui 2.2.1 新增
            height: 500,
            url: '/shoporder/manager/list',
            cols: [[
                
                {field: 'id',  title: 'ID'},
                {field: 'parentId',  title: '主单id'},
                {field: 'shopId',  title: '店铺id'},
                {field: 'roomId',  title: '房间id'},
                {field: 'userId',  title: '用户id'},
                {field: 'bookStartTime',  title: '预定开始时间'},
                {field: 'bookEndTime',  title: '预定结束时间'},
                {field: 'orderType',  title: '0 - 普通订单， 10 - 续费单'},
                {field: 'orderStatus',  title: '0 - 未支付， 10 - 支付完成，30 - 已取消'},
                {field: 'createTime',  title: '下单时间'},
                
                {field: 'status',title: '状态', templet: '#statusTpl'},
                {align:'center',title: '操作', templet: '#opt-col'}
            ]]
        });

        // 绑定搜索点击事件
        $("#j-search-btn").click(function(){
            var className = $("#className").val();
            table.reload('listDataTable01', {
                where: { className: className},
            });

            return false;
        });

        $("#add_shoporder_btn").click(function() {
           window.location.href = '/shoporder/manager/add';

           return false;
        });

        form.on('switch(statusSwitch)', function(data){
            var id = data.value;
            var status = 0;
            if (data.elem.checked) {
                status = 1;
            }
            $.ajax({
                url: "/shoporder/manager/do-update",
                type: "PUT",
                data: {id: id, status: status},
                dataType: "json",
                success: function(data) {
                    if (data.success) {
                        layer.msg("修改成功", {icon: 6});
                    } else {
                        layer.msg(data.message, {icon: 5});
                    }
                },
                error: function() {
                    layer.alert("网络超时", {icon: 5});
                }
            });
        });

        // 监听工具条
        table.on('tool(listDataTable01Filter)', function(obj) {
            var data = obj.data;
            if (obj.event === 'detail') {
                window.location.href = "/shoporder/manager/detail/" + data.id;
            } else if (obj.event === 'edit') {
                window.location.href = "/shoporder/manager/update/" + data.id;
            } else if (obj.event === 'delete') {
                layer.confirm("确定删除？", {icon: 3}, function(index) {
                    $.ajax({
                        url: "/shoporder/manager/delete/" + data.id,
                        type: "DELETE",
                        dataType: "json",
                        success: function(data) {
                            if (data.success) {
                                layer.msg("删除成功", {icon: 6});
                                table.reload('listDataTable01');
                            } else {
                                layer.msg(data.message, {icon: 5});
                            }
                        },
                        error: function() {
                            parent.layer.alert("网络超时", {icon: 5});
                        }
                    });
                });
            }
        });

    });
})
