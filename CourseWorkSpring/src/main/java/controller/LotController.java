package controller;

import DTO.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/lot")
public class LotController {

    private final LotService lotService;

    public LotController(LotService lotService) {
        this.lotService = lotService;
    }

    @PostMapping("/")
    public void createLot(@RequestBody CreatingLot lot) {
        lotService.createLot(lot);
    }

    @GetMapping
    public List<LotDTO> getLotsByStatus(@RequestParam("page") Integer page,
                                        @RequestParam("status") String status) {
        return lotService.getLotsByStatus(page, status);
    }


    @GetMapping(value = "/export", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<Resource> exportLotInFile() throws IOException {
        return lotService.exportLotInFile();
    }

    @PostMapping("/{id}/stop")
    public void stopBargaining(@PathVariable Integer id) {
        lotService.stopBargaining(id);
    }

    @PostMapping("/{id}/bid")
    public void addBid(@PathVariable Integer id, @RequestBody BidDTO bidDTO) {
        lotService.addBid(id, bidDTO);
    }

    @PostMapping("/{id}/start")
    public void startBargaining(@PathVariable Integer id) {
        lotService.startBargaining(id);
    }

    @GetMapping("/{id}")
    public FullLotDTO getFullLot(@PathVariable Integer id) {
        return lotService.getFullLot(id);
    }

    @GetMapping("/{id}/frequent")
    public FrequentBidInterface getTheFrequentBid(@PathVariable Integer id) {
        return lotService.getTheFrequentBid(id);
    }

    @GetMapping("/{id}/first")
    public BidDTO getTheFirstBid(@PathVariable Integer id) {
        return lotService.getTheFirstBid(id);
    }
}
