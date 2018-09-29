//为具有a-page类的标签注册点击事件，并加载页面
$(function () {
  $(".a-page").click(function () {
    var url = $(this).attr("url");
    console.log(url);
    $("#single-page").load(url);
  });
})