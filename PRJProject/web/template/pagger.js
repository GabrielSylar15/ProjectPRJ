/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function pagger(id,pageindex,totalpage,gap)
{
    var container = document.getElementById(id);
    var result = '';
    var query = window.location.search.split("&")[0];
    console.log(query);
    if(window.location.search.includes("category")||window.location.search.includes("order")){
        if(window.location.search.includes("category")&&window.location.search.includes("order")){
            query = window.location.search.split("&")[0]+"&"+window.location.search.split("&")[1];
        }
        if(pageindex-gap > 1)
           result+='<a href="displayproduct'+query+'&pageindex=1">First</a>';

        for(var i=pageindex-gap;i<pageindex;i++)
           if(i>0)
               result+='<a href="displayproducts'+query+'&pageindex='+i+'">'+i+'</a>';

        result+= '<span>' +pageindex+ '</span>';

        for(var i=pageindex+1;i<=pageindex + gap;i++)
           if(i<=totalpage)
               result+='<a href="displayproducts'+query+'&pageindex='+i+'">'+i+'</a>';

        if(pageindex+gap < totalpage)
           result+='<a href="displayproducts'+query+'&pageindex='+totalpage+'">Last</a>';       
    }
    else{
        if(pageindex-gap > 1)
            result+='<a href="displayproducts?pageindex=1">First</a>';

        for(var i=pageindex-gap;i<pageindex;i++)
            if(i>0)
                result+='<a href="displayproducts?pageindex='+i+'">'+i+'</a>';

        result+= '<span>' +pageindex+ '</span>';

        for(var i=pageindex+1;i<=pageindex + gap;i++)
            if(i<=totalpage)
                result+='<a href="displayproducts?pageindex='+i+'">'+i+'</a>';

        if(pageindex+gap < totalpage)
            result+='<a href="displayproducts?pageindex='+totalpage+'">Last</a>';
    }
    container.innerHTML = result;
}