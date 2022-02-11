const body = document.querySelector("body");
const colors = ["#EEBD10", "#904DAD", "#2D8CD4"];

function handleResize() {
  const width = window.innerWidth;

  if (width >= 1000) {
    body.style.backgroundColor = colors[0];
  } else if (width >= 700) {
    body.style.backgroundColor = colors[1];
  } else {
    body.style.backgroundColor = colors[2];
  }
}

window.addEventListener("resize", handleResize);
