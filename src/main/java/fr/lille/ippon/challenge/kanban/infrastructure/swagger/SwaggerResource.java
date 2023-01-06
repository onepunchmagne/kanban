package fr.lille.ippon.challenge.kanban.infrastructure.swagger;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Resource redirection to swagger api documentation
 */
@ApiIgnore
@Controller
@Slf4j
public class SwaggerResource {

    @RequestMapping(value = "/")
    public String index() {
        log.info("go to index");
        return "redirect:/swagger-ui/index.html";
    }
}
