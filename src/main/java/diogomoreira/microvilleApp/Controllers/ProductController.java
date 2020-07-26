package diogomoreira.microvilleApp.Controllers;

import diogomoreira.microvilleApp.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@ControllerAdvice
public class ProductController {

    private Product product;

    @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
    public String submitProduct(@ModelAttribute("product") Product product, ModelMap model) {
        model.addAttribute("Specie", product.getSpecie());
        model.addAttribute("Quantity", product.getQuantity());
        return "ProductView";
    }
}
