let currentIndex = 0;
const images = document.querySelectorAll('.carousel-image');

function updateCarousel() {
    images.forEach((img, index) => {
        img.classList.remove('active');
        img.style.transform = `translateX(${(index - currentIndex) * 100}%)`;
    });
    images[currentIndex].classList.add('active');
}

function nextSlide() {
    currentIndex = (currentIndex + 1) % images.length;
    updateCarousel();
}

function prevSlide() {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    updateCarousel();
}

updateCarousel(); // Initialize the first image
