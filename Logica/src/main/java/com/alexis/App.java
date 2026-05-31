import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String opcion = "";
        String usuario = "";
        String contrasena = "";

        // 1. Declaramos las variables de las notas aquí arriba para que no se borren
        String n1 = "Sin calificar";
        String n2 = "Sin calificar";
        String comentario = "Ninguno";


        while (!opcion.equals("5")) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Nosotros");
            System.out.println("2. Cursos");
            System.out.println("3. Eventos");
            System.out.println("4. Evaluacion");
            System.out.println("5. Cerrar Sesión");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Nosotros");
                    break;
                case "2":
                    System.out.println("Cursos");
                    break;
                case "3":
                    System.out.println("Eventos");
                    break;
                case "4":
                    System.out.println("Evaluacion");
                    // Usamos la misma forma de imprimir de tu profesor
                    System.out.print("Seleccione: 1- Login - 2 - Registro: ");
                    opcion = sc.nextLine(); // Reutilizando la variable como el profe

                    switch (opcion) {
                        case "1":
                            System.out.println("Ingrese las credenciales");
                            System.out.print("Ingrese el usuario: ");
                            usuario = sc.nextLine();
                            System.out.print("Ingrese la contraseña: ");
                            contrasena = sc.nextLine();

                            // Si entra el estudiante
                            if(usuario.equals("estudiante") && contrasena.equals("1234")){
                                System.out.println("Bienvenido al sistema Estudiante...");
                                System.out.print("Califica del 1 al 5 su explicacion: ");
                                n1 = sc.nextLine();

                                System.out.print("Califica del 1 al 5 su puntualidad: ");
                                n2 = sc.nextLine();

                                System.out.print("Deja un comentario: ");
                                comentario = sc.nextLine();

                                System.out.println("Evaluacion guardada exitosamente.");
                            }
                            // Si entra el profesor a consultar
                            else if(usuario.equals("jaime.zapata") && contrasena.equals("1234")) {
                                System.out.println("Bienvenido Profe Jaime. Sus resultados son:");
                                System.out.println("- Explicacion: " + n1);
                                System.out.println("- Puntualidad: " + n2);
                                System.out.println("- Comentario: " + comentario);
                            }
                            else {
                                System.out.println("Error de credenciales..");
                            }
                            break;

                        case "2":
                            System.out.println("Ingrese los campos del registro");
                            break;

                        default:
                            break;
                    }

                    // Reiniciamos la variable opción para que el menú principal vuelva a cargar bien
                    opcion = "0";
                    break;

                case "5":
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        }
        sc.close();
    }
}