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
  // console.log(document.documentElement.scrollTop)
}


// SlideShow Animation
