package cl.praxis.apringclasss2.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

public class Persona {
    private String nombre;
    private String apellido;
    private String edad;
}
