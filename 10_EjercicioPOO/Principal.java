public class Principal{
    public static void main(String[] args){
        // cajero cajero01 = new cajero(300000000, 10000000, 100, 50, 20, 70, "banco Popular", "admin2023", "admin123");
        // cajero01.imprimirDetalle();

        cajero cajero02 = new cajero(150000000, "Davivienda", "admin2023", "admin123");
        // cajero02.imprimirDetalle();

        String transaccion01 = cajero02.abastecerCajero(1000, 1000, 500, 500);
        String transaccion02 = cajero02.abastecerCajero(2000, 2000, 500, 500);
        // cajero02.imprimirDetalle();
        // cajero02.verHistorialCajero();

        tarjetaDebito tarjeta01 = new tarjetaDebito("Maribel Obando", "345 213 2356 12", "Bancolombia", 3000000, 500000, "mari123", "ACTIVA");
        tarjetaDebito tarjeta02 = new tarjetaDebito("Christian Giraldo", "430 445 7892 34", "Bancolombia", 6000000, 100000, "chris123", "BLOQUEADA");
        tarjetaDebito tarjeta03 = new tarjetaDebito("Ines Arroyave", "556 090 8763 65", "Banco Popular", 5000000, 600000, "ines123", "ACTIVA");
        tarjetaDebito tarjeta04 = new tarjetaDebito("Jenifer Ortega", "889 590 2641 12", "Davivienda", 2800000, 50000, "jeni123", "SUSPENDIDA");
        tarjetaDebito tarjeta05 = new tarjetaDebito("Fabian Gonzalez", "054 190 3723 87", "Colpatria", 1000000, 100000, "fabi123", "ACTIVA");

        String transaccion03 = tarjeta05.disminuirSaldo(50000);
        String transaccion04 = tarjeta05.aumentarSaldo(10000);

        cajero02.verHistorialCajero(transaccion01, transaccion02, transaccion03, transaccion04);
    }
}