const clockTitle = document.querySelector(".js-clock");

function getTime() {
  const target = new Date("2022-12-25 00:00:00+0800");
  const today = new Date();
  const gap = target - today;

  const day = Math.floor(gap / (1000 * 60 * 60 * 24));
  const hour = Math.floor((gap / (1000 * 60 * 60)) % 24);
  const minute = Math.floor(((gap / 1000) * 60) % 60);
  const second = Math.floor((gap / 1000) % 60);

  clockTitle.innerText = `${day} d ${hour} h ${minute} m ${second} s`;
}

getTime();
setInterval(getTime, 1000);
