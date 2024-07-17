package cl.praxis.apringclasss2;
import cl.praxis.apringclasss2.entity.Persona;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApringClasss2Application {
    public static void main(String[] args) {
        SpringApplication.run(ApringClasss2Application.class, args);
        Persona persona = new Persona("Miguel", "Rondanelli", "35");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: "+persona.getApellido());
        System.out.println("Edad: "+ persona.getEdad());
    }
}
