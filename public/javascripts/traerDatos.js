/**
 *
 * In this document you take the information of gamers.js to show it in the route.
 * 
 * @version 1.01.001 2022-06-28.
 *
 * @author Cristian Gallego Hurtado - cris.gahur@hotmail.com
 *
 * @since 1.01.001
 */

const btnCons = document.getElementById("btnCons");

const traerDatos = () => {
  fetch("http://localhost:3000/api/v1/gamers")
    .then((response) => response.json())
    .then((data) => {
      console.log(data);

      const id = document.querySelector("#id");
      const gamer1 = document.querySelector("#gamer1");
  
      id.textContent = data.id;
      gamer1.textContent = data.gamer1;
      gamer2.textContent = data.gamer2;
      gamer3.textContent = data.gamer3;
    });
};

btnCons.addEventListener("click", traerDatos);
