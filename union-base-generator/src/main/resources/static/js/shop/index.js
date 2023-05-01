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
            url: '/shop/manager/list',
            cols: [[
                
                {field: 'id',  title: 'ID'},
                {field: 'shopName',  title: '店名'},
                {field: 'mainPic',  title: '主图'},
                {field: 'address',  title: '地址'},
                {field: 'coordinate',  title: '经纬度'},
                {field: 'phone',  title: '电话号'},
                {field: 'bizStartTime',  title: '营业开始时间'},
                {field: 'bizEndTime',  title: '营业结束时间'},
                {field: 'roomTotal',  title: '包间总数'},
                {field: 'shopStatus',  title: '0 - 营业中， 10 - 已关店， 20 - 暂停营业'},
                {field: 'shopSearchable',  title: '0 - 不可搜索， 20 - 可搜索'},
                {field: 'shopOwnerName',  title: '店主名'},
                
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

        $("#add_shop_btn").click(function() {
           window.location.href = '/shop/manager/add';

           return false;
        });

        form.on('switch(statusSwitch)', function(data){
            var id = data.value;
            var status = 0;
            if (data.elem.checked) {
                status = 1;
            }
            $.ajax({
                url: "/shop/manager/do-update",
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
                window.location.href = "/shop/manager/detail/" + data.id;
            } else if (obj.event === 'edit') {
                window.location.href = "/shop/manager/update/" + data.id;
            } else if (obj.event === 'delete') {
                layer.confirm("确定删除？", {icon: 3}, function(index) {
                    $.ajax({
                        url: "/shop/manager/delete/" + data.id,
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
