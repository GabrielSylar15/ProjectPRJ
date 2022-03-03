// Slide down animation
// var element = document.querySelector(".mobile__header .child");
// var heightElement = element.offsetHeight;
// element.classList.toggle("hide");
// var parentElement = document.querySelector(".mobile__nav");
// var heightParentElement = parentElement.offsetHeight;
// parentElement.classList.toggle("hide")
// document.querySelector(".mobile__nav .parent>a").setAttribute('data-content',"+");
// document.querySelector(".mobile__header .parent").onclick = function(){
//     element.style.height = `${216}px`;
//     element.classList.toggle("hide");
//     parentElement.style.height = null;
//     setTimeout(() => {
//         if(element.offsetHeight!=0){
//             document.querySelector(".mobile__nav .parent>a").setAttribute('data-content',"-");
//             parentElement.style.height = parentElement.offsetHeight + "px";
//         }else{
//             document.querySelector(".mobile__nav .parent>a").setAttribute('data-content',"+");
//             parentElement.style.height = parentElement.offsetHeight + "px";
//         }
//     }, 200);
// }
// parentElement.style.height = `${317}px`
// document.querySelector(".header__bar").onclick = function(){
//     parentElement.classList.toggle("hide")
//     setTimeout(() => {
//         console.log(parentElement.offsetHeight)
//         if(parentElement.style.height<=parentElement.offsetHeight)   parentElement.style.height = `${parentElement.offsetHeight}px`;
//     }, 250);
// }


// Slide down for Header
var parentElement = document.querySelector(".mobile__nav");
var element = document.querySelector(".mobile__header .child");
document.querySelector(".mobile__nav .parent>a").setAttribute('data-content',"+");
document.querySelector(".mobile__header .parent").onclick = function(){
    element.classList.toggle("hide");
        setTimeout(() => {
        if(element.offsetHeight!=0){
            document.querySelector(".mobile__nav .parent>a").setAttribute('data-content',"-");
        }else{
            document.querySelector(".mobile__nav .parent>a").setAttribute('data-content',"+");
        }
    }, 200);
}

document.querySelector(".header__bar").onclick = function(){
    parentElement.classList.toggle("hide")
}

// Window Scroll
// For Mobile
window.onscroll = function() {scrollFunctionM(), scrollFunctionP()};
function scrollFunctionM() {
  if (document.documentElement.scrollTop > 150) {
    document.querySelector(".mobile__header").classList.add("scrollDownM");
  }else{
    document.querySelector(".mobile__header").classList.remove("scrollDownM");
  }
}
// For PC
function scrollFunctionP() {
  if (document.documentElement.scrollTop > 200) {
    document.querySelector(".header").classList.add("scrollDownP");
  }else{
    document.querySelector(".header").classList.remove("scrollDownP");
  }
}


// SlideShow Animation
var high=0;
var elementowl = document.querySelector(".owl");
var owlitem = document.getElementsByClassName("owl-item");

// document.getElementById("button--previous").onclick = function(){
//   if(high<0){
//     high+=400;
//     elementowl.setAttribute("style",`transform: translateX(${high}px);transition: all .2s ease-in-out;`)
//   }  
  
// }

// document.getElementById("button--next").onclick = function(){
//   if(high>-1600){
//     high-=400;
//     elementowl.setAttribute("style",`transform: translateX(${high}px);transition: all .2s ease-in-out;`)
//   } 
// }

var screenwith = window.innerWidth;
for (let index = 0; index < owlitem.length; index++) {
  owlitem[index].setAttribute("style",`width:${screenwith/4}px`);
  elementowl.setAttribute("style",`width: ${9*screenwith/4}px`)
}

document.querySelector("body").onresize = function(){
  var screenwith = document.querySelector("body").offsetWidth;
  console.log(screenwith)
  if(window.innerWidth<740){
    for (let index = 0; index < owlitem.length; index++) {
      owlitem[index].setAttribute("style",`width:${screenwith/1}px`);
      elementowl.setAttribute("style",`width: ${9*screenwith/1}px`)
    }
  }else if(window.innerWidth>=740 && window.innerWidth<1114){
    for (let index = 0; index < owlitem.length; index++) {
      owlitem[index].setAttribute("style",`width:${(screenwith)/3}px`);
      elementowl.setAttribute("style",`width: ${9*screenwith/3}px`)
    }
  }else{
    for (let index = 0; index < owlitem.length; index++) {
      owlitem[index].setAttribute("style",`width:${screenwith/4}px`);
      elementowl.setAttribute("style",`width: ${9*screenwith/4}px`)
    }
  }
}

elementowl.ondrag = function(){
  console.log("hehe")
}

