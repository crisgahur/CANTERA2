/**
 * It's a function to create a contact list.
 */

 const btnCreateContact = document.getElementById("btnCreate");


 const createData = () => {
    const form = document.getElementById("formulario");
    const data = new FormData(form);
    fetch('http://localhost:8080/contact',{
        method: "POST",
        body: data
    })
    .then((response) => response.json())
    .then((data) => {

        if(data.name!=""){
        console.log(data);
        alert("Contact created successfully");
    }
        else{
            alert("Please complete all the subjects");
        }
        
    })
    .catch((err) => {
        console.log(err);
    }) 
 }

 
 btnCreateContact.addEventListener("click", (e) => {
    e.preventDefault();
    createData();
 });


