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
                alert(data);
                $("div#result").val(data);
            },
            error:function(err){
                alert('连接失败');
            }
        });
    });
});