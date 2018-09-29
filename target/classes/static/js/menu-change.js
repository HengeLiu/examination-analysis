//为菜单注册点击事件，点击后切换颜色
$(function(){
  $(".child-menu").click(function () {
    $(this).parent().children(".child-menu").each(function () {
      $(this).children("li.active").removeClass("active")
    });
    $(this).children("li").addClass("active");
  });
})