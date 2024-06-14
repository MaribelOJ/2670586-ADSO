<?php 
    include 'DB/Conexion.php';

    if (!empty($_POST['nombre']) and !empty($_POST['modalidad']) and !empty($_POST['participantes_min']) ) {

        $nombre = $_POST['nombre'];
        $modalidad = $_POST['modalidad'];
        $participantes_min = $_POST['participantes_min'];
        $participantes_max = $_POST['participantes_max'];
        $implementos=$_POST['implementos'];
        $categoria = $_POST['categoria'];

        try {

            $consulta = $base_de_datos->prepare("INSERT INTO deportes (nombre, modalidad, participantes_min, participantes_max, implementos, categoria) VALUES(:nom, :mod, :pmin, :pmax, :imp, :cat)");
            $consulta->bindParam(':nom', $nombre);
            $consulta->bindParam(':mod', $modalidad);
            $consulta->bindParam(':pmin', $participantes_min);
            $consulta->bindParam(':pmax', $participantes_max);
            $consulta->bindParam(':imp', $implementos);
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
