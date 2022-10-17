package com.example.reto3.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.reto3.entities.Reservation;
import com.example.reto3.service.ResevationService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/Reservation")
public class ReservationController {

    @Autowired
    private ResevationService resevationService;

    @GetMapping("/all")
    public List<Reservation> getAll(){
        return resevationService.getAll();
    }


    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody Reservation c){
        return resevationService.save(c);
    }

    /*@GetMapping("/{id}")
    public Optional<Reservation> getById(@PathVariable("id") int id){
        return reservationService.getById(id);
    }*/



    /*Reto 4
    @GetMapping("/report-dates/{dateA}/{dateB}")
    public List<Reservation> getByDates(@PathVariable("dateA")String da,@PathVariable("dateB")String db ){
        return resevationService.getReservationsByPeriod(da,db);
    }
    @GetMapping("/report-status")
    public StatusAccount getByStatus(){
        return resevationService.getReportByStatus();
    }
    @GetMapping("/report-clients")
    public List<TopClients> getTopClients(){
        return resevationService.getTopclients();
    }
*/


}
