/**
 * It's a function to show the list contacts.
 */
const btnShowContacts = document.getElementById("btnShow");

const traerDatos = () => {
  fetch("http://localhost:8080/contacts")
    .then((response) => response.json())
    .then((data) => {
      const table = document.getElementById("tblData");
      const tBody = document.createElement("tbody");

      data.forEach((element) => {
        const tr = document.createElement("tr");
        const tdId = document.createElement("td");
        const tdName = document.createElement("td");
        const tdBorn = document.createElement("td");
        const tdEmail = document.createElement("td");
        const tdNumber = document.createElement("td");
        const tdCheck = document.createElement("td");
        const tdCheckInput = document.createElement("INPUT");
        tdCheckInput.setAttribute("type", "checkbox");
        tdCheckInput.setAttribute("tag", "INPUT");
        tdCheckInput.setAttribute("class", "checkboxclass");
        tr.setAttribute("id", element.id);

        tdId.textContent = element.id;
        tdName.textContent = element.name;
        tdBorn.textContent = element.born;
        tdEmail.textContent = element.email;
        tdNumber.textContent = element.number;
        tdCheck.appendChild(tdCheckInput);

        tr.appendChild(tdId);
        tr.appendChild(tdName);
        tr.appendChild(tdBorn);
        tr.appendChild(tdEmail);
        tr.appendChild(tdNumber);
        tr.appendChild(tdCheck);
        tBody.appendChild(tr);
      });
      table.appendChild(tBody);
    });
};

btnShowContacts.addEventListener("click", traerDatos);




const btnDeleteContacts = document.getElementById("btnDelete");

/**
 * This function delete the contacts checked in the web page.
 */
const eliminarDatos = () => {
  const table = document.getElementById("tblData");

  var checkBoxes = table.getElementsByTagName("INPUT");

  var IdtoDelete = new Array();

  for (var i = 0; i < checkBoxes.length; i++) {
    if (checkBoxes[i].checked) {
      var row = checkBoxes[i].parentNode.parentNode;
      IdtoDelete.push(row.id);
    }
  }

  console.log(IdtoDelete);

  for (var i = 0; i < IdtoDelete.length; i++) {
    
    console.log(IdtoDelete[i]);
     /* var url = "http://localhost:8080/contact/" + IdtoDelete[i];*/
     var url = `http://localhost:8080/contact/${IdtoDelete[i]}`; 
    url.concat(IdtoDelete[i])
    fetch(url, {
      method: "DELETE",
    })
      .then((response) => response.json())
      .then((data) => {console.log(data)})
      .catch(error =>
      {console.log(error)});
  }



  fetch("http://localhost:8080/contact/id", {
    method: "DELETE",
  })
    .then((response) => response.json())
    .then((data) => {
      const tBody = document.createElement("tbody");
      console.log(data);
      

      data.forEach((element) => {
        const tr = document.createElement("tr");
        const tdId = document.createElement("td");
        const tdName = document.createElement("td");
        const tdBorn = document.createElement("td");
        const tdEmail = document.createElement("td");
        const tdNumber = document.createElement("td");
        const tdCheck = document.createElement("td");
        const tdCheckInput = document.createElement("INPUT");
        tdCheckInput.setAttribute("type", "checkbox");
        tdCheckInput.setAttribute("class", "checkboxclass");

        tdId.remove = element.id;
        tdName.remove = element.name;
        tdBorn.remove = element.born;
        tdEmail.remove = element.email;
        tdNumber.remove = element.number;
        tdCheck.appendChild(tdCheckInput);

        tr.removeChild(tdId);
        tr.removeChild(tdName);
        tr.removeChild(tdBorn);
        tr.removeChild(tdEmail);
        tr.removeChild(tdNumber);
        tr.removeChild(tdCheck);
        tBody.removeChild(tr);
        alert("ELIMINADO");
      });
      table.removeChild(tBody);
    });
};

btnDeleteContacts.addEventListener("click", eliminarDatos);
