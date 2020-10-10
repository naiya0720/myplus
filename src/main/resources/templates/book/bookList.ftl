<!DOCTYPE html>
<html lang="en">
<head>
    <#include "../common/head.ftl"/>
    <script type="text/javascript" src="js/book/bookList.js" charset="UTF-8"></script>
</head>
<body style="padding-top:12px;">
<div class="layui-fluid">
    <div class="layui-condition">
        <form id="fm" name="fm" action="/" method="post" class="layui-form">
            <div class="layui-form-item">
                <div class="layui-inline">
                    <label class="layui-form-label">书本名称：</label>
                    <div class="layui-input-inline">
                        <input class="layui-input" id="bookname" name="bookname" lay-verify="bookname">
                    </div>
                </div>
                <div class="layui-inline">
                    <button class="layui-btn" id="btn_search" type="button"><i class="fa fa-search fa-right"></i>查 询
                    </button>
                    <input class="layui-btn" value="新增" id="btn_add" type="button"><i class="fa fa-plus fa-right"></i>
                    </input>
                </div>
            </div>
        </form>
    </div>
    <div class="layui-fluid" style="padding-left: 0px; padding-right: 0px;">
        <table id="tb_userlist" class="layui-table" lay-filter="tb_userlist" style="margin-top:-5px;">

        </table>
    </div>
</div>
</body>
<script type="text/html" id="toolbar">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
</html>