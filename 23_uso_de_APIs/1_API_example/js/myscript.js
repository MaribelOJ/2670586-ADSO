let contPrincipal;

window.onload = function() {
    contPrincipal = document.getElementById("contPrincipal");
    contPokemon = document.getElementById("contPokemon");
    nombre = document.getElementById("nombre");
    imgPokemons = document.getElementById("imgPokemon");
}



function consumoAPI(){
    let endpoint = "https://pokeapi.co/api/v2/pokemon";
    //Consumo - AJAX 
    fetch(endpoint)
    .then( res => res.json())
    .then( data => {
        contPrincipal.innerHTML ="";
        // Coigo para ejecutar en caso de tener el JSON como respuestas de la API
        for( var i=0; i<data.results.length; i++){

            let html_temp = `<div>
                                <button onclick="cargarDetalle('${data.results[i].url}')" class="btn btn-outline-dark m-1 mt-0 col-12"> ${ data.results[i].name} </button>
                            </div>`;

            contPrincipal.innerHTML += html_temp;

        }
    });
}

function cargarDetalle(url){

    fetch(url)
    .then( res => res.json())
    .then( data => {

        nombre.innerHTML = data.name;
        imgPokemons.src = data.sprites.other.dream_world.front_default;
    });
}