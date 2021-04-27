package baranski.marcin.todo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller("error")
public class ErrorController {

    @ExceptionHandler(Exception.class)
    public ModelAndView handleException(HttpServletRequest httpServletRequest, Exception ex){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("exception",ex.getLocalizedMessage());
        modelAndView.addObject("url",httpServletRequest.getRequestURL());

        modelAndView.setViewName("error");
        return modelAndView;

    }
}
