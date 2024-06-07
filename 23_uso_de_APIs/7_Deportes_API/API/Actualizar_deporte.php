<?php 
    include 'DB/Conexion.php';

    if (!empty($_POST['id_deporte']) and !empty($_POST['nombre']) and !empty($_POST['modalidad']) ) {

        $id_deporte = $_POST['id_deporte'];
        $nombre = $_POST['nombre'];
        $modalidad = $_POST['modalidad'];
        $paricipantes_min = $_POST['paricipantes_min'];
        $participantes_max = $_POST['participantes_max'];
        $categoria = $_POST['categoria'];

        try {
            $consulta = $base_de_datos->prepare("UPDATE deportes SET nombre=:nom, modalidad=:mod, participantes_min=:pmin, participantes_max=:pmax, categoria=:cat WHERE id_deporte = :id ");

            $consulta->bindParam(':id', $id_deporte);
            $consulta->bindParam(':nom', $nombre);
            $consulta->bindParam(':mod', $modalidad);
            $consulta->bindParam(':pmin', $participantes_min);
            $consulta->bindParam(':pmax', $participantes_max);
            $consulta->bindParam(':cat', $categoria);
            
            $proceso = $consulta->execute();

            if( $proceso ){
                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##PERSON##UPDATE"
                              ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "ERROR##PERSON##UPDATE"
                              ];
                echo json_encode($respuesta);
            }
        } catch (Exception $e) {
            $respuesta = [
                            'status' => false,
                            'mesagge' => "ERROR##SQL",
                            'exception' => $e
                          ];
            echo json_encode($respuesta);
        }
    }else{
        $respuesta = [
                        'status' => false,
                        'mesagge' => "ERROR##DATOS##POST"
                      ];
        echo json_encode($respuesta);
    }
?>
