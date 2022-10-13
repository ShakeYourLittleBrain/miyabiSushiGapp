const hamburger = document.querySelector(".hamburger");
const navBar = document.querySelector(".nav-bar");
const wrapper = document.querySelector(".wrapper");

hamburger.addEventListener("click", () => {
    navBar.classList.toggle("active");
    wrapper.classList.toggle("top-fix");
});
$(function () {
    $(document).on('scroll', function () {
        //Multiplication value shall be changed based on user window
        $('#MyFloatPanel').css('top', 40);
    });
});
//To make the panel float over a bootstrap model which has z-index: 2300, so i specified custom value as 2400
$(document).on('click', '.btnSearchView', function () {
    $('#MyFloatPanel').addClass('PanelFloat');
});

$(document).on('click', '.btnSearchClose', function () {
    $('#MyFloatPanel').removeClass('PanelFloat');
});