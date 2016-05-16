package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MesajController {

    private static final String template = "Hello, %s!";
    int i=0;

    @RequestMapping("/mesaj")
    public Mesaj addMesaj(@RequestParam(value="mesaj", defaultValue="World") String name) {
    	
        return new Mesaj(i++,i,
                            String.format(template, name));
    }
  
}
