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
  if (document.scrollingElement.scrollTop > 150) {
    document.querySelector(".mobile__header").classList.add("scrollDownM");
  }else{
    document.querySelector(".mobile__header").classList.remove("scrollDownM");
  }
}
// For PC
function scrollFunctionP() {
  if (document.scrollingElement.scrollTop > 200) {
    document.querySelector(".header").classList.add("scrollDownP");
  }else{
    document.querySelector(".header").classList.remove("scrollDownP");
  }
}

// After Login
function appearLogin(){
  var activeLogin =  document.querySelector(".expand-infor");
  document.querySelector(".cart .user").onclick = function(){
      if(activeLogin.style.display!="block"){
        activeLogin.setAttribute("style","display:block")
      }else{
        activeLogin.setAttribute("style","display:none")
      }
  }
}

appearLogin();

// SlideShow Animation

var elementowl = document.querySelector(".owl");
var owlitem = document.getElementsByClassName("owl-item");

function moveSlide(step, minWidth){
  var scrollBar=0;
  document.getElementById("button--previous").onclick = function(){
    if(scrollBar<0){
      scrollBar+=step;
      elementowl.style.transform=`translateX(${scrollBar}px`
      elementowl.style.transition="all 1s ease-in-out";
    }  
  }

  document.getElementById("button--next").onclick = function(){
    console.log(step)
    if(scrollBar>minWidth){
      scrollBar-=step;
      elementowl.style.transform=`translateX(${scrollBar}px`
      elementowl.style.transition="all 1s ease-in-out";
    } 
  }
}

function responsiveSlide(){
  var screenwith = document.querySelector("body").offsetWidth;
  if(window.innerWidth<740){
    for (let index = 0; index < owlitem.length; index++) {
      owlitem[index].setAttribute("style",`width:${screenwith/1}px`);
      // owlitem[index].style.width=`${(screenwith)/3}px`
      elementowl.setAttribute("style",`width: ${9*screenwith/1}px`)
      // elementowl.style.width=`${9*screenwith/1}px`
      moveSlide(screenwith, -8*screenwith);
    }
  }else if(window.innerWidth>=740 && window.innerWidth<1114){
    for (let index = 0; index < owlitem.length; index++) {
      owlitem[index].setAttribute("style",`width:${(screenwith)/3}px`);
      // owlitem[index].style.width=`${(screenwith)/3}px`
      elementowl.setAttribute("style",`width: ${9*screenwith/3}px`)  
      // elementowl.style.width=`${9*screenwith/3}px`
      moveSlide(screenwith/3, -6*screenwith/3)
    }
  }else{
    for (let index = 0; index < owlitem.length; index++) {
      owlitem[index].setAttribute("style",`width:${screenwith/4}px`);
      // owlitem[index].style.width=`${(screenwith)/3}px`
      elementowl.setAttribute("style",`width: ${9*screenwith/4}px`);
      // elementowl.style.width=`${9*screenwith/4}px`
      moveSlide(screenwith/4,-5*screenwith/4)
    }
  }
}

responsiveSlide()
document.querySelector("body").onresize = responsiveSlide;

// elementowl.ondrag = function(){
//   console.log("hehe")
// }




