public class Estudiante extends Persona{
    private String carnet;
    private Integer expediente;

    public void expulsar(){
        System.out.println("expulsado");
    }

    public Integer getExpediente() {
        return expediente;
    }
    public void setExpediente(Integer expediente) {
        this.expediente = expediente;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getCarnet() {
        return carnet;
    }
}
