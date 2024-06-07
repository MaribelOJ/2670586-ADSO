<?php 
    include 'DB/Conexion.php';

    if (!empty($_POST['id_deporte']) and !empty($_POST['nombre']) and !empty($_POST['modalidad']) ) {

        $id_deporte = $_POST['id_deporte'];
        $nombre = $_POST['nombres'];
        $modalidad = $_POST['modalidad'];
        $paricipantes_min = $_POST['paricipantes_min'];
        $participantes_max = $_POST['participantes_max'];
        $categoria = $_POST['categoria'];

        try {
            $consulta = $base_de_datos->prepare("INSERT INTO deportes (id_deporte', nombres, modalidad, paricipantes_min, participantes_max, categoria) VALUES(:id, :nom, :mod, :pmin, :pmax, :cat) ");
            $consulta->bindParam(':id', $id_deporte);
            $consulta->bindParam(':nom', $nombre);
            $consulta->bindParam(':mod', $apellidos);
            $consulta->bindParam(':pmin', $paricipantes_min);
            $consulta->bindParam(':pmax', $participantes_max);
            $consulta->bindParam(':cat', $categoria);
            $proceso = $consulta->execute();

            if( $proceso && $consulta->rowCount()!=0){
                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##PERSON##INSERT"
                              ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "ERROR##PERSON##INSERT"
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
