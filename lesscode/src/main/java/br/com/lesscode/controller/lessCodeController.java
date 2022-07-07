package br.com.lesscode.controller;

import br.com.lesscode.model.CepResponseDto;
import br.com.lesscode.service.BuscarCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class lessCodeController {

    @Autowired
    private BuscarCepService buscarCepService;

    @RequestMapping("/cep/consulta")
    @ResponseBody
    public CepResponseDto getCep(@RequestParam(name = "cep") String cep) {
        return buscarCepService.getCep(cep);

    }

}
