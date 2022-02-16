// Slide down animation
var element = document.querySelector(".mobile__header .child");
var heightElement = element.offsetHeight;
element.classList.toggle("hide");
var parentElement = document.querySelector(".mobile__nav");
var heightParentElement = parentElement.offsetHeight;
console.log(heightParentElement)
parentElement.classList.toggle("hide")
document.querySelector(".mobile__nav .parent>a").setAttribute('data-content',"+");
document.querySelector(".mobile__header .parent").onclick = function(){
    element.style.height = `${heightElement}px`;
    element.classList.toggle("hide");
    parentElement.style.height = null;
    setTimeout(() => {
        if(element.offsetHeight!=0){
            document.querySelector(".mobile__nav .parent>a").setAttribute('data-content',"-");
            parentElement.style.height = parentElement.offsetHeight + "px";
        }else{
            document.querySelector(".mobile__nav .parent>a").setAttribute('data-content',"+");
            parentElement.style.height = parentElement.offsetHeight + "px";
        }
    }, 200);
}
parentElement.style.height = `${heightParentElement}px`
document.querySelector(".header__bar").onclick = function(){
    if(parentElement.offsetHeight!=0)   parentElement.style.height = `${parentElement.offsetHeight}px`;
    parentElement.classList.toggle("hide")
}
