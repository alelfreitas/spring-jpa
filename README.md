# spring-jpa
Repositório de testes e estudos sobre jpa com springboot.

Teste executado: Retornar ID de objeto salvo na base através do comando `repository.save`.
Objetivo era retornar o valor gerado pelo `AUTO_INCREMENT` da base de dados.

Resultado: Descoberto que quando utilizado chave composta (Mais de uma pk no JPA), o valor da chave retorna 0, mesmo depois de salvo. 
Quando alterado para apenas uma chave (sendo essa a `AUTO_INCREMENT`) o programa funciona normalmente e é possível trazer o ID colocando o retorno da função `repository.saveAndFlush(data)` em uma variavel e pegando a informação necessária pelo próprio objeto:

```$xslt
var dadosRetornados = repository.saveAndFlush(dados)
LOG.info("Chave retornada {}", dadosRetornados.Id)
``` 