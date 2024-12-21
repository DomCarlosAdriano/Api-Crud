package med.voli.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}

/*
	"nome" : "Paulo Henrique",
    "email" : "gatinha@hotmail.com",
    "crm" : 444666,
    "telefone" : "89955554444",
    "especialidade" : "DERMATOLOGIA",
    "endereco" : {
        "logradouro" : "rua 3",
        "bairro" : "Vegel do Lago",
        "cep" : "57015040",
        "complemento": "perto da colegio",
        "numero" : "77",
        "uf": "BR",
        "cidade" : "Rio de Janeiro"
    }
 */