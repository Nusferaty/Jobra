$(function(){

    // Initializing the swiper plugin for the slider.
    // Read more here: http://idangero.us/swiper/api/
    
    var mySwiper = new Swiper ('.swiper-container', {
        loop: true,
        //autoplay: true,
        effect: 'cube',
        cubeEffect: {
            slideShadows: false,
            shadow: false,
        },
        watchSlidesProgress: true,
        pagination: '.swiper-pagination',
        paginationClickable: true,
        nextButton: '.swiper-button-next',
        prevButton: '.swiper-button-prev'
    });
    let timerId = setInterval(() => mySwiper.slideNext(100), 5000);
});