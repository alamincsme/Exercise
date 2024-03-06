package io.alamincsme;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class AppController {


    @GetMapping("")
   public String welcome() {
       return "Welcome my spring boot application";
   }

    @GetMapping("/add")
    public int add (@RequestParam("a") int a, @RequestParam("b") int b) {
        return a + b ;
    }

    @GetMapping("/sub")
    public int sub (@RequestParam("a") int a, @RequestParam("b") int b) {
        return a - b ;
    }

    @GetMapping("/mul")
    public int mul (@RequestParam("a") int a, @RequestParam("b") int b) {
        return a * b ;
    }

    @GetMapping("/div")
    public double div (@RequestParam("a") int a, @RequestParam("b") int b) throws Exception {
        double ans = 0.0 ;
       try {
             ans = (double) a /b ;
        } catch ( ArithmeticException e) {
            throw new Exception("divided is not possible.");
        }

        return ans ;
    }
}
