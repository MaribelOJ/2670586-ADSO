

var cargarDeportes = function() {
    document.getElementById('datos').innerHTML="";
    table_body = document.getElementById('datos');


    let endpoint = "http://localhost/Deportes_API/API/Obtener_deportes.php";

    fetch(endpoint)
    .then( res => res.json())
    .then( data => {

        for( var i=0; i<data.length; i++){

            const table_row = document.createElement('tr');
            
            let td_id = document.createElement('td');
            let td_nombre = document.createElement('td');
            let td_modalidad = document.createElement('td');
            let td_participantes = document.createElement('td');
            let td_implementos = document.createElement('td');
            let td_categoria = document.createElement('td');
            let td_eliminar = document.createElement('td');
            let td_editar = document.createElement('td');

            let txt_id = document.createTextNode(data[i].id_deporte);
            let txt_nombre = document.createTextNode(data[i].nombre);
            let txt_modalidad = document.createTextNode(data[i].modalidad);
            let txt_participantes = document.createTextNode(data[i].participantes_min + " - "+ data[i].participantes_max);
            let txt_implementos = document.createTextNode(data[i].implementos);
            let num_categoria = data[i].categoria;

            fetch("http://localhost/Deportes_API/API/Obtener_categorias.php")
            .then( res => res.json())
            .then( data2 => {

                for(var a = 0; a < data2.length; a++){
                    if(num_categoria == data2[a].id_categoria){
                         let txt_categoria = document.createTextNode(data2[a].nombre);
                         td_categoria.appendChild(txt_categoria);
                        break;
                    }
                }
            });

            const boton1 = document.createElement('button');
            const nodoBoton1 = document.createTextNode(' Eliminar ');
            let parametro1 = "eliminarDeporte('"+data[i].id_deporte+"')";
            boton1.setAttribute('onclick', parametro1);
            boton1.classList.add("btn", "btn-danger");
            boton1.appendChild(nodoBoton1);

            const boton2 = document.createElement('button');
            const nodoBoton2 = document.createTextNode(' Editar ');
            boton2.setAttribute('data-bs-toggle', 'modal');
            boton2.setAttribute('data-bs-target', '#form');
            let parametro2 = "editarDeporte('"+data[i].id_deporte+"')";
            boton2.setAttribute('onclick', parametro2);
            boton2.classList.add("btn", "btn-success");
            boton2.appendChild(nodoBoton2);

            td_id.appendChild(txt_id);
            td_nombre.appendChild(txt_nombre);
            td_modalidad.appendChild(txt_modalidad);
            td_participantes.appendChild(txt_participantes);
            td_implementos.appendChild(txt_implementos);  
            td_editar.appendChild(boton2);
            td_eliminar.appendChild(boton1);

            table_row.appendChild(td_id)
            table_row.appendChild(td_nombre);
            table_row.appendChild(td_modalidad);
            table_row.appendChild(td_participantes);
            table_row.appendChild(td_implementos);
            table_row.appendChild(td_categoria);
            table_row.appendChild(td_editar);
            table_row.appendChild(td_eliminar);

            table_body.appendChild(table_row); 

        }
    });
}

window.onload = cargarDeportes;

function insertarDeporte(id){
    
    nombre = document.getElementById("nombre").value;
    mod = document.getElementById("modalidad").value;
    players = document.getElementById("participantes").value;
    items = document.getElementById("implementos").value;
    type = document.getElementById("categoria").value;

    let minMax = players.split("-");

    if(nombre == "" || mod == "" || minMax.length != 2 || items == "" || type == "seleccionar"){

        alert("Todos los campos son obligatorios y deben proveer los datos completos");
  
    }else{

        let datos = new FormData();

        datos.append("nombre", nombre);
        datos.append("modalidad", mod);
        datos.append("participantes_min", minMax[0]);
        datos.append("participantes_max", minMax[1]);
        datos.append("implementos", items);

        

        fetch("http://localhost/Deportes_API/API/Obtener_categorias.php")
        .then( res => res.json())
        .then( data => {
            for(var a = 0; a < data.length; a++){
                if(type == data[a].nombre){
                    let cat = data[a].id_categoria;
                    datos.append("categoria",cat);
                    break;
                }
            }

            
            if(id == 0){

                let config = {
                    method: "POST",
                    headers: {
                        "Accept" : "application/json"
                    },
                    body: datos,
                };    
    
                fetch('http://localhost/Deportes_API/API/Insertar_deporte.php', config)
                .then( res => res.json())
                .then( data => {     
                    table_body.innerHTML = "";
                    limpiarCampos();
                    cargarDeportes();             
        
                });
            }else{

                datos.append("id_deporte", id);

                let config = {
                    method: "POST",
                    headers: {
                        "Accept" : "application/json"
                    },
                    body: datos,
                };  


                fetch('http://localhost/Deportes_API/API/Actualizar_deporte.php', config)
                .then( res => res.json())
                .then( data => {
                    if(data.status == true){
                        table_body.innerHTML = "";
                        limpiarCampos();
                        cargarDeportes();  
                                          
                    }        
                });
            }
        }); 
    }
}

function editarDeporte(id){
    titulo_modal = document.getElementById('titulo_modal');
    encabezado = document.getElementById('encabezado');
    titulo_nuevo = document.createElement('h1');
    titulo_nuevo.id="titulo_modal";
    titulo_nuevo.classList.add("modal-title","fs-5");    
    let txt_titulo = document.createTextNode('Actualizar información: ');
    titulo_nuevo.appendChild(txt_titulo);
    encabezado.replaceChild(titulo_nuevo, titulo_modal);
  
    let btn_enviar = document.getElementById("btn_enviar");
    btn_enviar.setAttribute('onclick','insertarDeporte("'+id+'")')

    let endpoint = "http://localhost/Deportes_API/API/Obtener_deportes.php";

    fetch(endpoint)
    .then( res => res.json())
    .then( data => {

        for( var i=0; i<data.length; i++){
            if(data[i].id_deporte == id){

                document.getElementById("nombre").value = data[i].nombre;
                document.getElementById("modalidad").value = data[i].modalidad;
                document.getElementById("participantes").value = data[i].participantes_min +"-"+data[i].participantes_max;
                document.getElementById("implementos").value = data[i].implementos;

                cargarCategorias(data[i].categoria);
                break;
            }
        }

    });
}

function eliminarDeporte(id){

    let datos = new FormData();
    datos.append("id_deporte", id);

    let config = {
                    method: "POST",
                    headers: {
                        "Accept" : "application/json"
                    },
                    body: datos,
                 };
    
    fetch('http://localhost/Deportes_API/API/Eliminar_deporte.php', config)
    .then( res => res.json())
    .then( data => {

        table_body.innerHTML = "";
        cargarDeportes();
    });    
}

function cargarCategorias(indice){

    document.getElementById("categoria").innerHTML="";
    var select = document.getElementById("categoria");
    let endpoint = "http://localhost/Deportes_API/API/Obtener_categorias.php";

    let opc = document.createElement('option');
    opc.selected;
    opc.textContent ="Seleccionar";
    select.appendChild(opc);

    let chosen="";
    fetch(endpoint)
    .then( res => res.json())
    .then( data => {

        for(var a = 0; a < data.length; a++){

            let opc = document.createElement('option');
            opc.value=data[a].nombre;
            opc.textContent =data[a].nombre;
            select.appendChild(opc);
            

            if((indice-1) == a){
                
                chosen = data[a].nombre;
            }
        }

        if(indice == 0){
            chosen="Seleccionar";
        }
        
        select.value=chosen;

    });
    
}

function limpiarCampos(){
    
    document.getElementById("nombre").value  = "";
    document.getElementById("modalidad").selectedIndex = 0;
    document.getElementById("participantes").value = "";
    document.getElementById("implementos").value = "";

}