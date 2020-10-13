var $, table, form, layer, element;
layui.use(['form', 'element', 'layer', 'table', 'jquery'], function() {
    table = layui.table,
        element = layui.element,
        form = layui.form,
        layer = layui.layer,
        $ = layui.$;
    //初始化表格
    tableInit();
    //初始查询
    query();
    form.render();
    element.init();

    $('#btn_search').click(function() {
        query();
    });



});

//table初始化
function tableInit() {
    table.render({
        id: 'tb_userlist',
        elem: '#tb_userlist',
        width: 703,
        height: 469,
        loading: false,
        page: false,
        cols: [
            [
                {
                    field: 'bookname',
                    title: '书本名称',
                    width: 150
                },
                {
                    field: 'bookprice',
                    title: '书本价格',
                    width: 120
                },
                {
                    field: 'bookbrief',
                    title: '书本类型',
                    width: 120
                },
                {
                    field: '#',
                    title: '操作',
                    width: 186,
                    toolbar: '#toolbar'
                }
            ]
        ]
    });
}


//按钮点击查询
function query() {
    table.reload('tb_userlist', {
        url: 'queryAll',
        method: 'POST',
        loading: true,
        page: true,
        where: {
            bookname: $('#bookname').val()
        }, //查询条件
        request: {
            //自定义分页请求参数名
            pageName: 'page', //页码的参数名称，默认：page
            limitName: 'rows' //每页数据量的参数名，默认：limit
        },
        response: {
            //自定义分页响应结果集
            statusName: "success", //数据状态的字段名称，默认：code
            statusCode: true,
            msgName: 'message', //状态信息的字段名称，默认：msg
            countName: 'total', //数据总数的字段名称，默认：count
            dataName: 'data', //数据列表的字段名称，默认：data
        },
        done: function (res, curr, count) {
        },



    });
    //// 监听工具条
    // 注：tool 是工具条事件名，test 是 table 原始容器的属性 lay-filter="对应的值"
    table.on("tool(tb_userlist)",function (obj) {
        var data = obj.data;
        var even = obj.event;
        if(even==="del"){
            layer.confirm('真的删除行么', function(index){
                // 删除当前行数据
                obj.del();
                //向服务端发送删除指令
                var msg = deleteBook(data.bookid);
                if(msg.flag){
                    layer.msg(msg.msg, {icon: 1});
                }else{
                    layer.msg(msg.msg, {icon: 2});
                }
                // 更新缓存
                layer.close(index);
            });
        }if(even==="edit"){

        }
    })
}

function deleteBook(id) {
    var messge = ""
    $.ajax({
        url: 'delBook',
        method: 'POST',
        async:false,
        data:{
            bookid: id
        },
        success:function (msg) {
            messge = msg
        }
    })
    return messge;
}

