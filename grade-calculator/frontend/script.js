async function calculateGrade() {

    const marks = document.getElementById("marks").value;
    const result = document.getElementById("result");

    if (marks === "") {
        result.innerText = "Please enter marks.";
        return;
    }

    try {

        const response = await fetch(
            "http://localhost:8080/api/grades/calculate",
            {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: marks
            }
        );

        const data = await response.json();

        result.innerText =
            "Marks: " + data.marks + " | Grade: " + data.grade;

    } catch (error) {

        result.innerText = "Unable to connect to backend.";
        console.error(error);
    }
}