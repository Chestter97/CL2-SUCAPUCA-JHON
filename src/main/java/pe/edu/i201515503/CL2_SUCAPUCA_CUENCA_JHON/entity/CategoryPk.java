package pe.edu.i201515503.CL2_SUCAPUCA_CUENCA_JHON.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryPk {
    private Integer film_id;
    private Integer category_id;
}