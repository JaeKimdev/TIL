const h1 = document.querySelector("div.hello:first-child h1");

function handleTitleClick() {
    const clickedCalss = "clicked"
    if(h1.classList.contains(clickedCalss)){
        h1.classList.remove(clickedCalss);
    } else {
        h1.classList.add(clickedCalss);
    }
}

h1.addEventListener("click", handleTitleClick);