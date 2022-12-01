public class Main {
    public static void main(String[] args){
        Estudiante e1 = new Estudiante();
        e1.setNombre("Juanito");
        e1.setApellido("Perez");
        e1.setEdad(12);
        e1.setCarnet("36546354G");
        e1.setExpediente(12);

        System.out.println("Nombre de estudiante:" + e1.getNombre());
        System.out.println("Apellido de estudiante:" + e1.getApellido());
        System.out.println("Edad de estudiante:" + e1.getEdad());
        System.out.println("Carnet de estudiante:" + e1.getCarnet());
        e1.expulsar();
    }

}