package tacos.web.api;

import java.util.Date;
import java.util.List;
import org.springframework.hateoas.RepresentationModel;
import lombok.Getter;
import tacos.Ingredient;
import tacos.Taco;

public class TacoResource extends RepresentationModel {
    
    @Getter
    private final String name;
    
    @Getter
    private final Date createdAt;
    
    @Getter
    private final List<Ingredient> ingredients;
    
    public TacoResource(Taco taco) {
        this.name = taco.getName();
        this.createdAt = taco.getCreatedAt();
        this.ingredients = taco.getIngredients();
    }
}
