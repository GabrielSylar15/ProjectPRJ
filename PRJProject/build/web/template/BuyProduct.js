function ClickButton(){
    var sizes = document.querySelectorAll(".size");
    var colors = document.querySelectorAll(".color");
    var sizeindex,colorindex;
    var temp=0;
    sizes.forEach((element, index) => {
        element.onclick = function(){
            temp=index+1;
            sizes.forEach(e => {
                e.setAttribute("style","background-color:none");
            });
            sizeindex=temp;
            element.setAttribute("style","background-color:skyblue");
            if(colorindex!=null){
                document.getElementById("#instock").innerHTML = 1;
            }
        }      
    });

    colors.forEach((element, index) => {
        element.onclick = function(){
            temp=index+1;
            colors.forEach(e => {
                e.setAttribute("style","background-color:none");
            });
            colorindex = temp;
            element.setAttribute("style","background-color:skyblue");
            if(sizeindex!=null){
                <c:forEach items="requestScope.product.listColor_Sizes" var = "cs">
                    <c:if test="${cs.colorID==1}">

                    </c:if>
                </c:forEach>
                document.getElementById("#instock").innerHTML = 1;
            }
        }      
    });
}
ClickButton();