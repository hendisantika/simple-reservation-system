package com.hendisantika.controller;

import com.hendisantika.service.ReservationService;
import com.hendisantika.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : simple-reservation-system
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/03/22
 * Time: 09.19
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class PagesController {

    final UserService userService;
    final ReservationService reservationService;

    public PagesController(UserService userService, ReservationService reservationService) {
        this.userService = userService;
        this.reservationService = reservationService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
