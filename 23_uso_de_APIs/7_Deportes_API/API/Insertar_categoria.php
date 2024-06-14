<?php 
    include 'DB/Conexion.php';

    if (!empty($_POST['nombre'])) {

        $id_deporte = $_POST['id_categoria'];
        $nombre = $_POST['nombres'];

        try {
            $consulta = $base_de_datos->prepare("INSERT INTO deportes (id_categoria', nombres) VALUES(:id, :nom) ");
            $consulta->bindParam(':id', $id_categoria);
            $consulta->bindParam(':nom', $nombre);
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
