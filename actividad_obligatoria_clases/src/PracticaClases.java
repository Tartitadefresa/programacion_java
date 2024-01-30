import java.util.Scanner;

public class PracticaClases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        Anotaciones[] anotaciones = new Anotaciones[10];
        
        do {
            System.out.println("MENÚ");
            System.out.println("============");
            System.out.println("1.📝 Crear anotación");
            System.out.println("2.📖 Listar anotación");
            System.out.println("3.🔍 Buscar anotación");
            System.out.println("4.🗑️ Eliminar anotación");
            System.out.println("5.✅ Marcar/desmarcar anotación como importante");
            System.out.println("6.📄 Listar anotaciones importantes");
            System.out.println("7.🚪 Salir");

            int opciones = sc.nextInt();

            switch (opciones) {
                case 1:
                    Anotaciones anotacion = crearAnotaciones(sc);
                    
                    for (int i = 0; i < anotaciones.length; i++) {
                        if (anotaciones[i] == null) {
                            anotaciones[i] = anotacion;
                            break;
                        }
                    }
                    break;
            
                case 2:
                    listarAnotaciones(anotaciones);
                    break;

                case 3:
                    buscarAnotacion(anotaciones, sc);
                    break;

                case 4:
                    eliminarAnotacion(anotaciones, sc);   
                    break;

                case 5:
                    marcarDesmarcarComoImportante(anotaciones, sc);    
                    break;

                case 6:
                    listarAnotacionesImportantes(anotaciones);                
                    break;

                case 7:
                    salir = true;
                    break;

            }
        } while (!salir);
        
        sc.close();
    }


    private static Anotaciones crearAnotaciones(Scanner sc) {
        System.out.println("Introduce el título de la anotación");
        String titulo = sc.next();
        System.out.println("Introduce el texto de la anotación");
        String texto = sc.next();
        System.out.println("Introduce el nombre del autor");
        String nombre = sc.next();
        System.out.println("Introduce el apellido del autor");
        String apellido = sc.next();
        Persona autor = new Persona(nombre, apellido);
        Anotaciones anotacion = new Anotaciones(titulo, texto, autor);

        return anotacion;
    }

    private static void listarAnotaciones(Anotaciones[] anotaciones) {
        int cont = 0;

        System.out.println("EXISTE UN TOTAL DE " + anotaciones.length + " ANOTACIONES ALMACENADAS QUE SON: \n");
        
        for (int i = 0; i < anotaciones.length; i++) {
            if (anotaciones[i] != null) {
                cont++;
                System.out.println("ANOTACIÓN " + cont + ": \n" + anotaciones[i].toString());

            }
        }
    }

    private static void buscarAnotacion(Anotaciones[] anotaciones, Scanner sc) {
        System.out.println("Introduce el texto a buscar");
        String texto = sc.next();

        for (int i = 0; i < anotaciones.length; i++) {
            if (anotaciones[i] != null && anotaciones[i].getTitulo().contains(texto)) {
                System.out.println("ANOTACIÓN ENCONTRADA: " + "\n" + anotaciones[i].toString());
                return;
            }
        }

        System.out.println("No se ha encontrado ninguna anotación");
    }

    private static void eliminarAnotacion(Anotaciones[] anotaciones, Scanner sc) {
        System.out.println("Introduce el número de anotación a eliminar");
        int indice = sc.nextInt();

        if (indice >= 0 && indice < anotaciones.length) {
            System.out.println("Valor no válido");
            return;
        }

        if (anotaciones[indice] != null) {
            anotaciones[indice] = null;
            System.out.println("Anotación eliminada");
        } else {
            System.out.println("No existe ninguna anotación en ese índice");
        }

    }

    private static void marcarDesmarcarComoImportante(Anotaciones[] anotaciones, Scanner sc) {
        System.out.println("Desea marcar o descamarcar como importante?");
        String respuesta = sc.next();

        if(respuesta.equals("Marcar")) {
            String indicesMsg = "Los indices son: ";
            for (int i = 0; i < anotaciones.length; i++) {
                if (anotaciones[i] != null && !anotaciones[i].getEsImportante()) {
                    indicesMsg += i + " ";
                }
            }

            System.out.println(indicesMsg);
            System.out.println("Introduce uno de los indices");

            int indice = sc.nextInt();

            if (indice >= 0 && indice < anotaciones.length) {
                anotaciones[indice].setEsImportante(true);
            }
        }

        if(respuesta.equals("Desmarcar")) {
            String indiceMsg = "Los indices son: ";
            for (int i = 0; i < anotaciones.length; i++) {
                if (anotaciones[i] != null && anotaciones[i].getEsImportante()) {
                    indiceMsg += i + " ";
                }
            }

            System.out.println(indiceMsg);
            System.out.println("Introduce uno de los indices");

            int indices = sc.nextInt();

            if (indices >= 0 && indices < anotaciones.length) {
                anotaciones[indices].setEsImportante(false);
            }
        }
    }

    private static void listarAnotacionesImportantes(Anotaciones[] anotaciones) {
        int cont = 0;
        for (int i = 0; i < anotaciones.length; i++) {
            if (anotaciones[i] != null && anotaciones[i].getEsImportante()) {
                cont++;
                System.out.println("ANOTACIÓN " + cont + ": \n" + anotaciones[i].toString());
            }
        }
    }
}

