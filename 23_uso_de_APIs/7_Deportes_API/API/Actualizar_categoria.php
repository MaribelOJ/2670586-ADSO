<?php 
    include 'DB/Conexion.php';

    if (!empty($_POST['id_categoria']) and !empty($_POST['nombre'])) {

        $id_categoria = $_POST['id_categoria'];
        $nombre = $_POST['nombre'];
    
        try {
            $consulta = $base_de_datos->prepare("UPDATE categoria SET nombre=:nom WHERE id_categoria = :id ");

            $consulta->bindParam(':id', $id_categoria);
            $consulta->bindParam(':nom', $nombre);
            
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
