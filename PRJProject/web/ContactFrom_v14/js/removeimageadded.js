function removeImage(){
    var images = document.querySelectorAll(".wrapper-imageadded");
    document.querySelectorAll(".removeImageAdded").forEach((element,index) => {
        element.onclick = function(){
            images[index].remove()
        }
    });
}
removeImage()


function drawTableBeta(listProducts, index){
    var wrapper = document.querySelector(".drawtable")
    var color = document.querySelectorAll(".color");
    var size = document.querySelectorAll(".size");
    var result="";
    var count=0;
    if(color.length>index&&size.length>index){
        color.forEach(element => {
            result+=`<tr>
                        <td rowspan="${size.length}">${element.value}</td>`;
            size.forEach((e,index) => {
                if(index==0){
                    result+=`<td>${e.value}</td>
                            <td><input type="text" name="quantity" class="quantity" value="${listProducts[count].quantity}"></td>
                            </tr>`;
                            count+=1;
                }else{
                    result+=`<tr>
                        <td>${e.value}</td>
                        <td><input type="text" name="quantity" class="quantity" value="${listProducts[count].quantity}"></td>
                        </tr>`;
                        count+=1;
                }
            });
        });
    }else if(color.length==index&&size.length==index){
        result+=`<tr><td><input type="text" name="quantity" class="quantity" value="${listProducts[count].quantity}"><td></tr>`;
        count+=1;
    }else{
        color.forEach(element => {
            result+=
            `<tr>
                <td>${element.value}</td>
                <td><input type="text" name="quantity" class="quantity" value="${listProducts[count].quantity}"></td>
                </tr>`;
                count+=1;
        });

        size.forEach(element => {
            result+=
            `<tr>
                <td>${element.value}</td>
                <td><input type="text" name="quantity" class="quantity" value="${listProducts[count].quantity}"></td>
                </tr>`;
                count+=1;
        });
    }
    wrapper.innerHTML=result;
}
