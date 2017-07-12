package org.t246osslab.easybuggy4sb.troubles;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectLoopController {

    @Autowired
    MessageSource msg;

    @RequestMapping(value = "/redirectloop")
    public String process() throws IOException {
        return "redirect:redirectloop";
    }
}