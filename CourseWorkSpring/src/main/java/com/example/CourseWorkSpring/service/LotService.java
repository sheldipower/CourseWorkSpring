package com.example.CourseWorkSpring.service;
import com.example.CourseWorkSpring.DTO.*;
import org.springframework.http.ResponseEntity;

import org.springframework.core.io.Resource;
import java.io.IOException;
import java.util.List;

public interface LotService {
    void createLot(CreatingLot creatingLot);

    List<LotDTO> getLotsByStatus(Integer page, String status);

    ResponseEntity<Resource> exportLotInFile() throws IOException;


    void stopBargaining(Integer id);

    void addBid(Integer id, BidDTO bidDTO);

    void startBargaining(Integer id);

    FullLotDTO getFullLot(Integer id);

    FrequentBidInterface getTheFrequentBid(Integer id);

    BidDTO getTheFirstBid(Integer id);
}

