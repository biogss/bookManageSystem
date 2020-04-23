$(document).ready(function(){
    $("button#queryBook").click(function(){
        var jsonObj = {
            bookName: $("#bookName").val()
            };
        $.ajax({
            async : false,
            url: "/getBookByName",
            data:JSON.stringify(jsonObj), // 传入json数据
            type: "POST",
            dataType:"json",//返回数据类型
            headers:{"Content-Type":"application/json"},  //传入json数据时需设置请求头
            success:function(data){
               $("div#result").val(data);
            },
            error:function(err){
                alert('连接失败');
            }
        });
    });

    $("button#insertBook").click(function(){
        var jsonObj = {
            bookName: $("#insertBookName").val(),
            bookCode: $("#insertBookCode").val(),
            bookPrice: $("#insertBookPrice").val(),
            bookType: $("#insertBookType").val(),
            bookAuthor: $("#insertBookAuthor").val(),
            bookPublishingHouse: $("#insertBookPublish").val(),
            bookDesc: $("#insertBookDesc").val(),
            bookCover: $("#insertBookCover").val(),
            bookStatus: $("#insertBookStatus").val(),
            bookDepreciation: $("#insertBookDepreciation").val(),
            bookPublishDate: $("#insertBookDate").val()
        };
        $.ajax({
            async : false,
            url: "/insertBook",
            data:JSON.stringify(jsonObj), // 传入json数据
            type: "post",
            dataType:"json",//返回数据类型
            headers:{"Content-Type":"application/json"},  //传入json数据时需设置请求头
            success:function(data){
                $("div#result").val(data);
            },
            error:function(err){
                alert('连接失败');
            }
        });
    });

    $("button#updateBook").click(function(){
        var jsonObj = {
            bookName: $("#updateBookName").val(),
            bookCode: $("#updateBookCode").val(),
            bookPrice: $("#updateBookPrice").val(),
            bookType: $("#updateBookType").val(),
            bookAuthor: $("#updateBookAuthor").val(),
            bookPublishingHouse: $("#updateBookPublish").val(),
            bookDesc: $("#updateBookDesc").val(),
            bookCover: $("#updateBookCover").val(),
            bookStatus: $("#updateBookStatus").val(),
            bookDepreciation: $("#updateBookDepreciation").val(),
            bookPublishDate: $("#updateBookDate").val()
        };
        $.ajax({
            async : false,
            url: "updateBook",
            data:JSON.stringify(jsonObj), // 传入json数据
            type: "post",
            dataType:"json",//返回数据类型
            headers:{"Content-Type":"application/json"},  //传入json数据时需设置请求头
            success:function(data){
                $("div#result").val(data);
            },
            error:function(err){
                alert('连接失败');
            }
        });
    });

    $("button#queryUser").click(function(){
        var jsonObj = {
            userName: $("#userName").val()
        };
        $.ajax({
            async : false,
            url: "getUserInfoByUserName",
            data:JSON.stringify(jsonObj), // 传入json数据
            type: "POST",
            dataType:"json",//返回数据类型
            headers:{"Content-Type":"application/json"},  //传入json数据时需设置请求头
            success:function(data){
                $("div#result").html(data);
            },
            error:function(err){
                alert('连接失败');
            }
        });
    });

    $("button#insertUser").click(function(){
        var jsonObj = {
            userName: $("#insertUserName").val(),
            password: $("#insertPassword").val(),
            userType: $("#insertUserType").val(),
            bookType: $("#updateBookType").val(),
            mobileNo: $("#insertMobileNo").val(),
        };
        $.ajax({
            async : false,
            url: "addUser",
            data:JSON.stringify(jsonObj), // 传入json数据
            type: "post",
            dataType:"json",//返回数据类型
            headers:{"Content-Type":"application/json"},  //传入json数据时需设置请求头
            success:function(data){
                $("div#result").html(data);
            },
            error:function(err){
                alert('连接失败');
            }
        });
    });

    $("button#borrowAdd").click(function(){
        var jsonObj = {
            userId: $("#userId").val(),
            bookId: $("#bookId").val(),
            borrowStartTime: $("#borrowStartTime").val(),
            borrowEndTime: $("#borrowEndTime").val()
        };
        $.ajax({
            async : false,
            url: "borrowBook",
            data:JSON.stringify(jsonObj), // 传入json数据
            type: "post",
            dataType:"json",//返回数据类型
            headers:{"Content-Type":"application/json"},  //传入json数据时需设置请求头
            success:function(data){
                $("div#result").html(data);
            },
            error:function(err){
                alert('连接失败');
            }
        });
    });
});