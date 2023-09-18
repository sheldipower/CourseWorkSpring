package com.example.CourseWorkSpring.DTO;

import lombok.Getter;
import lombok.Setter;
import com.example.CourseWorkSpring.model.Bid;
import com.example.CourseWorkSpring.model.Lot;
@Getter
@Setter
public class LotCSV {
    private Integer id;
    private String title;
    private String status;
    private BidDTO lastBidder;
    private int currentPrice;

    public static LotCSV fromLot(Lot lot) {
        LotCSV lotCSV = new LotCSV();
        lotCSV.setId(lot.getId());
        lotCSV.setStatus(lot.getStatus());
        lotCSV.setTitle(lot.getTitle());
        if (lot.getBidList().size() != 0) {
            lotCSV.setLastBidder(BidDTO.formBid(lot.getBidList().get(lot.getBidList().size() - 1)));
        }
        lotCSV.setCurrentPrice(lot.getBidList().size()*lot.getBidPrice()+lot.getStartPrice());
        return lotCSV;
    }

    @Override
    public String toString() {
        return id +
                ", " + title +
                ", " + status +
                ", " + (lastBidder!=null ? lastBidder.getBidderName() : "null") +
                ", " + currentPrice;
    }
}