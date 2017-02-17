package controller;

import dto.Greeting;
import dto.IP_Reccords;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by CarlosSanchez on 2/17/17.
 */


@RestController
public class RestfulController {

    int userCounts = 0;
    IP_Reccords reccords = new IP_Reccords();


    @RequestMapping("/details")
    public Greeting getInfo(HttpServletRequest request, ModelMap modelMap){

        String message = "Welcome Back! This is a placeholder, some cool stuff coming soon!";
        String requestIP = request.getRemoteAddr();
        if(reccords.addIP(requestIP)){
            userCounts++;
            message = "Welcome this is a placeholder, some cool stuff coming soon!";
        }
        reccords.getIpAdresses().stream().forEach(System.out::println);
        return new Greeting(userCounts, message);
    }
}
