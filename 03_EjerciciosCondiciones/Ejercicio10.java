import java.util.Scanner;
public class Ejercicio10{
    public static void main (String[] args){
        Scanner notas = new Scanner(System.in);

        String m1 = "Sociales";
        String m2 = "Ingles";
        String m3 = "Historia";
        String m4 = "Matematicas";
        String m5 = "Fisica";

        double resta1, resta2, resta3, resta4, promedio, suma, puntaje;


        System.out.print("Ingrese su nota de " + m1 + " : ");

        double n1 =notas.nextDouble();

        System.out.print("Ingrese su nota de  " + m2 + " : ");

        double n2 =notas.nextDouble();

        System.out.print("Ingrese su nota de " + m3 + " : ");

        double n3 =notas.nextDouble();

        System.out.print("Ingrese su nota de " + m4 + " : ");

        double n4 =notas.nextDouble();

        System.out.print("Ingrese su nota de " + m5 + " : ");

        double n5 =notas.nextDouble();

        promedio = (n1+n2+n3+n4+n5)/5;

        if (n1 > n2){
            if(n1 > n3){
                if(n1 > n4){
                    if(n1 > n5){
                        System.out.println("Asignatura con mejor nota: " + m1);
                        resta1 = n1- n2;
                        resta2 = n1- n3;
                        resta3 = n1 - n4;
                        resta4 = n1 - n5;

                        if (resta1 > resta2){
                            if (resta1 > resta3){
                                if (resta1 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m2);
                                    suma = (((promedio * 5) - n2) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m2 + " para aprobar el periodo");

                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");
                                }
                            }else{
                                if (resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");
                                }
                            }
                        }else{
                            if (resta2 > resta3){
                                if(resta2 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m3);
                                    suma = (((promedio * 5) - n3) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m3 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");
                                }
                            }else{
                                if(resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");

                                }
                            }
                        }

                    }else{
                        System.out.println("Asignatura con mejor nota: " + m5);
                        resta1 = n5- n1;
                        resta2 = n5- n2;
                        resta3 = n5 - n3;
                        resta4 = n5 - n4;

                        if (resta1 > resta2){
                            if (resta1 > resta3){
                                if (resta1 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m1);
                                    suma = (((promedio * 5) - n1) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m1 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }
                            }else{
                                if (resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m3);
                                    suma = (((promedio * 5) - n3) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m3 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }
                            }
                        }else{
                            if (resta2 > resta3){
                                if(resta2 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m2);
                                    suma = (((promedio * 5) - n2) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m2 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }
                            }else{
                                if(resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m3);
                                    suma = (((promedio * 5) - n3) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m3 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);

                                }
                            }
                        }
                    }
                }else{
                    if(n4 > n5){
                        System.out.println("Asignatura con mejor nota: " + m4);
                        resta1 = n4- n1;
                        resta2 = n4- n2;
                        resta3 = n4 - n3;
                        resta4 = n4 - n5;

                        if (resta1 > resta2){
                            if (resta1 > resta3){
                                if (resta1 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m1);
                                    suma = (((promedio * 5) - n1) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m1 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");
                                }
                            }else{
                                if (resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m3);
                                    suma = (((promedio * 5) - n3) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m3 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");
                                }
                            }
                        }else{
                            if (resta2 > resta3){
                                if(resta2 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m2);
                                    suma = (((promedio * 5) - n2) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m2 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");
                                }
                            }else{
                                if(resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m3);
                                    suma = (((promedio * 5) - n3) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m3 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");

                                }
                            }
                        }


                    }else{
                        System.out.println("Asignatura con mejor nota: " + m5);
                        resta1 = n5- n1;
                        resta2 = n5- n2;
                        resta3 = n5 - n3;
                        resta4 = n5 - n4;

                        if (resta1 > resta2){
                            if (resta1 > resta3){
                                if (resta1 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m1);
                                    suma = (((promedio * 5) - n1) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m1 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }
                            }else{
                                if (resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m3);
                                    suma = (((promedio * 5) - n3) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m3 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }
                            }
                        }else{
                            if (resta2 > resta3){
                                if(resta2 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m2);
                                    suma = (((promedio * 5) - n2) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m2 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }
                            }else{
                                if(resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m3);
                                    suma = (((promedio * 5) - n3) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m3 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");

                                }
                            }
                        }
                    }
                }
            }else{
                if(n3 > n4){
                    if( n3 > n5){
                        System.out.println("Asignatura con mejor nota: " + m3);
                        resta1 = n3- n1;
                        resta2 = n3- n2;
                        resta3 = n3 - n4;
                        resta4 = n3 - n5;

                        if (resta1 > resta2){
                            if (resta1 > resta3){
                                if (resta1 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m1);
                                    suma = (((promedio * 5) - n1) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m1 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");
                                }
                            }else{
                                if (resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");
                                }
                            }
                        }else{
                            if (resta2 > resta3){
                                if(resta2 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m2);
                                    suma = (((promedio * 5) - n2) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m2 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");
                                }
                            }else{
                                if(resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");

                                }
                            }
                        }
                    }else{
                        System.out.println("Asignatura con mejor nota: " + m5);
                        resta1 = n5- n1;
                        resta2 = n5- n2;
                        resta3 = n5 - n3;
                        resta4 = n5 - n4;

                        if (resta1 > resta2){
                            if (resta1 > resta3){
                                if (resta1 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m1);
                                    suma = (((promedio * 5) - n1) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m1 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }
                            }else{
                                if (resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m3);
                                    suma = (((promedio * 5) - n3) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m3 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }
                            }
                        }else{
                            if (resta2 > resta3){
                                if(resta2 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m2);
                                    suma = (((promedio * 5) - n2) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m2 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }
                            }else{
                                if(resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m3);
                                    suma = (((promedio * 5) - n3) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m3 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");

                                }
                            }
                        }
                    }
                }else{
                    if(n4 > n5){
                        System.out.println("Asignatura con mejor nota: " + m4);
                        resta1 = n4- n1;
                        resta2 = n4- n2;
                        resta3 = n4 - n3;
                        resta4 = n4 - n5;

                        if (resta1 > resta2){
                            if (resta1 > resta3){
                                if (resta1 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m1);
                                    suma = (((promedio * 5) - n1) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m1 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");
                                }
                            }else{
                                if (resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m3);
                                    suma = (((promedio * 5) - n3) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m3 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");
                                }
                            }
                        }else{
                            if (resta2 > resta3){
                                if(resta2 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m2);
                                    suma = (((promedio * 5) - n2) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m2 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");
                                }
                            }else{
                                if(resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m3);
                                    suma = (((promedio * 5) - n3) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m3 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");

                                }
                            }
                        }
                    }else{
                        System.out.println("Asignatura con mejor nota: " + m5);
                        resta1 = n5- n1;
                        resta2 = n5- n2;
                        resta3 = n5 - n3;
                        resta4 = n5 - n4;

                        if (resta1 > resta2){
                            if (resta1 > resta3){
                                if (resta1 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m1);
                                    suma = (((promedio * 5) - n1) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m1 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }
                            }else{
                                if (resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m3);
                                    suma = (((promedio * 5) - n3) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m3 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }
                            }
                        }else{
                            if (resta2 > resta3){
                                if(resta2 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m2);
                                    suma = (((promedio * 5) - n2) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m2 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }
                            }else{
                                if(resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m3);
                                    suma = (((promedio * 5) - n3) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m3 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");

                                }
                            }
                        }
                    }
                }
            }
        }else{
            if(n2 > n3){
                if(n2 > n4){
                    if (n2 > n5){
                        System.out.println("Asignatura con mejor nota: " + m2);
                        resta1 = n2- n1;
                        resta2 = n2- n3;
                        resta3 = n2 - n4;
                        resta4 = n2 - n5;

                        if (resta1 > resta2){
                            if (resta1 > resta3){
                                if (resta1 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m1);
                                    suma = (((promedio * 5) - n1) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m1 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");
                                }
                            }else{
                                if (resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");
                                }
                            }
                        }else{
                             if (resta2 > resta3){
                                if(resta2 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m3);
                                    suma = (((promedio * 5) - n2) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m2 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");
                                }
                            }else{
                                if(resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");

                                }
                            }

                        }

                    }else{
                        System.out.println("Asignatura con mejor nota: " + m5);
                        resta1 = n5- n1;
                        resta2 = n5- n2;
                        resta3 = n5 - n3;
                        resta4 = n5 - n4;

                        if (resta1 > resta2){
                            if (resta1 > resta3){
                                if (resta1 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m1);
                                    suma = (((promedio * 5) - n1) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m1 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }
                            }else{
                                if (resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m3);
                                    suma = (((promedio * 5) - n3) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m3 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }
                            }
                        }else{
                             if (resta2 > resta3){
                                if(resta2 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m2);
                                    suma = (((promedio * 5) - n2) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m2 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }
                            }else{
                                if(resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m3);
                                    suma = (((promedio * 5) - n3) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m3 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");

                                }
                            }

                        }
                    }
                }else{
                    if (n4 > n5){
                        System.out.println("Asignatura con mejor nota: " + m4);
                        resta1 = n4- n1;
                        resta2 = n4- n2;
                        resta3 = n4 - n3;
                        resta4 = n4 - n5;

                        if (resta1 > resta2){
                            if (resta1 > resta3){
                                if (resta1 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m1);
                                    suma = (((promedio * 5) - n1) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m1 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");
                                }
                            }else{
                                if (resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m3);
                                    suma = (((promedio * 5) - n3) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m3 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");
                                }
                            }
                        }else{
                             if (resta2 > resta3){
                                if(resta2 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m2);
                                    suma = (((promedio * 5) - n2) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m2 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");
                                }
                            }else{
                                if(resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m3);
                                    suma = (((promedio * 5) - n3) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m3 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");

                                }
                            }
                        }
                    }else{
                        System.out.println("Asignatura con mejor nota: " + m5);
                        resta1 = n5- n1;
                        resta2 = n5- n2;
                        resta3 = n5 - n3;
                        resta4 = n5 - n4;

                        if (resta1 > resta2){
                            if (resta1 > resta3){
                                if (resta1 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m1);
                                    suma = (((promedio * 5) - n1) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m1 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }
                            }else{
                                if (resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m3);
                                    suma = (((promedio * 5) - n3) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m3 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }
                            }
                        }else{
                             if (resta2 > resta3){
                                if(resta2 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m2);
                                    suma = (((promedio * 5) - n2) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m2 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }
                            }else{
                                if(resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m3);
                                    suma = (((promedio * 5) - n3) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m3 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");

                                }
                            }

                        }
                    }
                }
            }else{
                if( n3 > n4){
                    if ( n3 > n5){
                        System.out.println("Asignatura con mejor nota: " + m3);
                        resta1 = n3- n1;
                        resta2 = n3- n2;
                        resta3 = n3 - n4;
                        resta4 = n3 - n5;

                        if (resta1 > resta2){
                            if (resta1 > resta3){
                                if (resta1 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m1);
                                    suma = (((promedio * 5) - n1) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m1 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");
                                }
                            }else{
                                if (resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");
                                }
                            }
                        }else{
                             if (resta2 > resta3){
                                if(resta2 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m2);
                                    suma = (((promedio * 5) - n2) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m2 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");
                                }
                            }else{
                                if(resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");

                                }
                            }

                        }
                    }else{
                        System.out.println("Asignatura con mejor nota: " + m5);
                        resta1 = n5- n1;
                        resta2 = n5- n2;
                        resta3 = n5 - n3;
                        resta4 = n5 - n4;

                        if (resta1 > resta2){
                            if (resta1 > resta3){
                                if (resta1 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m1);
                                    suma = (((promedio * 5) - n1) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m1 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }
                            }else{
                                if (resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m3);
                                    suma = (((promedio * 5) - n3) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m3 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }
                            }
                        }else{
                             if (resta2 > resta3){
                                if(resta2 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m2);
                                    suma = (((promedio * 5) - n2) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m2 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                }
                            }else{
                                if(resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m3);
                                    suma = (((promedio * 5) - n3) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m3 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m4);
                                    suma = (((promedio * 5) - n4) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");

                                }
                            }

                        }
                    }
                }else{
                    if(n4 > n5){
                        System.out.println("Asignatura con mejor nota: " + m4);
                        resta1 = n4- n1;
                        resta2 = n4- n2;
                        resta3 = n4 - n3;
                        resta4 = n4 - n5;

                        if (resta1 > resta2){
                            if (resta1 > resta3){
                                if (resta1 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m1);
                                    suma = (((promedio * 5) - n1) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m1 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");
                                }
                            }else{
                                if (resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m3);
                                    suma = (((promedio * 5) - n3) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m3 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");
                                }
                            }
                        }else{
                             if (resta2 > resta3){
                                if(resta2 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m2);
                                    suma = (((promedio * 5) - n2) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m2 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");
                                }
                            }else{
                                if(resta3 > resta4){
                                    System.out.println("Asignatura con menor nota: " + m3);
                                    suma = (((promedio * 5) - n3) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m3 + " para aprobar el periodo");
                                }else{
                                    System.out.println("Asignatura con menor nota: " + m5);
                                    suma = (((promedio * 5) - n5) / 4) * 0.2;
                                    puntaje = (3.0 -(suma * 4))/0.2;
                                    System.out.println("Debió obtener una nota de " + puntaje + " en " + m5 + " para aprobar el periodo");

                                }
                            }

                        }
                    }else{
                        if(n4 < n5){
                            System.out.println("Asignatura con mejor nota: " + m5);
                            resta1 = n5- n1;
                            resta2 = n5- n2;
                            resta3 = n5 - n3;
                            resta4 = n5 - n4;

                            if (resta1 > resta2){
                                if (resta1 > resta3){
                                    if (resta1 > resta4){
                                        System.out.println("Asignatura con menor nota: " + m1);
                                        suma = (((promedio * 5) - n1) / 4) * 0.2;
                                        puntaje = (3.0 -(suma * 4))/0.2;
                                        System.out.println("Debió obtener una nota de " + puntaje + " en " + m1 + " para aprobar el periodo");
                                    }else{
                                        System.out.println("Asignatura con menor nota: " + m4);
                                        suma = (((promedio * 5) - n4) / 4) * 0.2;
                                        puntaje = (3.0 -(suma * 4))/0.2;
                                        System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                    }
                                }else{
                                    if (resta3 > resta4){
                                        System.out.println("Asignatura con menor nota: " + m3);
                                        suma = (((promedio * 5) - n3) / 4) * 0.2;
                                        puntaje = (3.0 -(suma * 4))/0.2;
                                        System.out.println("Debió obtener una nota de " + puntaje + " en " + m3 + " para aprobar el periodo");
                                    }else{
                                        System.out.println("Asignatura con menor nota: " + m4);
                                        suma = (((promedio * 5) - n4) / 4) * 0.2;
                                        puntaje = (3.0 -(suma * 4))/0.2;
                                        System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                    }
                                }
                            }else{
                                if (resta2 > resta3){
                                    if(resta2 > resta4){
                                        System.out.println("Asignatura con menor nota: " + m2);
                                        suma = (((promedio * 5) - n2) / 4) * 0.2;
                                        puntaje = (3.0 -(suma * 4))/0.2;
                                        System.out.println("Debió obtener una nota de " + puntaje + " en " + m2 + " para aprobar el periodo");
                                    }else{
                                        System.out.println("Asignatura con menor nota: " + m4);
                                        suma = (((promedio * 5) - n4) / 4) * 0.2;
                                        puntaje = (3.0 -(suma * 4))/0.2;
                                        System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");
                                    }
                                }else{
                                    if(resta3 > resta4){
                                        System.out.println("Asignatura con menor nota: " + m3);
                                        suma = (((promedio * 5) - n3) / 4) * 0.2;
                                        puntaje = (3.0 -(suma * 4))/0.2;
                                        System.out.println("Debió obtener una nota de " + puntaje + " en " + m3 + " para aprobar el periodo");
                                    }else{
                                        System.out.println("Asignatura con menor nota: " + m4);
                                        suma = (((promedio * 5) - n4) / 4) * 0.2;
                                        puntaje = (3.0 -(suma * 4))/0.2;
                                        System.out.println("Debió obtener una nota de " + puntaje + " en " + m4 + " para aprobar el periodo");

                                    }
                                }

                            }
                        }else{
                            System.out.println("Todas las asignaturas tienen la misma nota");
                        }
                    }
                }
            }

        }

        

        System.out.println("Promedio de notas: " + promedio);



    }
}