function favadder() {
    var xhr = new XMLHttpRequest();

    url = "https://simplymovieapp.herokuapp.com/favourites";
    xhr.open('POST', url);
    xhr.setRequestHeader('content-type', 'application/x-www-form-urlencoded;charset=UTF-8');
    var title = document.getElementById("title").textContent;
    var year = document.getElementById("year").innerHTML;
    var type = document.getElementById("type").textContent;
    var imdb = document.getElementById("details").textContent;
    var Poster = document.getElementById("card-img-top").src;

    xhr.send(`title=${title}&year=${year}&type=${type}&imdb=${imdb}&poster=${Poster}`);

}

function flash(msg) {

}