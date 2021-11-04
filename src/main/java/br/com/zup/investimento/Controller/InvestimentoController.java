package br.com.zup.investimento.Controller;

import br.com.zup.investimento.Service.InvestimentoService;
import org.springframework.web.bind.annotation.RequestMapping;;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/investimento")
public class InvestimentoController {

    private InvestimentoService investimentoService;


}
