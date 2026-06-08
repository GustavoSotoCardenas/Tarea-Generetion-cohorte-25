const navLinks = document.querySelectorAll('nav .nav-link');

navLinks.forEach(link => {
    link.addEventListener('click', function (e) {
        e.preventDefault();

        const targetId = this.getAttribute('data-section');

        // Actualiza clases activas en el nav
        navLinks.forEach(l => l.classList.remove('active'));
        this.classList.add('active');

        // Muestra solo la sección correspondiente
        document.querySelectorAll('main section').forEach(section => {
            section.classList.remove('active');
        });

        const targetSection = document.getElementById(targetId);
        if (targetSection) {
            targetSection.classList.add('active');
            window.scrollTo({ top: 0, behavior: 'smooth' });
        }
    });
});