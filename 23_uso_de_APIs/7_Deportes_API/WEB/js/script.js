

var cargarDeportes = function() {
    table_body = document.getElementById('datos');

    let endpoint = "http://localhost/Deportes_API/API/Obtener_deportes.php";
    let endpoint2 = "http://localhost/Deportes_API/API/Obtener_categorias.php";

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

            fetch(endpoint2)
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
            let parametro1 = "eliminarPersona('"+data[i].id_deporte+"')";
            boton1.setAttribute('onclick', parametro1);
            boton1.classList.add("btn", "btn-danger");
            boton1.appendChild(nodoBoton1);

            const boton2 = document.createElement('button');
            const nodoBoton2 = document.createTextNode(' Editar ');
            boton2.setAttribute('data-bs-toggle', 'modal');
            boton2.setAttribute('data-bs-target', '#form');
            let parametro2 = "editarPersona('"+data[i].id_deporte+"')";
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

function limpiarCampos(){
    document.getElementById("cedula").value = "";
    document.getElementById("nombre").value  = "";
    document.getElementById("modalidad").value = "";
    document.getElementById("participantes").value = "";
    document.getElementById("implementos").value = "";

}