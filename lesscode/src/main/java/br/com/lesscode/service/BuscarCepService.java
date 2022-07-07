package br.com.lesscode.service;

import br.com.lesscode.model.CepResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BuscarCepService {

    @Value("${api-consumo-cep}")
    private String url;

    @Autowired
    private RestTemplate restTemplate;

    public CepResponseDto getCep(String cep) {
        try {
            return restTemplate.getForObject(url + "/" + cep + "/json/", CepResponseDto.class);

        } catch (Exception exception) {
            return new CepResponseDto("400", exception.toString());
        }

    }

}
