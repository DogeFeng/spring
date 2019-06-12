window.onload = function() {
    document.getElementById("deleteBut").addEventListener("click",function (ev) {
        deleteForward("gid","pages/admin/goods/goods_delete_do.jsp") ;
    },false)
    document.getElementById("sabut").addEventListener("click",function (ev) {
        selectAll("sabut", "gid") ;
    } ,false) ;
}