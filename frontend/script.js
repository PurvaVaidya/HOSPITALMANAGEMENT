const API_URL = "https://hospital-management-nwun.onrender.com/patients";

async function fetchPatients() {

    const response = await fetch(API_URL);

    const patients = await response.json();

    const patientList = document.getElementById("patientList");

    patientList.innerHTML = "";

    patients.forEach(patient => {

        const li = document.createElement("li");

        li.innerText =
            patient.name +
            " | Age: " + patient.age +
            " | Disease: " + patient.disease +
            " | Doctor: " + patient.doctor;

        patientList.appendChild(li);
    });
}

async function addPatient() {

    const patient = {

        name: document.getElementById("name").value,

        age: parseInt(document.getElementById("age").value),

        disease: document.getElementById("disease").value,

        doctor: document.getElementById("doctor").value
    };

    await fetch(API_URL, {

        method: "POST",

        headers: {
            "Content-Type": "application/json"
        },

        body: JSON.stringify(patient)
    });

    fetchPatients();
}

fetchPatients();