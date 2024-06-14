
let inputCategoria;

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

                console.log(datos);

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

function cargarTabla(){
    document.getElementById("categories").innerHTML="";
    let container = document.getElementById("categories");

    let endpoint = "http://localhost/Deportes_API/API/Obtener_categorias.php";

    fetch(endpoint)
    .then( res => res.json())
    .then( data => {

        let chart = document.createElement('table');
        chart.classList.add("table", "table-hover");
        let headSection =document.createElement('thead'); 
        let bodySection = document.createElement('tbody'); 

        let col1 = document.createElement('td');
        let col2 = document.createElement('td');
        let col3 = document.createElement('td');
        let col4 = document.createElement('td');


        let titlesRow = document.createElement('tr');

        let title1=document.createTextNode("Id Categoria");
        let title2=document.createTextNode("Nombre");
        col1.classList.add("fw-bold");
        col2.classList.add("fw-bold");
        col1.appendChild(title1);
        col2.appendChild(title2);
        
        titlesRow.appendChild(col1);
        titlesRow.appendChild(col2);
        titlesRow.appendChild(col3);
        titlesRow.appendChild(col4);

        headSection.appendChild(titlesRow);
        chart.appendChild(headSection);
        

        for(var a = 0; a < data.length; a++){

            let col1 = document.createElement('td');
            let col2 = document.createElement('td');
            let col3 = document.createElement('td');
            let col4 = document.createElement('td');

            let row = document.createElement('tr');
            
            let dato1=document.createTextNode(data[a].id_categoria);
            let dato2=document.createTextNode(data[a].nombre);

            const boton1 = document.createElement('button');
            const nodoBoton1 = document.createTextNode(' Eliminar ');
            let parametro1 = "eliminarCategoria('"+data[a].id_categoria+"')";
            boton1.setAttribute('onclick', parametro1);
            boton1.classList.add("btn", "btn-danger");
            boton1.appendChild(nodoBoton1);

            const boton2 = document.createElement('button');
            const nodoBoton2 = document.createTextNode(' Editar ');
            let parametro2 = "editarCategoria('"+ data[a].id_categoria +"')";
            boton2.setAttribute('onclick', parametro2);
            boton2.classList.add("btn", "btn-success");
            boton2.appendChild(nodoBoton2);

            col1.appendChild(dato1);
            col2.appendChild(dato2);
            col3.appendChild(boton1);
            col4.appendChild(boton2);

            row.appendChild(col1);
            row.appendChild(col2);
            row.appendChild(col3);
            row.appendChild(col4);

            bodySection.appendChild(row);
            
        }

        let footSection = document.createElement('tfoot');
        let footRow = document.createElement('tr');
        let uniqueCol = document.createElement('td');
        uniqueCol.colSpan=4;
        uniqueCol.classList.add("text-center");

        const boton = document.createElement('button');
        const nodoBoton = document.createTextNode(' Registrar ');
        let parametro = "registrarCategoria()";
        boton.setAttribute('onclick', parametro);
        boton.classList.add("btn", "btn-info");
        boton.appendChild(nodoBoton);

        uniqueCol.appendChild(boton);
        footRow.appendChild(uniqueCol);
        footSection.appendChild(footRow);

        
        chart.appendChild(bodySection);
        chart.appendChild(footSection);

        container.appendChild(chart);
        

    });

}

function eliminarCategoria(id){

    let datos = new FormData();
    datos.append("id_categoria", id);

    let config = {
                    method: "POST",
                    headers: {
                        "Accept" : "application/json"
                    },
                    body: datos,
                 };
    
    console.log(datos);

    fetch('http://localhost/Deportes_API/API/Eliminar_categoria.php', config)
    .then( res => res.json())
    .then( data => {

        console.log("eliminar");
        table_body.innerHTML = "";
    });    
}

function editarCategoria(id){

    let endpoint = "http://localhost/Deportes_API/API/Obtener_categorias.php";

    fetch(endpoint)
    .then( res => res.json())
    .then( data => {


        document.getElementById("categories").innerHTML="";
        let container = document.getElementById("categories");

        titulo_modal = document.getElementById('titulo_modal2');
        encabezado = document.getElementById('encabezado2');
        titulo_nuevo = document.createElement('h1');
        titulo_nuevo.id="titulo_modal2";
        titulo_nuevo.classList.add("modal-title","fs-5");    
        let txt_titulo = document.createTextNode('Actualizar información: ');
        titulo_nuevo.appendChild(txt_titulo);
        encabezado.replaceChild(titulo_nuevo, titulo_modal);

        let form= document.createElement('form');
        let etq= document.createElement('label');
        etq.classList.add("me-3");
        let txt_etq = document.createTextNode("Nombre:");

        etq.appendChild(txt_etq);

        inputCategoria=document.createElement('input');
        inputCategoria.classList.add("me-3","w-50");
        inputCategoria.id="nombreCategoria";
        inputCategoria.type="text";

        for(var a = 0; a < data.length; a++){
            if(data[a].id_categoria == id){
                inputCategoria.value=data[a].nombre;
                break;
            }
        }

        const boton = document.createElement('button');
        boton.classList.add("w-25");
        const nodoBoton = document.createTextNode('Guardar');
        let parametro = "insertarCategoria('"+id+"')";
        boton.setAttribute('onclick', parametro);
        boton.classList.add("btn", "btn-info");
        boton.appendChild(nodoBoton);
        
        form.appendChild(etq);
        form.appendChild(inputCategoria);
        form.appendChild(boton);

        container.appendChild(form);
    });

}

function insertarCategoria(id){

    let nombre = document.getElementById("nombreCategoria").value;
    if(nombre == ""){
        alert("Se debe llenas los campos dispobinles");
    }else{

        let datos = new FormData();
        datos.append("id_categoria", id);
        datos.append("nombre", nombre);
        

        let config = {
            method: "POST",
            headers: {
                "Accept" : "application/json"
            },
            body: datos,
        };  
    
        console.log(config);

        fetch('http://localhost/Deportes_API/API/Actualizar_categoria.php', config)
        .then( res => res.json())
        .then( data => {
    
            console.log("actualizar categoria");
            cargarTabla();
                
        });

    }

    
}

function limpiarCampos(){
    
    document.getElementById("nombre").value  = "";
    document.getElementById("modalidad").selectedIndex = 0;
    document.getElementById("participantes").value = "";
    document.getElementById("implementos").value = "";

}