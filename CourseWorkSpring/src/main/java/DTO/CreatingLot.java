package DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreatingLot {

    private String title;
    private String description;
    private int startPrice;
    private int bidPrice;


    public Lot toLot() {
        Lot lot = new Lot();
        lot.setStatus("CREATED");
        lot.setTitle(this.getTitle());
        lot.setDescription(this.getDescription());
        lot.setStartPrice(this.getStartPrice());
        lot.setBidPrice(this.getBidPrice());
        return lot;
    }
}