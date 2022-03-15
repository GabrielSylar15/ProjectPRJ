
(function ($) {
    "use strict";

    /*==================================================================
    [ Validate after type ]*/
    $('.validate-input .input100').each(function(){
        $(this).on('blur', function(){
            if(validate(this) == false){
                showValidate(this);
            }
            else {
                $(this).parent().addClass('true-validate');
            }
        })    
    })
  
  
    /*==================================================================
    [ Validate ]*/
    var input = $('.validate-input .input100');

    $('.validate-form').on('submit',function(){
        var check = true;

        for(var i=0; i<input.length; i++) {
            if(validate(input[i]) == false){
                showValidate(input[i]);
                check=false;
            }
        }

        return check;
    });


    $('.validate-form .input100').each(function(){
        $(this).focus(function(){
           hideValidate(this);
           $(this).parent().removeClass('true-validate');
        });
    });

     function validate (input) {
        if($(input).attr('type') == 'email' || $(input).attr('name') == 'email') {
            if($(input).val().trim().match(/^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{1,5}|[0-9]{1,3})(\]?)$/) == null) {
                return false;
            }
        }
        else {
            if($(input).val().trim() == ''){
                return false;
            }
        }
    }

    function showValidate(input) {
        var thisAlert = $(input).parent();

        $(thisAlert).addClass('alert-validate');

        $(thisAlert).append('<span class="btn-hide-validate">&#xf136;</span>')
        $('.btn-hide-validate').each(function(){
            $(this).on('click',function(){
               hideValidate(this);
            });
        });
    }

    function hideValidate(input) {
        var thisAlert = $(input).parent();
        $(thisAlert).removeClass('alert-validate');
        $(thisAlert).find('.btn-hide-validate').remove();
    }
})(jQuery);

// Add images for product
document.getElementById("AddMoreImage").onclick = function(){
    var WrapperImage = document.createElement("div")
    var InputTag = document.createElement("input");
    var ButtonRemoveImage = document.createElement("button");
    var node = document.createTextNode("x");
    ButtonRemoveImage.appendChild(node);
    InputTag.type="file";
    InputTag.name="image";
    InputTag.classList.add("input100");
    WrapperImage.classList.add("wrapper-image");
    ButtonRemoveImage.classList.add("RemoveImage")
    WrapperImage.appendChild(InputTag);
    WrapperImage.appendChild(ButtonRemoveImage);
    document.getElementById("UploadImage").appendChild(WrapperImage);
    ButtonRemoveImage.onclick = function(){
        WrapperImage.remove();
    }
}

// Add properties for product
function updateSKU(){
    var ButtonAddSku = document.getElementsByClassName("AddMoreSku");
    for (let index = 0; index < ButtonAddSku.length; index++) {
        ButtonAddSku[index].onclick = function(){
            var ButtonRemoveSKU = document.createElement("button");
            ButtonRemoveSKU.type="button";
            ButtonRemoveSKU.classList.add("RemoveSKU");
            var wrapper_sku = document.createElement("div");
            var node = document.createTextNode("x");
            ButtonRemoveSKU.appendChild(node)
            var InputTag = document.createElement("input");
            InputTag.type="text";
            InputTag.classList.add("input100");
            wrapper_sku.classList.add("wrap-input100");
            if(index==0){
                InputTag.name="color";     
                InputTag.classList.add("color");
                wrapper_sku.appendChild(InputTag);
                wrapper_sku.appendChild(ButtonRemoveSKU);
                wrapper_sku.classList.add("sku--color");
                document.querySelector(".smallblock--color").appendChild(wrapper_sku);
            }     
            else{
                InputTag.name="size";
                InputTag.classList.add("size");
                wrapper_sku.appendChild(InputTag);
                wrapper_sku.appendChild(ButtonRemoveSKU);
                wrapper_sku.classList.add("sku--size");
                document.querySelector(".smallblock--size").appendChild(wrapper_sku);     
            }

            ButtonRemoveSKU.onclick = function(){
                wrapper_sku.remove();
            }
        }     
    }
}

updateSKU();

// Draw Table and InputSize
// function drawTable(){
//     var table = document.querySelector(".tableQuantity");
//     var colors = document.querySelectorAll(".color");
//     var sizes = document.querySelectorAll(".size");
//     var colortable="", sizetable="";
//     if(colors.length!=0&&sizes.length!=0)   colortable += "<thead><tr><td>CvsS</td>"; 
//     if(sizes.length==0&&colors.length==0){
//         table.innerHTML='<div class="wrap-input100 sku--size"><input id="phone" class="input100" type="text" name="quantity" placeholder="Eg. 100"></div>'
//     }else{

//         if(sizes.length!=0&&colors.length==0){
//             for (let index = 0; index < sizes.length; index++) {
//                 colortable += `<tr>`;
//                 colortable += `<td>${sizes[index].value}</td>`;
//                 colortable += `<td><input type="text" value="" name="quantity" class="quantity"></td>`;
//                 colortable += `</tr>`;
//             }
//         }else if(sizes.length!=0&&colors.length!=0){
//             for (let index = 0; index < colors.length; index++) {
//                 colortable += `<td>${colors[index].value}</td>`;
//             }
//         }

//         colortable+="</tr></thead>";
//         if(sizes.length==0&&colors.length!=0){
//             sizetable+= '<tr>';
//             for (let index = 0; index < colors.length; index++) {
//                 sizetable += `<tr>`;
//                 sizetable += `<td>${colors[index].value}</td>`;
//                 sizetable+='<td><input type="text" value="" name="quantity" class="quantity"></td>';
//                 sizetable += `</tr>`;
//             }
//             sizetable+="</tr>";
//         }
//         else if(sizes.length!=0&&colors.length!=0){
//             for (let i = 0; i < sizes.length; i++) {
//                 sizetable+=  `<tr><td>${sizes[i].value}</td>`
//                 for (let j = 0; j < colors.length; j++) {
//                     sizetable+=`<td><input type="text" value="" name="quantity" class="quantity"></td>`;
//                 }
//                 sizetable+="</tr>";
//             }
//         }
//         table.innerHTML = `<table border="1">${colortable}${sizetable}</table>`;
//     }
// }

function addMore(){
    var wrapper = document.querySelector(".drawtable")
    // wrapper.innerHTML="";
    var color = document.querySelectorAll(".color");
    var size = document.querySelectorAll(".size");
    var result="";
    if(color.length>0&&size.length>0){
        color.forEach(element => {
            result+=`<tr>
                        <td rowspan="${size.length}">${element.value}</td>`;
            size.forEach((e,index) => {
                if(index==0){
                    result+=`<td>${e.value}</td>
                            <td><input type="text" name="quantity" class="quantity"></td>
                            </tr>`;
                }else{
                    result+=`<tr>
                        <td>${e.value}</td>
                        <td><input type="text" name="quantity" class="quantity"></td>
                        </tr>`;
                }
            });
        });
    }else if(color.length==0&&size.length==0){
        result+=`<tr><td><input type="text" name="quantity" class="quantity"><td></tr>`;
    }else{
        color.forEach(element => {
            result+=
            `<tr>
                <td>${element.value}</td>
                <td><input type="text" name="quantity" class="quantity"></td>
                </tr>`;
        });

        size.forEach(element => {
            result+=
            `<tr>
                <td>${element.value}</td>
                <td><input type="text" name="quantity" class="quantity" ></td>
                </tr>`;
        });
    }
    wrapper.innerHTML=result;
}

