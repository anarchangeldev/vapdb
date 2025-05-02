package cz.anarchangel.vapedb.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

/**
 * @author Lukáš Petráček, lukas.petracek@media-sol.com, MEDIA SOLUTIONS
 */
@Getter @Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@Document("vapes")
public class Vape extends BasicEntity {

    @Id
    private String id;

    private String name;

    private String manufacturer;

    private String description;

    private BigDecimal price;

    private int stock;

}
