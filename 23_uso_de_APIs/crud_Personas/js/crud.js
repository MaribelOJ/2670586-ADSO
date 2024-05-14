let cc;
let names;
let surnames;
let phone;
let address;
let correo;
let foto; 

let titulo_modal;
let encabezado;
let titulo_nuevo;

let table_body;
let imgPersona; 


var cargarPersonas = function() {
    imgPersona = document.getElementById('imgPersona');
    document.getElementById("input_foto").value = "";
    imgPersona.src = "img/no_disponible.png";
    table_body = document.getElementById('datos');

    let endpoint = "https://codetesthub.com/API/Obtener.php";

    fetch(endpoint)
    .then( res => res.json())
    .then( data => {

        for( var i=0; i<data.length; i++){
            let td_dato1 = document.createElement('td');
            let td_doc = document.createElement('td');
            let td_nombre = document.createElement('td');
            let td_email = document.createElement('td');
            let td_eliminar = document.createElement('td');
            let td_editar = document.createElement('td');

            let txt_dato1 = document.createTextNode(i);
            let txt_doc = document.createTextNode(data[i].cedula);
            let txt_nombre = document.createTextNode(data[i].nombres + " " +data[i].apellidos);
            let txt_email = document.createTextNode(data[i].email);

            const boton1 = document.createElement('button');
            const nodoBoton1 = document.createTextNode(' Eliminar ');
            let parametro1 = "eliminarPersona('"+data[i].cedula+"')";
            boton1.setAttribute('onclick', parametro1);
            boton1.classList.add("btn", "btn-danger");
            boton1.appendChild(nodoBoton1);

            const boton2 = document.createElement('button');
            const nodoBoton2 = document.createTextNode(' Editar ');
            boton2.setAttribute('data-bs-toggle', 'modal');
            boton2.setAttribute('data-bs-target', '#form');
            let parametro2 = "editarPersona('"+data[i].cedula+"')";
            boton2.setAttribute('onclick', parametro2);
            boton2.classList.add("btn", "btn-success");
            boton2.appendChild(nodoBoton2);

            td_dato1.appendChild(txt_dato1);
            td_doc.appendChild(txt_doc);
            td_nombre.appendChild(txt_nombre);
            td_email.appendChild(txt_email);
            td_editar.appendChild(boton2);
            td_eliminar.appendChild(boton1);

            const table_row = document.createElement('tr');

            table_row.appendChild(td_dato1);
            table_row.appendChild(td_doc);
            table_row.appendChild(td_nombre);
            table_row.appendChild(td_email);
            table_row.appendChild(td_editar);
            table_row.appendChild(td_eliminar);

            table_body.appendChild(table_row);
            

        }
    });

}

window.onload = cargarPersonas;

function insertarPersona(){
    
    cc = document.getElementById("cedula").value;
    names = document.getElementById("nombres").value;
    surnames = document.getElementById("apellidos").value;
    phone = document.getElementById("telefono").value;
    address = document.getElementById("direccion").value;
    correo = document.getElementById("email").value;
    foto = document.getElementById("input_foto").value;

    if(cc == "" || names == "" || surnames == "" || phone == "" || address == "" || correo == ""){
        alert("Todos los campos son obligatorios");
    }else{
        
        let datos = new FormData();
        datos.append("cedula", cc);
        datos.append("nombres", names);
        datos.append("apellidos", surnames);
        datos.append("telefono", phone);
        datos.append("direccion", address);
        datos.append("email", correo);
        datos.append("foto",foto);

        let config = {
            method: "POST",
            headers: {
                "Accept" : "application/json"
            },
            body: datos,
        };

        fetch('https://codetesthub.com/API/Insertar.php', config)
        .then( res => res.json())
        .then( data => {

            if(data.status == true){
                table_body.innerHTML = "";
                cargarPersonas();
            }
        });
    }
}

function limpiarCampos(){
    document.getElementById("cedula").value = "";
    document.getElementById("nombres").value  = "";
    document.getElementById("apellidos").value = "";
    document.getElementById("telefono").value = "";
    document.getElementById("direccion").value = "";
    document.getElementById("email").value = "";
    document.getElementById("input_foto").value = "";
    imgPersona.src = "img/no_disponible.png";
    let doc = document.getElementById('cedula');
    doc.setAttribute('disabled','false');

    titulo_modal = document.getElementById('titulo_modal');
    encabezado = document.getElementById('encabezado');
    titulo_nuevo = document.createElement('h1');
    titulo_nuevo.id="titulo_modal";
    titulo_nuevo.classList.add("modal-title","fs-5");
    let txt_titulo = document.createTextNode('Ingrese datos: ');
    titulo_nuevo.appendChild(txt_titulo);
    encabezado.replaceChild(titulo_nuevo, titulo_modal);
}

function editarPersona(cc){
    titulo_modal = document.getElementById('titulo_modal');
    encabezado = document.getElementById('encabezado');
    titulo_nuevo = document.createElement('h1');
    titulo_nuevo.id="titulo_modal";
    titulo_nuevo.classList.add("modal-title","fs-5");    
    let txt_titulo = document.createTextNode('Actualizar información: ');
    titulo_nuevo.appendChild(txt_titulo);
    encabezado.replaceChild(titulo_nuevo, titulo_modal);
    let doc = document.getElementById('cedula');
    doc.setAttribute('disabled','true');
    let btn_enviar = document.getElementById("btn_enviar");
    btn_enviar.setAttribute('onclick','actualizarPersona("'+cc+'")')

    let endpoint = "https://codetesthub.com/API/Obtener.php";

    fetch(endpoint)
    .then( res => res.json())
    .then( data => {

        for( var i=0; i<data.length; i++){
            if(data[i].cedula == cc){
                document.getElementById("cedula").value = data[i].cedula;
                document.getElementById("nombres").value = data[i].nombres;
                document.getElementById("apellidos").value = data[i].apellidos;
                document.getElementById("telefono").value = data[i].telefono;
                document.getElementById("direccion").value = data[i].direccion;
                document.getElementById("email").value = data[i].email;
                

                if(data[i].foto != ""){
                    document.getElementById("input_foto").value = data[i].foto;
                    imgPersona.src = "img/"+data[i].foto;
                }

                break;
            }
        }

    });

}

function actualizarPersona(cc){
    names = document.getElementById("nombres").value;
    surnames = document.getElementById("apellidos").value;
    phone = document.getElementById("telefono").value;
    address = document.getElementById("direccion").value;
    correo = document.getElementById("email").value;
    foto = document.getElementById("input_foto").value;
    let file;
    let imageData; 

    if(foto == ""){
       foto = "img/no_disponible.png";
    }else{
       foto = document.getElementById('input_foto').files[0] //no esta funcionando
    }

    console.log(foto);
    if(names == "" || surnames == "" || phone == "" || address == "" || correo == ""){
        alert("Todos los campos son obligatorios");
    }else{
        
        let datos = new FormData();
        datos.append("cedula", cc);
        datos.append("nombres", names);
        datos.append("apellidos", surnames);
        datos.append("telefono", phone);
        datos.append("direccion", address);
        datos.append("email", correo);
        datos.append("foto",foto.name);

        let config = {
            method: "POST",
            headers: {
                "Accept" : "application/json"
            },
            body: datos,
        };

        fetch('https://codetesthub.com/API/Actualizar.php', config)
        .then( res => res.json())
        .then( data => {
            if(data.status == true){
                alert(data.status);
                table_body.innerHTML = "";
                cargarPersonas();
            }        
        });
    }

}

function eliminarPersona(cedula){

    let datos = new FormData();
    datos.append("cedula", cedula);

    let config = {
                    method: "POST",
                    headers: {
                        "Accept" : "application/json"
                    },
                    body: datos,
                 };
    
    fetch('https://codetesthub.com/API/Eliminar.php', config)
    .then( res => res.json())
    .then( data => {

        alert(data.status);
        table_body.innerHTML = "";
        cargarPersonas();
    });    
}



