// External JavaScript for image slider.

var images = ["images/a.jpg", "images/b.jpg", "images/c.jpg", "images/d.jpg", "images/e.jpg"];

var x = 0;

var imgs = document.getElementById('img');

setInterval(slider, 4000);


function slider() {

  if (x < images.length) {
    x = x + 1;
  } else {
    x = 1;
  }


  imgs.innerHTML = "<img src=" + images[x - 1] + ">";


}











