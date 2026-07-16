document.getElementById("calculate").addEventListener("click", calculate);

async function calculate() {

    const percentage = document.getElementById("percentage").value;
    const number = document.getElementById("number").value;

    if (percentage === "" || number === "") {
        alert("Please enter both values.");
        return;
    }

    const response = await fetch(`/api/of?percentage=${percentage}&number=${number}`);

    const answer = await response.text();

    document.getElementById("answer").innerHTML = answer;
}