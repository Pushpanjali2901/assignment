const surveyForm = document.getElementById('surveyForm');
const popup = document.getElementById('popup');

surveyForm.addEventListener('submit', function (event) {
    event.preventDefault();
    // Validate the form here (you can add custom validation logic)
    // For simplicity, we'll just display the submitted values in the popup
    document.getElementById('popupFirstName').textContent = document.getElementById('firstName').value;
    document.getElementById('popupLastName').textContent = document.getElementById('lastName').value;
    document.getElementById('popupDOB').textContent = document.getElementById('dob').value;
    document.getElementById('popupCountry').textContent = document.getElementById('country').value;

    const genderElements = document.querySelectorAll('input[name="gender"]:checked');
    let genderValues = '';
    genderElements.forEach(function (element) {
        genderValues += element.value + ', ';
    });
    document.getElementById('popupGender').textContent = genderValues.replace(/, $/, '');

    document.getElementById('popupProfession').textContent = document.getElementById('profession').value;
    document.getElementById('popupEmail').textContent = document.getElementById('email').value;
    document.getElementById('popupMobile').textContent = document.getElementById('mobile').value;

    // Show the popup
    popup.style.display = 'block';
});

document.getElementById('closePopup').addEventListener('click', function () {
    // Close the popup and reset the form
    popup.style.display = 'none';
    surveyForm.reset();
});