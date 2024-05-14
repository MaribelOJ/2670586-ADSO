let cuadrilla;
let pokemonName;
let btnRewind;
let btnNext;
let contAll;
let img;
let btn1;
let next;
let rewind;
let spinner;
let txt_spinner;

window.onload = function() {
    
    pokemonName = document.getElementById("nombre");
    btnRewind = document.getElementById("btnRewind");
    btnNext = document.getElementById("btnNext");
    img = document.getElementById("imgPokemon");
    contAll = document.getElementById("pokemonList");

    btnRewind.classList.add('disabled','btn','btn-success');

    let endpoint = "https://pokeapi.co/api/v2/pokemon";
    

    fetch(endpoint)
    .then( res => res.json())
    .then( data => {
        
        // Coigo para ejecutar en caso de tener el JSON como respuestas de la API
        for( var i=0; i<data.results.length; i++){

            cuadrilla = document.createElement('div');
            cuadrilla.classList.add('col-2');
            let botones = document.createElement('button');
            botones.classList.add('btn','btn-outline-info','text-center','w-100');
            botones.id="btn"+(i+1);
            botones.setAttribute('onclick',"mostrarPokemon('"+data.results[i].url+"')");
            let text = document.createTextNode(data.results[i].name);
            botones.appendChild(text)
            botones.addEventListener("mouseover", function() {
                btn1.classList.remove('active');
                this.classList.add('text-white');
            });
            botones.addEventListener("mouseout", function() {
                this.classList.remove('text-white');
            });
            cuadrilla.appendChild(botones)
            contAll.appendChild(cuadrilla)
            
        }

        btn1 = document.getElementById("btn1");
        btn1.classList.add('active','text-white');
        mostrarPokemon(data.results[0].url);
        

        if(data.next == null){
            btnNext.classList.add('disabled');
        }else{
            next = data.next;
            btnRewind.classList.remove('disabled');
        }

    }); 
    
    


}

function mostrarPokemon(url){

    fetch(url)
    .then( res => res.json())
    .then( data => {

        pokemonName.innerHTML = data.name;
        img.src = data.sprites.other.dream_world.front_default;
    });
}

function mostrarSpinner() {

    spinner = document.createElement('div');
    spinner.classList.add("spinner-border","text-secondary","text-center");
    spinner.style.width='3rem';
    spinner.style.height='3rem';
    spinner.setAttribute('role', 'status');

    let span = document.createElement('span');
    span.classList.add("visually-hidden");

    let txt_span = document.createTextNode('Loading...');
    span.appendChild(txt_span);
    spinner.appendChild(span);

    txt_spinner = document.createElement('div');
    txt_spinner.classList.add("text-center");
    let h3 = document.createElement('h3');
    h3.classList.add('text-secondary');
    let txt_h3 =document.createTextNode("Cargando...");

    h3.appendChild(txt_h3);
    txt_spinner.appendChild(h3);

    contAll.innerHTML = "";
    contAll.appendChild(spinner);
    contAll.appendChild(txt_spinner);    
}

function ocultarSpinner() {

    spinner.setAttribute('hidden','true');
    txt_spinner.setAttribute('hidden', 'true');
}

function siguiente(){
        
    mostrarSpinner();


    fetch(next)
    .then( res => res.json())
    .then( data => {
        contAll.innerHTML="";
        for( var i=0; i<data.results.length; i++){

            cuadrilla = document.createElement('div');
            cuadrilla.classList.add('col-2');
            let botones = document.createElement('button');
            botones.classList.add('btn','btn-outline-info','text-center','w-100');
            botones.id="btn"+(i+1);
            botones.setAttribute('onclick',"mostrarPokemon('"+data.results[i].url+"')");
            let text = document.createTextNode(data.results[i].name);
            botones.appendChild(text)
            botones.addEventListener("mouseover", function() {
                btn1.classList.remove('active');
                this.classList.add('text-white');
            });
            botones.addEventListener("mouseout", function() {
                this.classList.remove('text-white');
            });
            cuadrilla.appendChild(botones);
            contAll.appendChild(cuadrilla);
            
        }

        if(data.next == null){
            btnNext.classList.add('disabled');
        }else{
            next = data.next;
        } 
        
        rewind = data.previous;
        ocultarSpinner();
        
    });

}

function anterior(){
    mostrarSpinner();


    fetch(rewind)
    .then( res => res.json())
    .then( data => {
        
        contAll.innerHTML="";
        for( var i=0; i<data.results.length; i++){

            cuadrilla = document.createElement('div');
            cuadrilla.classList.add('col-2');
            let botones = document.createElement('button');
            botones.classList.add('btn','btn-outline-info','text-center','w-100');
            botones.id="btn"+(i+1);
            botones.setAttribute('onclick',"mostrarPokemon('"+data.results[i].url+"')");
            let text = document.createTextNode(data.results[i].name);
            botones.appendChild(text)
            botones.addEventListener("mouseover", function() {
                btn1.classList.remove('active');
                this.classList.add('text-white');
            });
            botones.addEventListener("mouseout", function() {
                this.classList.remove('text-white');
            });
            cuadrilla.appendChild(botones);
            contAll.appendChild(cuadrilla);
            
        }

        if(data.previous == null){
            btnRewind.classList.add('disabled');
        }else{
            rewind = data.previous;
        }
        
        next = data.next;

        ocultarSpinner();
    });

}
